package com.tachikoma.core.component.timer.TKTimer$a;
import java.lang.Runnable;
import com.tachikoma.core.component.timer.TKTimer;
import com.tachikoma.core.component.timer.TKTimer$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import tx4.y;

public class TKTimer$a implements Runnable	// class@000da9
{
    public final TKTimer$d b;
    public final TKTimer c;

    public void TKTimer$a(TKTimer p0,TKTimer$d p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKTimer$a.class, "1")) {
          return;
       }
       y.c(this.b.e);
       return;
    }
}
