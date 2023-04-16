package com.hpplay.sdk.source.process.LelinkSourceSdkImp;
import com.hpplay.sdk.source.api.ILelinkSourceSdk;
import java.lang.Object;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp$2;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp$3;
import com.hpplay.sdk.source.h;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.process.b;
import android.content.Context;
import com.hpplay.sdk.source.api.IBindSdkListener;
import android.os.Handler;
import android.os.Looper;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp$1;
import java.lang.Runnable;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import java.util.List;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.hpplay.sdk.source.process.LelinkSourceSdkImp$4;
import java.lang.StringBuilder;
import com.hpplay.sdk.source.process.c;
import com.hpplay.sdk.source.browse.api.AuthListener;
import java.lang.Boolean;
import com.hpplay.sdk.source.browse.api.IAPICallbackListener;
import com.hpplay.sdk.source.e;
import java.lang.System;
import java.lang.Thread;
import com.hpplay.sdk.source.process.a;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import android.net.Uri;

public class LelinkSourceSdkImp implements ILelinkSourceSdk	// class@00068e
{
    public AuthListener authListener;
    public int bindCount;
    public c$a bindStatusListener;
    public boolean isBind;
    public String mAppSecret;
    public String mAppVer;
    public String mAppid;
    public AuthListener mAuthListener;
    public IBindSdkListener mBindSdkListener;
    public a mBrowserThread;
    public IConnectListener mConnectListener;
    public Context mContext;
    public IBrowseListener mIBrowseListener;
    public String mOaid;
    public ILelinkPlayerListener mPlayerListener;
    public h mSdkInterface;
    public b mSdkManager;
    public c mServiceConnection;
    public String mUserId;
    public long startBrowserTime;
    public static Handler mBindHander;
    public static LelinkSourceSdkImp mLelinkSDKController;

