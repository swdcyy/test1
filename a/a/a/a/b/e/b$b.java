package a.a.a.a.b.e.b$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class b$b extends Enum	// class@000012
{
    public static final b$b a;
    public static final b$b b;
    public static final b$b c;
    public static final b$b d;
    public static final b$b e;
    public static final b$b[] f;

    static {
       b$b uob = new b$b("ALL", 0);
       b$b.a = uob;
       b$b uob1 = new b$b("CBACK_REPORT", 1);
       b$b.b = uob1;
       b$b uob2 = new b$b("CBACK_ONERROR", 2);
       b$b.c = uob2;
       b$b uob3 = new b$b("CBACK_R_E", 3);
       b$b.d = uob3;
       b$b uob4 = new b$b("S_PERF", 4);
       b$b.e = uob4;
       b$b[] uobArray = new b$b[]{uob,uob1,uob2,uob3,uob4};
       b$b.f = uobArray;
    }
    public void b$b(String p0,int p1){
       super(p0, p1);
    }
    public static b$b valueOf(String p0){
       return Enum.valueOf(b$b.class, p0);
    }
    public static b$b[] values(){
       return b$b.f.clone();
    }
}
