package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$g;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$g implements g	// class@001191
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$g(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymiListDampingPresenter$g.class, "1")) {
       }else {
          a.p(p0, "unFollowUserId");
          this.b.q9(p0);
       }
       return;
    }
}