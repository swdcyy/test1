package com.yxcorp.gifshow.profile.ProfileStyle;
import java.lang.Enum;
import com.yxcorp.gifshow.profile.ProfileStyle$TEENAGE;
import java.lang.String;
import com.yxcorp.gifshow.profile.ProfileStyle$REDESIGN_IMMERSIVE_V2;
import com.yxcorp.gifshow.profile.ProfileStyle$REDESIGN_HEAD_SMALL_CARD;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public abstract class ProfileStyle extends Enum	// class@0011e7
{
    public final int profileStyle;
    public static final ProfileStyle[] $VALUES;
    public static final ProfileStyle REDESIGN_HEAD_SMALL_CARD;
    public static final ProfileStyle REDESIGN_IMMERSIVE_V2;
    public static final ProfileStyle TEENAGE;

    static {
       ProfileStyle$TEENAGE tEENAGE;
       ProfileStyle$REDESIGN_IMMERSIVE_V2 rEDESIGN_IMM;
       ProfileStyle$REDESIGN_HEAD_SMALL_CARD rEDESIGN_HEA;
       ProfileStyle[] profileStyle = new ProfileStyle[]{tEENAGE,rEDESIGN_IMM,rEDESIGN_HEA};
       tEENAGE = new ProfileStyle$TEENAGE("TEENAGE", 0);
       ProfileStyle.TEENAGE = tEENAGE;
       rEDESIGN_IMM = new ProfileStyle$REDESIGN_IMMERSIVE_V2("REDESIGN_IMMERSIVE_V2", 1);
       ProfileStyle.REDESIGN_IMMERSIVE_V2 = rEDESIGN_IMM;
       rEDESIGN_HEA = new ProfileStyle$REDESIGN_HEAD_SMALL_CARD("REDESIGN_HEAD_SMALL_CARD", 2);
       ProfileStyle.REDESIGN_HEAD_SMALL_CARD = rEDESIGN_HEA;
       ProfileStyle.$VALUES = profileStyle;
    }
    public void ProfileStyle(String p0,int p1,int p2){
       super(p0, p1);
       this.profileStyle = p2;
    }
    public void ProfileStyle(String p0,int p1,int p2,u p3){
       super(p0, p1, p2);
    }
    public static ProfileStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfileStyle.class, p0);
    }
    public static ProfileStyle[] values(){
       Object obj = PatchProxy.apply(null, null, ProfileStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileStyle.$VALUES.clone();
    }
    public abstract void addCommonPresenterV2(PresenterV2 p0);
    public abstract void addMyPresenterV2(PresenterV2 p0);
    public abstract void addUserPresenterV2(PresenterV2 p0);
    public int getLayoutId(){
       return 0x7f0d11b2;
    }
    public final int getProfileStyle(){
       return this.profileStyle;
    }
}
