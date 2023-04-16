package com.facebook.react.modules.core.a$a$a;
import android.view.Choreographer$FrameCallback;
import com.facebook.react.modules.core.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class a$a$a implements Choreographer$FrameCallback	// class@001298
{
    public final a$a b;

    public void a$a$a(a$a p0){
       this.b = p0;
       super();
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(a$a$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, a$a$a.class, "1")) {
          return;
       }
       this.b.a(p0);
       return;
    }
}
