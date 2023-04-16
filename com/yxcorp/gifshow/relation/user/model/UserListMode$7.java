package com.yxcorp.gifshow.relation.user.model.UserListMode$7;
import com.yxcorp.gifshow.relation.user.model.UserListMode;
import java.lang.String;
import com.yxcorp.gifshow.relation.user.model.UserListMode$1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment;

public final class UserListMode$7 extends UserListMode	// class@001a4c
{

    public void UserListMode$7(String p0,int p1,String p2){
       super(p0, p1, p2, null);
    }
    public t createFragment(GifshowActivity p0){
       p0 = PatchProxy.applyOneRefs(p0, this, UserListMode$7.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return t.just(new MissUUserProfileAndNoticeFragment());
    }
}
