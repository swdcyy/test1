package com.kuaishou.merchant.interpretation.presenter.g;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import i04.a;
import m04.r;
import java.lang.Runnable;
import android.widget.FrameLayout;
import e17.i;
import java.lang.System;

public final class g implements IMediaPlayer$OnInfoListener	// class@00185d
{
    public final MerchantInterpretationPlayerPresenter b;

    public void g(MerchantInterpretationPlayerPresenter p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 != 3) {
          if (p1 != 701) {
             if (p1 == 702) {
                tb.P.a(1);
                tb.r.post(new r(tb));
             }
          }else {
             tb.P.c(1);
             tb.r.post(new r(tb));
          }
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f102773);
          tb.r.post(new r(tb));
          MerchantInterpretationPlayerPresenter p = tb.P;
          long l = System.currentTimeMillis();
          if (!p.o && l) {
             p.o = l;
          }
       }
       return false;
    }
}
