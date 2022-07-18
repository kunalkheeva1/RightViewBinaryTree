import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewBinaryTree {

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
    static List<Integer> rightViewBinaryTree(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size =q.size();
            for(int i=0; i<size; i++){
                TreeNode current = q.remove();
                if(i==(size-1)){
                    ans.add(current.val);
                }
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }
        }return ans;
    }

     public static void main(String[] args) {

    }
}
