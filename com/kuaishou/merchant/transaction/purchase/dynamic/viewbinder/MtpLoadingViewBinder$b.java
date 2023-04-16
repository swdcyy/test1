package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$b;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$c;

public final class MtpLoadingViewBinder$b extends m	// class@000920
{
    public final MtpLoadingViewBinder c;

    public void MtpLoadingViewBinder$b(MtpLoadingViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpLoadingViewBinder$b.class, "1")) {
          return;
       }
       MtpLoadingViewBinder y = this.c.y;
       if (y != null) {
          y.a(null);
       }
       return;
    }
}
