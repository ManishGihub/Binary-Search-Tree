public class BSTSearch{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node Insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = Insert(root.left, val);
        }
        else{
            root.right = Insert(root.right, val);
        }
        return root;
    }

    public static void InOrder(Node root){
        if(root == null){
            return;
        }

        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    public static boolean search(Node root,int val){
        if(root == null){
            return false;
        }

        if(root.data > val){
            return search(root.left, val);
        }
        else if(root.data == val){
            return true;
        }
        else{
            return search(root.right, val);
        }
    }

    public static void main(String []args){
        int nodes[] = {5,3,1,4,2,9,8};
        Node root = null;

        for(int i=0;i<nodes.length;i++){
            root = Insert(root, nodes[i]);
        }

        InOrder(root);
        System.out.println();

        if(search(root, 4)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
    }
}

// 4
// 1 2 3 4 5 8 9 
// found

// 9
// 1 2 3 4 5 8 9 
// Not found
