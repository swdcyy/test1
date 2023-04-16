package com.yxcorp.gifshow.ad.webview.AdWebInterceptUtil;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.ad.webview.AdWebInterceptUtil$mBlackRequestInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import p59.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import sl9.b;
import lnc.y0;
import k59.e2;
import p59.n;

public final class AdWebInterceptUtil	// class@001896
{
    public static final boolean a;
    public static final p b;
    public static final AdWebInterceptUtil c;

    static {
       AdWebInterceptUtil.c = new AdWebInterceptUtil();
       AdWebInterceptUtil.a = a.t().d("disableJumpBridgeWhenH5Preloading", false);
       AdWebInterceptUtil.b = s.c(AdWebInterceptUtil$mBlackRequestInfo$2.INSTANCE);
    }
    public void AdWebInterceptUtil(){
       super();
    }
    public static final boolean b(t p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdWebInterceptUtil uAdWebInterc = AdWebInterceptUtil.class;
       Boolean uBoolean = null;
       AdWebInterceptUtil obj = PatchProxy.applyOneRefs(p0, uBoolean, uAdWebInterc, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!AdWebInterceptUtil.a) {
          return false;
       }
       obj = AdWebInterceptUtil.c;
       t f = (p0 != null)? p0.f: uBoolean;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(f, obj, uAdWebInterc, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(f != null){
          uBoolean = Boolean.valueOf(f.c());
       }
       b = y0.p(uBoolean);
       if (b) {
          if (p0 != null) {
             p0 = p0.g;
             if (p0 != null) {
                p0.p();
             }
          }
          return true;
       }else {
          return false;
       }
    }
    public final n a(){
       Object obj = PatchProxy.apply(null, this, AdWebInterceptUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdWebInterceptUtil.b.getValue();
    }
}
