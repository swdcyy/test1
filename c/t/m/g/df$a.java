package c.t.m.g.df$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class df$a extends Enum	// class@000c40
{
    public static final df$a a;
    public static final df$a b;
    public static final df$a c;
    public static final df$a d;
    public static final df$a e;
    public static final df$a f;
    public static final df$a g;
    public static final df$a h;
    public static final df$a i;
    public static final df$a[] j;

    static {
       df$a uoa = new df$a("NONE", 0);
       df$a.a = uoa;
       df$a uoa1 = new df$a("GSM", 1);
       df$a.b = uoa1;
       df$a uoa2 = new df$a("CDMA", 2);
       df$a.c = uoa2;
       df$a uoa3 = new df$a("WCDMA", 3);
       df$a.d = uoa3;
       df$a uoa4 = new df$a("LTE", 4);
       df$a.e = uoa4;
       df$a uoa5 = new df$a("NR", 5);
       df$a.f = uoa5;
       df$a uoa6 = new df$a("TEMP6", 6);
       df$a.g = uoa6;
       df$a uoa7 = new df$a("TEMP7", 7);
       df$a.h = uoa7;
       df$a uoa8 = new df$a("NOSIM", 8);
       df$a.i = uoa8;
       df$a[] uoaArray = new df$a[9];
       uoaArray[0] = uoa;
       uoaArray[1] = uoa1;
       uoaArray[2] = uoa2;
       uoaArray[3] = uoa3;
       uoaArray[4] = uoa4;
       uoaArray[5] = uoa5;
       uoaArray[6] = uoa6;
       uoaArray[7] = uoa7;
       uoaArray[8] = uoa8;
       df$a.j = uoaArray;
    }
    public void df$a(String p0,int p1){
       super(p0, p1);
    }
    public static df$a valueOf(String p0){
       return Enum.valueOf(df$a.class, p0);
    }
    public static df$a[] values(){
       return df$a.j.clone();
    }
}
