package com.yxcorp.gifshow.v3.editor.text.tts.d$a;
import zt7.d$b;
import com.yxcorp.gifshow.v3.editor.text.tts.d;
import java.lang.Object;
import java.lang.String;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import java.lang.Long;
import w46.b;
import hvc.e;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import java.io.FileOutputStream;
import java.io.File;
import hvc.f;
import zt7.d;
import com.google.protobuf.nano.MessageNano;
import java.lang.Integer;
import com.google.protobuf.MessageLite;
import com.yxcorp.gifshow.v3.editor.text.tts.d$a$a;
import o75.j0;

public class d$a implements d$b	// class@0014f2
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void StentorLog(String p0,AudioCallback$DebugLevel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "StentorLog: "+p0, objArray);
       return;
    }
    public void a(boolean p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "onFinished", objArray);
       return;
    }
    public void b(byte[] p0,Long p1,String p2,Boolean p3){
       Object[] objArray1;
       d$a ta;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d$a.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TtsAuditionManager", "onResult:", objArray);
       if (!p1.longValue() - -2) {
          objArray1 = new Object[i];
          a.D().t("TtsAuditionManager", "onResult: time out", objArray1);
          k1.o(new e(this));
          ta = this.a;
          ta.b(ta.b, ta.c);
       }else if(!p1.longValue() - -3){
          objArray1 = new Object[i];
          a.D().t("TtsAuditionManager", "onResult: server error", objArray1);
          k1.o(new f(this));
          ta = this.a;
          ta.b(ta.b, ta.c);
       }else if(p0 != null && p0.length > 0){
          if (p1.longValue() > 0) {
             this.a.g(p2, p0, i);
             this.a.j = true;
          }
          Object[] objArray2 = new Object[i];
          a.D().w("TtsAuditionManager", "onResult:  serialNo = "+p1, objArray2);
          d$a ta1 = this.a;
          ta1.f(ta1.b, p0);
       }
       if (p3.booleanValue()) {
          this.a.g(p2, p0, true);
          ta = this.a;
          ta.a(ta.b);
          this.a.a.d(true);
       }
       return;
    }
    public void c(MessageNano p0,Class p1){
    }
    public void onProgress(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "onProgress: progess is "+p0+"%", objArray);
       return;
    }
    public void sendMessage(MessageLite p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "sendMessage:", objArray);
       this.a.e(p0, p1, new d$a$a(this), "Global.MMU.RtTextToSpeechPushKS");
       return;
    }
}
