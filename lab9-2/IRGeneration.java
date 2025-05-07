public class IRGeneration {
    private String[][] irTable;
    private int currentRow;
    private int tempCount;

    public IRGeneration() {
        irTable = new String[100][4]; // columns: op, arg1, arg2, result
        currentRow = 0;
        tempCount = 0;
    }

    void generateIR(SimpleNode root) {
        // Process root node
        String result = processNode(root);
        
        // Print the IR table
        System.out.println("\nIntermediate Representation Table:");
        System.out.println("Op\tArg1\tArg2\tResult");
        System.out.println("--------------------------------");
        for (int i = 0; i < currentRow; i++) {
            System.out.println(irTable[i][0] + "\t" + irTable[i][1] + "\t" + 
                             irTable[i][2] + "\t" + irTable[i][3]);
        }
    }

    private String processNode(SimpleNode node) {
        String nodeValue = (node.jjtGetValue() != null) ? node.jjtGetValue().toString() : "";
        
        // Handle leaf nodes (identifiers)
        if (node.jjtGetNumChildren() == 0) {
            return nodeValue;
        }
        
        // Handle assignment
        if (nodeValue.equals("=")) {
            SimpleNode lhs = (SimpleNode)node.jjtGetChild(0);
            SimpleNode rhs = (SimpleNode)node.jjtGetChild(1);
            String rhsResult = processNode(rhs);
            
            irTable[currentRow][0] = "=";
            irTable[currentRow][1] = rhsResult;
            irTable[currentRow][2] = "-";
            irTable[currentRow][3] = lhs.jjtGetValue().toString();
            currentRow++;
            return lhs.jjtGetValue().toString();
        }
        
        // Handle binary operations (+, -, *, /)
        if (node.jjtGetNumChildren() == 2) {
            SimpleNode left = (SimpleNode)node.jjtGetChild(0);
            SimpleNode right = (SimpleNode)node.jjtGetChild(1);
            
            String leftResult = processNode(left);
            String rightResult = processNode(right);
            String temp = "t" + tempCount++;
            
            irTable[currentRow][0] = nodeValue;
            irTable[currentRow][1] = leftResult;
            irTable[currentRow][2] = rightResult;
            irTable[currentRow][3] = temp;
            currentRow++;
            return temp;
        }
        
        // If only one child, process it
        if (node.jjtGetNumChildren() == 1) {
            return processNode((SimpleNode)node.jjtGetChild(0));
        }
        
        return "";
    }
}
