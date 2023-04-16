package com.kwai.live.gzone.accompanyplay.model.LiveLinkBindConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveLinkBindConfig implements Serializable	// class@000c4a
{
    public List mBindUserInfo;
    public String mGameId;
    public String mLiveLinkActId;
    public String mLiveLinkGameName;
    public String mLivelinkPath;
    public String mOriginId;
    public List mSettingItems;
    public static final long serialVersionUID = 0x5e55fa0c2a059ea8;

    public void LiveLinkBindConfig(){
       super();
    }
    public void update(LiveLinkBindConfig p0){
       this.mGameId = p0.mGameId;
       this.mLiveLinkGameName = p0.mLiveLinkGameName;
       this.mLiveLinkActId = p0.mLiveLinkActId;
       this.mLivelinkPath = p0.mLivelinkPath;
       this.mOriginId = p0.mOriginId;
       this.mBindUserInfo = p0.mBindUserInfo;
       this.mSettingItems = p0.mSettingItems;
    }
}
