package c.t.m.g.bv$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bv$a extends Enum	// class@000bf9
{
    public static final bv$a a;
    public static final bv$a b;
    public static final bv$a c;
    public static final bv$a[] d;

    static {
       bv$a uoa = new bv$a("NETWORK_NONE", 0);
       bv$a.a = uoa;
       bv$a uoa1 = new bv$a("NETWORK_MOBILE", 1);
       bv$a.b = uoa1;
       bv$a uoa2 = new bv$a("NETWORK_WIFI", 2);
       bv$a.c = uoa2;
       bv$a[] uoaArray = new bv$a[]{uoa,uoa1,uoa2};
       bv$a.d = uoaArray;
    }
    public void bv$a(String p0,int p1){
       super(p0, p1);
    }
    public static bv$a valueOf(String p0){
       return Enum.valueOf(bv$a.class, p0);
    }
    public static bv$a[] values(){
       return bv$a.d.clone();
    }
}
