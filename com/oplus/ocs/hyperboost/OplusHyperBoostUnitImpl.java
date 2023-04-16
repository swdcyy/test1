package com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl;
import com.oplus.ocs.hyperboost.HyperBoostUnitInterface;
import java.lang.Object;
import com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl$1;
import com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl$2;
import java.lang.String;
import com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService;
import java.lang.StringBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.Exception;
import com.oplus.ocs.hyperboost.HyperBoostCallback;
import java.lang.ref.WeakReference;
import com.oplus.ocs.base.common.AuthResult;

public class OplusHyperBoostUnitImpl implements HyperBoostUnitInterface	// class@000b34
{
    public boolean mAuthCheckFlag;
    public OplusHyperBoostUnitImpl$a mBindListener;
    public WeakReference mCallBacks;
    public Context mContext;
    public IOplusHyperBoostService mHyperBoostServiceBinder;
    public IOplusHyperBoostNotifier mIHyperBoostNotifier;
    public ServiceConnection mServiceConnection;

    public void OplusHyperBoostUnitImpl(){
       super();
       this.mContext = null;
       this.mHyperBoostServiceBinder = null;
       this.mBindListener = null;
       this.mAuthCheckFlag = false;
       this.mServiceConnection = new OplusHyperBoostUnitImpl$1(this);
       this.mIHyperBoostNotifier = new OplusHyperBoostUnitImpl$2(this);
    }
    public boolean appActionBind(int p0,boolean p1){
       if (this.checkPermisson()) {
          return this.bindCoreSignal(16, p1, p0, -1);
       }
       return false;
    }
    public boolean appActionBurst(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(8, p0, p1, -1);
       }
       return false;
    }
    public boolean appActionDdr(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(14, p0, p1, -1);
       }
       return false;
    }
    public boolean appActionEnd(){
       if (this.checkPermisson()) {
          return this.generalSignal(10, -1, -1, -1);
       }
       return false;
    }
    public boolean appActionGpu(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(15, p0, p1, -1);
       }
       return false;
    }
    public boolean appActionLoading(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(9, p0, p1, -1);
       }
       return false;
    }
    public boolean appActionVibrate(int p0){
       if (this.checkPermisson()) {
          try{
             ("vibrate sceneValue:").concat(String.valueOf(p0));
             this.mHyperBoostServiceBinder.vibrate(p0);
             return true;
          }catch(java.lang.Exception e4){
             ("vibrate error:").concat(String.valueOf(e4));
          }
          return v1;
       }else {
          goto label_0021 ;
       }
    }
    public boolean appBootCompleted(){
       if (this.checkPermisson()) {
          return this.generalSignal(7, -1, -1, -1);
       }
       return false;
    }
    public final boolean bindCoreSignal(int p0,boolean p1,int p2,int p3){
       if (this.mHyperBoostServiceBinder == null) {
          return false;
       }
       try{
          String str = "{\"actionType\":";
          String str1 = (p1)? str+p0+",\"hb_bind_tid\":"+p2+",\"extra\":"+p3+"}": str+p0+",\"hb_unbind_tid\":"+p2+",\"extra\":"+p3+"}";
          this.mHyperBoostServiceBinder.generalSignal(str1);
          return true;
       }catch(java.lang.Exception e6){
          "actionType:"+p0+" signalInfo error:"+e6;
          return false;
       }
    }
    public final boolean checkPermisson(){
       return this.mAuthCheckFlag;
    }
    public boolean gameActionBind(int p0,boolean p1){
       if (this.checkPermisson()) {
          return this.bindCoreSignal(13, p1, p0, -1);
       }
       return false;
    }
    public boolean gameActionBurst(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(1, p0, p1, -1);
       }
       return false;
    }
    public boolean gameActionDdr(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(11, p0, p1, -1);
       }
       return false;
    }
    public boolean gameActionEnd(){
       if (this.checkPermisson()) {
          return this.generalSignal(3, -1, -1, -1);
       }
       return false;
    }
    public boolean gameActionGpu(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(12, p0, p1, -1);
       }
       return false;
    }
    public boolean gameActionLoading(int p0,int p1){
       if (this.checkPermisson()) {
          return this.generalSignal(2, p0, p1, -1);
       }
       return false;
    }
    public boolean gameActionVibrate(int p0){
       if (this.checkPermisson()) {
          try{
             ("vibrate sceneValue:").concat(String.valueOf(p0));
             this.mHyperBoostServiceBinder.vibrate(p0);
             return true;
          }catch(java.lang.Exception e4){
             ("vibrate error:").concat(String.valueOf(e4));
          }
          return v1;
       }else {
          goto label_0021 ;
       }
    }
    public boolean gameBootCompleted(){
       if (this.checkPermisson()) {
          return this.generalSignal(6, -1, -1, -1);
       }
       return false;
    }
    public boolean gameSceneEnd(){
       if (this.checkPermisson()) {
          return this.generalSignal(5, -1, -1, -1);
       }
       return false;
    }
    public boolean gameSceneStart(){
       if (this.checkPermisson()) {
          return this.generalSignal(4, -1, -1, -1);
       }
       return false;
    }
    public final boolean generalSignal(int p0,int p1,int p2,int p3){
       if (this.mHyperBoostServiceBinder == null) {
          return false;
       }
       try{
          this.mHyperBoostServiceBinder.generalSignal("{\"actionType\":"+p0+",\"actionTime\":"+p1+",\"actionlevel\":"+p2+",\"extra\":"+p3+"}");
          return true;
       }catch(java.lang.Exception e5){
          "actionType:"+p0+" signalInfo error:"+e5;
          return v1;
       }
    }
    public String getVersion(){
       try{
          if (this.mHyperBoostServiceBinder != null && this.checkPermisson()) {
          label_000c :
             return this.mHyperBoostServiceBinder.getVersion()+":2.1";
          }
       }catch(java.lang.Exception e0){
          ("HyperBoost SdkVersion error:").concat(String.valueOf(e0));
       }
       return null;
    }
    public void initialize(Context p0){
       this.mContext = p0;
       Intent intent = new Intent("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
       intent.setPackage("com.oplus.cosa");
       OplusHyperBoostUnitImpl tmContext = this.mContext;
       if (tmContext != null) {
          ("bindService. ret-> ").concat(String.valueOf(a.a(tmContext, intent, this.mServiceConnection, 1)));
       }
       return;
    }
    public boolean registerClient(){
       if (this.mHyperBoostServiceBinder != null && this.checkPermisson()) {
          try{
             boolean b = this.mHyperBoostServiceBinder.registerClient(this.mIHyperBoostNotifier.asBinder());
             ("registerClient. register: ").concat(String.valueOf(b));
             if (b) {
                return true;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public boolean registerNotifier(HyperBoostCallback p0){
       this.mCallBacks = new WeakReference(p0);
       if (this.mHyperBoostServiceBinder == null || !this.checkPermisson()) {
          return false;
       }
       try{
          this.mHyperBoostServiceBinder.registerNotifier();
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return true;
    }
    public void setAuthResult(AuthResult p0){
       boolean b = (p0.getErrrorCode() == 1001)? true: false;
       this.mAuthCheckFlag = b;
       if (!b) {
          p0.getErrrorCode();
       }
       return;
    }
    public boolean updateGameInfo(String p0){
       if (this.mHyperBoostServiceBinder == null) {
          return false;
       }
       try{
          this.mHyperBoostServiceBinder.generalSignal("{\"actionType\":9999,\"actionInfo\":\""+p0+"\"}");
          return true;
       }catch(java.lang.Exception e4){
          ("actionType:9999 signalInfo error:").concat(String.valueOf(e4));
          return v1;
       }
    }
}
