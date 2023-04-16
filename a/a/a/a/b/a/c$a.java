package a.a.a.a.b.a.c$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class c$a extends Enum	// class@00000e
{
    public int a;
    public static final c$a b;
    public static final c$a c;
    public static final c$a[] d;

    static {
       c$a uoa = new c$a("OFFLINE", 0, 1);
       c$a.b = uoa;
       c$a uoa1 = new c$a("ONLINE", 1, 2);
       c$a.c = uoa1;
       c$a[] uoaArray = new c$a[]{uoa,uoa1};
       c$a.d = uoaArray;
    }
    public void c$a(String p0,int p1,int p2){
       this.a = p2;
    }
    public static c$a a(int p0){
       if (p0 == 1) {
          return c$a.b;
       }
       if (p0 == 2) {
          return c$a.c;
       }
       return c$a.c;
    }
    public static c$a valueOf(String p0){
       return Enum.valueOf(c$a.class, p0);
    }
    public static c$a[] values(){
       return c$a.d.clone();
    }
    public int a(){
       return this.a;
    }
}
