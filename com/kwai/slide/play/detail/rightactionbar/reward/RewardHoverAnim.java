package com.kwai.slide.play.detail.rightactionbar.reward.RewardHoverAnim;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RewardHoverAnim extends Enum	// class@001872
{
    public static final RewardHoverAnim[] $VALUES;
    public static final RewardHoverAnim HIDE;
    public static final RewardHoverAnim SHOW;

    static {
       RewardHoverAnim rewardHoverA = new RewardHoverAnim("SHOW", 0);
       RewardHoverAnim.SHOW = rewardHoverA;
       RewardHoverAnim rewardHoverA1 = new RewardHoverAnim("HIDE", 1);
       RewardHoverAnim.HIDE = rewardHoverA1;
       RewardHoverAnim[] rewardHoverA2 = new RewardHoverAnim[]{rewardHoverA,rewardHoverA1};
       RewardHoverAnim.$VALUES = rewardHoverA2;
    }
    public void RewardHoverAnim(String p0,int p1){
       super(p0, p1);
    }
    public static RewardHoverAnim valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RewardHoverAnim.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RewardHoverAnim.class, p0);
    }
    public static RewardHoverAnim[] values(){
       Object obj = PatchProxy.apply(null, null, RewardHoverAnim.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RewardHoverAnim.$VALUES.clone();
    }
}
