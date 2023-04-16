package com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$6;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority;
import java.lang.String;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;

public final class UserStateExtBuilder$Priority$6 extends UserStateExtBuilder$Priority	// class@0013d0
{

    public void UserStateExtBuilder$Priority$6(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checked(User p0,UserProfile p1){
       boolean b;
       if (p1 != null) {
          UserProfile mProfile = p1.mProfile;
          if (mProfile != null && mProfile.mFrozen != null) {
             b = true;
          label_000d :
             return b;
          }
       }
       b = false;
       goto label_000d ;
    }
}
