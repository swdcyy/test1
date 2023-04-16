package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mUserListAdapter$2$a;
import z0.a;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mUserListAdapter$2;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import trd.t;

public final class FollowPymiListDampingPresenter$mUserListAdapter$2$a implements a	// class@0011a0
{
    public final FollowPymiListDampingPresenter$mUserListAdapter$2 a;

    public void FollowPymiListDampingPresenter$mUserListAdapter$2$a(FollowPymiListDampingPresenter$mUserListAdapter$2 p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefsWithListener(p0, this, FollowPymiListDampingPresenter$mUserListAdapter$2$a.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          FollowPymiListDampingPresenter$mUserListAdapter$2 this$0 = this.a.this$0;
          a.o(p0, "index");
          int i = p0.intValue();
          Objects.requireNonNull(this$0);
          FollowPymiListDampingPresenter uFollowPymiL = FollowPymiListDampingPresenter.class;
          if (!PatchProxy.isSupport(uFollowPymiL) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this$0, uFollowPymiL, "28")) {
             List list = this$0.e9();
             if (list != null) {
                i = CollectionsKt___CollectionsKt.F2(list, i);
                if (i != null) {
                   i = t.k(i);
                   if (i != null) {
                      this$0.s9(i, list);
                   }
                }
             }
          }
          integer = Integer.valueOf(0);
          PatchProxy.onMethodExit(FollowPymiListDampingPresenter$mUserListAdapter$2$a.class, "1");
       }
       return integer;
    }
}
