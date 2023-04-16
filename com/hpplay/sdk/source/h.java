package com.hpplay.sdk.source.h;
import android.os.IInterface;
import java.lang.String;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;
import com.hpplay.sdk.source.g;
import com.hpplay.sdk.source.c;
import com.hpplay.sdk.source.d;
import com.hpplay.sdk.source.a;
import com.hpplay.sdk.source.f;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import com.hpplay.sdk.source.e;

public interface abstract h implements IInterface	// class@000675
{

    void addPinCodeToLelinkServiceInfo(String p0);
    void addQRCodeToLelinkServiceInfo(String p0);
    void addVolume();
    void browse(boolean p0,boolean p1);
    boolean canPlayLocalMedia(LelinkServiceInfo p0);
    boolean canPlayScreen(LelinkServiceInfo p0);
    void connect(LelinkServiceInfo p0);
    boolean disConnect(LelinkServiceInfo p0);
    List getConnectInfos();
    int getOption(int p0);
    void initSdkWithUserId(String p0,String p1,String p2,String p3,String p4);
    int loadLePatch(String p0,String p1,boolean p2);
    void pause();
    void resume();
    void seekTo(int p0);
    void setAuthListener(g p0);
    void setConnectStatusListener(c p0);
    void setDebugMode(boolean p0);
    void setLelinkPlayListenerListener(d p0);
    void setLelinkServiceInfoListener(a p0);
    void setOption(int p0,String p1);
    void setParceResultListener(f p0);
    void setSystemApp(boolean p0);
    void setVolume(int p0);
    void startMirrorForPlayerInfo(LelinkPlayerInfo p0);
    void startOnlineCheck(e p0,List p1);
    void startPlayMedia(String p0,int p1,boolean p2);
    void startPlayMediaForPlayerInfo(LelinkPlayerInfo p0);
    void startPlayMediaImmed(LelinkServiceInfo p0,String p1,int p2,boolean p3);
    void stopBrowse();
    void stopPlay();
    void subVolume();
}
