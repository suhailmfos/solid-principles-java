import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Solution {
    enum Day {

        Monday(1),
        Tuesday(2),
        Wednesday(3),
        Thursday(4),
        Friday(5),
        Saturday(6),
        Sunday(7);
        int day = 0;
        Day(int day){
            this.day = day;
        }
    }

    static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split(" ");
        Stack<String> st = new Stack<>();
        for(String str : strs){
            System.out.println(str);
            if(str.isEmpty()) continue;
            st.push(str);
        }
        while (!st.empty()){
            sb.append(st.pop() + " ");
        }
       return sb.toString().trim();
    }

    private static boolean checkUniqueSubstring(String s, int i, int j){
        boolean[] visited = new boolean[256];
        for(int k = i; k <= j; k++){
            if(visited[s.charAt(k)])
                return false;
            visited[s.charAt(k)] = true;
        }
        return true;
    }
    static int longestSubstringON3(String s, int n){
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(checkUniqueSubstring(s,i,j))
                    maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }
    static int longestSubstringON2(String s, int n){
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            boolean[] visited = new boolean[256];
            for(int j = i; j < n; j++){

                if(visited[s.charAt(j)]) break;
                else{
                    maxLength = Math.max(maxLength, j-i+1);
                    visited[s.charAt(j)] = true;
                }
            }
            // mark the previously visisted node false
            visited[s.charAt(i)] = false;
        }
        return maxLength;
    }
    static int longestSubstringON1(String s, int n){
        int maxLength = 0;
        int i = 0, j = 0;
        boolean[] visited = new boolean[256];
        while(i < n && j < n){
            if(!visited[s.charAt(j)]){
                visited[s.charAt(j)] = true;
                j = j + 1;
                maxLength = Math.max(maxLength, j - i);
            }else {
                visited[s.charAt(i)] = false;
                i = i + 1;
            }
        }
        return maxLength;
    }
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    static int getNext(int n){
        int totalSum = 0;
        while(n > 0){
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
    static boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a  = sc.nextInt();
        String str = "";
        System.out.println(isHappy(2));


    }
}
