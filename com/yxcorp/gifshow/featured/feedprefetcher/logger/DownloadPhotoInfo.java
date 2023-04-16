package com.yxcorp.gifshow.featured.feedprefetcher.logger.DownloadPhotoInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class DownloadPhotoInfo implements Serializable	// class@000fc0
{
    public String mAppVer;
    public int mDownloadErrorCode;
    public long mFinishTime;
    public int mHlsSegCnt;
    public boolean mIsFullyCache;
    public String mReason;
    public long mSize;
    public long mStartTime;
    public String mStatus;
    public long mSystemClockStartTime;
    public static final long serialVersionUID = 0xf2f0a73a1f5c6391;

    public void DownloadPhotoInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DownloadPhotoInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DownloadPhotoInfo{mReason=\'"+this.mReason+", mStatus=\'"+this.mStatus+", mStartTime="+this.mStartTime+", mFinishTime="+this.mFinishTime+", mSize="+this.mSize+", mHlsSegCnt="+this.mHlsSegCnt+", mIsFullyCache="+this.mIsFullyCache+", mDownloadErrorCode= "+this.mDownloadErrorCode+", mAppVer= "+this.mAppVer+'}';
    }
}
