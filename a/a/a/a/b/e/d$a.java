package a.a.a.a.b.e.d$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class d$a extends Enum	// class@000017
{
    public final int a;
    public static final d$a b;
    public static final d$a c;
    public static final d$a d;
    public static final d$a[] e;

    static {
       d$a uoa = new d$a("RATIO", 0, 0);
       d$a.b = uoa;
       d$a uoa1 = new d$a("FULL", 1, 1);
       d$a.c = uoa1;
       d$a uoa2 = new d$a("IGNORE", 2, 2);
       d$a.d = uoa2;
       d$a[] uoaArray = new d$a[]{uoa,uoa1,uoa2};
       d$a.e = uoaArray;
    }
    public void d$a(String p0,int p1,int p2){
       this.a = p2;
    }
    public static d$a valueOf(String p0){
       return Enum.valueOf(d$a.class, p0);
    }
    public static d$a[] values(){
       return d$a.e.clone();
    }
    public int a(){
       return this.a;
    }
}
