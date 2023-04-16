package com.yxcorp.gifshow.relation.friend.manage.delegate.FriendReverseRemovedUserListEventDelegate;
import rac.g;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tac.m;
import com.yxcorp.gifshow.relation.friend.manage.delegate.FriendReverseRemovedUserListEventDelegate$observeKrnReverseRemoveUserListEvent$1;
import msd.p;

public final class FriendReverseRemovedUserListEventDelegate implements g	// class@0018b9
{
    public FriendManager a;

    public void FriendReverseRemovedUserListEventDelegate(){
       super();
    }
    public void D(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendReverseRemovedUserListEventDelegate.class, "3")) {
          return;
       }
       a.p(p0, "user");
       m.a("krnFriendsPreventMyselfStateChange", p0, false);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, FriendReverseRemovedUserListEventDelegate.class, "1")) {
          return;
       }
       m.b("KRNFriendsPreventMyselfNotification", new FriendReverseRemovedUserListEventDelegate$observeKrnReverseRemoveUserListEvent$1(this));
       return;
    }
    public void w(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendReverseRemovedUserListEventDelegate.class, "2")) {
          return;
       }
       a.p(p0, "user");
       m.a("krnFriendsPreventMyselfStateChange", p0, true);
       return;
    }
}
