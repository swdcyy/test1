package com.kuaishou.commercial.corona.social.AdProfileBannerPresenter$renderBanner$tkBridgeContext$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import xw.a;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;

public final class AdProfileBannerPresenter$renderBanner$tkBridgeContext$1 extends Lambda implements l	// class@0014ae
{
    public final a this$0;

    public void AdProfileBannerPresenter$renderBanner$tkBridgeContext$1(a p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(AdProfileBannerPresenter$renderBanner$tkBridgeContext$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdProfileBannerPresenter$renderBanner$tkBridgeContext$1.class, "1")) {
          return;
       }
       a s = this.this$0.s;
       if (s == null) {
          a.S("mBannerContainer");
       }
       if (s != null) {
          s.removeAllViews();
       }
       return;
    }
}
