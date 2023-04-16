package com.frog.engine.view.FrogRender$k$a;
import com.frog.engine.FrogCommandResponseListener;
import com.frog.engine.view.FrogRender$k;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogRender$k$a$a;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;

public class FrogRender$k$a extends FrogCommandResponseListener	// class@0015a1
{
    public final FrogRender$k a;

    public void FrogRender$k$a(FrogRender$k p0,int p1){
       this.a = p0;
       super(p1);
    }
    public void onResponse(FrogJSObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogRender$k$a.class, "1")) {
          return;
       }
       FrogRender.postGLRunnable(this.a.d, new FrogRender$k$a$a(this, p0));
       return;
    }
}
