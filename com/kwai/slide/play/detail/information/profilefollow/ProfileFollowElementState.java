package com.kwai.slide.play.detail.information.profilefollow.ProfileFollowElementState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProfileFollowElementState extends Enum	// class@0017fa
{
    public static final ProfileFollowElementState[] $VALUES;
    public static final ProfileFollowElementState HIDE_NO_ANIM;
    public static final ProfileFollowElementState HIDE_WITH_FOLLOW_ANIM;
    public static final ProfileFollowElementState HIDE_WITH_NORMAL_ANIM;
    public static final ProfileFollowElementState SHOW;
    public static final ProfileFollowElementState SHOW_NO_ANIM;
    public static final ProfileFollowElementState UNKNOWN;

    static {
       ProfileFollowElementState profileFollo1;
       ProfileFollowElementState[] profileFollo = new ProfileFollowElementState[]{profileFollo1,profileFollo1,profileFollo1,profileFollo1,profileFollo1,profileFollo1};
       profileFollo1 = new ProfileFollowElementState("UNKNOWN", 0);
       ProfileFollowElementState.UNKNOWN = profileFollo1;
       profileFollo1 = new ProfileFollowElementState("HIDE_NO_ANIM", 1);
       ProfileFollowElementState.HIDE_NO_ANIM = profileFollo1;
       profileFollo1 = new ProfileFollowElementState("HIDE_WITH_NORMAL_ANIM", 2);
       ProfileFollowElementState.HIDE_WITH_NORMAL_ANIM = profileFollo1;
       profileFollo1 = new ProfileFollowElementState("HIDE_WITH_FOLLOW_ANIM", 3);
       ProfileFollowElementState.HIDE_WITH_FOLLOW_ANIM = profileFollo1;
       profileFollo1 = new ProfileFollowElementState("SHOW", 4);
       ProfileFollowElementState.SHOW = profileFollo1;
       profileFollo1 = new ProfileFollowElementState("SHOW_NO_ANIM", 5);
       ProfileFollowElementState.SHOW_NO_ANIM = profileFollo1;
       ProfileFollowElementState.$VALUES = profileFollo;
    }
    public void ProfileFollowElementState(String p0,int p1){
       super(p0, p1);
    }
    public static ProfileFollowElementState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileFollowElementState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfileFollowElementState.class, p0);
    }
    public static ProfileFollowElementState[] values(){
       Object obj = PatchProxy.apply(null, null, ProfileFollowElementState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileFollowElementState.$VALUES.clone();
    }
}
