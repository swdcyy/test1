package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$e;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$e implements r	// class@00118f
{
    public final FollowPymiListDampingPresenter b;

    public void FollowPymiListDampingPresenter$e(FollowPymiListDampingPresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$e.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = this.b.Z8();
       }
       return b;
    }
}
