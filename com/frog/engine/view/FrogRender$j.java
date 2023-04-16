package com.frog.engine.view.FrogRender$j;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import java.lang.Boolean;
import java.lang.String;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class FrogRender$j implements Runnable	// class@00159f
{
    public final Boolean[] a;
    public final String b;
    public final CountDownLatch c;
    public final FrogRender d;

    public void FrogRender$j(FrogRender p0,Boolean[] p1,String p2,CountDownLatch p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$j.class, "1")) {
          return;
       }
       this.a[0] = Boolean.valueOf(FrogRender.frogCanRead(this.b, this.d.mUniqueId));
       this.c.countDown();
       return;
    }
}
