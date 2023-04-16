package com.kuaishou.merchant.interpretation.presenter.c;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.player.core.b;
import i04.a;
import m04.r;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class c implements View$OnClickListener	// class@001859
{
    public final MerchantInterpretationPlayerPresenter b;

    public void c(MerchantInterpretationPlayerPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, MerchantInterpretationPlayerPresenter.class, "6")) {
       }else {
          MerchantInterpretationPlayerPresenter d = tb.D;
          if (d != null && d.isPrepared()) {
             int i = 2;
             if (tb.D.isPlaying()) {
                tb.M = true;
                tb.P.a(i);
                tb.h9();
             }else {
                tb.M = false;
                tb.P.c(i);
                tb.d9();
             }
             tb.r.post(new r(tb));
          }
       }
       return;
    }
}
