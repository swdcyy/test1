package a.a.a.a.b.e.d$b;
import java.lang.Enum;
import a.a.a.a.b.e.d$a;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class d$b extends Enum	// class@000018
{
    public final int a;
    public final d$a b;
    public static final d$b c;
    public static final d$b d;
    public static final d$b e;
    public static final d$b f;
    public static final d$b g;
    public static final d$b h;
    public static final d$b[] i;

    static {
       d$a c = d$a.c;
       d$b uob = new d$b("KSG_INITFAILURE", 0, 0, c);
       d$b.c = uob;
       d$b uob1 = new d$b("KSG_INITSUCCESS", 1, 1);
       d$b.d = uob1;
       d$b uob2 = new d$b("KSG_PREFWATCH", 2, 2, d$a.b);
       d$b.e = uob2;
       d$b uob3 = new d$b("KSG_EXCEPTION", 3, 3, c);
       d$b.f = uob3;
       d$b uob4 = new d$b("KSG_LOADSOFAIL", 4, 4, c);
       d$b.g = uob4;
       d$b uob5 = new d$b("KSG_LITE", 5, 5, c);
       d$b.h = uob5;
       d$b[] uobArray = new d$b[]{uob,uob1,uob2,uob3,uob4,uob5};
       d$b.i = uobArray;
    }
    public void d$b(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
       this.b = d$a.d;
    }
    public void d$b(String p0,int p1,int p2,d$a p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static d$b valueOf(String p0){
       return Enum.valueOf(d$b.class, p0);
    }
    public static d$b[] values(){
       return d$b.i.clone();
    }
    public d$a a(){
       return this.b;
    }
    public int b(){
       return this.a;
    }
}
