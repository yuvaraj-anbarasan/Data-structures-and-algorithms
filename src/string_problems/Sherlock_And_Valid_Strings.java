package stringProblems;

import java.util.Arrays;

public class Sherlock_And_Valid_Strings {
    static String isValidString(String s1){
        int[] charOccurrence = new int[26];
        int index = 0;
        for(int i=0; i<s1.length(); i++){
            charOccurrence[s1.charAt(i) - 'a']++;
        }

        Arrays.sort(charOccurrence);

        while(charOccurrence[index] == 0){
            index++;
        }

        if( charOccurrence[25] == charOccurrence[index] )
            return "YES";
        else if( charOccurrence[24] == charOccurrence[index] && (charOccurrence[25]-charOccurrence[24] == 1) )
            return "YES";
        else if( (charOccurrence[index+1] - charOccurrence[index]) == 1 && charOccurrence[index+1] == charOccurrence[25] )
            return "YES";
        else if( charOccurrence[index+1] == charOccurrence[25] && charOccurrence[index] == 1)
            return "YES";
        else if( charOccurrence[index] == charOccurrence[24] && charOccurrence[25] == 1)
            return "YES";

        return "NO";
    }
    public static void main(String[] args){
        System.out.println(isValidString("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
    }
}
