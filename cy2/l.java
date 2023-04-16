package cy2.l;
import cy2.b;
import ee1.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import h02.b;
import dp1.d;
import h02.c;
import d61.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import u71.a;
import cy2.k;
import java.lang.Runnable;
import java.lang.System;
import android.view.View;

public class l	// class@002409
{
    public boolean a;
    public long b;
    public long c;
    public final c d;
    public final l0 e;
    public final b f;
    public final a g;
    public final l h;
    public final l i;

    public void l(b p0,a p1,l p2,l p3){
       a.p(p0, "cameraProvider");
       a.p(p2, "onStart");
       a.p(p3, "onStop");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.b = -1;
       this.c = -1;
       this.d = d.a(-204054297).Ch(null);
       this.e = l0.d("prettifyGuideToast");
    }
    public static void d(l p0,boolean p1,int p2,Object p3){
       int i = 1;
       if (p2 & i) {
          p1 = false;
       }
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), p0, ol, "1") && p0.a == null)) {
          LiveLogTag lIVE_VOICE_P = LiveLogTag.LIVE_VOICE_PARTY;
          b.Z(lIVE_VOICE_P, "[VoiceParty Streamer] open video");
          a uoa = p0.f.a();
          if (uoa != null) {
             uoa.v(new k(p0, p1, uoa));
             p0.a = i;
             if (!PatchProxy.applyVoid(null, p0, ol, "5")) {
                p0.b = System.currentTimeMillis();
                p0.c = -1;
             }
             b.Z(lIVE_VOICE_P, "[VoiceParty Streamer] enableVideoTx");
             l g = p0.g;
             if (g != null && g.j() == 2) {
                p0.g.D5(false);
             }
             p0.c(uoa);
             uoa.f();
             View view = uoa.n1();
             a.o(view, "liveCamera.cameraView");
             view.setVisibility(false);
             p0.h.invoke(uoa);
          }
       }
       return;
    }
    public final a a(){
       return this.g;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "8")) {
          return;
       }
       a.p(p0, "camera");
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "7")) {
          return;
       }
       a.p(p0, "camera");
       return;
    }
    public final void e(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "4")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       LiveLogTag lIVE_VOICE_P = LiveLogTag.LIVE_VOICE_PARTY;
       b.Z(lIVE_VOICE_P, "[VoiceParty Streamer] close video");
       a uoa = this.f.b();
       if (uoa != null) {
          this.a = false;
          this.d.a();
          if (!PatchProxy.applyVoid(objArray, this, ol, "6")) {
             this.c = System.currentTimeMillis();
          }
          View view = uoa.n1();
          a.o(view, "liveCamera.cameraView");
          view.setVisibility(4);
          uoa.g();
          b.Z(lIVE_VOICE_P, "[VoiceParty Streamer] disableVideoTx");
          ol = this.g;
          if (ol != null && ol.j() == 2) {
             this.g.D5(true);
          }
          this.b(uoa);
          this.i.invoke(uoa);
       }
       return;
    }
}
