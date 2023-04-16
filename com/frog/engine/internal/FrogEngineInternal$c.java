package com.frog.engine.internal.FrogEngineInternal$c;
import java.lang.Runnable;
import com.frog.engine.FrogRunGameResultListener;
import com.frog.engine.internal.FrogGameHandlerImpl;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.FrogCanvasHandler;

public final class FrogEngineInternal$c implements Runnable	// class@001537
{
    public final int a;
    public final FrogRunGameResultListener b;
    public final FrogGameHandlerImpl c;
    public final String d;

    public void FrogEngineInternal$c(int p0,FrogRunGameResultListener p1,FrogGameHandlerImpl p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogEngineInternal$c.class, "1")) {
          return;
       }
       FrogEngineInternal$c ta = this.a;
       if (ta == 1) {
          this.b.onSuccess(this.c);
       }else {
          this.b.onFail(ta, this.d);
       }
       return;
    }
}
