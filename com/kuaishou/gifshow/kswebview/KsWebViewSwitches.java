package com.kuaishou.gifshow.kswebview.KsWebViewSwitches;
import com.kuaishou.gifshow.kswebview.KsWebViewSwitches$mPageLoadReportRatio$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.gifshow.kswebview.KsWebViewSwitches$mShouldReportPageLoad$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import kotlin.jvm.internal.a;

public final class KsWebViewSwitches	// class@0019e9
{
    public static final p a;
    public static final p b;
    public static final KsWebViewSwitches c;

    static {
       KsWebViewSwitches.c = new KsWebViewSwitches();
       KsWebViewSwitches.a = s.c(KsWebViewSwitches$mPageLoadReportRatio$2.INSTANCE);
       KsWebViewSwitches.b = s.c(KsWebViewSwitches$mShouldReportPageLoad$2.INSTANCE);
    }
    public void KsWebViewSwitches(){
       super();
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, KsWebViewSwitches.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("ksWebViewAsyncCompositingMode", 3);
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, KsWebViewSwitches.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("switchKsWebViewHttpDnsPolicy", 0);
    }
    public final float c(){
       Object obj = PatchProxy.apply(null, this, KsWebViewSwitches.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = KsWebViewSwitches.a.getValue();
       }
       return obj.floatValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, KsWebViewSwitches.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SystemUtil.J()) {
          return a.t().d("switchEnableGrayVersionKsWebView", true);
       }
       return a.t().d("switchEnableKSWebView", true);
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, KsWebViewSwitches.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("switchEnableSingleLayerRender", true);
    }
    public final String f(){
       String obj = PatchProxy.apply(null, this, KsWebViewSwitches.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("switchKsWebViewOptimizePolicyString", "");
       a.o(obj, "SwitchConfigManager.getI¡­TIMIZE_POLICY_STRING, \"\"\)");
       return obj;
    }
}
