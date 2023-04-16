package com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil$1;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Build$VERSION;
import android.os.PowerManager;
import java.lang.Boolean;
import java.lang.Exception;
import com.kwai.video.player.pragma.DebugLog;

public class KwaiBatteryInfoUtil	// class@000b32
{
    public static int mBatteryLevel;
    public static final BroadcastReceiver mBatteryReceiver;
    public static int mBatteryTemperature;
    public static Context mContext;
    public static boolean mEnableCollectBatteryNew;
    public static boolean mInited;
    public static boolean mIsCharging;
    public static boolean mIsPowerSaveMode;
    public static PowerManager mPowerManager;

    static {
       KwaiBatteryInfoUtil.mBatteryReceiver = new KwaiBatteryInfoUtil$1();
    }
    public void KwaiBatteryInfoUtil(){
       super();
    }
    public static void collectBatteryInfo(Context p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, KwaiBatteryInfoUtil.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (KwaiBatteryInfoUtil.mEnableCollectBatteryNew) {
          KwaiBatteryInfoUtil.init(p0);
          KwaiBatteryInfoUtil.dumpBatteryInfo();
          return;
       }else {
          KwaiBatteryInfoUtil.mContext = p0.getApplicationContext();
          Intent intent = UniversalReceiver.e(KwaiBatteryInfoUtil.mContext, obj, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          if (intent != null) {
             int i = 0;
             KwaiBatteryInfoUtil.mBatteryTemperature = intent.getIntExtra("temperature", i);
             KwaiBatteryInfoUtil.mBatteryLevel = intent.getIntExtra("level", i);
             if (intent.getIntExtra("status", -1) == 2) {
                i = true;
             }
             KwaiBatteryInfoUtil.mIsCharging = i;
          }
          KwaiBatteryInfoUtil.dumpBatteryInfo();
          return;
       }
    }
    public static void dumpBatteryInfo(){
    }
    public static void enableCollectionBatteryNew(){
       KwaiBatteryInfoUtil.mEnableCollectBatteryNew = true;
    }
    public static int getBatteryLevel(){
       return KwaiBatteryInfoUtil.mBatteryLevel;
    }
    public static int getBatteryTemperature(){
       return KwaiBatteryInfoUtil.mBatteryTemperature;
    }
    public static int getCurrentThermalStatus(){
       PowerManager obj = PatchProxy.apply(null, null, KwaiBatteryInfoUtil.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (Build$VERSION.SDK_INT >= 29) {
          if (KwaiBatteryInfoUtil.mPowerManager == null) {
             KwaiBatteryInfoUtil.mPowerManager = KwaiBatteryInfoUtil.getPowerManager();
          }
          obj = KwaiBatteryInfoUtil.mPowerManager;
          if (obj != null) {
             i = obj.getCurrentThermalStatus();
          }
       }
       return i;
    }
    public static boolean getIsCharging(){
       return KwaiBatteryInfoUtil.mIsCharging;
    }
    public static boolean getIsPowerSaveMode(){
       Object obj = PatchProxy.apply(null, null, KwaiBatteryInfoUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (KwaiBatteryInfoUtil.mPowerManager == null) {
             KwaiBatteryInfoUtil.mPowerManager = KwaiBatteryInfoUtil.getPowerManager();
          }
          PowerManager mPowerManage = KwaiBatteryInfoUtil.mPowerManager;
          if (mPowerManage != null) {
             b = mPowerManage.isPowerSaveMode();
          }
          KwaiBatteryInfoUtil.mIsPowerSaveMode = b;
       }catch(java.lang.Exception e1){
          DebugLog.e("KwaiBatteryInfoUtil", e1.getMessage());
       }
       return b;
    }
    public static PowerManager getPowerManager(){
       Object obj = PatchProxy.apply(null, null, KwaiBatteryInfoUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return KwaiBatteryInfoUtil.mContext.getSystemService("power");
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiBatteryInfoUtil.class, "1")) {
          return;
       }
       if (!KwaiBatteryInfoUtil.mInited && KwaiBatteryInfoUtil.mEnableCollectBatteryNew) {
          p0 = p0.getApplicationContext();
          KwaiBatteryInfoUtil.mContext = p0;
          boolean b = true;
          KwaiBatteryInfoUtil.mInited = b;
          Intent intent = UniversalReceiver.e(p0, KwaiBatteryInfoUtil.mBatteryReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          if (intent != null) {
             KwaiBatteryInfoUtil.mBatteryTemperature = intent.getIntExtra("temperature", 0);
             KwaiBatteryInfoUtil.mBatteryLevel = intent.getIntExtra("level", 0);
             if (intent.getIntExtra("status", -1) != 2) {
                b = false;
             }
             KwaiBatteryInfoUtil.mIsCharging = b;
          }
          KwaiBatteryInfoUtil.mPowerManager = KwaiBatteryInfoUtil.getPowerManager();
          KwaiBatteryInfoUtil.getIsPowerSaveMode();
       }
       return;
    }
}
