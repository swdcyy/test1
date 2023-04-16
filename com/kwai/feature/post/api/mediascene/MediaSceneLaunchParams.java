package com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class MediaSceneLaunchParams implements Serializable	// class@001404
{
    public boolean mAllowJumpToolbox;
    public HashMap mArgsMap;
    public String mBizParams;
    public String mBottomColor;
    public boolean mDirectPublish;
    public boolean mIsMock;
    public List mLoadingSubTitles;
    public List mLoadingTitles;
    public boolean mRequireAlbum;
    public boolean mRequirePreview;
    public boolean mReturnOriginPage;
    public int mSceneType;
    public boolean mSkipSessionEndWaiting;
    public long mTemplateId;
    public String mTopColor;
    public boolean mUseCommonInterface;
    public static final long serialVersionUID = 0x78288465db1a0805;

    public void MediaSceneLaunchParams(){
       super();
       this.mTemplateId = 0;
       this.mDirectPublish = false;
       this.mReturnOriginPage = false;
       this.mArgsMap = new HashMap();
       this.mUseCommonInterface = false;
       this.mAllowJumpToolbox = false;
       this.mLoadingTitles = new ArrayList();
       this.mLoadingSubTitles = new ArrayList();
       this.mIsMock = false;
    }
}
