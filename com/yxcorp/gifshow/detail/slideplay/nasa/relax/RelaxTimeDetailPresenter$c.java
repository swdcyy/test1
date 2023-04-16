package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$c;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import uw9.o;
import java.lang.StringBuilder;
import com.kwai.framework.player.core.b;
import q87.c;
import java.lang.Runnable;
import android.view.TextureView;

public class RelaxTimeDetailPresenter$c implements b$b	// class@0017ad
{
    public final RelaxTimeDetailPresenter b;

    public void RelaxTimeDetailPresenter$c(RelaxTimeDetailPresenter p0){
       this.b = p0;
       super();
    }
    public void d(int p0){
       RelaxTimeDetailPresenter$c tb;
       if (PatchProxy.isSupport2(RelaxTimeDetailPresenter$c.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, RelaxTimeDetailPresenter$c.class, "1")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       if (p0 != 2) {
          if (p0 == 3) {
             tb = this.b;
             if (tb.N != null) {
                tb.A.setVisibility(8);
                Object[] objArray = new Object[i];
                objArray[i1] = "isPaused = "+this.b.F.isPaused();
                o.C().w("RelaxTimeDetailPresenter", "PLAYER_STATE_STARTED isPlaying = "+this.b.F.isPlaying(), objArray);
                tb = this.b;
                tb.s.removeCallbacks(tb.S);
                tb = this.b;
                tb.s.postDelayed(tb.S, 2000);
             }
             tb.N = i1;
          }
       }else {
          Object[] objArray1 = new Object[i1];
          o.C().w("RelaxTimeDetailPresenter", "PLAYER_STATE_PREPARED ", objArray1);
          tb = this.b;
          tb.K = i;
          tb.s.removeCallbacks(tb.U);
          this.b.a9();
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$c.class, "1");
       return;
    }
}
