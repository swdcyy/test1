package com.frog.engine.view.FrogRender$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogRender;
import java.util.Map;

public final class FrogRender$a implements Runnable	// class@001594
{
    public final String a;
    public final Runnable b;

    public void FrogRender$a(String p0,Runnable p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$a.class, "1")) {
          return;
       }
       if (FrogRender.sGLThreadHandler.get(this.a) == null) {
          return;
       }
       this.b.run();
       return;
    }
}
