class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder str = new StringBuilder();
    for(char c:s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            str.append(Character.toLowerCase(c));
        }
    }
    int pointer_1=0;
    int pointer_2=str.length()-1;
    while(pointer_1<pointer_2){
        if(str.charAt(pointer_1) !=str.charAt(pointer_2)){
            return false;
        }
    pointer_1++;
    pointer_2--;
    }
    return true;
    } 
    }

