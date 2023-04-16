package c.t.m.g.d$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class d$a extends Enum	// class@000c35
{
    public static final d$a a;
    public static final d$a b;
    public static final d$a c;
    public static final d$a d;
    public static final d$a e;
    public static final d$a f;
    public static final d$a g;
    public static final d$a h;
    public static final d$a i;
    public static final d$a[] j;

    static {
       d$a uoa = new d$a("NONE", 0);
       d$a.a = uoa;
       d$a uoa1 = new d$a("GSM", 1);
       d$a.b = uoa1;
       d$a uoa2 = new d$a("CDMA", 2);
       d$a.c = uoa2;
       d$a uoa3 = new d$a("WCDMA", 3);
       d$a.d = uoa3;
       d$a uoa4 = new d$a("LTE", 4);
       d$a.e = uoa4;
       d$a uoa5 = new d$a("NR", 5);
       d$a.f = uoa5;
       d$a uoa6 = new d$a("TEMP6", 6);
       d$a.g = uoa6;
       d$a uoa7 = new d$a("TEMP7", 7);
       d$a.h = uoa7;
       d$a uoa8 = new d$a("NOSIM", 8);
       d$a.i = uoa8;
       d$a[] uoaArray = new d$a[9];
       uoaArray[0] = uoa;
       uoaArray[1] = uoa1;
       uoaArray[2] = uoa2;
       uoaArray[3] = uoa3;
       uoaArray[4] = uoa4;
       uoaArray[5] = uoa5;
       uoaArray[6] = uoa6;
       uoaArray[7] = uoa7;
       uoaArray[8] = uoa8;
       d$a.j = uoaArray;
    }
    public void d$a(String p0,int p1){
       super(p0, p1);
    }
    public static d$a valueOf(String p0){
       return Enum.valueOf(d$a.class, p0);
    }
    public static d$a[] values(){
       return d$a.j.clone();
    }
}
