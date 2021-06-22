package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int b[]=new int[50];
    int i=0;
    while(n>0)
    {
      b[i++]=n%2;
      n=n/2;
    }
    
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return b;
  }
  public static void main(String args[])
  {
    int s1;
    Scanner s=new Scanner(System.in);
    s1=s.nextInt();
    toBinary(s1);
  }
}
