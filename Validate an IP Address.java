class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        
       
        String[] ip = s.split("\\.");
        
      
        if (ip.length != 4) {
            return false;
        }
        
        for (String i : ip) {
            
            try {
                int num = Integer.parseInt(i);
                if (num < 0 || num > 255 || (i.length() > 1 && i.charAt(0) == '0')) {
                    return false;
                }
            } catch (NumberFormatException e) {
                
                return false;
            }
        }
        
        return true;
    }
}
