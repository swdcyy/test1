package com.yxcorp.gifshow.v3.editor.music_v2.utils.f;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import brd.v;
import com.kwai.video.editorsdk2.RemuxTask;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.g$a;
import brd.g;
import com.kwai.video.editorsdk2.Mp4RemuxerException;
import java.lang.Double;

public class f implements Mp4RemuxerEventListener	// class@00112a
{
    public final v a;
    public final RemuxTask b;
    public final String c;
    public final String d;
    public final String e;

    public void f(v p0,RemuxTask p1,String p2,String p3,String p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       g$a uoa = new g$a(-2, this.b, this.c, "", "");
       this.a.onNext(v8);
       this.a.onComplete();
       return;
    }
    public void onError(Mp4RemuxerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       g$a uoa = new g$a(-1, this.b, this.c, "", "");
       this.a.onNext(v7);
       this.a.onComplete();
       return;
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       g$a uoa = new g$a(100, this.b, this.c, this.d, this.e);
       this.a.onNext(v8);
       this.a.onComplete();
       return;
    }
    public void onProgress(double p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uof, "1")) {
          return;
       }
       g$a uoa = new g$a((long)(p0 * 100.00f), this.b, this.c, "", "");
       this.a.onNext(v8);
       return;
    }
}
