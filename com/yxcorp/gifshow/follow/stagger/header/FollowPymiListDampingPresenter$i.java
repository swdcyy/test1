package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$i;
import erd.o;
import java.lang.Object;
import zf5.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FollowPymiListDampingPresenter$i implements o	// class@001193
{
    public static final FollowPymiListDampingPresenter$i b;

    static {
       FollowPymiListDampingPresenter$i.b = new FollowPymiListDampingPresenter$i();
    }
    public void FollowPymiListDampingPresenter$i(){
       super();
    }
    public Object apply(Object p0){
       c$b uob = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$i.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          uob = p0.b;
       }
       return uob;
    }
}
