package com.facebook.react.modules.core.a$a;
import java.lang.Object;
import android.view.Choreographer$FrameCallback;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.modules.core.a$a$a;

public abstract class a$a	// class@001299
{
    public Runnable a;
    public Choreographer$FrameCallback b;

    public void a$a(){
       super();
    }
    public abstract void a(long p0);
    public Choreographer$FrameCallback b(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new a$a$a(this);
       }
       return this.b;
    }
}
