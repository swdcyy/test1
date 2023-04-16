package com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1$a;
import hh3.c;
import com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1;
import java.lang.Object;
import java.lang.String;
import hh3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatInfoUpdate;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate;
import com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate$a;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;

public final class LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1$a implements c	// class@000de2
{
    public final LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1 a;

    public void LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1$a(LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1 p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       b.b(this, p0);
    }
    public void b(String p0){
       b.a(this, p0);
    }
    public void c(String p0){
       b.c(this, p0);
    }
    public void d(SCInteractiveChatInfoUpdate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1$a.class, "1")) {
          return;
       }
       b.d(this, p0);
       if (p0 != null) {
          LiveJsInteractChatMediaInfoUpdate$liveInteractMediaObserverLazy$1 this$0 = this.a.this$0;
          Objects.requireNonNull(this$0);
          LiveJsInteractChatMediaInfoUpdate liveJsIntera = LiveJsInteractChatMediaInfoUpdate.class;
          if (!PatchProxy.applyVoidOneRefs(p0, this$0, liveJsIntera, "7")) {
             String str = PatchProxy.applyOneRefs(p0, this$0, liveJsIntera, "8");
             if (str != PatchProxyResult.class) {
             }else {
                try{
                   str = Base64.encodeToString(MessageNano.toByteArray(p0), 0);
                   a.o(str, "Base64.encodeToString\(\n бн,\n        Base64.DEFAULT\)");
                }catch(java.lang.Exception e5){
                   b.y(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveJsInteractChatMediaInfoUpdate"), "getPbBase64String", e5);
                   str = "";
                }
             }
          }
       }
       return;
    }
}
