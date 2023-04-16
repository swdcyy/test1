package com.kuaishou.live.lite.performance.a$a;
import java.lang.Runnable;
import com.kuaishou.live.lite.performance.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Choreographer;
import ec3.u;
import android.view.Choreographer$FrameCallback;

public class a$a implements Runnable	// class@000a42
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       Choreographer.getInstance().postFrameCallback(new u(this));
       return;
    }
}
