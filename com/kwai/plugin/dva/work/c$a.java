package com.kwai.plugin.dva.work.c$a;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.c;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sj7.d;

public class c$a implements c$c	// class@0013a3
{
    public final Object[] a;
    public final CountDownLatch b;
    public final Exception[] c;
    public final c d;

    public void c$a(c p0,Object[] p1,CountDownLatch p2,Exception[] p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       this.c[0] = p0;
       this.b.countDown();
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.a[0] = p0;
       this.b.countDown();
       return;
    }
}
