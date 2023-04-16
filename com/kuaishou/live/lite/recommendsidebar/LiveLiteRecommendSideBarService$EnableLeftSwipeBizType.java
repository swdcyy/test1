package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService$EnableLeftSwipeBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteRecommendSideBarService$EnableLeftSwipeBizType extends Enum	// class@000ae7
{
    public static final LiveLiteRecommendSideBarService$EnableLeftSwipeBizType[] $VALUES;
    public static final LiveLiteRecommendSideBarService$EnableLeftSwipeBizType FEEDBACK;
    public static final LiveLiteRecommendSideBarService$EnableLeftSwipeBizType SQUARE;

    static {
       LiveLiteRecommendSideBarService$EnableLeftSwipeBizType uEnableLeftS1;
       LiveLiteRecommendSideBarService$EnableLeftSwipeBizType[] uEnableLeftS = new LiveLiteRecommendSideBarService$EnableLeftSwipeBizType[]{uEnableLeftS1,uEnableLeftS1};
       uEnableLeftS1 = new LiveLiteRecommendSideBarService$EnableLeftSwipeBizType("FEEDBACK", 0);
       LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.FEEDBACK = uEnableLeftS1;
       uEnableLeftS1 = new LiveLiteRecommendSideBarService$EnableLeftSwipeBizType("SQUARE", 1);
       LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.SQUARE = uEnableLeftS1;
       LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.$VALUES = uEnableLeftS;
    }
    public void LiveLiteRecommendSideBarService$EnableLeftSwipeBizType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteRecommendSideBarService$EnableLeftSwipeBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.class, p0);
    }
    public static LiveLiteRecommendSideBarService$EnableLeftSwipeBizType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.$VALUES.clone();
    }
}
