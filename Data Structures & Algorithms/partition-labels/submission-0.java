class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] array=s.toCharArray();

        //create the hashmap
        for(int i=0; i<array.length; i++)
            map.put(array[i], i);

        List<Integer> output = new ArrayList<>();

        int end=0,size=0;
        for(int i=0; i<array.length; i++)
        {
            size++;
            end=Math.max(end, map.get(array[i]));
            if(i==end)
            {
                output.add(size);
                size=0;
            }
        }

        return output;

    }
}
