package com.tachikoma.plugin.TKLottieImageView$e;
import java.lang.Runnable;
import com.tachikoma.plugin.TKLottieImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKLottieImageView$e implements Runnable	// class@000de5
{
    public final TKLottieImageView b;

    public void TKLottieImageView$e(TKLottieImageView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKLottieImageView$e.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
