package cd9.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import android.graphics.RectF;
import java.lang.Object;
import java.util.Objects;
import bd9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.duet.controller.a;
import dd9.g;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import lnc.s6;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import com.yxcorp.gifshow.camera.record.base.b;

public final class h implements Runnable	// class@0005a7
{
    public final DuetLayoutManager b;
    public final RectF c;
    public final RectF d;

    public void h(DuetLayoutManager p0,RectF p1,RectF p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       h tb = this.b;
       RectF rectF = tb.g2(this.c);
       RectF rectF1 = tb.g2(this.d);
       DuetLayoutManager t = tb.t;
       Objects.requireNonNull(t);
       if (PatchProxy.applyVoidTwoRefs(rectF, rectF1, t, d.class, "17")) {
       }else {
          d v = t.v;
          Objects.requireNonNull(v);
          if (!PatchProxy.applyVoidTwoRefs(rectF, rectF1, v, a.class, "2")) {
             v.w.set(rectF);
             v.x.set(rectF1);
          }
          d u = t.u;
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoidOneRefs(rectF, u, g.class, "38")) {
             g i = u.I;
             int i1 = 1;
             if (i != null) {
                int[] ointArray = n.p(i);
                u.u.set((rectF.left + (float)ointArray[0]), (rectF.top + (float)ointArray[i1]), (rectF.right + (float)ointArray[0]), (rectF.bottom + (float)ointArray[i1]));
             }else {
                u.u.set(rectF);
             }
             u.s.setTranslationX((rectF.centerX() - (float)(u.s.getWidth() / 2)));
             u.s.setTranslationY((rectF.centerY() - (float)(u.s.getHeight() / 2)));
             if (s6.H() && u.E == null) {
                if (u.K == null) {
                   ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a30b3, 0x7f0a30ae);
                   u.K = viewStubInfl;
                   viewStubInfl.d(u.e.findViewById(R.id.root_layout));
                }
                u.K.g(i1);
                View view = u.K.a();
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int)rectF.width();
                layoutParams.height = (int)rectF.height();
                view.setLayoutParams(layoutParams);
                view.setTranslationX(rectF.left);
                view.setTranslationY(rectF.top);
             }
             u.i2();
          }
       }
       tb.d.m(new c(rectF, rectF1, tb.v));
       return;
    }
}
