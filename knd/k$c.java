package knd.k$c;
import zt7.d$b;
import knd.k;
import java.lang.Object;
import java.lang.String;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import java.util.concurrent.CountDownLatch;
import knd.k$b;
import java.lang.Long;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import zt7.d;
import knd.j;
import java.io.FileOutputStream;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import w46.b;
import knd.j$a;
import com.google.protobuf.nano.MessageNano;
import java.lang.Integer;
import com.google.protobuf.MessageLite;
import knd.k$c$a;
import o75.j0;

public final class k$c implements d$b	// class@0017ed
{
    public final k a;

    public void k$c(k p0){
       this.a = p0;
       super();
    }
    public void StentorLog(String p0,AudioCallback$DebugLevel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "5")) {
          return;
       }
       a.p(p0, "log");
       a.p(p1, "level");
       Object[] objArray = new Object[0];
       a.D().w("TTSDownloadManagerV2", "StentorLog: log = "+p0, objArray);
       return;
    }
    public void a(boolean p0){
       k$c uoc = k$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSDownloadManagerV2", "onFinished release mCountDownLatch", objArray);
       if (p0) {
          k g = this.a.g;
          a.m(g);
          if (!g.h().getCount() - 1) {
             g = this.a.g;
             a.m(g);
             g.h().countDown();
          }
       }
       return;
    }
    public void b(byte[] p0,Long p1,String p2,Boolean p3){
       Object[] objArray;
       k$c ta;
       k g;
       File uFile1;
       long l = p1.longValue();
       boolean b = p3.booleanValue();
       if (!PatchProxy.isSupport(k$c.class) || !PatchProxy.applyVoidFourRefs(p0, Long.valueOf(l), p2, Boolean.valueOf(b), this, k$c.class, "3")) {
          a.p(p2, "reqID");
          String str = "TTSDownloadManagerV2";
          int i = 0;
          if (this.a.i.get()) {
             objArray = new Object[i];
             a.D().w(str, "onResult: cancel", objArray);
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, k.class, "8")) {
                Object[] objArray1 = new Object[i];
                a.D().w(str, "cancelTtsDownloadTask: ", objArray1);
                if (!ta.f().c()) {
                   objArray1 = new Object[i];
                   a.D().w(str, "cancelTtsDownloadTask: tts.isNotFinished", objArray1);
                   ta.f().h();
                   ta.f().l();
                   File uFile = ta.c();
                   a.m(uFile);
                   ta.b(ta.d(), uFile);
                }
                ta.f.c();
                g = ta.g;
                if (g != null) {
                   a.m(g);
                   g.h().countDown();
                   objArray = new Object[i];
                   a.D().w(str, "cancelTtsDownloadTask: release mCountDownLatch", objArray);
                }
             }
          }else {
             p2 = "onResult: release mCountDownLatch";
             if (!l - -2) {
                objArray = new Object[i];
                a.D().t(str, "onResult: timeout", objArray);
                g = this.a.h;
                if (g != null) {
                   g.a();
                }
                this.a.m();
                ta = this.a;
                uFile1 = this.a.c();
                a.m(uFile1);
                ta.b(ta.d(), uFile1);
                g = this.a.g;
                a.m(g);
                g.h().countDown();
                objArray = new Object[i];
                a.D().w(str, p2, objArray);
             }else if(!l - -3){
                objArray = new Object[i];
                a.D().t(str, "onResult: failed", objArray);
                g = this.a.h;
                if (g != null) {
                   g.b();
                }
                this.a.m();
                ta = this.a;
                uFile1 = this.a.c();
                a.m(uFile1);
                ta.b(ta.d(), uFile1);
                g = this.a.g;
                a.m(g);
                g.h().countDown();
                objArray = new Object[i];
                a.D().w(str, p2, objArray);
             }else {
                Object[] objArray2 = new Object[i];
                a.D().w(str, "onResult: serialNo = "+l+" endPack = "+b, objArray2);
                if (p0 != null) {
                   if (!p0.length) {
                      i = 1;
                   }
                   if (i ^ 0x01) {
                      k$c ta1 = this.a;
                      ta1.l(ta1.d(), p0);
                   }
                }
                if (b) {
                   ta = this.a;
                   ta.a(ta.d());
                   this.a.f().d(true);
                }
             }
          }
       }
       return;
    }
    public void c(MessageNano p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "1")) {
          return;
       }
       a.p(p0, "messageNano");
       a.p(p1, "responseClass");
       return;
    }
    public void onProgress(int p0){
       k$c uoc = k$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSDownloadManagerV2", "onProgress: progess is "+p0+'%', objArray);
       return;
    }
    public void sendMessage(MessageLite p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "2")) {
          return;
       }
       a.p(p0, "messageV3");
       a.p(p1, "responseClass");
       Object[] objArray = new Object[0];
       a.D().w("TTSDownloadManagerV2", "sendMessage:", objArray);
       this.a.j(p0, p1, new k$c$a(this), "Global.MMU.RtTextToSpeechPushKS");
       return;
    }
}
