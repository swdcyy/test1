package com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteHighFrequencyGuideType extends Enum	// class@0009af
{
    public static final LiveLiteHighFrequencyGuideType[] $VALUES;
    public static final LiveLiteHighFrequencyGuideType FANS_GROUP;
    public static final LiveLiteHighFrequencyGuideType GIFT;
    public static final LiveLiteHighFrequencyGuideType UNKNOWN;

    static {
       LiveLiteHighFrequencyGuideType liveLiteHigh1;
       LiveLiteHighFrequencyGuideType[] liveLiteHigh = new LiveLiteHighFrequencyGuideType[]{liveLiteHigh1,liveLiteHigh1,liveLiteHigh1};
       liveLiteHigh1 = new LiveLiteHighFrequencyGuideType("UNKNOWN", 0);
       LiveLiteHighFrequencyGuideType.UNKNOWN = liveLiteHigh1;
       liveLiteHigh1 = new LiveLiteHighFrequencyGuideType("FANS_GROUP", 1);
       LiveLiteHighFrequencyGuideType.FANS_GROUP = liveLiteHigh1;
       liveLiteHigh1 = new LiveLiteHighFrequencyGuideType("GIFT", 2);
       LiveLiteHighFrequencyGuideType.GIFT = liveLiteHigh1;
       LiveLiteHighFrequencyGuideType.$VALUES = liveLiteHigh;
    }
    public void LiveLiteHighFrequencyGuideType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteHighFrequencyGuideType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteHighFrequencyGuideType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteHighFrequencyGuideType.class, p0);
    }
    public static LiveLiteHighFrequencyGuideType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteHighFrequencyGuideType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteHighFrequencyGuideType.$VALUES.clone();
    }
}
