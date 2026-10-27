public class PrintRange{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void IO(Node root){
        if(root == null){
            return;
        }

        IO(root.left);
        System.out.print(root.data+" ");
        IO(root.right);
    }

    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }else if(root.data > y){
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
    }

    public static void main(String []args){
        int nodes[] = {8,5,3,1,4,6,10,11,14};

        Node root = null;

        for(int i=0;i<nodes.length;i++){
            root = insert(root,nodes[i]);
        }

        IO(root);
        System.out.println();

        printInRange(root, 6, 10);
        IO(root);
    }
}
// 1 3 4 5 6 8 10 11 14 
// 6 8 10 
