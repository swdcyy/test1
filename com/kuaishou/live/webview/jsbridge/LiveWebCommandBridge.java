package com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge;
import com.kwai.yoda.function.c;
import com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge$a;
import nsd.u;
import o63.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import o63.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import o63.k;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import ny7.a;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge;
import com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge$b;
import o63.r;
import com.kuaishou.live.webview.jsbridge.a;
import lq3.d;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge$c;
import o63.o;
import o63.j;
import lq3.a;
import com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge$b;
import o63.p;
import o63.l;
import o63.j$a;
import o63.m;
import o63.m$a;

public final class LiveWebCommandBridge extends c	// class@001004
{
    public final a f;
    public static final LiveWebCommandBridge$a g;

    static {
       LiveWebCommandBridge.g = new LiveWebCommandBridge$a(null);
    }
    public void LiveWebCommandBridge(a p0){
       a.p(p0, "jsBridgeService");
       super();
       this.f = p0;
    }
    public static final void s(YodaBaseWebView p0,a p1,e p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveWebCommandBridge.class, "3")) {
          return;
       }
       LiveWebCommandBridge$a g = LiveWebCommandBridge.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, g, LiveWebCommandBridge$a.class, "1")) {
          String str = "webView";
          a.p(p0, str);
          String str1 = "jsBridgeService";
          a.p(p1, str1);
          Iterator iterator = p1.fc();
          while (iterator.hasNext()) {
             k ok = iterator.next();
             e uoe = (p2 != null)? p2: p1.Mf();
             if (uoe.a(ok)) {
                p0.getJavascriptBridge().o(ok.getNameSpace(), ok.getCommandName(), new LiveWebCommandBridge(p1));
             }
          }
          LiveWebSubscribeChannelBridge$b g1 = LiveWebSubscribeChannelBridge.g;
          Objects.requireNonNull(g1);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, g1, LiveWebSubscribeChannelBridge$b.class, "1")) {
             a.p(p0, str);
             a.p(p1, str1);
             p0.getJavascriptBridge().o("KwaiLive", "subscribeChannel", new LiveWebSubscribeChannelBridge(p1));
             p0.getJavascriptBridge().o("KwaiLive", "unsubscribeChannel", new LiveWebSubscribeChannelBridge(p1));
          }
          if (r.d.b(r.e).a(p1.ph())) {
             a uoa = new a(p0, p1);
             if (!PatchProxy.applyVoid(null, uoa, d.class, "1")) {
                uoa.f.getJavascriptBridge().o("Kwai", "popBack", uoa);
             }
          }
       }
    label_00c2 :
       return;
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       LiveWebCommandBridge liveWebComma = LiveWebCommandBridge.class;
       if (PatchProxy.isSupport(liveWebComma)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, liveWebComma, "1")) {
             return;
          }
       }
       a.p(p0, "webView");
       a.p(p1, "nameSpace");
       a.p(p2, "command");
       a.p(p3, "params");
       a.p(p4, "callbackId");
       b.Z(LiveJsBridgeLogTag.Web, "command: "+p2+" params: "+p3+" callbackId: "+p4);
       LiveWebCommandBridge$c uoc = new LiveWebCommandBridge$c(this, p0, p1, p2, p4, o.a(p2));
       j oj = this.f.Ce(p1, p2);
       if (oj != null) {
          oj.c(new a(p1, p2, p3), liveWebComma, new LiveWebCommandBridge$b(p0));
          return;
       }else {
          liveWebComma.b(m.g.a(-2, "unknown command: "+p2));
          return;
       }
    }
}
