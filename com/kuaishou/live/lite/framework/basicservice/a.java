package com.kuaishou.live.lite.framework.basicservice.a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e93.f;

public final class a implements Runnable	// class@00090b
{
    public final Runnable b;

    public void a(Runnable p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       f.f(this.b);
       return;
    }
}
