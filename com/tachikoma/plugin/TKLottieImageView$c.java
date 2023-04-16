package com.tachikoma.plugin.TKLottieImageView$c;
import w4.k;
import com.tachikoma.plugin.TKLottieImageView;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.tkruntime.v8.JsValueRef;
import android.view.View;
import com.tachikoma.core.component.e;
import com.airbnb.lottie.LottieAnimationView;

public class TKLottieImageView$c implements k	// class@000de3
{
    public final TKLottieImageView a;

    public void TKLottieImageView$c(TKLottieImageView p0){
       this.a = p0;
       super();
    }
    public void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView$c.class, "1")) {
          return;
       }
       TKLottieImageView$c ta = this.a;
       ta.executeCallback(ta.mAnimationLoadedCallbackRef, Boolean.TRUE);
       ta = this.a;
       if (ta.mProgress > 0) {
          ta.getView().setProgress(this.a.mProgress);
       }
       ta = this.a;
       ta.isRunning = false;
       ta.notifyExecCommands();
       return;
    }
}
