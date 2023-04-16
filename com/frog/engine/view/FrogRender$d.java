package com.frog.engine.view.FrogRender$d;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class FrogRender$d implements Runnable	// class@001599
{
    public final String a;
    public final FrogRender b;

    public void FrogRender$d(FrogRender p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$d.class, "1")) {
          return;
       }
       FrogRender.frogRunRealScript(this.a, this.b.mUniqueId);
       return;
    }
}
