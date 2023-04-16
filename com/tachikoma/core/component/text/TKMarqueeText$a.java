package com.tachikoma.core.component.text.TKMarqueeText$a;
import java.lang.Runnable;
import com.tachikoma.core.component.text.TKMarqueeText;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKMarqueeText$a implements Runnable	// class@000d8d
{
    public final TKMarqueeText b;

    public void TKMarqueeText$a(TKMarqueeText p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKMarqueeText$a.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
