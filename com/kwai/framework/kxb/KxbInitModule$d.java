package com.kwai.framework.kxb.KxbInitModule$d;
import java.lang.Runnable;
import com.kwai.framework.kxb.KxbInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kxb.preload.PreloadSource;

public final class KxbInitModule$d implements Runnable	// class@00161f
{
    public final KxbInitModule b;

    public void KxbInitModule$d(KxbInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KxbInitModule$d.class, "1")) {
          return;
       }
       this.b.o0(PreloadSource.COLD_START);
       return;
    }
}
