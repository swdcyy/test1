package com.hpplay.sdk.source.api.ILelinkSourceSdk;
import android.content.Context;
import java.lang.String;
import com.hpplay.sdk.source.api.IBindSdkListener;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.IConnectListener;
import java.lang.Object;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import android.net.Uri;

public interface abstract ILelinkSourceSdk	// class@000639
{

    void addVolume();
    void bindSdk(Context p0,String p1,String p2,IBindSdkListener p3);
    void bindSdk(Context p0,String p1,String p2,String p3,IBindSdkListener p4);
    void bindSdk(Context p0,String p1,String p2,String p3,String p4,String p5,IBindSdkListener p6);
    void connect(LelinkServiceInfo p0);
    boolean disConnect(LelinkServiceInfo p0);
    List getConnectInfos();
    int getOption(int p0);
    boolean isPatchLoaded(Context p0);
    int loadLePatch(String p0,String p1,boolean p2);
    void pause();
    void resume();
    void seekTo(int p0);
    void setBrowseResultListener(IBrowseListener p0);
    void setConnectListener(IConnectListener p0);
    void setDebugMode(boolean p0);
    void setOption(int p0,Object[] p1);
    void setPlayListener(ILelinkPlayerListener p0);
    void setVolume(int p0);
    void startBrowse(boolean p0,boolean p1);
    void startPlayMedia(LelinkPlayerInfo p0);
    void startPlayMedia(String p0,int p1,boolean p2);
    void startPlayMediaImmed(LelinkServiceInfo p0,Uri p1,int p2);
    void startPlayMediaImmed(LelinkServiceInfo p0,String p1,int p2,boolean p3);
    void stopBrowse();
    void stopPlay();
    void subVolume();
    void unBindSdk();
}
