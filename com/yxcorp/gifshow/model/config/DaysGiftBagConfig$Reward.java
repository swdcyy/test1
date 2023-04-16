package com.yxcorp.gifshow.model.config.DaysGiftBagConfig$Reward;
import java.lang.Object;
import com.yxcorp.gifshow.model.config.DaysGiftBagConfig$Reward$RewardType;

public final class DaysGiftBagConfig$Reward	// class@001ebc
{
    public int amount;
    public String bottomText;
    public int rewardType;
    public int signInDay;
    public int status;
    public String topText;

    public void DaysGiftBagConfig$Reward(){
       super();
       this.topText = "";
       this.bottomText = "";
       this.rewardType = DaysGiftBagConfig$Reward$RewardType.Cash.getValue();
    }
}
