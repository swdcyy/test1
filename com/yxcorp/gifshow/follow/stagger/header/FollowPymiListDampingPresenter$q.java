package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$q;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.QCurrentUser;

public final class FollowPymiListDampingPresenter$q implements r	// class@0011a6
{
    public static final FollowPymiListDampingPresenter$q b;

    static {
       FollowPymiListDampingPresenter$q.b = new FollowPymiListDampingPresenter$q();
    }
    public void FollowPymiListDampingPresenter$q(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPymiListDampingPresenter$q.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = QCurrentUser.ME.enableShowFrequentUsers() ^ 0x01;
       }
       return b;
    }
}
