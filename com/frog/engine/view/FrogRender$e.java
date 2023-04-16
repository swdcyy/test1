package com.frog.engine.view.FrogRender$e;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import java.lang.String;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class FrogRender$e implements Runnable	// class@00159a
{
    public final long[] a;
    public final String b;
    public final CountDownLatch c;
    public final FrogRender d;

    public void FrogRender$e(FrogRender p0,long[] p1,String p2,CountDownLatch p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$e.class, "1")) {
          return;
       }
       this.a[0] = FrogRender.frogResidueSizeOfDirectory(this.b, this.d.mUniqueId);
       this.c.countDown();
       return;
    }
}
