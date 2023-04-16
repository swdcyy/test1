package bia.l;
import hv5.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fia.o;
import fia.z;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import com.smile.gifmaker.mvps.presenter.MainThreadScatterPresenterGroup;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import fia.n0;
import fia.m0;

public class l implements b	// class@0003cc
{

    public void l(){
       super();
    }
    public void TF(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l.class, "1")) {
          return;
       }
       p0.U7(new o());
       p0.U7(new z());
       p0.U7(new FollowSlideInternalPymiListPresenter());
       PatchProxy.onMethodExit(l.class, "1");
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void z10(MainThreadScatterPresenterGroup p0,PhotoDetailParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "2")) {
          return;
       }
       if (p1.getSource() == 90) {
          if (FollowConfigUtil.m()) {
             p0.a(new n0());
          }
          if (FollowConfigUtil.h()) {
             p0.a(new m0());
          }
       }
       return;
    }
}
