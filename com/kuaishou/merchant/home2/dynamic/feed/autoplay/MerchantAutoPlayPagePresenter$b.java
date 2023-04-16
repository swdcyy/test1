package com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$b;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;

public final class MerchantAutoPlayPagePresenter$b implements g	// class@001753
{
    public final MerchantAutoPlayPagePresenter b;

    public void MerchantAutoPlayPagePresenter$b(MerchantAutoPlayPagePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantAutoPlayPagePresenter$b.class, "1")) {
       }else {
          p0 = this.b;
          p0.stopAllPlayCard();
          View view = MerchantAutoPlayPagePresenter.P8(p0).getView();
          if (view != null) {
             view.removeCallbacks(p0.R8());
          }
          view = MerchantAutoPlayPagePresenter.P8(p0).getView();
          if (view != null) {
             view.post(p0.R8());
          }
       }
       return;
    }
}
