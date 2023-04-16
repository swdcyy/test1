package com.yxcorp.gifshow.ad.webview.RiskTipPresenter$mDispatchListener$2$a;
import tyc.k3;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter$mDispatchListener$2;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.ad.detail.view.RiskTipView;

public final class RiskTipPresenter$mDispatchListener$2$a implements k3	// class@0018a7
{
    public final RiskTipPresenter$mDispatchListener$2 a;

    public void RiskTipPresenter$mDispatchListener$2$a(RiskTipPresenter$mDispatchListener$2 p0){
       this.a = p0;
       super();
    }
    public final void onDispatchTouchEvent(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RiskTipPresenter$mDispatchListener$2$a.class, "1")) {
          return;
       }
       a.o(p0, "event");
       int action = p0.getAction();
       if (action) {
          if (action == 2) {
             RiskTipPresenter$mDispatchListener$2 this$0 = this.a.this$0;
             if ((p0.getY() - this$0.s) - (float)0 < 0) {
                RiskTipPresenter r = this$0.r;
                if (r != null && !r.getVisibility()) {
                   r = this.a.this$0.r;
                   if (r != null) {
                      r.a();
                   }
                   this.a.this$0.S8(2);
                }
             }
          }
       }else {
          this.a.this$0.s = p0.getY();
       }
       return;
    }
}
