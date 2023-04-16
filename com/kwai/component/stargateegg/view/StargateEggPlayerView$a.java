package com.kwai.component.stargateegg.view.StargateEggPlayerView$a;
import java.lang.Runnable;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.player.core.b;
import wg5.b;
import qsd.d;
import android.os.Handler;

public final class StargateEggPlayerView$a implements Runnable	// class@000b4a
{
    public final StargateEggPlayerView b;

    public void StargateEggPlayerView$a(StargateEggPlayerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       boolean b;
       StargateEggPlayerView a;
       double d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StargateEggPlayerView$a.class, "1")) {
          return;
       }
       StargateEggPlayerView$a tb = this.b;
       if (tb.u != null) {
          Objects.requireNonNull(tb);
          StargateEggPlayerView obj = PatchProxy.apply(objArray, tb, StargateEggPlayerView.class, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = tb.A;
             boolean b1 = (obj != null)? obj.isPrepared(): false;
             if (b1) {
                a = tb.A;
                b = (a != null)? a.isPaused(): true;
                if (!b) {
                   b = true;
                }
             }
             b = false;
          }
          if (b) {
             tb = this.b;
             if (tb.t == null) {
                StargateEggPlayerView v = tb.V;
                if (v != null) {
                   a = tb.A;
                   d = (a != null)? (double)a.getCurrentPosition(): null;
                   tb = this.b;
                   v.a(d, (double)tb.v, (double)tb.w);
                }
                tb = this.b;
                tb.d.postDelayed(tb.e, (long)d.H0(tb.q));
             }
          }
       }
    label_0079 :
       return;
    }
}
