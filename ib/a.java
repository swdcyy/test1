package ib.a;
import java.lang.Object;

public class a	// class@002192
{

    public static int a(int p0,int p1){
       return (((p0 + 31) * 31) + p1);
    }
    public static int b(Object p0){
       int i = (p0 == null)? 0: p0.hashCode();
       return (i + 31);
    }
}
