package com.kuaishou.live.core.voiceparty.playway.VoicePartyPlayModeSwitcher;
import hp2.s;
import msd.q;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider;
import hp2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hp2.g;
import hp2.h;
import hp2.f;
import java.lang.Integer;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyPlayModeSwitcher$exitMode$1;
import hp2.m;
import hp2.r;
import hp2.n;

public final class VoicePartyPlayModeSwitcher implements s	// class@00184c
{
    public final CloseReasonProvider b;
    public final q c;
    public final p d;

    public void VoicePartyPlayModeSwitcher(q p0,p p1){
       a.p(p0, "vcFactory");
       a.p(p1, "switchAction");
       super();
       this.c = p0;
       this.d = p1;
       this.b = new CloseReasonProvider();
    }
    public void K(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "6")) {
          return;
       }
       a.p(p0, "reason");
       this.b(7, p0);
       return;
    }
    public void L(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "14")) {
          return;
       }
       a.p(p0, "reason");
       this.b(6, p0);
       return;
    }
    public void R(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "4")) {
          return;
       }
       a.p(p0, "reason");
       this.b(2, p0);
       return;
    }
    public void S(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "5")) {
          return;
       }
       a.p(p0, "param");
       this.a(7, p0);
       return;
    }
    public void T(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "9")) {
          return;
       }
       a.p(p0, "param");
       this.a(1, p0);
       return;
    }
    public void U(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "12")) {
          return;
       }
       a.p(p0, "reason");
       this.b(4, p0);
       return;
    }
    public void V(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "10")) {
          return;
       }
       a.p(p0, "reason");
       this.b(1, p0);
       return;
    }
    public void Y(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "13")) {
          return;
       }
       a.p(p0, "param");
       this.a(6, p0);
       return;
    }
    public final void a(int p0,Object p1){
       VoicePartyPlayModeSwitcher voicePartyPl = VoicePartyPlayModeSwitcher.class;
       if (PatchProxy.isSupport(voicePartyPl) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, voicePartyPl, "15")) {
          return;
       }
       this.d.invoke(Integer.valueOf(p0), this.c.invoke(Integer.valueOf(p0), CloseReasonProvider.b(this.b, p0, null, 2, null), p1));
       return;
    }
    public final void b(int p0,c p1){
       VoicePartyPlayModeSwitcher voicePartyPl = VoicePartyPlayModeSwitcher.class;
       if (PatchProxy.isSupport(voicePartyPl) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, voicePartyPl, "16")) {
          return;
       }
       this.b.c(p0, p1, new VoicePartyPlayModeSwitcher$exitMode$1(this));
       return;
    }
    public void d0(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "7")) {
          return;
       }
       a.p(p0, "param");
       this.a(5, p0);
       return;
    }
    public void g0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "8")) {
          return;
       }
       a.p(p0, "reason");
       this.b(5, p0);
       return;
    }
    public void i(){
       r.a(this);
    }
    public void l(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "11")) {
          return;
       }
       a.p(p0, "param");
       this.a(4, p0);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, VoicePartyPlayModeSwitcher.class, "1")) {
          return;
       }
       this.a(3, null);
       return;
    }
    public void o(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayModeSwitcher.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       this.b(3, p0);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, VoicePartyPlayModeSwitcher.class, "3")) {
          return;
       }
       this.a(2, null);
       return;
    }
}
