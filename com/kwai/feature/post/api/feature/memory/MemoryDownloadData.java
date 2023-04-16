package com.kwai.feature.post.api.feature.memory.MemoryDownloadData;
import java.io.Serializable;
import java.lang.Object;

public class MemoryDownloadData implements Serializable	// class@0013ad
{
    public String mActivityId;
    public String mCoverFilePath;
    public double mCoverTime;
    public String mDefaultStyleDirPath;
    public boolean mHaveServerAlbum;
    public CDNUrl[] mIconUrls;
    public MemoryJsonData mMemoryJsonData;
    public Object mMemoryStartEndResult;
    public Music mMusic;
    public String mPlaceHolderImageFilePath;
    public String mResourceRootFilePath;
    public String mSeasonAlbumMark;
    public int mSegmentCount;
    public boolean mSendPendant;
    public static final long serialVersionUID = 0xc5bc83bfda09dd6d;

    public void MemoryDownloadData(){
       super();
       this.mSeasonAlbumMark = "";
       this.mActivityId = "";
       this.mPlaceHolderImageFilePath = "";
       this.mResourceRootFilePath = "";
       this.mDefaultStyleDirPath = "";
       this.mHaveServerAlbum = false;
       this.mSegmentCount = 0;
    }
    public void reset(){
       this.mSeasonAlbumMark = "";
       this.mActivityId = "";
       this.mPlaceHolderImageFilePath = "";
       this.mResourceRootFilePath = "";
       this.mMemoryJsonData = null;
       this.mIconUrls = null;
       this.mSendPendant = false;
    }
}
