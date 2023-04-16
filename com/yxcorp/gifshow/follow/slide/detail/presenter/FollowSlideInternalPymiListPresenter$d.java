package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$d;
import tw6.e;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import cha.a;
import com.yxcorp.gifshow.follow.common.pymi.PymiUserRecyclerView;
import java.lang.Boolean;
import xha.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.autoplay.widget.FeedsLayoutManager;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$d$a;
import com.yxcorp.gifshow.autoplay.widget.a$a;

public final class FollowSlideInternalPymiListPresenter$d implements e	// class@00111a
{
    public final FollowSlideInternalPymiListPresenter a;

    public void FollowSlideInternalPymiListPresenter$d(FollowSlideInternalPymiListPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       FollowSlideInternalPymiListPresenter$d uod = FollowSlideInternalPymiListPresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       c.b(KsLogFollowTag.NIRVANA_PYMI.appendTag("FollowSlideInternalPymiListPresenter"), "translateYToTop", "reason", String.valueOf(p0));
       int i = 0;
       this.a.W8().d(i);
       FollowSlideInternalPymiListPresenter z = this.a.z;
       boolean b = true;
       if (z != null) {
          z.setCanScrollHorizontally(b);
       }
       if (!p0) {
          b = false;
       }
       a.d(Boolean.valueOf(b));
       FollowSlideInternalPymiListPresenter z1 = this.a.z;
       if (z1 != null) {
          i = z1.getChildCount();
       }
       if (i <= 0) {
          this.a.R8().K(new FollowSlideInternalPymiListPresenter$d$a(this));
       }else {
          this.a.Y8();
       }
       return;
    }
    public void b(int p0){
       FollowSlideInternalPymiListPresenter$d uod = FollowSlideInternalPymiListPresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       c.b(KsLogFollowTag.NIRVANA_PYMI.appendTag("FollowSlideInternalPymiListPresenter"), "translateYToTop", "reason", String.valueOf(p0));
       this.a.W8().d(1);
       FollowSlideInternalPymiListPresenter z = this.a.z;
       if (z != null) {
          z.setCanScrollHorizontally(false);
       }
       return;
    }
}
