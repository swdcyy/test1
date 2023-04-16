package com.yxcorp.gifshow.music.utils.b;
import com.yxcorp.gifshow.music.utils.a$a;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import java.io.File;
import kqb.b;

public class b implements a$a	// class@00208e
{
    public final v a;

    public void b(v p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.a.onError(p0);
       return;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.onNext(p0);
       this.a.onComplete();
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       b.c(this, p0, p1);
    }
}
