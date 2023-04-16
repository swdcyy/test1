package com.yxcorp.gifshow.profile.components.common.actions.UserProfileAction;
import ee7.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UserProfileAction extends Enum implements e	// class@0012e5
{
    public static final UserProfileAction[] $VALUES;
    public static final UserProfileAction UPDATE;

    static {
       UserProfileAction userProfileA = new UserProfileAction("UPDATE", 0);
       UserProfileAction.UPDATE = userProfileA;
       UserProfileAction[] userProfileA1 = new UserProfileAction[]{userProfileA};
       UserProfileAction.$VALUES = userProfileA1;
    }
    public void UserProfileAction(String p0,int p1){
       super(p0, p1);
    }
    public static UserProfileAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserProfileAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserProfileAction.class, p0);
    }
    public static UserProfileAction[] values(){
       Object obj = PatchProxy.apply(null, null, UserProfileAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserProfileAction.$VALUES.clone();
    }
}
