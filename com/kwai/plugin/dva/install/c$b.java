package com.kwai.plugin.dva.install.c$b;
import com.kwai.plugin.dva.install.e$b;
import com.kwai.plugin.dva.install.c;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class c$b implements e$b	// class@001355
{
    public final CountDownLatch a;
    public final c b;

    public void c$b(c p0,CountDownLatch p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       this.a.countDown();
       return;
    }
    public void onFailed(int p0,String p1){
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, c$b.class, "2")) {
          return;
       }
       this.a.countDown();
       return;
    }
    public void onProgress(float p0){
    }
}
