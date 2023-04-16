package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$u;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed$PymiBarMeta;
import z0b.b;
import nl8.a;
import java.util.Objects;
import aha.a;

public final class FollowPymiListDampingPresenter$u implements g	// class@0011aa
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$u(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymiListDampingPresenter$u.class, "1")) {
       }else {
          p0 = this.b;
          p0.Q = false;
          p0 = p0.c9();
          if (p0 != null) {
             p0 = p0.mPymiBarMeta;
             if (p0 != null && p0.mCollapsed == true) {
                p0 = this.b.P8();
                Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.follow.common.pymi.FollowPymiListStateCallback");
                p0.j8(false);
             }
          }
          p0 = this.b.c9();
          if (p0 != null) {
             p0 = p0.mPymiBarMeta;
             if (p0 != null) {
                p0.mCollapsed = true;
             }
          }
          p0 = this.b.P8();
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.follow.common.pymi.FollowPymiListStateCallback");
          p0.j8(true);
       }
       return;
    }
}
