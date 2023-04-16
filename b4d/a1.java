package b4d.a1;
import ub.a;
import b4d.v0;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class a1 extends a	// class@000355
{
    public final Runnable b;
    public final v0 c;

    public void a1(v0 p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a1.class, "1")) {
       }else {
          a1 tb = this.b;
          if (tb != null) {
             tb.run();
          }
       }
       return;
    }
}
