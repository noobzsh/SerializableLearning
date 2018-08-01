import model.Child;
import model.Father;

import java.util.*;

public class Solution {

    //回溯法示例
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    public static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<Integer>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    //字符串首尾相连
    public static List<List<String>> isHeadToTail(String[] nums){
        List<List<String>> resList = new ArrayList<List<String>>();
        List<String> tempList = new ArrayList<String>();
        //String [] nums ={"abc","cd","dea","dfa"};
        int[] index = new int[nums.length];
        backtrack2(resList,tempList,nums,index,0);
        return resList;
    }

    public static void backtrack2(List<List<String>> resList,List<String> tempList, String [] nums, int[] index,int start){
        if(nums==null||nums.length==0){return;}
        tempList.add(nums[start]);
        index[start]=1;
        for(int i=0;i<nums.length;i++){
            if(index[i]==1){continue;}
            char[] str1=tempList.get(tempList.size()-1).toCharArray();
            char[] str2=nums[i].toCharArray();
            if(str1[str1.length-1]!=str2[0]){continue;}
            backtrack2(resList,tempList,nums,index ,i);
            tempList.remove(tempList.size()-1);
            index[i]=0;
        }
        if(tempList.get(0).toCharArray()[0]==tempList.get(tempList.size()-1).toCharArray()[tempList.get(tempList.size()-1).toCharArray().length-1]){
            resList.add(new ArrayList<String>(tempList));
        }
        //resList.add(new ArrayList<String>(tempList));
    }

    public static void main(String[] args) throws Exception {
//        int[] nums = {1,2,3};
//        List<List<Integer>> res=subsets(nums);
//        System.out.println("ok");
        String [] nums ={"abc","cd","dea","dfa"};
        List<List<String>> res=isHeadToTail(nums);
        System.out.println("ok");
    }
}



