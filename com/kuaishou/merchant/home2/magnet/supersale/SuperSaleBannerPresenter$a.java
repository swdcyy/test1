package com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter;
import com.kuaishou.merchant.home2.skin.model.SkinConfig;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import com.kuaishou.merchant.basic.util.f;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import rz3.b;
import xw3.c;

public final class SuperSaleBannerPresenter$a extends m	// class@0017f2
{
    public final SuperSaleBannerPresenter c;
    public final SkinConfig d;

    public void SuperSaleBannerPresenter$a(SuperSaleBannerPresenter p0,SkinConfig p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuperSaleBannerPresenter$a.class, "1")) {
          return;
       }
       SuperSaleBannerPresenter p = this.c.p;
       if (p == null) {
          a.S("mSuperScaleBannerIv");
       }
       p = p.getTag(R.id.view_data_tag);
       if (p instanceof String) {
          f.g(this.c.getActivity(), MerchantHomeLogBiz.Skin, p);
          Activity activity = this.c.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          e uoe = e.q0(activity);
          SuperSaleBannerPresenter$a td = this.d;
          long materialId = (td != null)? td.getMaterialId(): 0;
          uoe.w0(new b(materialId));
       }
       return;
    }
}
