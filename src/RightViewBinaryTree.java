import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewBinaryTree {
    //tree node
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right =right;
        }
    }

    //method to return the list of right elements in the tree
    static List<Integer> rightViewBinaryTree(TreeNode root){
        // list to be returned
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        //queue to hold the nodes level wise
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        //until it gets empty
        while(!q.isEmpty()){
            int size =q.size();
            //wherever i becomes last element add that in the list
            for(int i=0; i<size; i++){
                TreeNode current = q.remove();
                if(i==(size-1)){
                    ans.add(current.val);
                }
                //also check the right and left
                // if not empty add that in queue and then repeat the process
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }
        }// return ans
        return ans;
    }

     public static void main(String[] args) {

    }
}
