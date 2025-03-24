class commandlinedemo1
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);

int r1,r2,r3,r4;
r1=n1+n2;
r2=n1-n2;
r3=n1*n2;
r4=n1/n2;

System.out.println("ADDITION:"+r1);
System.out.println("SUBTRACTION:"+r2);

System.out.println("MULTIPLICATION:"+r3);

System.out.println("DIVISION:"+r4);
}
}

