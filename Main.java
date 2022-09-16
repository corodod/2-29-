public class Main {
    public static void main (String[] args){
        int year, days;
        year = System.in.readln();
        if (year % 400 !=0 && year%100 == 0  ){
            days = 365;
        } else if (year % 4 == 0) {
            days = 366;
        } else{
            days = 365;
        }
        System.out.println(days);
    }
}


