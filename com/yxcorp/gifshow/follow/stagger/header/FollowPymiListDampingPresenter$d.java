package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$d;
import erd.r;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$d implements r	// class@00118e
{
    public static final FollowPymiListDampingPresenter$d b;

    static {
       FollowPymiListDampingPresenter$d.b = new FollowPymiListDampingPresenter$d();
    }
    public void FollowPymiListDampingPresenter$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "event");
          b = (p0.d == null && p0.c == null)? true: false;
       }
       return b;
    }
}
