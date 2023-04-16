package com.hpplay.sdk.source.api.LelinkSourceSDK;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.os.Process;
import java.lang.CharSequence;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.api.ILelinkSourceSdk;
import com.hpplay.sdk.source.api.IBindSdkListener;
import com.hpplay.sdk.source.b.a;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import android.net.Uri;

public class LelinkSourceSDK	// class@00063d
{
    public boolean isChildProcessBind;
    public boolean isDebug;
    public String mAppSecret;
    public String mAppVersion;
    public String mAppid;
    public IBindSdkListener mBindSdkListener;
    public IConnectListener mConnectListener;
    public Context mContext;
    public IBrowseListener mIBrowseListener;
    public ILelinkSourceSdk mILelinkSourceSdk;
    public String mOaid;
    public ILelinkPlayerListener mPlayerListener;
    public String mUserId;
    public static LelinkSourceSDK mLelinkSDKController;

    public void LelinkSourceSDK(){
       super();
       this.isDebug = false;
       this.isChildProcessBind = false;
    }
    public static LelinkSourceSDK getInstance(){
       _monitor_enter(LelinkSourceSDK.class);
       if (LelinkSourceSDK.mLelinkSDKController == null) {
          LelinkSourceSDK.mLelinkSDKController = new LelinkSourceSDK();
       }
       _monitor_exit(LelinkSourceSDK.class);
       return LelinkSourceSDK.mLelinkSDKController;
    }
    public static boolean isMyApp(Context p0){
       boolean b = true;
       try{
          List runningAppPr = p0.getSystemService("activity").getRunningAppProcesses();
          if (runningAppPr == null) {
             return b;
          }else {
             Iterator iterator = runningAppPr.iterator();
             while (iterator.hasNext()) {
                ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                if (runningAppPr1.pid == Process.myPid() && (runningAppPr1.processName).contains("lelinkps")) {
                   return false;
                }
             }
          }
       }catch(java.lang.Exception e4){
          a.b("LelinkSourceSDK", e4);
       }
       return b;
    }
    public void addVolume(){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.addVolume();
       }
       return;
    }
    public void bindOfChildProcess(){
       this.isChildProcessBind = true;
       this.bindSdk();
    }
    public void bindSdk(){
       this.bindSdk(this.mContext, this.mAppid, this.mAppSecret, this.mUserId, this.mAppVersion, this.mOaid, this.mBindSdkListener);
    }
    public void bindSdk(Context p0,String p1,String p2,String p3,String p4,String p5,IBindSdkListener p6){
       try{
          Context applicationC = p0.getApplicationContext();
          if (LelinkSourceSDK.isMyApp(applicationC) || this.isChildProcessBind != null) {
             ILelinkSourceSdk iLelinkSourc = a.a();
             this.mILelinkSourceSdk = iLelinkSourc;
             iLelinkSourc.bindSdk(applicationC, p1, p2, p3, p4, p5, p6);
             LelinkSourceSDK tmIBrowseLis = this.mIBrowseListener;
             if (tmIBrowseLis != null) {
                this.mILelinkSourceSdk.setBrowseResultListener(tmIBrowseLis);
             }
             tmIBrowseLis = this.mConnectListener;
             if (tmIBrowseLis != null) {
                this.mILelinkSourceSdk.setConnectListener(tmIBrowseLis);
             }
             tmIBrowseLis = this.mPlayerListener;
             if (tmIBrowseLis != null) {
                this.mILelinkSourceSdk.setPlayListener(tmIBrowseLis);
             }
             this.mILelinkSourceSdk.setDebugMode(this.isDebug);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void connect(LelinkServiceInfo p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.connect(p0);
       }
       return;
    }
    public boolean disConnect(LelinkServiceInfo p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          return tmILelinkSou.disConnect(p0);
       }
       return false;
    }
    public List getConnectInfos(){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          return tmILelinkSou.getConnectInfos();
       }
       return null;
    }
    public int getOption(int p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          return tmILelinkSou.getOption(p0);
       }
       return 0;
    }
    public boolean isPatchLoaded(){
       try{
          return this.mILelinkSourceSdk.isPatchLoaded(this.mContext);
       }catch(java.lang.Exception e0){
          a.b("LelinkSourceSDK", e0);
          return false;
       }
    }
    public int loadLePatch(String p0,String p1,boolean p2){
       try{
          ILelinkSourceSdk iLelinkSourc = a.a();
          this.mILelinkSourceSdk = iLelinkSourc;
          return iLelinkSourc.loadLePatch(p0, p1, p2);
       }catch(java.lang.Exception e2){
          a.b("LelinkSourceSDK", e2);
          return -2;
       }
    }
    public void pause(){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.pause();
       }
       return;
    }
    public void resume(){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.resume();
       }
       return;
    }
    public void seekTo(int p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.seekTo(p0);
       }
       return;
    }
    public LelinkSourceSDK setBindSdkListener(IBindSdkListener p0){
       this.mBindSdkListener = p0;
       return this;
    }
    public LelinkSourceSDK setBrowseResultListener(IBrowseListener p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.setBrowseResultListener(p0);
       }else {
          this.mIBrowseListener = p0;
       }
       return this;
    }
    public LelinkSourceSDK setConnectListener(IConnectListener p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.setConnectListener(p0);
       }else {
          this.mConnectListener = p0;
       }
       return this;
    }
    public LelinkSourceSDK setDebugMode(boolean p0){
       try{
          this.isDebug = p0;
          LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
          if (tmILelinkSou != null) {
             tmILelinkSou.setDebugMode(p0);
          }
          return this;
       }catch(java.lang.Exception e0){
       }
    }
    public void setOption(int p0,Object[] p1){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.setOption(p0, p1);
       }
       return;
    }
    public LelinkSourceSDK setPlayListener(ILelinkPlayerListener p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.setPlayListener(p0);
       }else {
          this.mPlayerListener = p0;
       }
       return this;
    }
    public LelinkSourceSDK setSdkInitInfo(Context p0,String p1,String p2){
       return this.setSdkInitInfo(p0, p1, p2, null, null, null);
    }
    public LelinkSourceSDK setSdkInitInfo(Context p0,String p1,String p2,String p3){
       return this.setSdkInitInfo(p0, p1, p2, null, null, p3);
    }
    public LelinkSourceSDK setSdkInitInfo(Context p0,String p1,String p2,String p3,String p4,String p5){
       this.mContext = p0;
       this.mAppid = p1;
       this.mAppSecret = p2;
       this.mUserId = p3;
       this.mAppVersion = p4;
       this.mOaid = p5;
       return this;
    }
    public void setVolume(int p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.setVolume(p0);
       }
       return;
    }
    public void startBrowse(){
       this.startBrowse(true, true);
    }
    public void startBrowse(boolean p0,boolean p1){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.startBrowse(p0, p1);
       }
       return;
    }
    public void startPlayMedia(LelinkPlayerInfo p0){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.startPlayMedia(p0);
       }
       return;
    }
    public void startPlayMedia(String p0,int p1,boolean p2){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.startPlayMedia(p0, p1, p2);
       }
       return;
    }
    public void startPlayMediaImmed(LelinkServiceInfo p0,Uri p1,int p2){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.startPlayMediaImmed(p0, p1, p2);
       }
       return;
    }
    public void startPlayMediaImmed(LelinkServiceInfo p0,String p1,int p2,boolean p3){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.startPlayMediaImmed(p0, p1, p2, p3);
       }
       return;
    }
    public void stopBrowse(){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.stopBrowse();
       }
       return;
    }
    public void stopPlay(){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.stopPlay();
       }
       return;
    }
    public void subVolume(){
       LelinkSourceSDK tmILelinkSou = this.mILelinkSourceSdk;
       if (tmILelinkSou != null) {
          tmILelinkSou.subVolume();
       }
       return;
    }
    public void unBindSdk(){
       try{
          this.mILelinkSourceSdk.unBindSdk();
       }catch(java.lang.Exception e0){
          a.b("LelinkSourceSDK", e0);
       }
       return;
    }
}
