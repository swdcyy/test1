package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$p;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$p implements r	// class@0011a5
{
    public static final FollowPymiListDampingPresenter$p b;

    static {
       FollowPymiListDampingPresenter$p.b = new FollowPymiListDampingPresenter$p();
    }
    public void FollowPymiListDampingPresenter$p(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$p.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.m(p0);
          b = p0.booleanValue();
       }
       return b;
    }
}
