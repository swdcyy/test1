package com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$UserAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveActionTrigger$UserAction extends Enum	// class@0017b5
{
    public static final LiveActionTrigger$UserAction[] $VALUES;
    public static final LiveActionTrigger$UserAction CommentOnce;
    public static final LiveActionTrigger$UserAction ForegroundWatchLite1Sec;
    public static final LiveActionTrigger$UserAction LikeOnce;
    public static final LiveActionTrigger$UserAction SendGiftOnce;

    static {
       LiveActionTrigger$UserAction userAction;
       LiveActionTrigger$UserAction[] userActionAr = new LiveActionTrigger$UserAction[]{userAction,userAction,userAction,userAction};
       userAction = new LiveActionTrigger$UserAction("ForegroundWatchLite1Sec", 0);
       LiveActionTrigger$UserAction.ForegroundWatchLite1Sec = userAction;
       userAction = new LiveActionTrigger$UserAction("CommentOnce", 1);
       LiveActionTrigger$UserAction.CommentOnce = userAction;
       userAction = new LiveActionTrigger$UserAction("SendGiftOnce", 2);
       LiveActionTrigger$UserAction.SendGiftOnce = userAction;
       userAction = new LiveActionTrigger$UserAction("LikeOnce", 3);
       LiveActionTrigger$UserAction.LikeOnce = userAction;
       LiveActionTrigger$UserAction.$VALUES = userActionAr;
    }
    public void LiveActionTrigger$UserAction(String p0,int p1){
       super(p0, p1);
    }
    public static LiveActionTrigger$UserAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveActionTrigger$UserAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveActionTrigger$UserAction.class, p0);
    }
    public static LiveActionTrigger$UserAction[] values(){
       Object obj = PatchProxy.apply(null, null, LiveActionTrigger$UserAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveActionTrigger$UserAction.$VALUES.clone();
    }
}
