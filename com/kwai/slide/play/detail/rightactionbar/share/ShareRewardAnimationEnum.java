package com.kwai.slide.play.detail.rightactionbar.share.ShareRewardAnimationEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ShareRewardAnimationEnum extends Enum	// class@001873
{
    public static final ShareRewardAnimationEnum[] $VALUES;
    public static final ShareRewardAnimationEnum SHOW_GUIDE;
    public static final ShareRewardAnimationEnum STOP_GUIDE;

    static {
       ShareRewardAnimationEnum shareRewardA = new ShareRewardAnimationEnum("SHOW_GUIDE", 0);
       ShareRewardAnimationEnum.SHOW_GUIDE = shareRewardA;
       ShareRewardAnimationEnum shareRewardA1 = new ShareRewardAnimationEnum("STOP_GUIDE", 1);
       ShareRewardAnimationEnum.STOP_GUIDE = shareRewardA1;
       ShareRewardAnimationEnum[] shareRewardA2 = new ShareRewardAnimationEnum[]{shareRewardA,shareRewardA1};
       ShareRewardAnimationEnum.$VALUES = shareRewardA2;
    }
    public void ShareRewardAnimationEnum(String p0,int p1){
       super(p0, p1);
    }
    public static ShareRewardAnimationEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ShareRewardAnimationEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ShareRewardAnimationEnum.class, p0);
    }
    public static ShareRewardAnimationEnum[] values(){
       Object obj = PatchProxy.apply(null, null, ShareRewardAnimationEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ShareRewardAnimationEnum.$VALUES.clone();
    }
}
