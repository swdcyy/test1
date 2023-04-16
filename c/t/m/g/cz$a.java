package c.t.m.g.cz$a;
import java.lang.Object;
import java.lang.String;

public class cz$a	// class@000c33
{
    public final Object a;
    public String b;
    public long c;
    public final int e;
    public final byte[] f;
    public final String g;
    public int h;
    public static final cz$a d;

    static {
       cz$a.d = new cz$a();
    }
    public void cz$a(){
       super();
       this.h = 1;
       this.e = 0;
       this.f = null;
       this.g = null;
       this.a = null;
    }
    public void cz$a(int p0,byte[] p1,String p2,Object p3){
       super();
       this.h = 1;
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.a = p3;
    }
    public static byte[] a(cz$a p0){
       return p0.f;
    }
    public static int b(cz$a p0){
       return p0.e;
    }
    public static String c(cz$a p0){
       return p0.g;
    }
    public static int d(cz$a p0){
       cz$a h = p0.h;
       p0.h = h - 1;
       return h;
    }
    public static int e(cz$a p0){
       return p0.h;
    }
}
