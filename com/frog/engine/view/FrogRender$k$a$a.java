package com.frog.engine.view.FrogRender$k$a$a;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender$k$a;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogRender$k;
import com.frog.engine.view.FrogRender;

public class FrogRender$k$a$a implements Runnable	// class@0015a0
{
    public final FrogJSObject a;
    public final FrogRender$k$a b;

    public void FrogRender$k$a$a(FrogRender$k$a p0,FrogJSObject p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$k$a$a.class, "1")) {
          return;
       }
       FrogRender$k$a$a ta = this.a;
       if (ta != null) {
          FrogRender$k$a a = this.b.a;
          FrogRender.onCallResponse(a.d, a.c, ta);
       }else {
          FrogRender$k$a a1 = this.b.a;
          FrogRender.onCallResponse(a1.d, a1.c, new FrogJSObject());
       }
       return;
    }
}
