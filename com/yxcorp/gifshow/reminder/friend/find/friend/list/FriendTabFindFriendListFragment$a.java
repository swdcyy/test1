package com.yxcorp.gifshow.reminder.friend.find.friend.list.FriendTabFindFriendListFragment$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.reminder.friend.find.friend.list.FriendTabFindFriendListFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class FriendTabFindFriendListFragment$a	// class@001a93
{

    public void FriendTabFindFriendListFragment$a(){
       super();
    }
    public void FriendTabFindFriendListFragment$a(u p0){
       super();
    }
    public final FriendTabFindFriendListFragment a(boolean p0){
       Bundle obj;
       FriendTabFindFriendListFragment$a uoa = FriendTabFindFriendListFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Bundle();
       obj.putBoolean("KEY_FRIEND_PYMK_PAGE", p0);
       FriendTabFindFriendListFragment uFriendTabFi = new FriendTabFindFriendListFragment();
       uFriendTabFi.setArguments(obj);
       return uFriendTabFi;
    }
}
