class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);

     StringBuilder st = new StringBuilder();
     String first = strs[0];
     String last = strs[strs.length - 1];

     for(int i = 0; i < first.length(); i++) {
         if(first.charAt(i) == last.charAt(i)) {
             st.append(first.charAt(i));
         }

         else 
             break;
     }            

     return st.toString();
    }
}
