
public class Waterlevelmonitor
{
    public static void main(String[] args){
        int waterlevel =1100;
  
        String message = (waterlevel >=1200)?"WARNING!!!!!!:WARTER LEVEL HAS REACHED 1200L or more!!!!":"Normal";
        System.out.print(message);
    }
}