package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$d;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.CharSequence;

public final class MtpLoadingViewBinder$d implements Observer	// class@000922
{
    public final MtpLoadingViewBinder b;

    public void MtpLoadingViewBinder$d(MtpLoadingViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpLoadingViewBinder$d.class, "1")) {
       }else {
          MtpLoadingViewBinder.o9(this.b).setLoadingText(p0);
       }
       return;
    }
}
