package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$s;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$s implements r	// class@0011a8
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$s(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$s.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          p0 = this.b.Q;
       }
       return b;
    }
}
