package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel$ClickSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UserLevelInfoViewModel$ClickSource extends Enum	// class@001a67
{
    public static final UserLevelInfoViewModel$ClickSource[] $VALUES;
    public static final UserLevelInfoViewModel$ClickSource CLICK_BADGE;
    public static final UserLevelInfoViewModel$ClickSource CLICK_BUTTON;

    static {
       UserLevelInfoViewModel$ClickSource uClickSource1;
       UserLevelInfoViewModel$ClickSource[] uClickSource = new UserLevelInfoViewModel$ClickSource[]{uClickSource1,uClickSource1};
       uClickSource1 = new UserLevelInfoViewModel$ClickSource("CLICK_BADGE", 0);
       UserLevelInfoViewModel$ClickSource.CLICK_BADGE = uClickSource1;
       uClickSource1 = new UserLevelInfoViewModel$ClickSource("CLICK_BUTTON", 1);
       UserLevelInfoViewModel$ClickSource.CLICK_BUTTON = uClickSource1;
       UserLevelInfoViewModel$ClickSource.$VALUES = uClickSource;
    }
    public void UserLevelInfoViewModel$ClickSource(String p0,int p1){
       super(p0, p1);
    }
    public static UserLevelInfoViewModel$ClickSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserLevelInfoViewModel$ClickSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserLevelInfoViewModel$ClickSource.class, p0);
    }
    public static UserLevelInfoViewModel$ClickSource[] values(){
       Object obj = PatchProxy.apply(null, null, UserLevelInfoViewModel$ClickSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserLevelInfoViewModel$ClickSource.$VALUES.clone();
    }
}
