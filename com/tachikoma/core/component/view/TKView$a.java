package com.tachikoma.core.component.view.TKView$a;
import java.lang.Runnable;
import com.tachikoma.core.component.view.TKView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKView$a implements Runnable	// class@000db0
{
    public final TKView b;

    public void TKView$a(TKView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKView$a.class, "1")) {
          return;
       }
       TKView.access$000(this.b);
       return;
    }
}
