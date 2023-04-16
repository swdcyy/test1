package com.tachikoma.core.component.input.TKInput$e;
import java.lang.Runnable;
import com.tachikoma.core.component.input.TKInput;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKInput$e implements Runnable	// class@000d75
{
    public final TKInput b;

    public void TKInput$e(TKInput p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKInput$e.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
