class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> op = new HashMap<>(); 

        for (String s : strs){

            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);

            if(!op.containsKey(key)){
                op.put(key,new ArrayList<>());
            }
            op.get(key).add(s);
        }

        ArrayList<List<String>> ans = new ArrayList<>(op.values());

        return ans;
    }
}