package com.kuaishou.audio.recorder.a;
import com.kuaishou.audio.recorder.IAudioRecordEngine;
import java.util.concurrent.atomic.AtomicInteger;
import pt.a;
import ot.a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import jw4.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.audio.recorder.IAudioRecordEngine$RecordAudioFormat;
import com.kuaishou.audio.recorder.IAudioRecordEngine$AudioScene;
import ot.c;
import com.kwai.robust.PatchProxyResult;

public class a implements IAudioRecordEngine	// class@000fab
{
    public final a a;
    public final a b;
    public boolean c;
    public boolean d;
    public static final AtomicInteger e;

    static {
       a.e = new AtomicInteger();
    }
    public void a(a p0,a p1){
       super();
       this.c = false;
       this.d = false;
       this.b = p0;
       this.a = p1;
       c.a("AudioRecordEngineImpl", "recorder init with adapter :"+p0+", biz:"+p1);
    }
    public void a(byte[] p0,int p1,int p2,int p3,long p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       if (this.c != null) {
          this.b.a(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.d = p0;
       this.b.b(p0);
       this.g("setEnableSpeakerInputAEC");
       return;
    }
    public void c(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.b.c(p0);
       c.b("AudioRecordEngineImpl", this.f("setEnableAudioMonitorDebug"), "enable", Boolean.valueOf(p0));
       return;
    }
    public void d(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "6")) {
          return;
       }
       this.b.d(p0, p1, p2);
       c.d("AudioRecordEngineImpl", this.f("setEnableRecordAutoResume"), "enable", Boolean.valueOf(p0), "detectTimeBySec", Integer.valueOf(p1), "target", Integer.valueOf(p2));
       return;
    }
    public boolean e(IAudioRecordEngine$RecordAudioFormat p0,IAudioRecordEngine$AudioScene p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = a.e.incrementAndGet();
       this.g("startRecord");
       this.c = true;
       this.b.b(this.d);
       if (p2 != null) {
          this.b.f(p2);
       }
       this.b.h(i, p0, p1);
       return true;
    }
    public final String f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+", biz = "+this.a+", session = "+a.e.get()+", mIsRecording = "+this.c+", mEnableAEC = "+this.d;
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       c.a("AudioRecordEngineImpl", this.f(p0));
       return;
    }
    public a getBiz(){
       return this.a;
    }
    public boolean isRecording(){
       return this.c;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.g("release");
       this.b.e();
       this.b.release();
       return;
    }
    public boolean stopRecording(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.g("stopRecord");
       boolean b = false;
       if (this.c == null) {
          return b;
       }
       this.c = b;
       this.b.g(a.e.get());
       return true;
    }
}
