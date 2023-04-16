package com.tachikoma.component.canvas.TKCanvas2DView$a;
import java.lang.Runnable;
import com.tachikoma.component.canvas.TKCanvas2DView;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKCanvas2DView$a implements Runnable	// class@000cda
{
    public final TKBaseNativeModule$DestroyReason b;
    public final TKCanvas2DView c;

    public void TKCanvas2DView$a(TKCanvas2DView p0,TKBaseNativeModule$DestroyReason p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKCanvas2DView$a.class, "1")) {
          return;
       }
       this.c.destroyOnMainThread(this.b);
       return;
    }
}
