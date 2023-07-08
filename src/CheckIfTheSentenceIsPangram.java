public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        boolean[] res = new boolean[26];

        int index = 0;

        for (int i = 0; i < sentence.length(); i++){
            if('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z'){
                index = sentence.charAt(i) - 'a';
            } else {
                continue;
            }
            res[index] = true;
        }

        for (int i = 0; i <= 25; i++){
            if (res[i] == false){
                return (false);
            }
        }

        return (true);
    }
}
