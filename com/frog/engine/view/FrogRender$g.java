package com.frog.engine.view.FrogRender$g;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import java.lang.String;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class FrogRender$g implements Runnable	// class@00159c
{
    public final String[] a;
    public final CountDownLatch b;
    public final FrogRender c;

    public void FrogRender$g(FrogRender p0,String[] p1,CountDownLatch p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$g.class, "1")) {
          return;
       }
       this.a[0] = FrogRender.getFrogTempDir(this.c.mUniqueId);
       this.b.countDown();
       return;
    }
}
