class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);  //if already exists, increase char freq
            else
                map.put(c,1);
        }

        for(int i=0; i<t.length(); i++)
        {
            if(!map.containsKey(t.charAt(i)))
                return false;
            else
                map.put(t.charAt(i), map.get(t.charAt(i))-1);

            if (map.get(t.charAt(i))<0)
                return false;
        }

        return true;
    }
}