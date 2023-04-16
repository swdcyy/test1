package knd.h$a;
import zt7.d$b;
import knd.h;
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
import java.lang.Long;
import w46.b;
import knd.j$a;
import java.io.FileOutputStream;
import knd.j;
import java.io.File;
import zt7.d;
import com.google.protobuf.nano.MessageNano;
import java.lang.Integer;
import com.google.protobuf.MessageLite;
import knd.h$a$a;
import o75.j0;

public final class h$a implements d$b	// class@0017e2
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void StentorLog(String p0,AudioCallback$DebugLevel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "5")) {
          return;
       }
       a.p(p0, "log");
       a.p(p1, "level");
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "StentorLog: "+p0, objArray);
       return;
    }
    public void a(boolean p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "onFinished", objArray);
       return;
    }
    public void b(byte[] p0,Long p1,String p2,Boolean p3){
       Object[] objArray1;
       h l1;
       h$a ta;
       long l = p1.longValue();
       boolean b = p3.booleanValue();
       if (!PatchProxy.isSupport(h$a.class) || !PatchProxy.applyVoidFourRefs(p0, Long.valueOf(l), p2, Boolean.valueOf(b), this, h$a.class, "3")) {
          a.p(p2, "reqID");
          Object[] objArray = new Object[0];
          a.D().w("TTSAuditionManagerV2", "onResult:", objArray);
          if (!l - -2) {
             objArray1 = new Object[0];
             a.D().t("TTSAuditionManagerV2", "onResult: time out", objArray1);
             l1 = this.a.l;
             if (l1 != null) {
                l1.a();
             }
             ta = this.a;
             ta.b(ta.d(), this.a.c());
          }else if(!l - -3){
             objArray1 = new Object[0];
             a.D().t("TTSAuditionManagerV2", "onResult: server error", objArray1);
             l1 = this.a.l;
             if (l1 != null) {
                l1.b();
             }
             ta = this.a;
             ta.b(ta.d(), this.a.c());
          }else if(p0 != null){
             int i = (!p0.length)? 1: 0;
             if (i ^ 1) {
                if (l - null > 0) {
                   this.a.m(p2, p0, 0);
                   this.a.k = true;
                }
                Object[] objArray2 = new Object[0];
                a.D().w("TTSAuditionManagerV2", "onResult:  serialNo = "+l, objArray2);
                h$a ta1 = this.a;
                ta1.l(ta1.d(), p0);
             }
          }
          if (b) {
             this.a.m(p2, p0, 1);
             ta = this.a;
             ta.a(ta.d());
             this.a.f().d(1);
          }
       }
       return;
    }
    public void c(MessageNano p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "messageNano");
       a.p(p1, "responseClass");
       return;
    }
    public void onProgress(int p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "onProgress: progress is "+p0+'%', objArray);
       return;
    }
    public void sendMessage(MessageLite p0,Class p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "2")) {
          return;
       }
       a.p(p0, "messageV3");
       a.p(p1, "responseClass");
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "sendMessage:", objArray);
       this.a.j(p0, p1, new h$a$a(this), "Global.MMU.RtTextToSpeechPushKS");
       return;
    }
}
