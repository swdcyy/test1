package com.yxcorp.gifshow.v3.editor.text.tts.g$a;
import zt7.d$b;
import com.yxcorp.gifshow.v3.editor.text.tts.g;
import java.lang.Object;
import java.lang.String;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.tts.g$c;
import java.util.concurrent.CountDownLatch;
import java.lang.Long;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import zt7.d;
import java.io.FileOutputStream;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import w46.b;
import hvc.i;
import java.lang.Runnable;
import ekd.k1;
import hvc.j;
import com.google.protobuf.nano.MessageNano;
import java.lang.Integer;
import com.google.protobuf.MessageLite;
import com.yxcorp.gifshow.v3.editor.text.tts.g$a$a;
import o75.j0;

public class g$a implements d$b	// class@0014fc
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void StentorLog(String p0,AudioCallback$DebugLevel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "StentorLog: log = "+p0, objArray);
       return;
    }
    public void a(boolean p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "onFinished release mCountDownLatch", objArray);
       if (p0 && !this.a.g.d.getCount() - 1) {
          this.a.g.d.countDown();
       }
       return;
    }
    public void b(byte[] p0,Long p1,String p2,Boolean p3){
       Object[] objArray;
       g$a ta;
       g g;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g$a.class, "2")) {
          return;
       }
       int i = 0;
       if (this.a.i.get()) {
          objArray = new Object[i];
          a.D().w("TtsDownloadManager", "onResult: cancel", objArray);
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, g.class, "9")) {
             Object[] objArray1 = new Object[i];
             a.D().w("TtsDownloadManager", "cancelTtsDownloadTask: ", objArray1);
             if (!ta.a.c()) {
                objArray1 = new Object[i];
                a.D().w("TtsDownloadManager", "cancelTtsDownloadTask: tts.isNotFinished", objArray1);
                ta.a.h();
                ta.a.l();
                ta.b(ta.b, ta.c);
             }
             ta.f.c();
             g = ta.g;
             if (g != null) {
                g.d.countDown();
                objArray = new Object[i];
                a.D().w("TtsDownloadManager", "cancelTtsDownloadTask: release mCountDownLatch", objArray);
             }
          }
       }else {
          p2 = "onResult: release mCountDownLatch";
          if (!p1.longValue() - -2) {
             objArray = new Object[i];
             a.D().t("TtsDownloadManager", "onResult: timeout", objArray);
             k1.o(new i(this));
             this.a.h();
             ta = this.a;
             ta.b(ta.b, ta.c);
             this.a.g.d.countDown();
             objArray = new Object[i];
             a.D().w("TtsDownloadManager", p2, objArray);
          }else if(!p1.longValue() - -3){
             objArray = new Object[i];
             a.D().t("TtsDownloadManager", "onResult: failed", objArray);
             k1.o(new j(this));
             this.a.h();
             ta = this.a;
             ta.b(ta.b, ta.c);
             this.a.g.d.countDown();
             objArray = new Object[i];
             a.D().w("TtsDownloadManager", p2, objArray);
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w("TtsDownloadManager", "onResult: serialNo = "+p1+" endPack = "+p3, objArray2);
             if (p0 != null && p0.length > 0) {
                g$a ta1 = this.a;
                ta1.f(ta1.b, p0);
             }
             if (p3.booleanValue()) {
                ta = this.a;
                ta.a(ta.b);
                this.a.a.d(true);
             }
          }
       }
       return;
    }
    public void c(MessageNano p0,Class p1){
    }
    public void onProgress(int p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "onProgress: progess is "+p0+"%", objArray);
       return;
    }
    public void sendMessage(MessageLite p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsDownloadManager", "sendMessage:", objArray);
       this.a.e(p0, p1, new g$a$a(this), "Global.MMU.RtTextToSpeechPushKS");
       return;
    }
}
