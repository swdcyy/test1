package com.kuaishou.merchant.interpretation.presenter.e;
import com.kwai.framework.player.core.b$b;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.player.core.b;
import i04.a;
import h04.c;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import m04.r;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class e implements b$b	// class@00185b
{
    public final MerchantInterpretationPlayerPresenter b;

    public void e(MerchantInterpretationPlayerPresenter p0){
       this.b = p0;
    }
    public final void d(int p0){
       Object[] objArray1;
       Object[] objArray2;
       e tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       String str = "MerchantInterpretationPlayerPresenter";
       if (p0 != 2) {
          String str1 = "isPaused = ";
          String str2 = 1;
          if (p0 != 3) {
             if (p0 != 4) {
                if (p0 != 6) {
                   if (p0 == 7) {
                      tb.L = tb.D.getCurrentPosition();
                      tb.P.a(3);
                      Object[] objArray = new Object[i];
                      c.C().w(str, "PLAYER_STATE_ERROR "+tb.L, objArray);
                      tb.r.post(new r(tb));
                   }
                }else {
                   objArray1 = new Object[i];
                   c.C().w(str, "PLAYER_STATE_COMPLETED ", objArray1);
                   tb.P.a(3);
                   tb.M = str2;
                   tb.r.post(new r(tb));
                }
             }else {
                objArray2 = new Object[str2];
                objArray2[i] = str1+tb.D.isPaused();
                c.C().w(str, "PLAYER_STATE_PAUSED isPlaying = "+tb.D.isPlaying(), objArray2);
                tb.P.a(3);
                tb.r.post(new r(tb));
             }
          }else {
             objArray2 = new Object[str2];
             objArray2[i] = str1+tb.D.isPaused();
             c.C().w(str, "PLAYER_STATE_STARTED isPlaying = "+tb.D.isPlaying(), objArray2);
             MerchantInterpretationPlayerPresenter l = tb.L;
             if (l > 0) {
                tb.D.seekTo(l);
             }
             tb.L = 0;
             tb.P.c(3);
             tb.r.post(new r(tb));
          }
       }else {
          objArray1 = new Object[i];
          c.C().w(str, "PLAYER_STATE_PREPARED ", objArray1);
          p0.b = tb.D.getDuration();
          tb.d9();
          tb.r.post(new r(tb));
       }
       return;
    }
}
