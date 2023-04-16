package com.frog.engine.view.FrogRender$h;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import java.lang.String;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class FrogRender$h implements Runnable	// class@00159d
{
    public final byte[][] a;
    public final String b;
    public final CountDownLatch c;
    public final FrogRender d;

    public void FrogRender$h(FrogRender p0,byte[][] p1,String p2,CountDownLatch p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$h.class, "1")) {
          return;
       }
       this.a[0] = FrogRender.fileDataWithPath(this.b, this.d.mUniqueId);
       this.c.countDown();
       return;
    }
}
