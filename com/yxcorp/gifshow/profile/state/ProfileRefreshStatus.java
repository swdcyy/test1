package com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProfileRefreshStatus extends Enum	// class@0015a7
{
    public static final ProfileRefreshStatus[] $VALUES;
    public static final ProfileRefreshStatus ALL;
    public static final ProfileRefreshStatus PROFILE;
    public static final ProfileRefreshStatus USER_FOLLOW;

    static {
       ProfileRefreshStatus profileRefre = new ProfileRefreshStatus("PROFILE", 0);
       ProfileRefreshStatus.PROFILE = profileRefre;
       ProfileRefreshStatus profileRefre1 = new ProfileRefreshStatus("ALL", 1);
       ProfileRefreshStatus.ALL = profileRefre1;
       ProfileRefreshStatus profileRefre2 = new ProfileRefreshStatus("USER_FOLLOW", 2);
       ProfileRefreshStatus.USER_FOLLOW = profileRefre2;
       ProfileRefreshStatus[] profileRefre3 = new ProfileRefreshStatus[]{profileRefre,profileRefre1,profileRefre2};
       ProfileRefreshStatus.$VALUES = profileRefre3;
    }
    public void ProfileRefreshStatus(String p0,int p1){
       super(p0, p1);
    }
    public static ProfileRefreshStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileRefreshStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfileRefreshStatus.class, p0);
    }
    public static ProfileRefreshStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ProfileRefreshStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileRefreshStatus.$VALUES.clone();
    }
}
