package com.yxcorp.gifshow.profile.components.common.actions.ProfileLoadStateAction;
import ee7.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProfileLoadStateAction extends Enum implements e	// class@0012e3
{
    public static final ProfileLoadStateAction[] $VALUES;
    public static final ProfileLoadStateAction UPDATE;

    static {
       ProfileLoadStateAction profileLoadS = new ProfileLoadStateAction("UPDATE", 0);
       ProfileLoadStateAction.UPDATE = profileLoadS;
       ProfileLoadStateAction[] profileLoadS1 = new ProfileLoadStateAction[]{profileLoadS};
       ProfileLoadStateAction.$VALUES = profileLoadS1;
    }
    public void ProfileLoadStateAction(String p0,int p1){
       super(p0, p1);
    }
    public static ProfileLoadStateAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileLoadStateAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfileLoadStateAction.class, p0);
    }
    public static ProfileLoadStateAction[] values(){
       Object obj = PatchProxy.apply(null, null, ProfileLoadStateAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileLoadStateAction.$VALUES.clone();
    }
}
