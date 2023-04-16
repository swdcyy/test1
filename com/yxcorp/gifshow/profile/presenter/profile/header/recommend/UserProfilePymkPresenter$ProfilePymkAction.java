package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter$ProfilePymkAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UserProfilePymkPresenter$ProfilePymkAction extends Enum	// class@00152f
{
    public static final UserProfilePymkPresenter$ProfilePymkAction[] $VALUES;
    public static final UserProfilePymkPresenter$ProfilePymkAction PYMK_SHOW_CONSTANT_FOLLOW;
    public static final UserProfilePymkPresenter$ProfilePymkAction PYMK_SHOW_CONSTANT_UNFOLLOW;

    static {
       UserProfilePymkPresenter$ProfilePymkAction profilePymkA = new UserProfilePymkPresenter$ProfilePymkAction("PYMK_SHOW_CONSTANT_FOLLOW", 0);
       UserProfilePymkPresenter$ProfilePymkAction.PYMK_SHOW_CONSTANT_FOLLOW = profilePymkA;
       UserProfilePymkPresenter$ProfilePymkAction profilePymkA1 = new UserProfilePymkPresenter$ProfilePymkAction("PYMK_SHOW_CONSTANT_UNFOLLOW", 1);
       UserProfilePymkPresenter$ProfilePymkAction.PYMK_SHOW_CONSTANT_UNFOLLOW = profilePymkA1;
       UserProfilePymkPresenter$ProfilePymkAction[] profilePymkA2 = new UserProfilePymkPresenter$ProfilePymkAction[]{profilePymkA,profilePymkA1};
       UserProfilePymkPresenter$ProfilePymkAction.$VALUES = profilePymkA2;
    }
    public void UserProfilePymkPresenter$ProfilePymkAction(String p0,int p1){
       super(p0, p1);
    }
    public static UserProfilePymkPresenter$ProfilePymkAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserProfilePymkPresenter$ProfilePymkAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserProfilePymkPresenter$ProfilePymkAction.class, p0);
    }
    public static UserProfilePymkPresenter$ProfilePymkAction[] values(){
       Object obj = PatchProxy.apply(null, null, UserProfilePymkPresenter$ProfilePymkAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserProfilePymkPresenter$ProfilePymkAction.$VALUES.clone();
    }
}
