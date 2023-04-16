package c.t.m.g.dg$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class dg$a extends Enum	// class@000c42
{
    public static final dg$a a;
    public static final dg$a b;
    public static final dg$a c;
    public static final dg$a d;
    public static final dg$a[] e;

    static {
       dg$a uoa = new dg$a("NONE", 0);
       dg$a.a = uoa;
       dg$a uoa1 = new dg$a("GPS", 1);
       dg$a.b = uoa1;
       dg$a uoa2 = new dg$a("PDR", 2);
       dg$a.c = uoa2;
       dg$a uoa3 = new dg$a("VDR", 3);
       dg$a.d = uoa3;
       dg$a[] uoaArray = new dg$a[]{uoa,uoa1,uoa2,uoa3};
       dg$a.e = uoaArray;
    }
    public void dg$a(String p0,int p1){
       super(p0, p1);
    }
    public static dg$a valueOf(String p0){
       return Enum.valueOf(dg$a.class, p0);
    }
    public static dg$a[] values(){
       return dg$a.e.clone();
    }
}
