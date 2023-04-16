package com.kuaishou.commercial.splash.playable.e;
import erd.g;
import com.kuaishou.commercial.splash.playable.g;
import java.lang.Object;
import bz.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import ez.y;
import java.lang.Runnable;
import ekd.k1;

public final class e implements g	// class@0015bd
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       e tb = this.b;
       Objects.requireNonNull(tb);
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, og, "3")) {
       }else if(p0.b != 2 && tb.A != null){
          p0 = PatchProxy.apply(null, tb, og, "4");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else if(!tb.getActivity() instanceof KwaiYodaWebViewActivity || (tb.getActivity().isImmersiveMode() || (!tb.getActivity() instanceof KwaiWebViewActivity || (tb.getActivity().isImmersiveMode() || tb.R8())))){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             k1.r(new y(tb), 800);
          }
       }
       return;
    }
}
