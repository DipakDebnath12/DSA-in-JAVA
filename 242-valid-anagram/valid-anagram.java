class Solution {
    public boolean isAnagram(String s, String t) {
        int n=t.length();
        if(s.length()!=n)
        {
            return false;
        }
        int count[] = new int[26];
        for(int i=0;i<t.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;

       /*if(s.length() == t.length()){
            char[] sarray = s.toCharArray();
            char[] tarray = t.toCharArray();
            Arrays.sort(sarray);
            Arrays.sort(tarray);

            if(Arrays.equals(sarray, tarray)){
                return true;
            }else{
                return false;
            }    
        }
        else{
            return false;
        }*/
    }
}