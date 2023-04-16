package r97.z;
import r97.a0;
import r97.a;
import java.lang.String;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import r97.r$a;
import r97.r;
import r97.o$a;
import r97.o;
import java.util.Map;
import ca7.f;
import java.lang.Object;
import com.google.gson.Gson;
import r97.t;
import r97.h0;
import r97.v$a;
import r97.v;
import java.lang.Throwable;
import android.util.Log;
import r97.i0;
import okhttp3.EventListener$Factory;
import r97.c0;
import android.app.Activity;
import r97.d0;

public final class z	// class@002358
{

    public static void a(a0 p0,a p1){
    }
    public static void b(a0 p0,String p1,String p2,String p3){
       p0.c(p1, "", p2, p3);
    }
    public static void c(a0 p0,String p1,String p2,String p3,JsonObject p4){
       String str = (p4 == null)? "": p4.toString();
       p0.c(p1, p2, p3, str);
       return;
    }
    public static void d(a0 p0,String p1,String p2,String p3,String p4){
       p0.d(p1, p2, p3, p4, "");
    }
    public static void e(a0 p0,String p1,String p2,String p3,String p4,String p5){
       r$a uoa = r.b();
       uoa.d(o.builder().i(p1).j(p2).b());
       uoa.f(p3);
       uoa.h(p4);
       uoa.b(p5);
       p0.E(uoa.c());
    }
    public static void f(a0 p0,String p1,String p2,String p3,Map p4){
       String str = (p4 == null)? "": f.b.q(p4);
       p0.c(p1, p2, p3, str);
       return;
    }
    public static void g(a0 p0,t p1){
       p0.C(p1, null);
    }
    public static void h(a0 p0,String p1,String p2,String p3,int p4){
       p0.n(v.a().c(o.builder().i(p1).j(p2).b()).e(p3).f(p4).b());
    }
    public static void i(a0 p0,String p1,String p2,Throwable p3){
       p0.q(p1, p2, Log.getStackTraceString(p3), 2);
    }
    public static void j(a0 p0,String p1,Throwable p2){
       p0.h(p1, "", p2);
    }
    public static void k(a0 p0,i0 p1){
       p0.B(p1, null);
    }
    public static void l(a0 p0,JsonObject p1){
    }
    public static EventListener$Factory m(a0 p0){
       return null;
    }
    public static boolean n(a0 p0,c0 p1,Activity p2,String p3,boolean p4){
       return false;
    }
    public static boolean o(a0 p0,c0 p1,Activity p2,String p3,boolean p4,d0 p5){
       return false;
    }
    public static void p(a0 p0,String p1){
    }
}
