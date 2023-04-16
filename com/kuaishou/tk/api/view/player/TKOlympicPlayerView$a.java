package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$a;
import java.lang.Runnable;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.player.core.b;
import yx4.b;
import qsd.d;
import android.os.Handler;

public final class TKOlympicPlayerView$a implements Runnable	// class@000f96
{
    public final TKOlympicPlayerView b;

    public void TKOlympicPlayerView$a(TKOlympicPlayerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       boolean b;
       TKOlympicPlayerView a;
       double d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKOlympicPlayerView$a.class, "1")) {
          return;
       }
       TKOlympicPlayerView$a tb = this.b;
       if (tb.u != null) {
          Objects.requireNonNull(tb);
          TKOlympicPlayerView obj = PatchProxy.apply(objArray, tb, TKOlympicPlayerView.class, "10");
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
                TKOlympicPlayerView q = tb.Q;
                if (q != null) {
                   a = tb.A;
                   d = (a != null)? (double)a.getCurrentPosition(): null;
                   tb = this.b;
                   q.a(d, (double)tb.v, (double)tb.w);
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
