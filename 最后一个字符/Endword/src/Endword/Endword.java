package Endword;

public class Endword {
    public int endword(String s) {
        int end=s.length()-1;
        while(end>=0&&s.charAt(end)==' ')end--;
        if(end<0)return 0;
        int start=end;
        while(start>=0&&s.charAt(start)!=' ')start--;
        return end-start;
    }
}
