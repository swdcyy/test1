package b8a.y0;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.o;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import xe5.r;
import xe5.t;

public final class y0 implements View$OnLayoutChangeListener	// class@000419
{
    public final o b;

    public void y0(o p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       y0 tb = this.b;
       if (tb.H == null) {
       }else {
          p2 = p0.getWidth();
          int height = p0.getHeight();
          o oo = o.class;
          if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p2), Integer.valueOf(height), tb, oo, "9")) {
             oo = tb.K;
             if (oo.k != p2 || oo.l != height) {
                oo.k = p2;
                oo.l = height;
                tb.H.o0(oo, oo.h, oo.i);
             }
          }
       }
       return;
    }
}
