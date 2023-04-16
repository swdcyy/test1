package com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openVideoAsGuest$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import msd.a;
import brd.t;
import cjd.e;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openVideoAsGuest$1$a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openVideoAsGuest$1$b;
import erd.g;
import crd.b;
import kotlin.jvm.internal.a;
import crd.a;
import krd.a;

public final class CameraRequestApi$openVideoAsGuest$1 extends Lambda implements l	// class@0018d7
{
    public final l $callback;
    public final o $handler;
    public final CameraRequestApi this$0;

    public void CameraRequestApi$openVideoAsGuest$1(CameraRequestApi p0,o p1,l p2){
       this.this$0 = p0;
       this.$handler = p1;
       this.$callback = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(CameraRequestApi$openVideoAsGuest$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraRequestApi$openVideoAsGuest$1.class, "1")) {
          return;
       }
       if (p0) {
          b uob = LiveVoicePartyApi.b().h(this.this$0.d.invoke(), this.this$0.e).map(new e()).retryWhen(this.$handler).subscribe(new CameraRequestApi$openVideoAsGuest$1$a(this), new CameraRequestApi$openVideoAsGuest$1$b(this));
          a.o(uob, "LiveVoicePartyApi\n      бн\(throwable\)\)\n          }\)");
          a.b(this.this$0.a, uob);
       }
       return;
    }
}
