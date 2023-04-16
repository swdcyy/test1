package com.facebook.react.modules.core.ReactChoreographer$b;
import java.lang.Runnable;
import com.facebook.react.modules.core.ReactChoreographer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.core.a;

public class ReactChoreographer$b implements Runnable	// class@001293
{
    public final Runnable b;
    public final ReactChoreographer c;

    public void ReactChoreographer$b(ReactChoreographer p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ReactChoreographer$b.class, "1")) {
          return;
       }
       ReactChoreographer reactChoreog = ReactChoreographer.class;
       _monitor_enter(reactChoreog);
       if (this.c.a == null) {
          this.c.a = a.a();
       }
       _monitor_exit(reactChoreog);
       ReactChoreographer$b tb = this.b;
       if (tb != null) {
          tb.run();
       }
       return;
    }
}
