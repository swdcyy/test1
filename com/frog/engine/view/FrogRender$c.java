package com.frog.engine.view.FrogRender$c;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import java.lang.String;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCallGameListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class FrogRender$c implements Runnable	// class@001598
{
    public final String a;
    public final FrogJSObject b;
    public final FrogCallGameListener c;
    public final FrogRender d;

    public void FrogRender$c(FrogRender p0,String p1,FrogJSObject p2,FrogCallGameListener p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$c.class, "1")) {
          return;
       }
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       uFrogJSObjec.put("cmd", this.a);
       FrogRender$c tb = this.b;
       if (tb == null) {
          uFrogJSObjec.put("data", new FrogJSObject());
       }else {
          uFrogJSObjec.put("data", tb);
       }
       FrogRender.frogRunJavaScript(uFrogJSObjec, this.d.mUniqueId);
       FrogRender$c tc = this.c;
       if (tc != null) {
          tc.onSuccess();
       }
       return;
    }
}
