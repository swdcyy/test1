package com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1$a;
import lh3.i0;
import com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate;
import fg6.a;
import com.kuaishou.live.bridge.channels.LiveJsInteractRoomInfoUpdate$a;
import f71.a;
import com.google.gson.Gson;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;

public final class LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1$a implements i0	// class@000de6
{
    public final LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1 a;

    public void LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1$a(LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1 p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       h0.b(this, p0, p1);
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       h0.a(this, p0);
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       h0.f(this, p0, p1);
    }
    public void t(int p0){
       h0.j(this, p0);
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       h0.h(this, p0);
    }
    public void v(boolean p0,Throwable p1){
       h0.d(this, p0, p1);
    }
    public void w(c p0){
       h0.c(this, p0);
    }
    public void x(SCInteractiveChatRoomInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1$a.class, "1")) {
          return;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       LiveJsInteractRoomInfoUpdate$rtcManagerObserverLazy$1 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(p0, this$0, LiveJsInteractRoomInfoUpdate.class, "7")) {
          this$0.a(a.a.q(new LiveJsInteractRoomInfoUpdate$a(a.a(p0))));
       }
       return;
    }
}
