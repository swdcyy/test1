package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$c;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import kotlin.jvm.internal.a;
import rm4.d;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;

public final class MtpLoadingViewBinder$c implements Observer	// class@000921
{
    public final MtpLoadingViewBinder b;

    public void MtpLoadingViewBinder$c(MtpLoadingViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpLoadingViewBinder$c.class, "1")) {
       }else {
          KwaiLoadingView kwaiLoadingV = MtpLoadingViewBinder.o9(this.b);
          if (a.g(p0, Boolean.TRUE)) {
             kwaiLoadingV.setVisibility(0);
             kwaiLoadingV.h();
             kwaiLoadingV.setOnTouchListener(d.b);
          }else {
             kwaiLoadingV.setVisibility(8);
             kwaiLoadingV.i();
             kwaiLoadingV.setOnTouchListener(null);
          }
       }
       return;
    }
}
