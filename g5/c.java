package g5.c;
import java.util.List;
import java.lang.String;
import java.lang.Object;

public class c	// class@002043
{
    public final List a;
    public final char b;
    public final double c;
    public final double d;
    public final String e;
    public final String f;

    public void c(List p0,char p1,double p2,double p3,String p4,String p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public static int b(char p0,String p1,String p2){
       return (((((0 + p0) * 31) + p1.hashCode()) * 31) + p2.hashCode());
    }
    public double a(){
       return this.d;
    }
    public int hashCode(){
       return c.b(this.b, this.f, this.e);
    }
}
