package com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$3;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority;
import java.lang.String;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class UserStateExtBuilder$Priority$3 extends UserStateExtBuilder$Priority	// class@0013cd
{

    public void UserStateExtBuilder$Priority$3(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checked(User p0,UserProfile p1){
       boolean b = (p1 != null && p1.mIsBlockedByOwner != null)? true: false;
       return b;
    }
}
