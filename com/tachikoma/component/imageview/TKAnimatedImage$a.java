package com.tachikoma.component.imageview.TKAnimatedImage$a;
import java.lang.Runnable;
import com.tachikoma.component.imageview.TKAnimatedImage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKAnimatedImage$a implements Runnable	// class@000cf8
{
    public final TKAnimatedImage b;

    public void TKAnimatedImage$a(TKAnimatedImage p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKAnimatedImage$a.class, "1")) {
          return;
       }
       this.b.destroyOnMainThread();
       return;
    }
}
