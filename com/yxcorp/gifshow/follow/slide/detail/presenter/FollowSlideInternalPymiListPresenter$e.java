package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$e;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import eda.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import xl8.b;
import android.view.View;
import com.yxcorp.utility.n;

public final class FollowSlideInternalPymiListPresenter$e implements g	// class@00111b
{
    public final FollowSlideInternalPymiListPresenter b;

    public void FollowSlideInternalPymiListPresenter$e(FollowSlideInternalPymiListPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideInternalPymiListPresenter$e.class, "1")) {
       }else {
          a.p(p0, "event");
          FollowSlideInternalPymiListPresenter$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, FollowSlideInternalPymiListPresenter.class, "21")) {
             p0 = tb.q;
             if (p0 == null) {
                a.S("mPymiTipsShowResponseObservableData");
             }
             p0.d(new PymiTipsShowResponse());
             View[] viewArray = new View[]{tb.t};
             n.Z(8, viewArray);
          }
       }
       return;
    }
}
