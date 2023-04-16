package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdtkPageLoadPresenter$initBridge$tkBridgeContext$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import d59.v;
import java.lang.Object;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.PageStatus;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;

public final class AdtkPageLoadPresenter$initBridge$tkBridgeContext$2 extends Lambda implements l	// class@001858
{
    public final v this$0;

    public void AdtkPageLoadPresenter$initBridge$tkBridgeContext$2(v p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PageStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkPageLoadPresenter$initBridge$tkBridgeContext$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.V8(false);
       boolean b = true;
       if (p0.mStatus == b) {
          v.P8(this.this$0).setDragStyle(2);
       }else {
          this.this$0.S8(b);
       }
       return;
    }
}
