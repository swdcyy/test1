package com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import android.app.Activity;
import ss2.h;
import msd.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$b;
import erd.g;
import crd.b;
import krd.a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$c;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$d;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$e;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$f;
import yx2.q;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openCameraAsAnchor$1;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openVideoAsGuest$1;

public final class CameraRequestApi	// class@0018d8
{
    public final a a;
    public final Activity b;
    public final h c;
    public final a d;
    public final String e;

    public void CameraRequestApi(Activity p0,h p1,a p2,String p3){
       a.p(p0, "activity");
       a.p(p1, "micSeatLongConnection");
       a.p(p2, "liveStreamIdFetcher");
       a.p(p3, "voicePartyId");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.a = new a();
    }
    public final void a(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraRequestApi.class, "7")) {
          return;
       }
       a.p(p0, "userId");
       a.p(p1, "callback");
       b uob = LiveVoicePartyApi.b().s0(this.d.invoke(), this.e, p0).map(new e()).subscribe(new CameraRequestApi$a(this, p1), new CameraRequestApi$b(p1));
       a.o(uob, "LiveVoicePartyApi\n      ¡­ult.failure\(it\)\)\n      }\)");
       a.b(this.a, uob);
       return;
    }
    public final void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRequestApi.class, "5")) {
          return;
       }
       a.p(p0, "callback");
       b uob = LiveVoicePartyApi.b().v(this.d.invoke(), this.e).map(new e()).subscribe(new CameraRequestApi$c(this, p0), new CameraRequestApi$d(p0));
       a.o(uob, "LiveVoicePartyApi\n      ¡­ult.failure\(it\)\)\n      }\)");
       a.b(this.a, uob);
       return;
    }
    public final void c(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraRequestApi.class, "9")) {
          return;
       }
       a.p(p0, "userId");
       a.p(p1, "callback");
       b uob = LiveVoicePartyApi.b().A(this.d.invoke(), this.e, p0).map(new e()).subscribe(new CameraRequestApi$e(p1), new CameraRequestApi$f(p1));
       a.o(uob, "LiveVoicePartyApi\n      ¡­ult.failure\(it\)\)\n      }\)");
       a.b(this.a, uob);
       return;
    }
    public final void d(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRequestApi.class, "8")) {
          return;
       }
       a.p(p0, "callback");
       q.a.a(this.b, new CameraRequestApi$openCameraAsAnchor$1(this, p0));
       return;
    }
    public final void e(o p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraRequestApi.class, "6")) {
          return;
       }
       a.p(p0, "handler");
       a.p(p1, "callback");
       q.a.a(this.b, new CameraRequestApi$openVideoAsGuest$1(this, p0, p1));
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, CameraRequestApi.class, "1")) {
          return;
       }
       this.a.dispose();
       return;
    }
}
