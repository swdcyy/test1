package com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBottomBarItemBadge$Type extends Enum	// class@000d50
{
    public static final LiveBottomBarItemBadge$Type[] $VALUES;
    public static final LiveBottomBarItemBadge$Type RED_DOT;
    public static final LiveBottomBarItemBadge$Type TEXT;

    static {
       LiveBottomBarItemBadge$Type type = new LiveBottomBarItemBadge$Type("RED_DOT", 0);
       LiveBottomBarItemBadge$Type.RED_DOT = type;
       LiveBottomBarItemBadge$Type type1 = new LiveBottomBarItemBadge$Type("TEXT", 1);
       LiveBottomBarItemBadge$Type.TEXT = type1;
       LiveBottomBarItemBadge$Type[] typeArray = new LiveBottomBarItemBadge$Type[]{type,type1};
       LiveBottomBarItemBadge$Type.$VALUES = typeArray;
    }
    public void LiveBottomBarItemBadge$Type(String p0,int p1){
       super(p0, p1);
    }
    public static LiveBottomBarItemBadge$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBottomBarItemBadge$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBottomBarItemBadge$Type.class, p0);
    }
    public static LiveBottomBarItemBadge$Type[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBottomBarItemBadge$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBottomBarItemBadge$Type.$VALUES.clone();
    }
}
