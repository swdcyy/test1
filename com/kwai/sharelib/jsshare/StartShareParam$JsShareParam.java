package com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import java.io.Serializable;
import java.lang.Object;

public class StartShareParam$JsShareParam implements Serializable	// class@0016c7
{
    public String mActionUrl;
    public String mActionUrlCatch;
    public JsonObject mAnyExtPainterParams;
    public JsonObject mAnyExtTokenPainterParams;
    public StartShareParam$BackupShareConfigs mBackupShareConfigs;
    public ArrayList mChannelOptionList;
    public JsonObject mCommonConfig;
    public boolean mDefaultPoster;
    public StartShareParam$ForceCommonConfig mForceCommonConfig;
    public String mLogParams;
    public StartShareParam$PanelConfig mPanelConfig;
    public String mPanelStyle;
    public StartShareParam$PosterConfig mPosterConfig;
    public StartShareParam$ScreenShotConfigs mScreenShotConfigs;
    public String mShareContent;
    public StartShareParam$shareInitConfig mShareInitConfig;
    public String mShareObjectId;
    public String mShareResourceType;
    public boolean mShowSharePanel;
    public String mSubBiz;
    public JsonObject mTokenStoreParams;
    public static final long serialVersionUID = 0xe762bc5d48819b98;

    public void StartShareParam$JsShareParam(){
       super();
       this.mDefaultPoster = false;
    }
}
