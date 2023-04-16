package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yx.j0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;

public final class AdNeoMerchantClickPresenter$b implements View$OnTouchListener	// class@00179f
{
    public final AdNeoMerchantClickPresenter b;

    public void AdNeoMerchantClickPresenter$b(AdNeoMerchantClickPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, AdNeoMerchantClickPresenter$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Object[] objArray = new Object[0];
       j0.f("AdNeoMerchantClick", "touch page", objArray);
       AdNeoMerchantClickPresenter$b tb = this.b;
       tb.s = true;
       tb.R8();
       Activity activity = this.b.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       if (activity != null) {
          Lifecycle lifecycle = activity.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(this.b.t);
          }
       }
       this.b.P8();
       return 0;
    }
}
