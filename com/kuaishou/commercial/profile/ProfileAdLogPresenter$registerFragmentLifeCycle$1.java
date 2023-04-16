package com.kuaishou.commercial.profile.ProfileAdLogPresenter$registerFragmentLifeCycle$1;
import androidx.lifecycle.LifecycleObserver;
import ny.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.j;
import wkd.b;
import mxb.j0;
import ny.c;
import erd.g;

public final class ProfileAdLogPresenter$registerFragmentLifeCycle$1 implements LifecycleObserver	// class@001533
{
    public final a b;

    public void ProfileAdLogPresenter$registerFragmentLifeCycle$1(a p0){
       this.b = p0;
       super();
    }
    public final void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileAdLogPresenter$registerFragmentLifeCycle$1.class, "1")) {
          return;
       }
       ProfileAdLogPresenter$registerFragmentLifeCycle$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "5")) {
          a r = tb.r;
          if (r != null) {
             ProfileParam mReferPhoto = r.mReferPhoto;
             if (mReferPhoto != null && tb.P8(k.B(mReferPhoto))) {
                b.a(0x1332c7d4).p(947, tb.R8(mReferPhoto)).d(new c(tb)).a();
             }
          }
       }
       return;
    }
}
