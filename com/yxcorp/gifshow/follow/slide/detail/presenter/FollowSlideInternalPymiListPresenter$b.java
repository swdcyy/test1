package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$b;
import joc.d;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import cia.w;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class FollowSlideInternalPymiListPresenter$b implements d	// class@001116
{
    public final FollowSlideInternalPymiListPresenter a;

    public void FollowSlideInternalPymiListPresenter$b(FollowSlideInternalPymiListPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0,boolean p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowSlideInternalPymiListPresenter$b uob = FollowSlideInternalPymiListPresenter$b.class;
       if (PatchProxy.isSupport(uob)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1");
          if (p0 != patchProxyRe) {
             return p0.booleanValue();
          }
       }
       FollowSlideInternalPymiListPresenter$b ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       FollowSlideInternalPymiListPresenter uFollowSlide = PatchProxy.apply(objArray, ta, FollowSlideInternalPymiListPresenter.class, "5");
       if (uFollowSlide != patchProxyRe) {
       }else {
          uFollowSlide = ta.v;
          if (uFollowSlide == null) {
             a.S("mFollowSlideInjectAdapter");
          }
       }
       SlidePlayViewModel slidePlayVie = uFollowSlide.O();
       uFollowSlide = false;
       if (slidePlayVie == null || slidePlayVie.b1()) {
          FollowSlideInternalPymiListPresenter z = this.a.z;
          if (z != null) {
             objArray = z.getLayoutManager();
          }
          if (objArray != null && objArray.h()) {
             uFollowSlide = true;
          }
          return uFollowSlide;
       }else {
          return uFollowSlide;
       }
    }
}
