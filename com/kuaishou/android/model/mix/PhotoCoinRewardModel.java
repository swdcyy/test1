package com.kuaishou.android.model.mix.PhotoCoinRewardModel;
import java.io.Serializable;
import java.lang.Object;

public class PhotoCoinRewardModel implements Serializable	// class@000d32
{
    public boolean isLiving;
    public boolean mCanReward;
    public long mRewardAmount;
    public int mRewardOptionType;
    public boolean mRewardedCurrentPhoto;
    public static final long serialVersionUID = 0xa1336c362fabe2a2;

    public void PhotoCoinRewardModel(){
       super();
       this.isLiving = true;
    }
}
