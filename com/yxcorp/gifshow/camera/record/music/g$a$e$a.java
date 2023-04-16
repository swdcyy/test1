package com.yxcorp.gifshow.camera.record.music.g$a$e$a;
import com.yxcorp.gifshow.music.utils.a$a;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.g;
import java.io.File;
import kotlin.Pair;
import java.lang.Float;
import kqb.b;
import java.lang.Long;
import java.lang.Math;

public final class g$a$e$a implements a$a	// class@000e7b
{
    public final v a;

    public void g$a$e$a(v p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$e$a.class, "2")) {
          return;
       }
       a.p(p0, "e");
       this.a.onError(p0);
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$e$a.class, "3")) {
          return;
       }
       a.p(p0, "file");
       this.a.onNext(new Pair(Float.valueOf(0x3f733333), null));
       this.a.onComplete();
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       g$a$e$a uoa$e$a = g$a$e$a.class;
       if (PatchProxy.isSupport(uoa$e$a) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa$e$a, "1")) {
          return;
       }
       this.a.onNext(new Pair(Float.valueOf(Math.min(((((float)p0 * 0x3f800000) / (float)p1) * 0x3f733333), 0x3f7d70a4)), null));
       return;
    }
}
