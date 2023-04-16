package com.kwai.component.misc.gamedownload.GameDownloadInfo;
import java.io.Serializable;
import java.lang.Object;

public class GameDownloadInfo implements Serializable	// class@0009c7
{
    public String mFilename;
    public String mGameIconUrl;
    public String mGameName;
    public String mPackageName;
    public long mPackageSize;
    public String mSignature;
    public int mStatus;
    public String mTargetFilePath;
    public String mTaskId;
    public String mUrl;
    public static final long serialVersionUID = 0xa1052772465934a0;

    public void GameDownloadInfo(){
       super();
    }
}
