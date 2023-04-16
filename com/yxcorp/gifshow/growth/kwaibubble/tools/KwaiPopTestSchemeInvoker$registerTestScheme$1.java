package com.yxcorp.gifshow.growth.kwaibubble.tools.KwaiPopTestSchemeInvoker$registerTestScheme$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cpa.a;
import java.util.Objects;
import o56.a;
import java.lang.Boolean;
import vqa.k;
import pna.k;
import java.lang.StringBuilder;

public final class KwaiPopTestSchemeInvoker$registerTestScheme$1 extends Lambda implements l	// class@001423
{
    public static final KwaiPopTestSchemeInvoker$registerTestScheme$1 INSTANCE;

    static {
       KwaiPopTestSchemeInvoker$registerTestScheme$1.INSTANCE = new KwaiPopTestSchemeInvoker$registerTestScheme$1();
    }
    public void KwaiPopTestSchemeInvoker$registerTestScheme$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, KwaiPopTestSchemeInvoker$registerTestScheme$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "bundleId");
       obj = a.a;
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyOneRefs(p0, obj, a.class, "2");
       if (str != patchProxyRe) {
       }else {
          str = "";
          if (a.d()) {
             k b = k.b;
             if (a.g(Boolean.TRUE, b.b("KEY_K_BUBBLE_TK_BUNDLE_TEST", Boolean.FALSE))) {
                str = "kwai://tachikoma?bundleId="+p0+"&bundleIp="+b.b("KEY_K_BUBBLE_TK_BUNDLE_IP", str);
             }
          }
       }
       return str;
    }
}
