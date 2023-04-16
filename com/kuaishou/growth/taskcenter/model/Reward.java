package com.kuaishou.growth.taskcenter.model.Reward;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.Reward$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class Reward implements Serializable	// class@000742
{
    public int mCoinType;
    public double mRewardCount;
    public String mRewardLinkUrl;
    public String mRewardType;
    public static final Reward$a Companion;
    public static final long serialVersionUID;

    static {
       Reward.Companion = new Reward$a(null);
       Reward.serialVersionUID = 0x4f05196e3e729824;
    }
    public void Reward(){
       super();
    }
    public static final long getSerialVersionUID(){
       return Reward.serialVersionUID;
    }
    public final int getMCoinType(){
       return this.mCoinType;
    }
    public final double getMRewardCount(){
       return this.mRewardCount;
    }
    public final String getMRewardLinkUrl(){
       return this.mRewardLinkUrl;
    }
    public final String getMRewardType(){
       return this.mRewardType;
    }
    public final void setMCoinType(int p0){
       this.mCoinType = p0;
    }
    public final void setMRewardCount(double p0){
       this.mRewardCount = p0;
    }
    public final void setMRewardLinkUrl(String p0){
       this.mRewardLinkUrl = p0;
    }
    public final void setMRewardType(String p0){
       this.mRewardType = p0;
    }
}
