class A{
  public int temp = 4;
  public int sum;
  public int y;
  public A(){
    y = temp - 2;
    sum = temp + 3;
    temp-=2;
  }
  public void methodA(int m, int n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
  }
}
class B extends A {
  public int x;
  public int sum;
  public B(){
    y = temp + 3 ;
    sum = 3 + temp + 2;
    temp-=1;
  }  
  public B(B b){
    sum = b.sum;
    x = b.x;
  }
  public void methodB(int m, int n){    
    int  y =0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    methodA(x, y);
    sum = x + y + sum;
    System.out.println(x + " " + y+ " " + sum);
  }
}


   
   
   

