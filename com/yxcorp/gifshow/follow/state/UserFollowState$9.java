package com.yxcorp.gifshow.follow.state.UserFollowState$9;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import java.lang.String;
import com.yxcorp.gifshow.follow.state.UserFollowState$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public final class UserFollowState$9 extends UserFollowState	// class@00125c
{

    public void UserFollowState$9(String p0,int p1){
       super(p0, p1, null);
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, UserFollowState$9.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f1012a1);
    }
}
