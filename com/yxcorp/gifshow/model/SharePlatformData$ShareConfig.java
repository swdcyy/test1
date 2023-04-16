package com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class SharePlatformData$ShareConfig implements Serializable	// class@001e8d
{
    public boolean isCoverUrlsFetched;
    public String mAppId;
    public int mAppIdKeyIndex;
    public String mBackSubTitle;
    public CDNUrl[] mBigPicUrls;
    public int mCoverHeight;
    public List mCoverStringUrls;
    public String mCoverUrl;
    public CDNUrl[] mCoverUrls;
    public int mCoverWidth;
    public int mH5MaxTitleLength;
    public String mImIconUrl;
    public String mImageData;
    public CDNUrl[] mProcessedCoverUrls;
    public String mQRCodeKey;
    public String mResourceUrl;
    public String mShareAppId;
    public String mShareMessage;
    public String mSharePath;
    public String mShareReportUrlParams;
    public String mShareUrl;
    public String mSource;
    public String mSourceName;
    public String mSubTitle;
    public String mTitle;
    public static final long serialVersionUID = 0xda982871bac520f6;

    public void SharePlatformData$ShareConfig(){
       super();
       this.isCoverUrlsFetched = false;
       this.mCoverWidth = 420;
       this.mCoverHeight = 337;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SharePlatformData$ShareConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareConfig{mShareUrl=\'"+this.mShareUrl+'''+", mShareMessage=\'"+this.mShareMessage+'''+", mTitle=\'"+this.mTitle+'''+", mSubTitle=\'"+this.mSubTitle+'''+", mSharePath=\'"+this.mSharePath+'''+", mAppId=\'"+this.mAppId+'''+", mAppIdKeyIndex="+this.mAppIdKeyIndex+'}';
    }
}
