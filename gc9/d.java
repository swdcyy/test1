package gc9.d;
import ub.a;
import gc9.a;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hc.a;
import gc9.c;
import java.lang.Runnable;
import android.view.View;

public final class d extends a	// class@002474
{
    public final a b;

    public void d(a p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, d.class, "1")) {
       }else if(!p2 instanceof a){
          PatchProxy.onMethodExit(d.class, "1");
       }else {
          d tb = this.b;
          c uoc = new c(this, p2);
          tb.r = uoc;
          a o = tb.o;
          if (o != null) {
             o.postDelayed(uoc, a.u);
          }
          PatchProxy.onMethodExit(d.class, "1");
       }
       return;
    }
}
