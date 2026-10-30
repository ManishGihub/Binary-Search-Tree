import java.util.*;

public class Root2LeafPaths{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node BT(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = BT(root.left,val);
        }else{
            root.right = BT(root.right,val);
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

    public static void rootToLeafPath(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }else{
            rootToLeafPath(root.left,path);
            rootToLeafPath(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nodes[] = {8,5,3,6,11,12,15};

        Node root = null;

        for(int i=0;i<nodes.length;i++){
            root = BT(root,nodes[i]);
        }

        // IO(root);
        rootToLeafPath(root,new ArrayList<>());
    }
}

// 8->5->3->
// 8->5->6->
// 8->11->12->15->
