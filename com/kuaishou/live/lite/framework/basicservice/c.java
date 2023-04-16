package com.kuaishou.live.lite.framework.basicservice.c;
import java.lang.Runnable;
import com.kuaishou.live.lite.framework.basicservice.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e93.f;

public final class c implements Runnable	// class@00090d
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       f.f(this.b.b);
       return;
    }
}
