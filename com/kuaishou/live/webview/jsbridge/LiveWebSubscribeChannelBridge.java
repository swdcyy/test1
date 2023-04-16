package com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge;
import com.kwai.yoda.function.c;
import com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge$b;
import nsd.u;
import o63.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import fg6.a;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams;
import com.google.gson.Gson;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.FunctionResultParams$a;
import o63.f;
import lq3.b;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import o63.h;
import com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge$ResultParams;
import qrd.l1;
import com.kwai.yoda.YodaWebView;
import com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge$a;
import crd.b;
import o63.s;

public final class LiveWebSubscribeChannelBridge extends c	// class@001008
{
    public final a f;
    public static final LiveWebSubscribeChannelBridge$b g;

    static {
       LiveWebSubscribeChannelBridge.g = new LiveWebSubscribeChannelBridge$b(null);
    }
    public void LiveWebSubscribeChannelBridge(a p0){
       a.p(p0, "jsBridgeService");
       super();
       this.f = p0;
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       Object[] objArray;
       String obj1;
       String str;
       String str1;
       f uof;
       b uob;
       LiveWebSubscribeChannelBridge$ResultParams resultParams;
       f uof1;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       LiveWebSubscribeChannelBridge liveWebSubsc = LiveWebSubscribeChannelBridge.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(liveWebSubsc)) {
          objArray = new Object[i3];
          objArray[i5] = oobject;
          objArray[i4] = oobject1;
          objArray[i2] = oobject2;
          objArray[i1] = oobject3;
          objArray[i] = oobject4;
          if (PatchProxy.applyVoid(objArray, obj, liveWebSubsc, "1")) {
             return;
          }
       }
       a.p(oobject, "webView");
       a.p(oobject1, "nameSpace");
       a.p(oobject2, "command");
       a.p(oobject3, "params");
       a.p(oobject4, "callbackId");
       b.Z(LiveJsBridgeLogTag.Web, "command: "+oobject2+" params: "+oobject3+" callbackId: "+oobject4);
       int i6 = 0x1e84f;
       if (a.g(oobject2, "subscribeChannel")) {
          if (PatchProxy.isSupport(liveWebSubsc)) {
             objArray = new Object[i3];
             objArray[i5] = oobject3;
             objArray[i4] = oobject;
             objArray[i2] = oobject1;
             objArray[i1] = oobject2;
             objArray[i] = oobject4;
             if (!PatchProxy.applyVoid(objArray, obj, liveWebSubsc, "2")) {
             }
          }else {
          }
       }else if(a.g(oobject2, "unsubscribeChannel")){
          if (PatchProxy.isSupport(liveWebSubsc)) {
             objArray = new Object[i3];
             objArray[i5] = oobject3;
             objArray[i4] = oobject;
             objArray[i2] = oobject1;
             objArray[i1] = oobject2;
             objArray[i] = oobject4;
             if (!PatchProxy.applyVoid(objArray, obj, liveWebSubsc, "3")) {
             }
          }else {
          }
       }
    label_01d0 :
       return;
    }
}
