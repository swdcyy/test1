package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$k;
import erd.r;
import java.lang.Object;
import dha.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$k implements r	// class@001195
{
    public static final FollowPymiListDampingPresenter$k b;

    static {
       FollowPymiListDampingPresenter$k.b = new FollowPymiListDampingPresenter$k();
    }
    public void FollowPymiListDampingPresenter$k(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$k.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "state");
          b = p0.b();
       }
       return b;
    }
}
