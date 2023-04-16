package com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController;
import com.kuaishou.live.core.voiceparty.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$c;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$f;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$e;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$a;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import fo2.b;
import erd.g;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.a$a;

public class VoicePartyAryaRoomSwitchController	// class@001333
{
    public final VoicePartyAryaRoomSwitchController$c a;
    public final VoicePartyAryaRoomSwitchController$f b;
    public final VoicePartyAryaRoomSwitchController$e c;
    public VoicePartyAryaRoomSwitchController$d d;
    public final a e;
    public VoicePartyAryaRoomSwitchController$b f;
    public String g;
    public b h;
    public final a$a i;

    public void VoicePartyAryaRoomSwitchController(a p0){
       super();
       VoicePartyAryaRoomSwitchController$c uoc = new VoicePartyAryaRoomSwitchController$c(this);
       this.a = uoc;
       this.b = new VoicePartyAryaRoomSwitchController$f(this);
       this.c = new VoicePartyAryaRoomSwitchController$e(this);
       this.d = uoc;
       this.i = new VoicePartyAryaRoomSwitchController$a(this);
       this.e = p0;
    }
    public void a(VoicePartyAryaRoomSwitchController$d p0){
       this.d = p0;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAryaRoomSwitchController.class, "7")) {
          return;
       }
       VoicePartyAryaRoomSwitchController th = this.h;
       if (th != null) {
          th.dispose();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAryaRoomSwitchController.class, "6")) {
          return;
       }
       this.b();
       this.h = t.timer(10, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new b(this));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAryaRoomSwitchController.class, "5")) {
          return;
       }
       this.h();
       this.f = null;
       return;
    }
    public void e(String p0,VoicePartyAryaRoomSwitchController$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyAryaRoomSwitchController.class, "2")) {
          return;
       }
       if (this.g()) {
          b.Z(LiveVoicePartyLogTag.ARYA, "enterAryaRoom fail, currentlySwitching");
          return;
       }else {
          b.c0(LiveVoicePartyLogTag.ARYA, "enterAryaRoom start", "newAryaConfig", p0);
          this.f(p0, p1);
          this.c();
          this.a(this.c);
          this.e.i(p0);
          return;
       }
    }
    public final void f(String p0,VoicePartyAryaRoomSwitchController$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyAryaRoomSwitchController.class, "3")) {
          return;
       }
       this.g = p0;
       this.f = p1;
       this.e.j(this.i);
       return;
    }
    public boolean g(){
       VoicePartyAryaRoomSwitchController td = this.d;
       boolean b = (td instanceof VoicePartyAryaRoomSwitchController$e || td instanceof VoicePartyAryaRoomSwitchController$f)? true: false;
       return b;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAryaRoomSwitchController.class, "4")) {
          return;
       }
       this.a(this.a);
       this.e.e(this.i);
       this.b();
       this.g = null;
       return;
    }
    public void i(String p0,VoicePartyAryaRoomSwitchController$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyAryaRoomSwitchController.class, "1")) {
          return;
       }
       if (this.g()) {
          b.Z(LiveVoicePartyLogTag.ARYA, "switchAryaRoom fail, currentlySwitching");
          return;
       }else {
          b.c0(LiveVoicePartyLogTag.ARYA, "switchAryaRoom start", "newAryaConfig", p0);
          this.f(p0, p1);
          this.c();
          this.a(this.b);
          this.e.n();
          return;
       }
    }
}
