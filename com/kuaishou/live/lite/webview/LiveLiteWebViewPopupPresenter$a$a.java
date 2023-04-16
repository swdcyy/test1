package com.kuaishou.live.lite.webview.LiveLiteWebViewPopupPresenter$a$a;
import lp3.e;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import lp3.c;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;
import java.util.Objects;

public final class LiveLiteWebViewPopupPresenter$a$a implements e	// class@000bb3
{
    public final Map a;

    public void LiveLiteWebViewPopupPresenter$a$a(Map p0){
       a.p(p0, "cachedServices");
       super();
       this.a = p0;
    }
    public c a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteWebViewPopupPresenter$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = this.a.get(p0);
       if (obj != null) {
          return obj;
       }
       throw new IllegalArgumentException("Service "+p0+" 未找到，"+"请检查 service 是否已经在 ServiceManagerInitLogic 以及 LiveLiteWebViewPopupPresenter 中注册！".toString());
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteWebViewPopupPresenter$a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isEmpty();
    }
    public c c(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteWebViewPopupPresenter$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       return this.a.get(p0);
    }
    public void clear(){
    }
    public boolean d(Class p0){
       LiveLiteWebViewPopupPresenter$a$a obj = PatchProxy.applyOneRefs(p0, this, LiveLiteWebViewPopupPresenter$a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "clazz");
       obj = this.a;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
       return obj.containsKey(p0);
    }
}
