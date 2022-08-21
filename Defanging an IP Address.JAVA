class Solution {
    public String defangIPaddr(String address) {
        String ans  = "";
        
        int n = address.length();
        
        for(int i=0;i<n;i++)
        {
            char c = address.charAt(i);
            if(c=='.')
            {
                ans+="[.]";
            }
            else{
                ans+=c;
            }
        }
        
        return ans;
    }
}
