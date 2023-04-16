package com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveWillShowType extends Enum	// class@000fb1
{
    public static final LiveWillShowType[] $VALUES;
    public static final LiveWillShowType DOWN_SLIDE;
    public static final LiveWillShowType NONE;
    public static final LiveWillShowType UP_SLIDE;

    static {
       LiveWillShowType liveWillShow = new LiveWillShowType("NONE", 0);
       LiveWillShowType.NONE = liveWillShow;
       LiveWillShowType liveWillShow1 = new LiveWillShowType("UP_SLIDE", 1);
       LiveWillShowType.UP_SLIDE = liveWillShow1;
       LiveWillShowType liveWillShow2 = new LiveWillShowType("DOWN_SLIDE", 2);
       LiveWillShowType.DOWN_SLIDE = liveWillShow2;
       LiveWillShowType[] liveWillShow3 = new LiveWillShowType[]{liveWillShow,liveWillShow1,liveWillShow2};
       LiveWillShowType.$VALUES = liveWillShow3;
    }
    public void LiveWillShowType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveWillShowType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveWillShowType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveWillShowType.class, p0);
    }
    public static LiveWillShowType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveWillShowType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveWillShowType.$VALUES.clone();
    }
}
