package com.tachikoma.plugin.TKLottieImageView$d;
import w4.j;
import com.tachikoma.plugin.TKLottieImageView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iq8.r;
import zp8.a;
import java.lang.Boolean;
import com.tkruntime.v8.JsValueRef;

public class TKLottieImageView$d implements j	// class@000de4
{
    public final TKLottieImageView a;

    public void TKLottieImageView$d(TKLottieImageView p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView$d.class, "1")) {
       }else if(r.a()){
          a.g("lottieFail", p0);
       }
       p0 = this.a;
       p0.executeCallback(p0.mAnimationLoadedCallbackRef, Boolean.FALSE);
       return;
    }
}
