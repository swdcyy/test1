package com.kwai.feature.post.api.mediascene.MediaSceneServerParams;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class MediaSceneServerParams implements Serializable	// class@001405
{
    public HashMap mArgsMap;
    public HashMap mAssetContents;
    public List mAudioAssets;
    public String mBottomColor;
    public boolean mDirectPublish;
    public boolean mDisableBackPublish;
    public boolean mDisableMoment;
    public boolean mDisableNext;
    public String mMomentButtonText;
    public String mMusicId;
    public long mMusicType;
    public long mPoiId;
    public String mPublishContent;
    public long mReplaceableTimestamp;
    public boolean mRequireAlbum;
    public boolean mRequirePreview;
    public boolean mReturnOriginPage;
    public int mSceneType;
    public String mSegmentIconTitle;
    public String mTagText;
    public long mTemplateId;
    public String mTopColor;
    public int mVideoSceneType;
    public static final long serialVersionUID = 0xc93e1c6401d2c9cb;

    public void MediaSceneServerParams(){
       super();
       this.mTemplateId = 0;
       this.mDirectPublish = false;
       this.mMusicId = "";
       this.mMusicType = 0;
       this.mTagText = "";
       this.mPublishContent = "";
       this.mReplaceableTimestamp = 0;
       this.mAudioAssets = new ArrayList();
       this.mAssetContents = new HashMap();
       this.mReturnOriginPage = false;
       this.mArgsMap = new HashMap();
    }
}
