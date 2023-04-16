package com.tachikoma.component.common.resource.TKImageResource$c;
import java.lang.Runnable;
import com.tachikoma.component.common.resource.TKImageResource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKImageResource$c implements Runnable	// class@000ce9
{
    public final TKImageResource b;

    public void TKImageResource$c(TKImageResource p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKImageResource$c.class, "1")) {
          return;
       }
       this.b.destroyOnMainThread();
       return;
    }
}
