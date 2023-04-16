package nd9.l0;
import java.lang.Runnable;
import nd9.n0;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.View;
import android.app.Activity;
import nd9.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import nd9.g0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class l0 implements Runnable	// class@00314c
{
    public final n0 b;

    public void l0(n0 p0){
       this.b = p0;
    }
    public final void run(){
       l0 tb = this.b;
       d e = tb.e;
       if (e == null) {
       }else {
          tb.q = false;
          tb.r = false;
          View view = e.findViewById(R.id.camera_tab_scroll_group);
          tb.p = view;
          if (view != null) {
             m0 om0 = new m0(tb);
             if (!PatchProxy.applyVoidOneRefs(om0, tb, n0.class, "6")) {
                n0 p = tb.p;
                if (p != null) {
                   if (p.getWidth() > 0 && tb.p.getHeight() > 0) {
                      om0.run();
                   }else {
                      ViewTreeObserver viewTreeObse = tb.p.getViewTreeObserver();
                      if (viewTreeObse != null) {
                         tb.i2();
                         g0 og0 = new g0(tb, om0);
                         tb.o = og0;
                         viewTreeObse.addOnGlobalLayoutListener(og0);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
