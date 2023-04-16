package com.yxcorp.gifshow.model.config.LoginDialogPopupConfig;
import java.io.Serializable;
import java.lang.Object;

public class LoginDialogPopupConfig implements Serializable	// class@001ed7
{
    public long mEnableFeedStayLandingGuide;
    public boolean mEnableLandingGuidePopupWindow;
    public int mEnableVideoPlayLandingGuide;
    public static final long serialVersionUID = 0xeec5489d24ee881f;

    public void LoginDialogPopupConfig(){
       super();
       this.mEnableLandingGuidePopupWindow = false;
       this.mEnableVideoPlayLandingGuide = 1;
       this.mEnableFeedStayLandingGuide = 10;
    }
}
