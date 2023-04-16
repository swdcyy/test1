package com.yxcorp.gifshow.relation.friend.manage.delegate.FriendRemovedUserListEventDelegate;
import rac.e;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tac.m;
import com.yxcorp.gifshow.relation.friend.manage.delegate.FriendRemovedUserListEventDelegate$observeKrnRemoveUserListEvent$1;
import msd.p;

public final class FriendRemovedUserListEventDelegate implements e	// class@0018b7
{
    public FriendManager a;

    public void FriendRemovedUserListEventDelegate(){
       super();
    }
    public void g(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendRemovedUserListEventDelegate.class, "2")) {
          return;
       }
       a.p(p0, "user");
       m.a("krnFriendsPreventUserStateChange", p0, true);
       return;
    }
    public void i(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendRemovedUserListEventDelegate.class, "3")) {
          return;
       }
       a.p(p0, "user");
       m.a("krnFriendsPreventUserStateChange", p0, false);
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, FriendRemovedUserListEventDelegate.class, "1")) {
          return;
       }
       m.b("KRNFriendsPreventUserNotification", new FriendRemovedUserListEventDelegate$observeKrnRemoveUserListEvent$1(this));
       return;
    }
}
