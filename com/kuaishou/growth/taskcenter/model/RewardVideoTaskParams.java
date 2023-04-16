package com.kuaishou.growth.taskcenter.model.RewardVideoTaskParams;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.RewardVideoTaskParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class RewardVideoTaskParams implements Serializable	// class@000744
{
    public long mAdIncentiveVideoPageId;
    public long mAdIncentiveVideoSubPageId;
    public String mAdIncentiveVideoToastDesc;
    public String mAdIncentiveVideoToastImageUrl;
    public int mAdIncentiveVideoType;
    public String mBizId;
    public String mEventId;
    public long mExpireTime;
    public int mTargetCount;
    public String mTaskToken;
    public static final RewardVideoTaskParams$a Companion;
    public static final long serialVersionUID;

    static {
       RewardVideoTaskParams.Companion = new RewardVideoTaskParams$a(null);
       RewardVideoTaskParams.serialVersionUID = 0xfffff859bb3e15b5;
    }
    public void RewardVideoTaskParams(){
       super();
    }
    public static final long getSerialVersionUID(){
       return RewardVideoTaskParams.serialVersionUID;
    }
    public final long getMAdIncentiveVideoPageId(){
       return this.mAdIncentiveVideoPageId;
    }
    public final long getMAdIncentiveVideoSubPageId(){
       return this.mAdIncentiveVideoSubPageId;
    }
    public final String getMAdIncentiveVideoToastDesc(){
       return this.mAdIncentiveVideoToastDesc;
    }
    public final String getMAdIncentiveVideoToastImageUrl(){
       return this.mAdIncentiveVideoToastImageUrl;
    }
    public final int getMAdIncentiveVideoType(){
       return this.mAdIncentiveVideoType;
    }
    public final String getMBizId(){
       return this.mBizId;
    }
    public final String getMEventId(){
       return this.mEventId;
    }
    public final long getMExpireTime(){
       return this.mExpireTime;
    }
    public final int getMTargetCount(){
       return this.mTargetCount;
    }
    public final String getMTaskToken(){
       return this.mTaskToken;
    }
    public final void setMAdIncentiveVideoPageId(long p0){
       this.mAdIncentiveVideoPageId = p0;
    }
    public final void setMAdIncentiveVideoSubPageId(long p0){
       this.mAdIncentiveVideoSubPageId = p0;
    }
    public final void setMAdIncentiveVideoToastDesc(String p0){
       this.mAdIncentiveVideoToastDesc = p0;
    }
    public final void setMAdIncentiveVideoToastImageUrl(String p0){
       this.mAdIncentiveVideoToastImageUrl = p0;
    }
    public final void setMAdIncentiveVideoType(int p0){
       this.mAdIncentiveVideoType = p0;
    }
    public final void setMBizId(String p0){
       this.mBizId = p0;
    }
    public final void setMEventId(String p0){
       this.mEventId = p0;
    }
    public final void setMExpireTime(long p0){
       this.mExpireTime = p0;
    }
    public final void setMTargetCount(int p0){
       this.mTargetCount = p0;
    }
    public final void setMTaskToken(String p0){
       this.mTaskToken = p0;
    }
}
