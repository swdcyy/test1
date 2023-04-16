package com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GuideStructBizRelations extends Enum	// class@0015b1
{
    public final int priority;
    public static final GuideStructBizRelations[] $VALUES;
    public static final GuideStructBizRelations AnchorFollowGuestGuideStructFollowedAfterEnterMic;
    public static final GuideStructBizRelations AnchorFollowGuestGuideStructFollowedBeforeEnterMic;
    public static final GuideStructBizRelations GuestFollowGuideStruct;

    static {
       GuideStructBizRelations guideStructB1;
       GuideStructBizRelations[] guideStructB = new GuideStructBizRelations[]{guideStructB1,guideStructB1,guideStructB1};
       guideStructB1 = new GuideStructBizRelations("GuestFollowGuideStruct", 0, 1);
       GuideStructBizRelations.GuestFollowGuideStruct = guideStructB1;
       guideStructB1 = new GuideStructBizRelations("AnchorFollowGuestGuideStructFollowedAfterEnterMic", 1, 2);
       GuideStructBizRelations.AnchorFollowGuestGuideStructFollowedAfterEnterMic = guideStructB1;
       guideStructB1 = new GuideStructBizRelations("AnchorFollowGuestGuideStructFollowedBeforeEnterMic", 2, 3);
       GuideStructBizRelations.AnchorFollowGuestGuideStructFollowedBeforeEnterMic = guideStructB1;
       GuideStructBizRelations.$VALUES = guideStructB;
    }
    public void GuideStructBizRelations(String p0,int p1,int p2){
       super(p0, p1);
       this.priority = p2;
    }
    public static GuideStructBizRelations valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GuideStructBizRelations.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GuideStructBizRelations.class, p0);
    }
    public static GuideStructBizRelations[] values(){
       Object obj = PatchProxy.apply(null, null, GuideStructBizRelations.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GuideStructBizRelations.$VALUES.clone();
    }
    public final int getPriority(){
       return this.priority;
    }
}
