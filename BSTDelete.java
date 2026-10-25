public class BSTDelete{

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

    public static boolean search(Node root,int val){
        if(root == null){
            return false;
        }

        if(root.data > val){
            return search(root.left, val);
        }else if(root.data == val){
            return true;
        }else{
            return search(root.right, val);
        }
    }

    public static Node delete(Node root,int val){

        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        
        else{ //root.data == val
            //case 1) no child
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2) having single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return  root.left;
            }

            //case 3) with 2 childs
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
            
        }
        return root;
    }

    public static Node InorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
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

    public static void main(String []args){
        int nodes[] = {8,5,3,1,4,6,10,11,14};

        Node root = null;

        for(int i=0;i<nodes.length;i++){
            root = insert(root,nodes[i]);
        }

        IO(root);
        System.out.println();

        delete(root, 10);
        IO(root);
    }
}
// 4
// 1 3 4 5 6 8 10 11 14 
// 1 3 5 6 8 10 11 14 

// 5
// 1 3 4 5 6 8 10 11 14 
// 1 3 4 6 8 10 11 14 

// 10
// 1 3 4 5 6 8 10 11 14 
// 1 3 4 5 6 8 11 14 
