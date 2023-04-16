package com.kuaishou.commercial.presenter.CommercialCoCreatePresenter$registerFragmentLifeCycle$1;
import androidx.lifecycle.LifecycleObserver;
import ly.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import da6.c;

public final class CommercialCoCreatePresenter$registerFragmentLifeCycle$1 implements LifecycleObserver	// class@001532
{
    public final b b;

    public void CommercialCoCreatePresenter$registerFragmentLifeCycle$1(b p0){
       this.b = p0;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, CommercialCoCreatePresenter$registerFragmentLifeCycle$1.class, "1")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(this.b.q);
       if (photoAdverti != null) {
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\) ?: return");
          photoAdverti.f("ENABLE_AD_LOG", Boolean.FALSE);
       }
       return;
    }
}
