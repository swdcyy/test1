package com.tachikoma.core.component.switchview.TKSwitch$a;
import java.lang.Runnable;
import com.tachikoma.core.component.switchview.TKSwitch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKSwitch$a implements Runnable	// class@000d88
{
    public final TKSwitch b;

    public void TKSwitch$a(TKSwitch p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKSwitch$a.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
