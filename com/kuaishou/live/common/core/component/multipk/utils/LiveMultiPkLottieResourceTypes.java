package com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkLottieResourceTypes;
import pu1.f;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkLottieResourceTypes extends Enum implements f	// class@0016a0
{
    public final String cdnUrlWithoutHost;
    public final String localFileName;
    public static final LiveMultiPkLottieResourceTypes[] $VALUES;
    public static final LiveMultiPkLottieResourceTypes PK_BIG_SPARK_BLUE;
    public static final LiveMultiPkLottieResourceTypes PK_BIG_SPARK_ORANGE;
    public static final LiveMultiPkLottieResourceTypes PK_DIVIDERS;
    public static final LiveMultiPkLottieResourceTypes PK_EMOJI_DRAW;
    public static final LiveMultiPkLottieResourceTypes PK_EMOJI_FAIL;
    public static final LiveMultiPkLottieResourceTypes PK_EMOJI_WIN;
    public static final LiveMultiPkLottieResourceTypes PK_SMALL_SPARK_BLUE;
    public static final LiveMultiPkLottieResourceTypes PK_SMALL_SPARK_ORANGE;

    static {
       LiveMultiPkLottieResourceTypes liveMultiPkL1;
       LiveMultiPkLottieResourceTypes[] liveMultiPkL = new LiveMultiPkLottieResourceTypes[]{liveMultiPkL1,liveMultiPkL1,liveMultiPkL1,liveMultiPkL1,liveMultiPkL1,liveMultiPkL1,liveMultiPkL1,liveMultiPkL1};
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_BIG_SPARK_ORANGE", 0, "live_pk_big_spark_orange_image/", "live_pk_big_spark_orange_image/live_pk_big_spark_orange.json");
       LiveMultiPkLottieResourceTypes.PK_BIG_SPARK_ORANGE = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_BIG_SPARK_BLUE", 1, "live_pk_big_spark_blue_image/", "live_pk_big_spark_blue_image/live_pk_big_spark_blue.json");
       LiveMultiPkLottieResourceTypes.PK_BIG_SPARK_BLUE = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_DIVIDERS", 2, "live_pk_dividers_image/", "live_pk_dividers_image/live_pk_dividers.json");
       LiveMultiPkLottieResourceTypes.PK_DIVIDERS = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_SMALL_SPARK_ORANGE", 3, "live_pk_small_spark_orange_image/", "live_pk_small_spark_orange_image/live_pk_small_spark_orange.json");
       LiveMultiPkLottieResourceTypes.PK_SMALL_SPARK_ORANGE = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_SMALL_SPARK_BLUE", 4, "live_pk_small_spark_blue_image/", "live_pk_small_spark_blue_image/live_pk_small_spark_blue.json");
       LiveMultiPkLottieResourceTypes.PK_SMALL_SPARK_BLUE = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_EMOJI_WIN", 5, "live_pk_emoji_win_image/", "live_pk_emoji_win_image/live_pk_emoji_win.json");
       LiveMultiPkLottieResourceTypes.PK_EMOJI_WIN = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_EMOJI_FAIL", 6, "live_pk_emoji_fail_image/", "live_pk_emoji_fail_image/live_pk_emoji_fail.json");
       LiveMultiPkLottieResourceTypes.PK_EMOJI_FAIL = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLottieResourceTypes("PK_EMOJI_DRAW", 7, "live_pk_emoji_draw_image/", "live_pk_emoji_draw_image/live_pk_emoji_draw.json");
       LiveMultiPkLottieResourceTypes.PK_EMOJI_DRAW = liveMultiPkL1;
       LiveMultiPkLottieResourceTypes.$VALUES = liveMultiPkL;
    }
    public void LiveMultiPkLottieResourceTypes(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.localFileName = p2;
       this.cdnUrlWithoutHost = p3;
    }
    public static LiveMultiPkLottieResourceTypes valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkLottieResourceTypes.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkLottieResourceTypes.class, p0);
    }
    public static LiveMultiPkLottieResourceTypes[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkLottieResourceTypes.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkLottieResourceTypes.$VALUES.clone();
    }
    public String getLocalFileName(){
       return this.cdnUrlWithoutHost;
    }
    public String getLottieImageResFolderPath(){
       return this.localFileName;
    }
}
