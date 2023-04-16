package com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPendingInstallInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class GameCenterPendingInstallInfo implements Serializable	// class@0012ac
{
    public long mDownloadCompleteTimestamp;
    public String mGameIconUrl;
    public String mGameId;
    public String mGameName;
    public String mPackageName;
    public static final long serialVersionUID = 0x445626c880ba6f3d;

    public void GameCenterPendingInstallInfo(String p0,String p1,long p2,String p3,String p4){
       super();
       this.mPackageName = p0;
       this.mGameId = p1;
       this.mDownloadCompleteTimestamp = p2;
       this.mGameIconUrl = p3;
       this.mGameName = p4;
    }
}
