package com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge$c;
import o63.l;
import com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import nsd.u;
import o63.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.kwai.yoda.bridge.InvokeContextCompatHelper;
import rx7.a;
import com.kwai.yoda.function.c;
import rx7.a$a;
import ty7.c;
import ty7.g;
import ty7.d;
import nz7.e;
import java.lang.Integer;

public final class LiveWebCommandBridge$c extends l	// class@001003
{
    public final LiveWebCommandBridge c;
    public final YodaBaseWebView d;
    public final String e;
    public final String f;
    public final String g;

    public void LiveWebCommandBridge$c(LiveWebCommandBridge p0,YodaBaseWebView p1,String p2,String p3,String p4,boolean p5){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super(p5, false, 2, null);
    }
    public void a(n p0){
       Object obj = this;
       n obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveWebCommandBridge$c.class, "1")) {
          return;
       }
       String str = "result";
       a.p(obj1, str);
       LiveWebCommandBridge$c c = obj.c;
       LiveWebCommandBridge$c d = obj.d;
       obj1 = obj1.b;
       LiveWebCommandBridge$c e = obj.e;
       LiveWebCommandBridge$c f = obj.f;
       LiveWebCommandBridge$c g = obj.g;
       Objects.requireNonNull(c);
       LiveWebCommandBridge liveWebComma = LiveWebCommandBridge.class;
       if (PatchProxy.isSupport(liveWebComma)) {
          Object[] objArray = new Object[]{d,obj1,e,f,"",g};
          if (PatchProxy.applyVoid(objArray, c, liveWebComma, "2")) {
          label_00a7 :
             return;
          }
       }
       a.p(d, "webView");
       a.p(obj1, str);
       a.p(e, "nameSpace");
       a.p(f, "command");
       a uoa = d.getJavascriptBridge().t().a(g);
       if (uoa == null) {
          a.m(g);
          uoa = a.r.a(e, f, "", g, c.c);
       }
       uoa.c();
       c debugKit = d.getDebugKit();
       if (debugKit != null) {
          debugKit.a(new g(e, f, null, obj1));
       }
       d.getJavascriptBridge().q(g, obj1, uoa);
       d.getSessionLogger().t(uoa, Integer.valueOf(1), "", obj1);
       uoa.d();
       c.n();
       goto label_00a7 ;
    }
}
