package com.tachikoma.core.canvas.TKCanvas$a;
import java.lang.Runnable;
import com.tachikoma.core.canvas.TKCanvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKCanvas$a implements Runnable	// class@000d49
{
    public final TKCanvas b;

    public void TKCanvas$a(TKCanvas p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKCanvas$a.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
