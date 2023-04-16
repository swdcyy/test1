package com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter;
import com.kuaishou.merchant.home2.skin.model.SkinConfig;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import com.kuaishou.merchant.basic.util.f;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import rz3.a;
import xw3.c;

public final class SuperSaleBannerPresenter$b extends m	// class@0017f3
{
    public final SuperSaleBannerPresenter c;
    public final int d;
    public final SkinConfig e;

    public void SuperSaleBannerPresenter$b(SuperSaleBannerPresenter p0,int p1,SkinConfig p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuperSaleBannerPresenter$b.class, "1")) {
          return;
       }
       p0 = p0.getTag(R.id.view_data_tag);
       if (p0 instanceof String) {
          f.g(this.c.getActivity(), MerchantHomeLogBiz.Skin, p0);
          Activity activity = this.c.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          e uoe = e.q0(activity);
          SuperSaleBannerPresenter$b td = this.d;
          SuperSaleBannerPresenter$b te = this.e;
          long materialId = (te != null)? te.getMaterialId(): 0;
          uoe.w0(new a(td, materialId));
       }
       return;
    }
}
