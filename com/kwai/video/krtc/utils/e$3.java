package com.kwai.video.krtc.utils.e$3;
import java.util.concurrent.Callable;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class e$3 implements Callable	// class@0008c6
{
    public final Runnable a;

    public void e$3(Runnable p0){
       this.a = p0;
       super();
    }
    public Void a(){
       Object obj = PatchProxy.apply(null, this, e$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.run();
       return null;
    }
    public Object call(){
       return this.a();
    }
}
