package com.yxcorp.gifshow.featured.feedprefetcher.logger.PrefetchPhotoInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PrefetchPhotoInfo implements Serializable	// class@000fc3
{
    public ConsumePhotoInfo mConsumePhotoInfo;
    public DownloadPhotoInfo mDownloadPhotoInfo;
    public long mDownloadToConsumeInterval;
    public String mLlsid;
    public int mMediaType;
    public float mPhotoHetu;
    public String mPhotoId;
    public int mPhotoType;
    public long mTotalCacheSize;
    public long mUsedCachedSize;
    public static final long serialVersionUID = 0x4a9b60a2ef794d87;

    public void PrefetchPhotoInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PrefetchPhotoInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PrefetchPhotoInfo{mPhotoId=\'"+this.mPhotoId+", mLlsid=\'"+this.mLlsid+", mPhotoType="+this.mPhotoType+", mMediaType=\'"+this.mMediaType+", mDownloadPhotoInfo="+this.mDownloadPhotoInfo+", mConsumePhotoInfo="+this.mConsumePhotoInfo+'}';
    }
}
