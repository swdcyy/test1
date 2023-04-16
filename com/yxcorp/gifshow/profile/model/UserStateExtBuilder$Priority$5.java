package com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$5;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority;
import java.lang.String;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class UserStateExtBuilder$Priority$5 extends UserStateExtBuilder$Priority	// class@0013cf
{

    public void UserStateExtBuilder$Priority$5(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean checked(User p0,UserProfile p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, UserStateExtBuilder$Priority$5.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       return p0.isBanned();
    }
}
