package com.hpplay.sdk.source.api.ILelinkPlayer;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;
import java.lang.Object;
import com.hpplay.sdk.source.bean.DanmakuPropertyBean;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.hpplay.sdk.source.api.IRelevantInfoListener;

public interface abstract ILelinkPlayer	// class@000637
{

    void addVolume();
    boolean canPlayLocalAudio(LelinkServiceInfo p0);
    boolean canPlayLocalPhoto(LelinkServiceInfo p0);
    boolean canPlayLocalVideo(LelinkServiceInfo p0);
    boolean canPlayOnlieAudio(LelinkServiceInfo p0);
    boolean canPlayOnliePhoto(LelinkServiceInfo p0);
    boolean canPlayOnlieVideo(LelinkServiceInfo p0);
    boolean canPlayScreen(LelinkServiceInfo p0);
    void connect(LelinkServiceInfo p0);
    boolean disConnect(LelinkServiceInfo p0);
    List getConnectLelinkServiceInfos();
    boolean isSupportDanmuku();
    void pause();
    void release();
    void resume();
    void seekTo(int p0);
    void sendDanmaku(Object p0);
    void sendDanmakuProperty(DanmakuPropertyBean p0);
    void sendRelevantInfo(int p0,Object[] p1);
    void setConnectListener(IConnectListener p0);
    void setDataSource(LelinkPlayerInfo p0);
    void setOption(int p0,Object[] p1);
    void setPlayerListener(ILelinkPlayerListener p0);
    void setRelevantInfoListener(IRelevantInfoListener p0);
    void setVolume(int p0);
    void start();
    void stop();
    void subVolume();
}
