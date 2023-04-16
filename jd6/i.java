package jd6.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fw8.r;
import jd6.i$a;
import fw8.r$a;

public final class i	// class@001b4f
{
    public static boolean a = true;
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public static final boolean a(i p0){
       return i.a;
    }
    public static final void b(i p0,boolean p1){
       i.a = p1;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       r.c().a(new i$a());
       return;
    }
}
