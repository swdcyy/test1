package com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.PlayerLibraryLoader;

public class PlayerLibraryLoader$FindBestParam	// class@000b05
{
    public String mAemonConfig;
    public boolean mIsHls;
    public boolean mIsKsMediaplayer;
    public boolean mIsLive;
    public boolean mIsPaidLive;
    public boolean mIsPrivateLive;
    public boolean mIsWebRTC;
    public int mOutputNoAemonReason;
    public d mProvider;

    public void PlayerLibraryLoader$FindBestParam(){
       super();
    }
    public int getVersionCode(){
       Object obj = PatchProxy.apply(null, this, PlayerLibraryLoader$FindBestParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return PlayerLibraryLoader.getInstance().mAppVersionCode;
    }
}
