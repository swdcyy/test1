package com.kuaishou.live.bridge.rn.LiveRnChannelHandler;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import t71.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.external.invoke.krn.LiveJsContainerParams;
import o63.a;
import l41.a;
import o63.f;
import com.kuaishou.live.bridge.rn.LiveRnChannelHandler$a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import o63.h;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import java.lang.Exception;
import com.kuaishou.live.bridge.rn.LiveRnChannelHandler$InvalidParamException;
import com.kuaishou.live.bridge.rn.LiveRnChannelHandler$MissParamException;
import t71.e;

public final class LiveRnChannelHandler	// class@000e31
{
    public final HashMap a;
    public final ReactContext b;

    public void LiveRnChannelHandler(ReactContext p0){
       a.p(p0, "reactContext");
       super();
       this.b = p0;
       this.a = new HashMap();
    }
    public final String a(d p0){
       d obj = PatchProxy.applyOneRefs(p0, this, LiveRnChannelHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subscribeParams");
       obj = p0.params;
       if (obj == null) {
          throw new LiveRnChannelHandler$MissParamException("params");
       }
       d channel = p0.channel;
       String str = "channel";
       if (channel == null) {
          throw new LiveRnChannelHandler$MissParamException(str);
       }
       LiveJsContainerParams liveJsContai = p0.a();
       String str1 = (liveJsContai != null)? liveJsContai.a(): null;
       StringBuilder str2 = (str1 == null || !str1.length())? 1: null;
       if (!str2) {
          a uoa = a.a(str1);
          if (uoa != null) {
             f uof = uoa.V9(channel);
             if (uof != null) {
                LiveRnChannelHandler$a uoa1 = this.a.get(channel);
                if (uoa1 == null) {
                   b.Z(LiveJsBridgeLogTag.RN, "new Subscriber, chanlenName="+channel+' '+", reactContext="+this.b);
                   uoa1 = new LiveRnChannelHandler$a(channel, this.b);
                   this.a.put(channel, uoa1);
                }
                a.o(uoa1, "chanleSubscribers[channe¡­      newSubscriber\n    }");
                String str3 = uof.d(uoa1, obj);
                if (str3 != null) {
                   return str3;
                }else {
                   throw new Exception("subscribeChannel failed:"+p0);
                }
             }else {
                throw new LiveRnChannelHandler$InvalidParamException(str);
             }
          }else {
             throw new LiveRnChannelHandler$InvalidParamException("liveId");
          }
       }else {
          throw new LiveRnChannelHandler$MissParamException("containerParams.liveId");
       }
    }
    public final void b(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRnChannelHandler.class, "2")) {
          return;
       }
       a.p(p0, "params");
       e subscribeId = p0.subscribeId;
       if (subscribeId == null) {
          throw new LiveRnChannelHandler$MissParamException("subscribeId");
       }
       LiveJsContainerParams liveJsContai = p0.a();
       if (liveJsContai != null) {
          String str = liveJsContai.a();
          if (str != null) {
             a uoa = a.a(str);
             if (uoa != null) {
                f uof = uoa.j9(subscribeId);
                if (uof != null) {
                   uof.b(subscribeId);
                   return;
                }else {
                   throw new LiveRnChannelHandler$InvalidParamException("channel");
                }
             }else {
                throw new LiveRnChannelHandler$InvalidParamException("liveId");
             }
          }
       }
       throw new LiveRnChannelHandler$MissParamException("containerParams.liveId");
    }
}
