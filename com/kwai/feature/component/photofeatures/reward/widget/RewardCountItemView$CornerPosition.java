package com.kwai.feature.component.photofeatures.reward.widget.RewardCountItemView$CornerPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RewardCountItemView$CornerPosition extends Enum	// class@00126a
{
    public static final RewardCountItemView$CornerPosition[] $VALUES;
    public static final RewardCountItemView$CornerPosition ALL;
    public static final RewardCountItemView$CornerPosition BOTTOM;
    public static final RewardCountItemView$CornerPosition NONE;
    public static final RewardCountItemView$CornerPosition TOP;

    static {
       RewardCountItemView$CornerPosition uCornerPosit1;
       RewardCountItemView$CornerPosition[] uCornerPosit = new RewardCountItemView$CornerPosition[]{uCornerPosit1,uCornerPosit1,uCornerPosit1,uCornerPosit1};
       uCornerPosit1 = new RewardCountItemView$CornerPosition("NONE", 0);
       RewardCountItemView$CornerPosition.NONE = uCornerPosit1;
       uCornerPosit1 = new RewardCountItemView$CornerPosition("TOP", 1);
       RewardCountItemView$CornerPosition.TOP = uCornerPosit1;
       uCornerPosit1 = new RewardCountItemView$CornerPosition("BOTTOM", 2);
       RewardCountItemView$CornerPosition.BOTTOM = uCornerPosit1;
       uCornerPosit1 = new RewardCountItemView$CornerPosition("ALL", 3);
       RewardCountItemView$CornerPosition.ALL = uCornerPosit1;
       RewardCountItemView$CornerPosition.$VALUES = uCornerPosit;
    }
    public void RewardCountItemView$CornerPosition(String p0,int p1){
       super(p0, p1);
    }
    public static RewardCountItemView$CornerPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RewardCountItemView$CornerPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RewardCountItemView$CornerPosition.class, p0);
    }
    public static RewardCountItemView$CornerPosition[] values(){
       Object obj = PatchProxy.apply(null, null, RewardCountItemView$CornerPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RewardCountItemView$CornerPosition.$VALUES.clone();
    }
}
