package com.oplus.ocs.hyperboost.HyperBoostUnitClient;
import com.oplus.ocs.base.common.api.OplusApi;
import java.util.ArrayList;
import com.oplus.ocs.base.common.api.Api$ClientKey;
import com.oplus.ocs.hyperboost.HyperBoostClientBuilder;
import com.oplus.ocs.base.common.api.Api;
import java.lang.String;
import com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import android.content.Context;
import com.oplus.ocs.hyperboost.HyperBoostUnitInterface;
import com.oplus.ocs.base.internal.ClientSettings;
import java.util.List;
import com.oplus.ocs.base.common.api.Api$ApiOptions;
import com.oplus.ocs.base.utils.ServiceCheck;
import com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl;
import com.oplus.ocs.hyperboost.HyperBoostUnitImpl;
import java.lang.RuntimeException;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.AuthResult;
import com.oplus.ocs.hyperboost.HyperBoostCallback;

public class HyperBoostUnitClient extends OplusApi	// class@000b2b
{
    public static final Api API;
    public static final Api$AbstractClientBuilder CLIENT_BUILDER;
    public static final Api$ClientKey CLIENT_KEY;
    public static final List mFeatures;
    public static HyperBoostUnitInterface mHyperBoostUnitInterface;
    public static HyperBoostUnitClient sHyperBoostUnitClient;

    static {
       HyperBoostUnitClient.mFeatures = new ArrayList();
       Api$ClientKey uClientKey = new Api$ClientKey();
       HyperBoostUnitClient.CLIENT_KEY = uClientKey;
       HyperBoostClientBuilder hyperBoostCl = new HyperBoostClientBuilder();
       HyperBoostUnitClient.CLIENT_BUILDER = hyperBoostCl;
       HyperBoostUnitClient.API = new Api("HyperBoostClient.API", hyperBoostCl, uClientKey);
       HyperBoostUnitClient.sHyperBoostUnitClient = null;
       HyperBoostUnitClient.mHyperBoostUnitInterface = null;
    }
    public void HyperBoostUnitClient(Context p0,HyperBoostUnitInterface p1){
       super(p0, HyperBoostUnitClient.API, null, new ClientSettings(p0.getPackageName(), 0x186a1, HyperBoostUnitClient.mFeatures));
       HyperBoostUnitClient.mHyperBoostUnitInterface = p1;
       p1.initialize(p0);
       this.checkCapability();
    }
    public static synchronized HyperBoostUnitClient initialize(Context p0){
       OplusHyperBoostUnitImpl oplusHyperBo;
       _monitor_enter(HyperBoostUnitClient.class);
       HyperBoostUnitClient sHyperBoostU = HyperBoostUnitClient.sHyperBoostUnitClient;
       if (sHyperBoostU != null) {
          sHyperBoostU.addThis2Cache();
          _monitor_exit(HyperBoostUnitClient.class);
          return HyperBoostUnitClient.sHyperBoostUnitClient;
       }else if(ServiceCheck.check(p0, "com.oplus.cosa")){
          oplusHyperBo = new OplusHyperBoostUnitImpl();
       }else {
          oplusHyperBo = new HyperBoostUnitImpl();
       }
       HyperBoostUnitClient hyperBoostUn = new HyperBoostUnitClient(p0, oplusHyperBo);
       HyperBoostUnitClient.sHyperBoostUnitClient = hyperBoostUn;
       _monitor_exit(HyperBoostUnitClient.class);
       return hyperBoostUn;
    }
    public boolean appActionBind(int p0,boolean p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appActionBind(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean appActionBurst(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appActionBurst(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean appActionDdr(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appActionDdr(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean appActionEnd(){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appActionEnd();
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean appActionGpu(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appActionGpu(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean appActionLoading(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appActionLoading(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean appActionVibrate(int p0){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appActionVibrate(p0);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean appBootCompleted(){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.appBootCompleted();
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public void checkAuthResult(CapabilityInfo p0){
       HyperBoostUnitClient.mHyperBoostUnitInterface.setAuthResult(p0.getAuthResult());
    }
    public boolean gameActionBind(int p0,boolean p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameActionBind(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameActionBurst(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameActionBurst(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameActionDdr(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameActionDdr(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameActionEnd(){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameActionEnd();
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameActionGpu(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameActionGpu(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameActionLoading(int p0,int p1){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameActionLoading(p0, p1);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameActionVibrate(int p0){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameActionVibrate(p0);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameBootCompleted(){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameBootCompleted();
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameSceneEnd(){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameSceneEnd();
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean gameSceneStart(){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.gameSceneStart();
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public int getVersion(){
       return 0x186a1;
    }
    public boolean hasFeature(String p0){
       return true;
    }
    public void init(){
    }
    public boolean registerClient(){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.registerClient();
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean registerNotifier(HyperBoostCallback p0){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.registerNotifier(p0);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
    public boolean specificAction(String p0){
       HyperBoostUnitInterface mHyperBoostU = HyperBoostUnitClient.mHyperBoostUnitInterface;
       if (mHyperBoostU != null) {
          return mHyperBoostU.updateGameInfo(p0);
       }
       throw new RuntimeException("mHyperBoostUnitInterface has already destroyed, call it before destroy\(\) ");
    }
}
