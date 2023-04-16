package com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMiniWidgetItemType extends Enum	// class@000fdc
{
    public final int type;
    public static final LiveMiniWidgetItemType[] $VALUES;
    public static final LiveMiniWidgetItemType DSL_TYPE;
    public static final LiveMiniWidgetItemType KDS_TYPE;
    public static final LiveMiniWidgetItemType MERCHANT_ACTIVITY_TYPE;
    public static final LiveMiniWidgetItemType NATIVE_TYPE;
    public static final LiveMiniWidgetItemType OLD_ACTIVITY_TYPE;
    public static final LiveMiniWidgetItemType UNKNOWN_TYPE;

    static {
       LiveMiniWidgetItemType liveMiniWidg1;
       LiveMiniWidgetItemType[] liveMiniWidg = new LiveMiniWidgetItemType[]{liveMiniWidg1,liveMiniWidg1,liveMiniWidg1,liveMiniWidg1,liveMiniWidg1,liveMiniWidg1};
       liveMiniWidg1 = new LiveMiniWidgetItemType("UNKNOWN_TYPE", 0, 0);
       LiveMiniWidgetItemType.UNKNOWN_TYPE = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetItemType("DSL_TYPE", 1, 1);
       LiveMiniWidgetItemType.DSL_TYPE = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetItemType("KDS_TYPE", 2, 2);
       LiveMiniWidgetItemType.KDS_TYPE = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetItemType("NATIVE_TYPE", 3, 3);
       LiveMiniWidgetItemType.NATIVE_TYPE = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetItemType("OLD_ACTIVITY_TYPE", 4, 4);
       LiveMiniWidgetItemType.OLD_ACTIVITY_TYPE = liveMiniWidg1;
       liveMiniWidg1 = new LiveMiniWidgetItemType("MERCHANT_ACTIVITY_TYPE", 5, 5);
       LiveMiniWidgetItemType.MERCHANT_ACTIVITY_TYPE = liveMiniWidg1;
       LiveMiniWidgetItemType.$VALUES = liveMiniWidg;
    }
    public void LiveMiniWidgetItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static LiveMiniWidgetItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMiniWidgetItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMiniWidgetItemType.class, p0);
    }
    public static LiveMiniWidgetItemType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMiniWidgetItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMiniWidgetItemType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
