package com.hpplay.sdk.source.process.LelinkSdkService$1;
import com.hpplay.sdk.source.h$a;
import com.hpplay.sdk.source.process.LelinkSdkService;
import java.lang.String;
import com.hpplay.sdk.source.process.b;
import com.hpplay.sdk.source.browse.api.IParceResultListener;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.List;
import android.content.Context;
import android.app.Service;
import com.hpplay.sdk.source.g;
import java.lang.Object;
import com.hpplay.sdk.source.c;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.d;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.hpplay.sdk.source.a;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.f;
import java.lang.Boolean;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import com.hpplay.sdk.source.e;
import com.hpplay.sdk.source.process.a;
import java.lang.System;

public class LelinkSdkService$1 extends h$a	// class@000684
{
    public final LelinkSdkService G;

    public void LelinkSdkService$1(LelinkSdkService p0){
       this.G = p0;
       super();
    }
    public void addPinCodeToLelinkServiceInfo(String p0){
       b.b().b(p0, this.G.d);
    }
    public void addQRCodeToLelinkServiceInfo(String p0){
       b.b().a(p0, this.G.d);
    }
    public void addVolume(){
       b.b().d();
    }
    public void browse(boolean p0,boolean p1){
       this.G.a(p0, p1);
    }
    public boolean canPlayLocalMedia(LelinkServiceInfo p0){
       return b.b().e(p0);
    }
    public boolean canPlayScreen(LelinkServiceInfo p0){
       return b.b().d(p0);
    }
    public void connect(LelinkServiceInfo p0){
       b.b().b(p0);
    }
    public boolean disConnect(LelinkServiceInfo p0){
       return b.b().c(p0);
    }
    public List getConnectInfos(){
       return b.b().f();
    }
    public int getOption(int p0){
       return b.b().c(p0);
    }
    public void initSdkWithUserId(String p0,String p1,String p2,String p3,String p4){
       b.b().a(this.G.getApplicationContext(), p0, p1, p2, p4, p3);
    }
    public int loadLePatch(String p0,String p1,boolean p2){
       return b.b().a(this.G.getApplicationContext(), p0, p1, p2);
    }
    public void pause(){
       b.b().h();
    }
    public void resume(){
       b.b().g();
    }
    public void seekTo(int p0){
       b.b().b(p0);
    }
    public void setAuthListener(g p0){
       Object[] objArray = new Object[]{p0};
       b.b().a(0x10004, objArray);
    }
    public void setConnectStatusListener(c p0){
       LelinkSdkService.a(this.G, p0);
       b.b().a(this.G.e);
    }
    public void setDebugMode(boolean p0){
       b.b().a(p0);
    }
    public void setLelinkPlayListenerListener(d p0){
       LelinkSdkService.a(this.G, p0);
       b.b().a(this.G.g);
    }
    public void setLelinkServiceInfoListener(a p0){
       LelinkSdkService.a(this.G, p0);
       b.b().a(this.G.f);
    }
    public void setOption(int p0,String p1){
       Object[] objArray = new Object[]{p1};
       b.b().a(p0, objArray);
    }
    public void setParceResultListener(f p0){
       LelinkSdkService.a(this.G, p0);
    }
    public void setSystemApp(boolean p0){
       Object[] objArray = new Object[]{Boolean.valueOf(p0)};
       b.b().a(0x100029, objArray);
    }
    public void setVolume(int p0){
       b.b().a(p0);
    }
    public void startMirrorForPlayerInfo(LelinkPlayerInfo p0){
       b.b().a(this.G, p0);
    }
    public void startOnlineCheck(e p0,List p1){
       Object[] objArray = new Object[]{p0,p1};
       b.b().a(0x10003, objArray);
    }
    public void startPlayMedia(String p0,int p1,boolean p2){
       b.b().a(null, p0, p1, p2);
    }
    public void startPlayMediaForPlayerInfo(LelinkPlayerInfo p0){
       b.b().a(p0);
    }
    public void startPlayMediaImmed(LelinkServiceInfo p0,String p1,int p2,boolean p3){
       b.b().a(p0, p1, p2, p3);
    }
    public void stopBrowse(){
       if (LelinkSdkService.a(this.G) != null) {
          LelinkSdkService$1 tG = this.G;
          if ((System.currentTimeMillis() - tG.b) - 200 > 0) {
             LelinkSdkService.a(tG).b();
          }
       }
       return;
    }
    public void stopPlay(){
       b.b().j();
    }
    public void subVolume(){
       b.b().e();
    }
}
