package bh9.g;
import java.lang.Runnable;
import bh9.r;
import com.yxcorp.gifshow.widget.ControlSpeedLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import ug9.c;
import com.yxcorp.gifshow.camera.record.base.b;
import hd9.n;
import java.util.Objects;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import dg.e;
import ekd.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.j;

public final class g implements Runnable	// class@00049c
{
    public final r b;
    public final ControlSpeedLayout c;

    public void g(r p0,ControlSpeedLayout p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       boolean b;
       g tb = this.b;
       g tc = this.c;
       tb.g2();
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, tb, r.class, "20");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.d.d(c.c).a != null || tb.d.d(n.j).a != null){
          b = true;
       }else {
          b = false;
       }
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(ControlSpeedLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tc, ControlSpeedLayout.class, "22")) {
          tc.setTag(R.id.speed_layout_shown, Boolean.TRUE);
          if (b) {
             tc.b.setVisibility(8);
             tc.f.setVisibility(8);
             tc.getLayoutParams().width = a1.e(150.00f);
          }
          tc.clearAnimation();
          tc.setAlpha(0);
          tc.setScaleX(0x3f47ae14);
          tc.setScaleY(0x3f47ae14);
          tc.setVisibility(i);
          tc.animate().alpha(0x3f800000).setDuration(200).setListener(objArray).start();
          f.o(tc, 0x3f47ae14, 0x3f800000, 700.00f, 40.00f);
          tc.g.setBackgroundResource(R.drawable.arg_RES_7f080655);
       }
       RxBus.f.b(new j(true));
       return;
    }
}
