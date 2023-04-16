package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$f;
import erd.o;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$f implements o	// class@001190
{
    public static final FollowPymiListDampingPresenter$f b;

    static {
       FollowPymiListDampingPresenter$f.b = new FollowPymiListDampingPresenter$f();
    }
    public void FollowPymiListDampingPresenter$f(){
       super();
    }
    public Object apply(Object p0){
       n on = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$f.class, "1");
       if (on != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          on = p0.b;
       }
       return on;
    }
}
