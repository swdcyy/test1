package com.kuaishou.live.core.voiceparty.g;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import zo2.n0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yx2.g;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import com.kuaishou.android.live.model.QLivePlayConfig;
import co2.f2;
import brd.t;
import cjd.e;
import erd.o;
import co2.g;
import co2.l;
import erd.g;
import crd.b;
import crd.a;
import java.util.Map;
import x91.d;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.util.Set;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.d;
import com.kuaishou.live.core.voiceparty.d0;
import co2.r;

public class g implements RtcManager$c	// class@0014f5
{
    public final h b;

    public void g(h p0){
       this.b = p0;
       super();
    }
    public void H(){
       n0.f(this);
    }
    public void I(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       if (p0 == h.o) {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, h.class, "22")) {
             p0.a.d("micSeatsReady");
             p0.g.c(LiveVoicePartyApi.b().A0(p0.d.getLiveStreamId(), p0.c.y()).map(new e()).subscribe(new g(p0), new l(p0)));
          }
       }
       return;
    }
    public void N(Object p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "4")) {
          return;
       }
       if (p0 != h.o) {
          return;
       }
       if (!d.a(p1) - 0x13901) {
          this.b.f(4);
       }
       return;
    }
    public void X(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       n0.g(this, p0);
    }
    public void e(Set p0){
    }
    public void f(Object p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "3")) {
          return;
       }
       if (p0 == h.o) {
          p0 = this.b;
          Objects.requireNonNull(p0);
          h oh = h.class;
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), p0, oh, "19")) {
             String str = "onLeaveMicSeat";
             p0.a.f(str);
             if (p0.c != null && p0.d != null) {
                p0.a.d("leave");
                LiveVoicePartyApi.b().I(p0.d.getLiveStreamId(), p0.c.y()).subscribe(d.b, d0.s("LiveVoicePartyAudienceManager", str));
                p0.f = false;
                p0.c.c = 2;
                p0 = p0.e;
                if (p0 != null) {
                   p0.c(p1);
                }
             }
          }
       }
       return;
    }
    public void i0(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       if (p0 == h.o) {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, h.class, "20")) {
             p0.a.f("onMicPrepareFailed");
             p0 = p0.e;
             if (p0 != null) {
                p0.a();
             }
          }
       }
       return;
    }
}
