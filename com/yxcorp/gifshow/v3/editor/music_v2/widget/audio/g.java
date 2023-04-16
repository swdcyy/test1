package com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.g;
import im8.g;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.AudioRecorderFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import nsc.u;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i;
import crd.a;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.AudioRecorderFragment$a;
import osc.b$a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import nsc.p;
import java.util.Map;
import java.util.HashMap;

public class g implements g	// class@00113a
{
    public PublishSubject b;
    public PublishSubject c;
    public b d;
    public long e;
    public boolean f;
    public boolean g;
    public u h;
    public AudioRecorderFragment i;
    public PresenterV2 j;
    public AudioRecorderFragment$a k;
    public i l;
    public a m;
    public long n;
    public boolean o;
    public boolean p;
    public int q;
    public double r;

    public void g(AudioRecorderFragment p0){
       super();
       this.b = PublishSubject.g();
       this.c = PublishSubject.g();
       this.h = new u();
       this.l = new i();
       this.m = new a();
       this.o = false;
       this.p = false;
       this.i = p0;
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       this.m.c(p0);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "12")) {
          return;
       }
       if (this.p != null) {
          this.l.f();
          g tk = this.k;
          if (tk != null) {
             tk.b();
          }
       }
       this.p = false;
       return;
    }
    public final void c(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AudioRecordController", "onSavedDataUpdated\(\) called with: audioRecordInfo = "+p0, objArray);
       if (p0 != null) {
          p0.b = this.q;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new p());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
}
