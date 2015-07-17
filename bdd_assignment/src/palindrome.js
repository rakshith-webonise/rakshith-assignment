function isPalindrome(word){
    if(word==null || word.length==0){
        
        return false;
    }
    var lastIndex=Math.ceil(word.length/2);
    for (var i = 0; i < lastIndex  && i< word.length; i++) {
        if (word[i] != word[word.length-1-i]) {
            return false;
        }
     }
     return true;
} 
