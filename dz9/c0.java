package dz9.c0;
import mf5.w0;
import java.lang.String;
import kf5.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public class c0 extends w0	// class@00200a
{

    public void c0(){
       super("space");
    }
    public int C(){
       return 5;
    }
    public boolean E(){
       return true;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c0.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       return;
    }
}
