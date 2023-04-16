package com.facebook.react.modules.core.ReactChoreographer$a;
import java.lang.Runnable;
import com.facebook.react.modules.core.ReactChoreographer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ReactChoreographer$a implements Runnable	// class@001292
{
    public final ReactChoreographer b;

    public void ReactChoreographer$a(ReactChoreographer p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ReactChoreographer$a.class, "1")) {
          return;
       }
       this.b.e();
       return;
    }
}
