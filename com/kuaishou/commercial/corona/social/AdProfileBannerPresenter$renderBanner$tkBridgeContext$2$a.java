package com.kuaishou.commercial.corona.social.AdProfileBannerPresenter$renderBanner$tkBridgeContext$2$a;
import java.lang.Runnable;
import com.kuaishou.commercial.corona.social.AdProfileBannerPresenter$renderBanner$tkBridgeContext$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xw.a;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.AdProcessUtils;

public final class AdProfileBannerPresenter$renderBanner$tkBridgeContext$2$a implements Runnable	// class@0014af
{
    public final AdProfileBannerPresenter$renderBanner$tkBridgeContext$2 b;

    public void AdProfileBannerPresenter$renderBanner$tkBridgeContext$2$a(AdProfileBannerPresenter$renderBanner$tkBridgeContext$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdProfileBannerPresenter$renderBanner$tkBridgeContext$2$a.class, "1")) {
          return;
       }
       a p = this.b.this$0.p;
       if (p == null) {
          a.S("mFragment");
       }
       FragmentActivity activity = p.getActivity();
       a.m(activity);
       a.o(activity, "mFragment.activity!!");
       a r = this.b.this$0.r;
       if (r == null) {
          a.S("mQphoto");
       }
       AdProcessUtils.m(activity, r);
       return;
    }
}
