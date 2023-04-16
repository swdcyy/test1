package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$e;
import xv4.i;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import zo2.o0;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$e$a;
import java.lang.Runnable;
import yb7.p;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomCompleteEvent;
import ut7.e;
import com.kwai.statechart.StateChart;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$ExitRoomEvent;

public final class RtcManager$e extends i	// class@0013a9
{
    public final RtcManager a;

    public void RtcManager$e(RtcManager p0){
       this.a = p0;
       super();
    }
    public void f(String p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RtcManager$e.class, "3")) {
          return;
       }
       a.p(p0, "channelId");
       a.p(p1, "speakers");
       this.a.b.e(ArraysKt___ArraysKt.Wy(p1));
       return;
    }
    public void g(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$e.class, "5")) {
          return;
       }
       try{
          p.d(new RtcManager$e$a(this, LiveAryaBroadcastProto$LiveAryaBroadcastMessage.parseFrom(p0)));
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e3){
          b.I(LiveLogTag.LIVE_VOICE_PARTY, "decode arya broadcast failed", e3);
       }
       return;
    }
    public void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$e.class, "4")) {
          return;
       }
       a.p(p0, "channelId");
       this.a.b.H();
       return;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$e.class, "1")) {
          return;
       }
       this.a.j.l(new RtcManager$EnterRoomCompleteEvent());
       return;
    }
    public void r(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager$e.class, "2")) {
          return;
       }
       RtcManager$e ta = this.a;
       RtcManager f = ta.f;
       a.m(f);
       ta.j.l(new RtcManager$ExitRoomEvent(1, f));
       return;
    }
}
