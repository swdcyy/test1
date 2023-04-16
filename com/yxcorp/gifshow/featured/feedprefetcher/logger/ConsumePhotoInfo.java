package com.yxcorp.gifshow.featured.feedprefetcher.logger.ConsumePhotoInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ConsumePhotoInfo implements Serializable	// class@000fbf
{
    public String mAppVer;
    public int mCachePoolSize;
    public int mCdnNetSpeed;
    public int mHlsSegCnt;
    public boolean mIsFullyCache;
    public int mNetScore;
    public String mNetSessionId;
    public String mPoorNetSessionId;
    public String mReason;
    public int mReplacedIndex;
    public long mReplacedPhotoCacheSize;
    public float mReplacedPhotoHetu;
    public String mReplacedPhotoId;
    public long mSize;
    public String mStatus;
    public long mSystemClockTime;
    public long mTime;
    public static final long serialVersionUID = 0xef633bdf2645acf1;

    public void ConsumePhotoInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ConsumePhotoInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ConsumePhotoInfo{mStatus=\'"+this.mStatus+", mReason=\'"+this.mReason+", mTime="+this.mTime+", mSize="+this.mSize+", mHlsSegCnt="+this.mHlsSegCnt+", mIsFullyCache="+this.mIsFullyCache+", mCachePoolSize="+this.mCachePoolSize+", mReplacedPhotoId=\'"+this.mReplacedPhotoId+", mReplacedIndex="+this.mReplacedIndex+", mReplacedPhotoCacheSize="+this.mReplacedPhotoCacheSize+", mNetScore="+this.mNetScore+", mCdnNetSpeed="+this.mCdnNetSpeed+", mNetSessionId=\'"+this.mNetSessionId+", mPoorNetSessionId=\'"+this.mPoorNetSessionId+", mAppVer= "+this.mAppVer+'}';
    }
}
