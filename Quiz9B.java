public class Quiz9B{
  public String sum="";
  public int y;
  public void methodA(){    
    int x=0;
    int z = 0;
    while (z < 5){
      y = y * 3%5; 
      x = y + 2;
      System.out.println(x + " " + y+ " " + sum);
      sum = sum + methodB(x, y);      
      z++;
    }
  }
  public String methodB(int m, int n){
    int x = 0;
    String sum = "0";
    y = y + m;
    x = n - 2;
    sum = sum + y;
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }
}
