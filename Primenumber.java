public class Primenumber {

   public static void main(String [] args){
       int count=0;
       for (int a=1;a<=100;a++)
       {
           for (int b=1;b<=100;b++)
           {
               if(a%b==0)
               {
                   count++;
               }


           }
           if (count==2)
           {
               System.out.println("primenumber"+a);
           }
       }

   }
}
