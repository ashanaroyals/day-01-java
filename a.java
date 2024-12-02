import java.io.PrintWriter;
public class a{
    public static void main(String args[])
    {
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("hello world");
        pw.print("this is a");
        pw.print("java statement");
        pw.close();
    }
}