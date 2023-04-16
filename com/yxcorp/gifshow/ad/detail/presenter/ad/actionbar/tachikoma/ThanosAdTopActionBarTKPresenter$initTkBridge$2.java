package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopActionBarTKPresenter$initTkBridge$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import nz8.g;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import lnc.a1;

public final class ThanosAdTopActionBarTKPresenter$initTkBridge$2 extends Lambda implements l	// class@001582
{
    public final g this$0;

    public void ThanosAdTopActionBarTKPresenter$initTkBridge$2(g p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdTopActionBarTKPresenter$initTkBridge$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = p0.optInt("actionBarHeight");
       if (i > 0) {
          g u = this.this$0.u;
          if (u != null) {
             ViewGroup$LayoutParams layoutParams = u.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = a1.e((float)i);
             }
          }
          g u1 = this.this$0.u;
          if (u1 != null) {
             u1.requestLayout();
          }
       }
       return;
    }
}
