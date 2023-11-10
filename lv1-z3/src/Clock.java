// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

 import java.util.Scanner;

public class Clock {
private  int hours, minutes, seconds;

// constructor
    public Clock( int hours, int minutes, int seconds) {
        set(hours, minutes, seconds);
    }


    // setter
    public   void  set( int hours, int minutes, int seconds) {
           this.hours=hours;
           this.minutes=minutes;
           this.seconds=seconds;
    }

    // metoda Next

    public  void next () {

        seconds++;
        if (seconds==60) { seconds=0; minutes++; }
        if (minutes==60) { minutes=0; hours++; }
        if (hours ==24) hours=0;

    }

  public  void previous ( ) {
        seconds--;
        if (seconds==-1) { seconds=59; minutes--; }
        if (minutes==-1) { minutes=59;  hours--; }
        if (hours==-1)  hours=23;
    }

    public  void move( int  n ) {
        if (n>0)  {
            for(int i=0; i<n; i++)
                this.next();
        }
        else {
            for (int i = 0; i < -n; i++)
                this.next();
        }

    }


    // getters
   public  int  getHours() {
        return hours;
   }

    public  int   getMinutes() {
        return  minutes;
    }

    public  int  getSeconds () {
         return seconds;
    }

   public  String  toString() {
         return this.hours + ":" + this.minutes + ":" + this.seconds;
   }
    public static void main(String[] args) {
           Clock c = new Clock (15,30,45);
           System.out.println(c);
           c.next();
        System.out.println(c);
        c.move(-48);
        System.out.println(c);
        c.set(0,0,0);
        System.out.println(c);
    }
}