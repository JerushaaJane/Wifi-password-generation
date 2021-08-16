import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      int roomno=sc.nextInt();
      int i=name.length();
      
      if(roomno<100 || roomno>999){System.out.println("0000");}
      else{
      
      char unit_pos_of_pass=name.charAt(i-1);
      int tenth_pos_of_pass=roomno%10;
      int hundredth_pos_of_pass=(roomno/10)%10;
      char symbol='-';                                //we randomly initialize symbol with -
      switch(hundredth_pos_of_pass){
          case 1:
              symbol='!';break;
          case 2:
               symbol='@';break;
          case 3:
              symbol='#';break;
          case 4:
              symbol='$';break;
          case 5:
              symbol='%';break;
          case 6:
              symbol='^';break;
          case 7:
              symbol='&';break;
          case 8:
              symbol='*';break;
          case 9:
              symbol='(';break;
          case 0:
              symbol=')';break;
              
      }
      int sum=0,r;
      while(roomno>0){
          r=roomno%10;
          sum=sum+r;
          roomno=roomno/10;
          
      }
      System.out.println(String.valueOf(sum)+String.valueOf(symbol)+String.valueOf(tenth_pos_of_pass)+String.valueOf(unit_pos_of_pass));
      }//else

    }
}