    public void LelinkSourceSdkImp(){
       super();
       this.bindCount = 0;
       this.startBrowserTime = 0;
       this.bindStatusListener = new LelinkSourceSdkImp$2(this);
       this.authListener = new LelinkSourceSdkImp$3(this);
    }
    public static synchronized LelinkSourceSdkImp getInstance(){
       _monitor_enter(LelinkSourceSdkImp.class);
       if (LelinkSourceSdkImp.mLelinkSDKController == null) {
          LelinkSourceSdkImp.mLelinkSDKController = new LelinkSourceSdkImp();
       }
       _monitor_exit(LelinkSourceSdkImp.class);
       return LelinkSourceSdkImp.mLelinkSDKController;
    }
    public void addVolume(){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.addVolume();
          }catch(java.lang.Exception e0){
             a.b("LelinkSourceSDK", e0);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.d();
          }
       }
    }
    public void bindSdk(Context p0,String p1,String p2,IBindSdkListener p3){
       this.bindSdk(p0, p1, p2, null, null, null, p3);
    }
    public void bindSdk(Context p0,String p1,String p2,String p3,IBindSdkListener p4){
       this.bindSdk(p0, p1, p2, null, null, p3, p4);
    }
    public void bindSdk(Context p0,String p1,String p2,String p3,String p4,String p5,IBindSdkListener p6){
       int i = this;
       i.mContext = p0;
       i.mAppid = p1;
       i.mAppSecret = p2;
       i.mUserId = p3;
       i.mAppVer = p4;
       i.mOaid = p5;
       i.mBindSdkListener = p6;
       if (LelinkSourceSdkImp.mBindHander == null) {
          LelinkSourceSdkImp.mBindHander = new Handler(p0.getMainLooper());
       }
       i.isBind = false;
       LelinkSourceSdkImp.mBindHander.removeCallbacksAndMessages(null);
       LelinkSourceSdkImp$1 u1 = new LelinkSourceSdkImp$1(this, p0, p1, p2, p3, p5, p4, p6);
       LelinkSourceSdkImp.mBindHander.postDelayed(v11, 500);
       return;
    }
    public void connect(LelinkServiceInfo p0){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.connect(p0);
          }catch(java.lang.Exception e2){
             a.b("LelinkSourceSDK", e2);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.b(p0);
          }
       }
    }
    public final void currentPorcessBind(){
       b uob = b.b();
       this.mSdkManager = uob;
       Object[] objArray = new Object[]{this.authListener};
       uob.a(0x10004, objArray);
       this.mSdkManager.a(this.mContext, this.mAppid, this.mAppSecret, this.mUserId, this.mAppVer, this.mOaid);
       this.mSdkManager.a(this.mIBrowseListener);
       this.mSdkManager.a(this.mConnectListener);
       this.mSdkManager.a(this.mPlayerListener);
    }
    public boolean disConnect(LelinkServiceInfo p0){
       if (this.isBind != null) {
          return this.mSdkInterface.disConnect(p0);
       }
       LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
       if (tmSdkManager != null) {
          return tmSdkManager.c(p0);
       }
    }
    public List getConnectInfos(){
       if (this.isBind != null) {
          return this.mSdkInterface.getConnectInfos();
       }
       LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
       if (tmSdkManager != null) {
          return tmSdkManager.f();
       }
    }
    public int getOption(int p0){
       if (this.isBind != null) {
          return this.mSdkInterface.getOption(p0);
       }
       LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
       if (tmSdkManager != null) {
          return tmSdkManager.c(p0);
       }
    }
    public boolean isPatchLoaded(Context p0){
       return PreferenceManager.getDefaultSharedPreferences(p0).getBoolean("ptach_load", false);
    }
    public int loadLePatch(String p0,String p1,boolean p2){
       try{
          if (this.isBind != null) {
             int i = this.mSdkInterface.loadLePatch(p0, p1, p2);
             if (i == 1 || i == 2) {
                this.mSdkInterface.initSdkWithUserId(this.mAppid, this.mAppSecret, this.mUserId, this.mAppVer, this.mOaid);
             }
             return i;
          }
       }catch(java.lang.Exception e7){
          a.b("LelinkSourceSDK", e7);
       }
       return -2;
    }
    public void pause(){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.pause();
          }catch(java.lang.Exception e0){
             a.b("LelinkSourceSDK", e0);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.h();
          }
       }
    }
    public void resume(){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.resume();
          }catch(java.lang.Exception e0){
             a.b("LelinkSourceSDK", e0);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.g();
          }
       }
    }
    public void retryBind(){
       Handler mBindHander = LelinkSourceSdkImp.mBindHander;
       if (mBindHander != null && this.bindCount < 3) {
          mBindHander.removeCallbacksAndMessages(null);
          LelinkSourceSdkImp.mBindHander.postDelayed(new LelinkSourceSdkImp$4(this), 500);
       }
       return;
    }
    public void seekTo(int p0){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.seekTo(p0);
          }catch(java.lang.Exception e2){
             a.b("LelinkSourceSDK", e2);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.b(p0);
          }
       }
    }
    public void setBrowseResultListener(IBrowseListener p0){
       this.mIBrowseListener = p0;
       String str = "LelinkSourceSdkImp setBrowseResultListener "+this.isBind;
       try{
          a.f("LelinkSourceSDK", str);
          if (this.isBind != null) {
             this.mServiceConnection.a(p0);
          }else {
             LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
             if (tmSdkManager != null) {
                tmSdkManager.a(p0);
             }
          }
       }catch(java.lang.Exception e3){
          a.b("LelinkSourceSDK", e3);
       }
       return;
    }
    public void setConnectListener(IConnectListener p0){
       this.mConnectListener = p0;
       try{
          a.f("LelinkSourceSDK", "LelinkSourceSdkImp setConnectListener "+this.isBind);
          if (this.isBind != null) {
             this.mServiceConnection.a(p0);
          }else {
             LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
             if (tmSdkManager != null) {
                tmSdkManager.a(p0);
             }
          }
       }catch(java.lang.Exception e4){
          a.b("LelinkSourceSDK", e4);
       }
       return;
    }
    public void setDebugMode(boolean p0){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.setDebugMode(p0);
          }catch(java.lang.Exception e2){
             a.b("LelinkSourceSDK", e2);
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.a(p0);
          }
       }
    }
    public void setOption(int p0,Object[] p1){
       object oobject;
       int i = 0;
       if (0x10004 == p0 && p1[i] instanceof AuthListener) {
          oobject = p1[i];
          this.mAuthListener = oobject;
          LelinkSourceSdkImp tmServiceCon = this.mServiceConnection;
          if (tmServiceCon != null) {
             tmServiceCon.a(oobject);
          }
          return;
       }else if(this.isBind != null){
          try{
             if (p0 != 0x10003) {
                try{
                   if (p0 == 0x100029 && p1[i] instanceof Boolean) {
                      this.mSdkInterface.setSystemApp(p1[i].booleanValue());
                   }
                }catch(java.lang.Exception e3){
                   a.b("LelinkSourceSDK", e3);
                }
             }else {
                oobject = p1[i];
                object oobject1 = p1[1];
                if (oobject != null && oobject1 != null) {
                   this.mServiceConnection.a(oobject);
                   this.mSdkInterface.startOnlineCheck(this.mServiceConnection.d, oobject1);
                }
             }
          }catch(java.lang.Exception e3){
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.a(p0, p1);
          }
       }
    }
    public void setPlayListener(ILelinkPlayerListener p0){
       this.mPlayerListener = p0;
       String str = "LelinkSourceSdkImp setPlayListener "+this.isBind;
       try{
          a.f("LelinkSourceSDK", str);
          if (this.isBind != null) {
             this.mServiceConnection.a(p0);
          }else {
             LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
             if (tmSdkManager != null) {
                tmSdkManager.a(p0);
             }
          }
       }catch(java.lang.Exception e3){
          a.b("LelinkSourceSDK", e3);
       }
       return;
    }
    public void setVolume(int p0){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.setVolume(p0);
          }catch(java.lang.Exception e2){
             a.b("LelinkSourceSDK", e2);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.a(p0);
          }
       }
    }
    public void startBrowse(boolean p0,boolean p1){
       a.f("LelinkSourceSDK", "LelinkSourceSdkImp startBrowse "+this.isBind);
       if (this.isBind != null) {
          try{
             this.mSdkInterface.browse(p0, p1);
          }catch(java.lang.Exception e3){
             a.b("LelinkSourceSDK", e3);
             this.retryBind();
          }
       }else if(this.mSdkManager != null){
          this.startBrowseThread(p0, p1);
       }
    }
    public void startBrowseThread(boolean p0,boolean p1){
       if ((System.currentTimeMillis() - this.startBrowserTime) - 200 < 0) {
          return;
       }
       LelinkSourceSdkImp tmBrowserThr = this.mBrowserThread;
       if (tmBrowserThr == null || !tmBrowserThr.isAlive()) {
          a uoa = new a(p0, p1);
          this.mBrowserThread = uoa;
          uoa.start();
       }
       a.f("threadTs", " "+this.mBrowserThread.isAlive());
       this.mBrowserThread.a();
       this.startBrowserTime = System.currentTimeMillis();
       return;
    }
    public void startPlayMedia(LelinkPlayerInfo p0){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.startPlayMediaForPlayerInfo(p0);
          }catch(java.lang.Exception e2){
             a.b("LelinkSourceSDK", e2);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.a(p0);
          }
       }
    }
    public void startPlayMedia(String p0,int p1,boolean p2){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.startPlayMedia(p0, p1, p2);
          }catch(java.lang.Exception e3){
             a.b("LelinkSourceSDK", e3);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.a(null, p0, p1, p2);
          }
       }
    }
    public void startPlayMediaImmed(LelinkServiceInfo p0,Uri p1,int p2){
       LelinkPlayerInfo lelinkPlayer = new LelinkPlayerInfo();
       lelinkPlayer.setLelinkServiceInfo(p0);
       lelinkPlayer.setLoaclUri(p1);
       lelinkPlayer.setType(p2);
       if (this.isBind != null) {
          try{
             this.mSdkInterface.startPlayMediaForPlayerInfo(lelinkPlayer);
          }catch(java.lang.Exception e2){
             a.b("LelinkSourceSDK", e2);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.a(lelinkPlayer);
          }
       }
    }
    public void startPlayMediaImmed(LelinkServiceInfo p0,String p1,int p2,boolean p3){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.startPlayMediaImmed(p0, p1, p2, p3);
          }catch(java.lang.Exception e2){
             a.b("LelinkSourceSDK", e2);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.a(p0, p1, p2, p3);
          }
       }
    }
    public void stopBrowse(){
       a.f("LelinkSourceSDK", "LelinkSourceSdkImp stopBrowse "+this.isBind);
       if (this.isBind != null) {
          try{
             this.mSdkInterface.stopBrowse();
          }catch(java.lang.Exception e0){
             a.b("LelinkSourceSDK", e0);
             this.retryBind();
          }
       }else if(this.mSdkManager != null){
          this.stopBrowseThread();
       }
    }
    public void stopBrowseThread(){
       if (this.mBrowserThread != null && (System.currentTimeMillis() - this.startBrowserTime) - 200 > 0) {
          this.mBrowserThread.b();
       }
       return;
    }
    public void stopPlay(){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.stopPlay();
          }catch(java.lang.Exception e0){
             a.b("LelinkSourceSDK", e0);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.j();
          }
       }
    }
    public void subVolume(){
       if (this.isBind != null) {
          try{
             this.mSdkInterface.subVolume();
          }catch(java.lang.Exception e0){
             a.b("LelinkSourceSDK", e0);
             this.retryBind();
          }
       }else {
          LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
          if (tmSdkManager != null) {
             tmSdkManager.e();
          }
       }
    }
    public void unBindSdk(){
       try{
          if (this.isBind != null) {
             this.mServiceConnection.b();
          }else {
             LelinkSourceSdkImp tmSdkManager = this.mSdkManager;
             if (tmSdkManager != null) {
                tmSdkManager.k();
             }
          }
       }catch(java.lang.Exception e0){
          a.b("LelinkSourceSDK", e0);
       }
       return;
    }
}
