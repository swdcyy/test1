package com.kwai.video.clipkit.config.ClipKitConfigManager;
import java.lang.Object;
import com.kwai.video.clipkit.config.ClipKitConfigManager$1;
import android.content.Context;
import com.kwai.video.clipkit.utils.Utils$Size;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.config.EditorImageConfig;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.config.ClipKitConfigManager$Holder;
import java.lang.Number;
import c97.d;
import h97.d;
import h97.j;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.video.clipkit.config.LowDeviceConfig;
import android.os.Build$VERSION;
import android.graphics.Point;
import java.lang.Math;
import java.lang.StringBuilder;
import com.google.gson.Gson;
import java.lang.Throwable;

public class ClipKitConfigManager	// class@001a60
{
    public ClipKitConfig mClipkitConfig;
    public String mClipkitConfigV2;
    public Object mLock;

    public void ClipKitConfigManager(){
       super();
       this.mLock = new Object();
       this.init();
    }
    public void ClipKitConfigManager(ClipKitConfigManager$1 p0){
       super();
    }
    public static Utils$Size getAtlasExportSize(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitConfigManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (ClipKitConfigManager.getImageConfig() == null)? 2048: ClipKitConfigManager.getImageConfig().atlasExportSize;
       return ClipKitUtils.getImageMaxSize(p0, i);
    }
    public static Utils$Size getAtlasPreviewSize(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitConfigManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (ClipKitConfigManager.getImageConfig() == null)? -1: ClipKitConfigManager.getImageConfig().atlasPreviewSize;
       return ClipKitUtils.getImageMaxSize(p0, i);
    }
    public static EditorImageConfig getImageConfig(){
       ClipKitConfig obj = PatchProxy.apply(null, null, ClipKitConfigManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ClipKitConfigManager.getInstance().getConfig();
       if (obj != null) {
          return obj.getImageConfig();
       }
       KSClipLog.i("ClipKitConfig", "getConfig is null");
       return null;
    }
    public static ClipKitConfigManager getInstance(){
       return ClipKitConfigManager$Holder.sManager;
    }
    public static Utils$Size getSingleExportSize(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitConfigManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (ClipKitConfigManager.getImageConfig() == null)? 2048: ClipKitConfigManager.getImageConfig().singleExportSize;
       return ClipKitUtils.getImageMaxSize(p0, i);
    }
    public static int getSingleImageQuality(){
       Object obj = PatchProxy.apply(null, null, ClipKitConfigManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (ClipKitConfigManager.getImageConfig() == null)? 85: ClipKitConfigManager.getImageConfig().singleImageQuality;
       return i;
    }
    public static Utils$Size getSinglePreviewSize(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitConfigManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (ClipKitConfigManager.getImageConfig() == null)? 2048: ClipKitConfigManager.getImageConfig().singlePreviewSize;
       return ClipKitUtils.getImageMaxSize(p0, i);
    }
    public ClipKitConfig getConfig(){
       Object[] objArray = null;
       ClipKitConfigManager obj = PatchProxy.apply(objArray, this, ClipKitConfigManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipKitConfigManager tmClipkitCon = this.mClipkitConfig;
       if (tmClipkitCon == null) {
          this.updateConfig();
       }else {
          objArray = tmClipkitCon;
       }
       _monitor_exit(obj);
       return objArray;
    }
    public String getMVConfig(){
       Object[] objArray = null;
       ClipKitConfigManager obj = PatchProxy.apply(objArray, this, ClipKitConfigManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipKitConfigManager tmClipkitCon = this.mClipkitConfigV2;
       if (tmClipkitCon == null) {
          this.updateConfig();
       }else {
          objArray = tmClipkitCon;
       }
       _monitor_exit(obj);
       return objArray;
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, ClipKitConfigManager.class, "1")) {
          return;
       }
       this.updateConfig();
       d.a().c().b("ksclipkit", new ClipKitConfigManager$1(this));
       return;
    }
    public boolean isLowDevice(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipKitConfigManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isLowDevice(p0, 0);
    }
    public boolean isLowDevice(Context p0,int p1){
       LowDeviceConfig obj;
       ClipKitConfigManager uClipKitConf = ClipKitConfigManager.class;
       if (PatchProxy.isSupport(uClipKitConf)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClipKitConf, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.getConfig() == null) {
          KSClipLog.i("ClipKitConfig", "isLowDevice config is null, return true");
          return true;
       }else {
          obj = this.getConfig().getLowDeviceConfig();
          if (obj == null) {
             KSClipLog.i("ClipKitConfig", "isLowDevice lowDeviceConfig is null, return false");
             return false;
          }else if(obj.lowDevice > null){
             KSClipLog.i("ClipKitConfig", "isLowDevice lowDevice > 0, return true");
             return true;
          }else if(Build$VERSION.SDK_INT < obj.minApiScreen){
             KSClipLog.i("ClipKitConfig", "isLowDevice deviceApiVersion < lowDeviceConfig.minApiScreen, return true");
             return true;
          }else {
             Point screenWidthH = ClipKitUtils.getScreenWidthHeight(p0);
             if (Math.max(screenWidthH.x, screenWidthH.y) < obj.minScreenLongEdge) {
                KSClipLog.i("ClipKitConfig", "isLowDevice current screen < minScreenLongEdge, return true");
                return true;
             }else {
                LowDeviceConfig miniAvgWrite = obj.miniAvgWriteOneFrame;
                if (miniAvgWrite > null && p1 > miniAvgWrite) {
                   Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(obj.miniAvgWriteOneFrame)};
                   KSClipLog.i("ClipKitConfig", String.format("isLowDevice miniAvgWriteOneFrame %d>%d,return true", objArray));
                   return true;
                }else {
                   KSClipLog.i("ClipKitConfig", "isLowDevice return false");
                   return false;
                }
             }
          }
       }
    }
    public void updateConfig(){
       if (PatchProxy.applyVoid(null, this, ClipKitConfigManager.class, "4")) {
          return;
       }
       try{
          String str = d.a().c().c("ksclipkit");
          KSClipLog.i("zf_test", "configV2 = "+str);
          ClipKitConfigManager tmLock = this.mLock;
          _monitor_enter(tmLock);
          this.mClipkitConfigV2 = str;
          this.mClipkitConfig = ClipKitUtils.COMMON_GSON.h(str, ClipKitConfig.class);
          _monitor_exit(tmLock);
       }catch(java.lang.Exception e0){
          KSClipLog.e("ClipKitConfig", "updateConfig Exception", e0);
       }
       return;
    }
}
