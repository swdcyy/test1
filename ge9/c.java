package ge9.c;
import java.lang.Object;
import h16.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import ge9.b;
import java.lang.Runnable;
import t45.c;
import java.util.List;

public class c	// class@00246e
{

    public void c(){
       super();
    }
    public static void a(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "2")) {
          return;
       }
       p0.o();
       return;
    }
    public static void b(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "1")) {
          return;
       }
       if (Looper.getMainLooper() == Looper.myLooper()) {
          c.a(new b(p0));
       }else {
          p0.m(p0.l());
          p0.n(p0.i());
       }
       return;
    }
}
