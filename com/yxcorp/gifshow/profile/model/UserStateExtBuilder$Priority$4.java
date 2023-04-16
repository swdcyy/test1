package com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$4;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority;
import java.lang.String;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class UserStateExtBuilder$Priority$4 extends UserStateExtBuilder$Priority	// class@0013ce
{

    public void UserStateExtBuilder$Priority$4(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checked(User p0,UserProfile p1){
       return p0.mBlacked;
    }
}
