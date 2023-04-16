package com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager$d;
import zo2.l;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import java.lang.Object;
import hp2.c;
import hp2.s;
import hp2.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import zo2.e;
import zo2.k;
import hp2.g;
import hp2.h;
import hp2.f;
import zo2.c;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import hp2.m;
import zo2.f;
import com.kuaishou.livestream.message.nano.SCTeamPkRoomOpened;
import hp2.n;
import zo2.d;
import zo2.g;

public final class AudienceMicSeatsDataManager$d implements l	// class@001883
{
    public final AudienceMicSeatsDataManager b;

    public void AudienceMicSeatsDataManager$d(AudienceMicSeatsDataManager p0){
       this.b = p0;
       super();
    }
    public void K(c p0){
       r.k(this, p0);
    }
    public void L(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceMicSeatsDataManager$d.class, "3")) {
          return;
       }
       a.p(p0, "closeReason");
       LiveStreamMessages$MicSeatDetailInfo[] micSeatDetai = new LiveStreamMessages$MicSeatDetailInfo[0];
       this.b.H(micSeatDetai);
       return;
    }
    public void Q(e p0){
       k.d(this, p0);
    }
    public void R(c p0){
       r.o(this, p0);
    }
    public void S(g p0){
       r.d(this, p0);
    }
    public void T(h p0){
       r.e(this, p0);
    }
    public void U(c p0){
       r.n(this, p0);
    }
    public void V(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceMicSeatsDataManager$d.class, "1")) {
          return;
       }
       a.p(p0, "reason");
       this.b.b();
       return;
    }
    public void Y(f p0){
       r.c(this, p0);
    }
    public void c0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceMicSeatsDataManager$d.class, "2")) {
          return;
       }
       a.p(p0, "param");
       SCLiveVoicePartyPkOpMicSeats sCLiveVoiceP = p0.c();
       if (sCLiveVoiceP != null) {
          sCLiveVoiceP = sCLiveVoiceP.micSeatDetailInfo;
          a.o(sCLiveVoiceP, "it.micSeatDetailInfo");
          this.b.H(sCLiveVoiceP);
       }
       return;
    }
    public void d0(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceMicSeatsDataManager$d.class, "4")) {
          return;
       }
       a.p(p0, "param");
       SCTeamPkRoomOpened micSeatDetai = p0.b().micSeatDetailInfo;
       a.o(micSeatDetai, "micSeats");
       this.b.E(micSeatDetai, p0.b().micSeatsVersion);
       return;
    }
    public void g0(c p0){
       r.m(this, p0);
    }
    public void h0(f p0){
       k.e(this, p0);
    }
    public void i(){
       r.a(this);
    }
    public void l(n p0){
       r.g(this, p0);
    }
    public void m(){
       r.b(this);
    }
    public void o(c p0){
       r.i(this, p0);
    }
    public void q(d p0){
       k.c(this, p0);
    }
    public void r(){
       k.g(this);
    }
    public void s(g p0){
       k.f(this, p0);
    }
    public void u(){
       k.a(this);
    }
    public void x(){
       r.h(this);
    }
}
