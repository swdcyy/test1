package com.yxcorp.gifshow.model.config.DaysGiftBagConfig$Reward$RewardType;
import java.lang.Enum;
import com.yxcorp.gifshow.model.config.DaysGiftBagConfig$Reward$RewardType$Cash;
import java.lang.String;
import com.yxcorp.gifshow.model.config.DaysGiftBagConfig$Reward$RewardType$Coin;
import com.yxcorp.gifshow.model.config.DaysGiftBagConfig$Reward$RewardType$Total;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class DaysGiftBagConfig$Reward$RewardType extends Enum	// class@001ebb
{
    public static final DaysGiftBagConfig$Reward$RewardType[] $VALUES;
    public static final DaysGiftBagConfig$Reward$RewardType Cash;
    public static final DaysGiftBagConfig$Reward$RewardType Coin;
    public static final DaysGiftBagConfig$Reward$RewardType Total;

    static {
       DaysGiftBagConfig$Reward$RewardType$Cash reward$Rewar1;
       DaysGiftBagConfig$Reward$RewardType$Coin reward$Rewar2;
       DaysGiftBagConfig$Reward$RewardType$Total reward$Rewar3;
       DaysGiftBagConfig$Reward$RewardType[] reward$Rewar = new DaysGiftBagConfig$Reward$RewardType[]{reward$Rewar1,reward$Rewar2,reward$Rewar3};
       reward$Rewar1 = new DaysGiftBagConfig$Reward$RewardType$Cash("Cash", 0);
       DaysGiftBagConfig$Reward$RewardType.Cash = reward$Rewar1;
       reward$Rewar2 = new DaysGiftBagConfig$Reward$RewardType$Coin("Coin", 1);
       DaysGiftBagConfig$Reward$RewardType.Coin = reward$Rewar2;
       reward$Rewar3 = new DaysGiftBagConfig$Reward$RewardType$Total("Total", 2);
       DaysGiftBagConfig$Reward$RewardType.Total = reward$Rewar3;
       DaysGiftBagConfig$Reward$RewardType.$VALUES = reward$Rewar;
    }
    public void DaysGiftBagConfig$Reward$RewardType(String p0,int p1){
       super(p0, p1);
    }
    public void DaysGiftBagConfig$Reward$RewardType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static DaysGiftBagConfig$Reward$RewardType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DaysGiftBagConfig$Reward$RewardType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DaysGiftBagConfig$Reward$RewardType.class, p0);
    }
    public static DaysGiftBagConfig$Reward$RewardType[] values(){
       Object obj = PatchProxy.apply(null, null, DaysGiftBagConfig$Reward$RewardType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DaysGiftBagConfig$Reward$RewardType.$VALUES.clone();
    }
    public abstract int getValue();
}
