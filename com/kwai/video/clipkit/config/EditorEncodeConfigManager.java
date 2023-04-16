package com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager$1;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager$Holder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.config.EditorEncodeConfig$AudioEncodeConfig;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import java.util.List;
import com.kwai.video.clipkit.post.LocalExportOption;
import com.kwai.video.clipkit.config.EditorEncodeConfig$LocalVideoEncodeConfig;
import java.lang.StringBuilder;
import java.lang.Math;
import com.kwai.video.clipkit.config.EditorEncodeConfig$CapeConfig;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ExportParam;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager$EncodeHighConfig;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.clipkit.ClipKitUtils;
import com.google.gson.Gson;
import com.kwai.video.clipkit.config.EditorEncodeConfig$MVImportParams;
import oe6.o;
import com.kwai.video.clipkit.config.EditorEncodeConfig$SupportAICutConditions;
import com.kwai.video.clipkit.config.EditorEncodeConfig$SupportHighEncodeConfig;
import android.util.Pair;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import cw9.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager$2;
import com.kwai.video.clipkit.utils.NetworkUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.editorsdk2.PreviewPlayerQosInfo;
import com.kwai.video.editorsdk2.PreviewPlayerRealtimeStatsInfo;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.Throwable;

public class EditorEncodeConfigManager	// class@001a71
{
    public EditorEncodeConfig mEditorEncodeConfig;
    public LinkedBlockingQueue mHighConfigQueue;
    public Object mLock;
    public int mMiniAvgWriteOneFrame;
    public static int HIGH_CONFIG_SUPPORT_NETWORK_2G = 1;
    public static int HIGH_CONFIG_SUPPORT_NETWORK_4G = 2;
    public static int HIGH_CONFIG_SUPPORT_NETWORK_5G = 4;
    public static int HIGH_CONFIG_SUPPORT_NETWORK_WIFI = 8;
    public static final int VERSION = 1;

    public void EditorEncodeConfigManager(){
       super();
       this.mHighConfigQueue = new LinkedBlockingQueue(100);
       this.mLock = new Object();
       ClipKitConfigManager.getInstance();
       this.updateConfig();
    }
    public void EditorEncodeConfigManager(EditorEncodeConfigManager$1 p0){
       super();
    }
    public static EditorEncodeConfigManager getInstance(){
       return EditorEncodeConfigManager$Holder.sManager;
    }
    public void clearQos(){
       if (PatchProxy.applyVoid(null, this, EditorEncodeConfigManager.class, "10")) {
          return;
       }
       EditorEncodeConfigManager tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mHighConfigQueue.clear();
       _monitor_exit(tmLock);
       return;
    }
    public EditorEncodeConfig$AudioEncodeConfig filterAudioEncodeConfig(){
       Object[] objArray = null;
       EditorEncodeConfigManager obj = PatchProxy.apply(objArray, this, EditorEncodeConfigManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       KSClipLog.i("ClipkitEditorEncode", "filterAudioEncodeConfig");
       this.updateConfig();
       EditorEncodeConfigManager tmEditorEnco = this.mEditorEncodeConfig;
       if (tmEditorEnco != null) {
          objArray = tmEditorEnco.audioEncodeConfig;
       }
       if (objArray == null || !objArray.size()) {
          KSClipLog.i("ClipkitEditorEncode", "filterAudioEncodeConfig config is null use default");
          objArray = EditorEncodeConfig$AudioEncodeConfig.defaultAudioEncodeConfigs();
       }
       _monitor_exit(obj);
       return objArray.get(0).clone();
    }
    public EditorEncodeConfig$LocalVideoEncodeConfig filterLocalVideoEncodeConfig(LocalExportOption p0){
       EditorEncodeConfig$LocalVideoEncodeConfig fps;
       EditorEncodeConfig$LocalVideoEncodeConfig fps1;
       EditorEncodeConfigManager obj = PatchProxy.applyOneRefs(p0, this, EditorEncodeConfigManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorEncodeConfig$LocalVideoEncodeConfig localVideoEn = null;
       if (p0.width > null && (p0.height <= null || p0.fps <= null)) {
          return localVideoEn;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       KSClipLog.i("ClipkitEditorEncode", "filterLocalVideoEncodeConfig exportOption:"+p0.width+p0.height+p0.fps);
       this.updateConfig();
       EditorEncodeConfigManager tmEditorEnco = this.mEditorEncodeConfig;
       EditorEncodeConfig localVideoEn1 = (tmEditorEnco != null)? tmEditorEnco.localVideoEncodeConfig: localVideoEn;
       if (localVideoEn1 == null || !localVideoEn1.size()) {
          KSClipLog.i("ClipkitEditorEncode", "filterLocalVideoEncodeConfig config is null use default");
          localVideoEn1 = EditorEncodeConfig$LocalVideoEncodeConfig.defaultVideoEncodeConfigs();
       }
       int i = Math.max(p0.width, p0.height);
       EditorEncodeConfig$LocalVideoEncodeConfig localVideoEn2 = localVideoEn;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i1 < localVideoEn1.size()) {
          EditorEncodeConfig$LocalVideoEncodeConfig localVideoEn3 = localVideoEn1.get(i1);
          int i4 = Math.max(localVideoEn3.width, localVideoEn3.height);
          if (localVideoEn2 == null || i2 < i4) {
          label_0099 :
             localVideoEn2 = localVideoEn3;
             i2 = i4;
          }else if(i2 == i4){
             fps = localVideoEn2.fps;
             fps1 = localVideoEn3.fps;
             if (fps > fps1) {
                if (p0.fps < fps1) {
                   goto label_0099 ;
                }
             }else if(p0.fps > fps){
                goto label_0099 ;
             }
          }
          if (i <= i4) {
             if (localVideoEn != null && i3 <= i4) {
                if (i3 == i4) {
                   fps = localVideoEn.fps;
                   fps1 = localVideoEn3.fps;
                   if (fps > fps1) {
                      if (p0.fps >= fps1) {
                      label_00b7 :
                         i1 = i1 + 1;
                      }
                   }else if(p0.fps > fps){
                   }
                }
             }
             localVideoEn = localVideoEn3;
             i3 = i4;
             goto label_00b7 ;
          }
       }
       if (localVideoEn == null) {
          localVideoEn = localVideoEn2;
       }
       localVideoEn = localVideoEn.clone();
       if (localVideoEn != null) {
          localVideoEn.width = p0.width;
          localVideoEn.height = p0.height;
          localVideoEn.fps = p0.fps;
       }
       _monitor_exit(obj);
       return localVideoEn;
    }
    public EditorEncodeConfig$CapeConfig getCapeConfig(){
       EditorEncodeConfigManager obj = PatchProxy.apply(null, this, EditorEncodeConfigManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       this.updateConfig();
       EditorEncodeConfigManager tmEditorEnco = this.mEditorEncodeConfig;
       if (tmEditorEnco != null) {
          EditorEncodeConfig capeConfig = tmEditorEnco.capeConfig;
          if (capeConfig != null) {
             _monitor_exit(obj);
             return capeConfig;
          }
       }
       KSClipLog.d("ClipkitEditorEncode", "getCapeConfig return null");
       _monitor_exit(obj);
       return null;
    }
    public EditorEncodeConfigModule getEditorEncodeConfigModule(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2){
       if (PatchProxy.isSupport(EditorEncodeConfigManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, EditorEncodeConfigManager.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getEditorEncodeConfigModule(p0, p1, p2, false);
    }
    public EditorEncodeConfigModule getEditorEncodeConfigModule(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2,boolean p3){
       EditorEncodeConfigManager obj;
       EditorEncodeConfig lowConfig;
       if (PatchProxy.isSupport(EditorEncodeConfigManager.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, EditorEncodeConfigManager.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mLock;
       _monitor_enter(obj);
       KSClipLog.i("ClipkitEditorEncode", "getEditorEncodeConfigModule videoType:"+p2+", forceHigh:"+p3);
       this.updateConfig();
       EditorEncodeConfigManager tmEditorEnco = this.mEditorEncodeConfig;
       if (tmEditorEnco == null) {
          KSClipLog.i("ClipkitEditorEncode", "getEditorEncodeConfigModule config is null, use default");
          tmEditorEnco = new EditorEncodeConfig();
       }
       if (tmEditorEnco.lowConfig != null && ClipKitConfigManager.getInstance().isLowDevice(p0, this.mMiniAvgWriteOneFrame)) {
          lowConfig = tmEditorEnco.lowConfig;
          KSClipLog.i("ClipkitEditorEncode", "getEditorEncodeConfigModule, use low");
       }else if(this.isUseHighConfig(p0, p1, p2, tmEditorEnco)){
          lowConfig = tmEditorEnco.highConfig;
          KSClipLog.i("ClipkitEditorEncode", "getEditorEncodeConfigModule, use high");
       }else if(!p3){
          lowConfig = tmEditorEnco.normalConfig;
          KSClipLog.i("ClipkitEditorEncode", "getEditorEncodeConfigModule, use normal");
       }else {
          lowConfig = null;
       }
       if (lowConfig == null) {
          KSClipLog.i("ClipkitEditorEncode", "getEditorEncodeConfigModule, configModule == null, return null");
          _monitor_exit(obj);
          return null;
       }else {
          this.setExportParamByVideoType(lowConfig, p2);
          if (lowConfig.exportParam != null) {
             KSClipLog.i("ClipkitEditorEncode", "getEditorEncodeConfigModule, return config wh:"+lowConfig.exportParam.width+","+lowConfig.exportParam.height+" hwBitrate:"+lowConfig.exportParam.videoBitrate);
             KSClipLog.i("ClipkitEditorEncode", "x264Param:"+lowConfig.exportParam.x264Params);
          }
          _monitor_exit(obj);
          return lowConfig;
       }
    }
    public final EditorEncodeConfigManager$EncodeHighConfig getEncodeHighConfig(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorEncodeConfigManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       String str1 = this.getPreferences(p0).getString("encodeHighConfig_1", str);
       if (!TextUtils.isEmpty(str1)) {
          return ClipKitUtils.COMMON_GSON.h(str1, EditorEncodeConfigManager$EncodeHighConfig.class);
       }
       return str;
    }
    public EditorEncodeConfig$MVImportParams getMVImportParamsConfig(){
       EditorEncodeConfigManager obj = PatchProxy.apply(null, this, EditorEncodeConfigManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       this.updateConfig();
       EditorEncodeConfigManager tmEditorEnco = this.mEditorEncodeConfig;
       if (tmEditorEnco == null || tmEditorEnco.getMVImportParams() == null) {
          KSClipLog.d("ClipkitEditorEncode", "getMVImportParamsConfig return null");
          _monitor_exit(obj);
          return null;
       }else {
          _monitor_exit(obj);
          return this.mEditorEncodeConfig.getMVImportParams();
       }
    }
    public final SharedPreferences getPreferences(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorEncodeConfigManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.c(p0, "editor_encode_config", 4);
    }
    public EditorEncodeConfig$SupportAICutConditions getSupportAICutConditions(){
       EditorEncodeConfigManager obj = PatchProxy.apply(null, this, EditorEncodeConfigManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       this.updateConfig();
       EditorEncodeConfigManager tmEditorEnco = this.mEditorEncodeConfig;
       if (tmEditorEnco != null) {
          EditorEncodeConfig supportAICut = tmEditorEnco.supportAICutConditions;
          if (supportAICut != null) {
             _monitor_exit(obj);
             return supportAICut;
          }
       }
       KSClipLog.d("ClipkitEditorEncode", "SupportAICutConditions return null");
       _monitor_exit(obj);
       return null;
    }
    public final boolean isUseHighConfig(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2,EditorEncodeConfig p3){
       EditorEncodeConfig obj;
       EditorEncodeConfigModule exportParam;
       EditorEncodeConfigModule$ExportParam width;
       int b;
       EditorEncodeConfigManager$EncodeHighConfig encodeHighCo;
       if (PatchProxy.isSupport(EditorEncodeConfigManager.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, EditorEncodeConfigManager.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p3.supportHighEncodeConfig;
       if (obj == null || p3.highConfig == null) {
          KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig highConfig is null or supportHighEncodeConfig is null,return false");
          return false;
       }else if(!this.isUseHighConfigCurNet(p0, obj)){
          KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig the current network environment does not support highConfig,return false");
          return false;
       }else {
          this.setExportParamByVideoType(p3.highConfig, p2);
          if (p3.highConfig.exportParam == null) {
             KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig videoType:"+p2+",highConfig.exportParam is null,return false");
             return false;
          }else {
             EditorEncodeConfig normalConfig = p3.normalConfig;
             if (normalConfig != null) {
                this.setExportParamByVideoType(normalConfig, p2);
                exportParam = p3.normalConfig.exportParam;
                if (exportParam != null) {
                   width = exportParam.width;
                   EditorEncodeConfigModule$ExportParam height = exportParam.height;
                label_007e :
                   Pair exportSize = ClipKitUtils.getExportSize(p1, 4096, 4096);
                   int i = exportSize.first.intValue();
                   int i1 = exportSize.second.intValue();
                   if (Math.min(i, i1) <= Math.min(width, height) && Math.max(i, i1) <= Math.max(width, height)) {
                      KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig video exportWidth :"+i+",exportHeight:"+i1+",return false");
                      return false;
                   }else {
                      b = true;
                      if (p2 == 4) {
                         KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig videoType is Camera,return true immediately");
                         return b;
                      }else {
                         DisplayMetrics uDisplayMetr = new DisplayMetrics();
                         c.d(p0.getSystemService("window").getDefaultDisplay(), uDisplayMetr);
                         DisplayMetrics heightPixels = uDisplayMetr.heightPixels;
                         uDisplayMetr = uDisplayMetr.widthPixels;
                         if (uDisplayMetr < obj.minScreenWidth || heightPixels < obj.minScreenHeight) {
                            KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig screenWidth :"+uDisplayMetr+",screenHeight:"+heightPixels+",return false");
                            return false;
                         }else {
                            EditorEncodeConfigManager tmLock = this.mLock;
                            _monitor_enter(tmLock);
                            i1 = this.mHighConfigQueue.size();
                            if (i1 <= b) {
                               encodeHighCo = this.getEncodeHighConfig(p0);
                               KSClipLog.d("ClipkitEditorEncode", "isUseHighConfig use last encodeHighConfig:"+ClipKitUtils.COMMON_GSON.q(encodeHighCo));
                            }else {
                               float f = 0;
                               EditorEncodeConfigManager$EncodeHighConfig uEncodeHighC = new EditorEncodeConfigManager$EncodeHighConfig();
                               ArrayList uArrayList = new ArrayList(i1);
                               for (StringBuilder int i2 = 0; i2 < i1; i2++) {
                                  EditorEncodeConfig$SupportHighEncodeConfig supportHighE = this.mHighConfigQueue.poll();
                                  uArrayList.add(supportHighE);
                                  f = f + supportHighE.maxStutterPerSecond;
                               }
                               uEncodeHighC.ccStutterPerSecond = f / (float)i1;
                               Collections.sort(uArrayList, new EditorEncodeConfigManager$1(this));
                               i2 = 0x40000000;
                               EditorEncodeConfig$SupportHighEncodeConfig minAvgFps = ((i1 % 2) == b)? uArrayList.get(((i1 - 1) / 2)).minAvgFps: (uArrayList.get(((i1 - 1) / 2)).minAvgFps + uArrayList.get((i1 / 2)).minAvgFps) / i2;
                               uEncodeHighC.ccFps = minAvgFps;
                               Collections.sort(uArrayList, new EditorEncodeConfigManager$2(this));
                               minAvgFps = ((i1 % 2) == b)? uArrayList.get(((i1 - 1) / 2)).maxProcessCpuUsage: (uArrayList.get(((i1 - 1) / 2)).maxProcessCpuUsage + uArrayList.get((i1 / 2)).maxProcessCpuUsage) / i2;
                               uEncodeHighC.ccCpuUsage = minAvgFps;
                               KSClipLog.d("ClipkitEditorEncode", "isUseHighConfig current encodeHighConfig:"+ClipKitUtils.COMMON_GSON.q(uEncodeHighC));
                               for (minAvgFps = 0; minAvgFps < i1; minAvgFps++) {
                                  this.mHighConfigQueue.offer(uArrayList.get(minAvgFps));
                               }
                               this.saveEncodeHighConfig(p0, uEncodeHighC);
                               encodeHighCo = uEncodeHighC;
                            }
                            if (encodeHighCo != null && (encodeHighCo.ccFps - obj.minAvgFps >= 0 && (encodeHighCo.ccStutterPerSecond - obj.maxStutterPerSecond <= 0 && encodeHighCo.ccCpuUsage - obj.maxProcessCpuUsage <= 0))) {
                               KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig return true");
                               _monitor_exit(tmLock);
                               return b;
                            }else {
                               KSClipLog.i("ClipkitEditorEncode", "isUseHighConfig return false");
                               _monitor_exit(tmLock);
                               return false;
                            }
                         }
                      }
                   }
                }
             }else {
                KSClipLog.w("ClipkitEditorEncode", "isUseHighConfig normalConfig is null");
             }
             b = 0;
             width = 0;
             goto label_007e ;
          }
       }
    }
    public final boolean isUseHighConfigCurNet(Context p0,EditorEncodeConfig$SupportHighEncodeConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditorEncodeConfigManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int networkState = NetworkUtils.getNetworkState(p0);
       p1 = p1.supportNetWork;
       String str = 1;
       if (networkState != 2) {
          if (networkState != 3 && networkState != 4) {
             if (networkState != 5) {
                if (networkState == 6 && (EditorEncodeConfigManager.HIGH_CONFIG_SUPPORT_NETWORK_5G & p1) > 0) {
                   return str;
                }
             }else if((EditorEncodeConfigManager.HIGH_CONFIG_SUPPORT_NETWORK_4G & p1) > 0){
                return str;
             }
          }else if((EditorEncodeConfigManager.HIGH_CONFIG_SUPPORT_NETWORK_2G & p1) > 0){
             return str;
          }
       }else if((EditorEncodeConfigManager.HIGH_CONFIG_SUPPORT_NETWORK_WIFI & p1) > 0){
          return str;
       }
       KSClipLog.i("ClipkitEditorEncode", "isUseHighConfigCurNet the current network type:"+networkState+",the value of supportNetWork:"+p1+",return false");
       return false;
    }
    public final void saveEncodeHighConfig(Context p0,EditorEncodeConfigManager$EncodeHighConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorEncodeConfigManager.class, "2")) {
          return;
       }
       g.b(this.getPreferences(p0).edit().putString("encodeHighConfig_1", ClipKitUtils.COMMON_GSON.q(p1)));
       return;
    }
    public final void setExportParamByVideoType(EditorEncodeConfigModule p0,int p1){
       EditorEncodeConfigManager uEditorEncod = EditorEncodeConfigManager.class;
       if (PatchProxy.isSupport(uEditorEncod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uEditorEncod, "14")) {
          return;
       }
       switch (p1){
           case 1:
           case 4:
           case 11:
           case 12:
           case 13:
             p0.exportParam = p0.exportVideoParams;
             break;
           case 2:
           case 6:
             p0.exportParam = p0.exportSinglePictureParams;
             break;
           case 3:
             p0.exportParam = p0.exportPhotoMovieParams;
             break;
           case 5:
             p0.exportParam = p0.exportMvParams;
             break;
           case 10:
             p0.exportParam = p0.exportWatermarkParams;
             break;
           default:
       }
       if (p0.exportParam == null) {
          KSClipLog.e("ClipkitEditorEncode", "setExportParamByVideoType exportParam is null,please check your videoType:"+p1);
       }
       return;
    }
    public void setIsUseLowConfig(int p0){
       this.mMiniAvgWriteOneFrame = p0;
    }
    public final void updateConfig(){
       if (PatchProxy.applyVoid(null, this, EditorEncodeConfigManager.class, "4")) {
          return;
       }
       ClipKitConfig config = ClipKitConfigManager.getInstance().getConfig();
       if (config != null) {
          this.mEditorEncodeConfig = config.getEditorEncodeConfig();
       }
       return;
    }
    public void updateQos(PreviewPlayerQosInfo p0,int p1){
       Object obj = this;
       Object obj1 = p0;
       EditorEncodeConfigManager uEditorEncod = EditorEncodeConfigManager.class;
       if (PatchProxy.isSupport(uEditorEncod) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, uEditorEncod, "8")) {
          return;
       }
       uEditorEncod = obj.mLock;
       _monitor_enter(uEditorEncod);
       if (obj1 != null && p0.getRealtimeStats().size() > 0) {
          EditorEncodeConfig$SupportHighEncodeConfig supportHighE = new EditorEncodeConfig$SupportHighEncodeConfig();
          long l = 0;
          int i = p0.getRealtimeStats().size();
          StringBuilder str = null;
          int i2 = 0;
          float f = 0;
          float f1 = 0;
          for (int i1 = 0; i1 < p0.getRealtimeStats().size(); i1 = i1 + 1) {
             PreviewPlayerRealtimeStatsInfo previewPlaye = p0.getRealtimeStats().get(i1);
             double d = (double)f + previewPlaye.getPlayFps();
             f = (float)d;
             i2 = i2 + previewPlaye.getStutterCount();
             l = l + (long)previewPlaye.getProcessMemorySize();
             f1 = f1 + (float)previewPlaye.getProcessCpuUsage();
          }
          if (!f - str) {
             _monitor_exit(uEditorEncod);
             return;
          }else {
             KSClipLog.v("ClipkitEditorEncode", "updateQos qosInfo:"+ClipKitUtils.COMMON_GSON.q(obj1));
             float f2 = (float)i;
             supportHighE.minAvgFps = f / f2;
             supportHighE.maxStutterPerSecond = ((float)i2 * 1000.00f) / (float)p1;
             supportHighE.maxProcessMemorySizeKb = l / (long)i;
             supportHighE.maxProcessCpuUsage = f1 / f2;
             if (obj.mHighConfigQueue.size() > 99) {
                obj.mHighConfigQueue.poll();
             }
             obj.mHighConfigQueue.offer(supportHighE);
          }
       }
       _monitor_exit(uEditorEncod);
       return;
    }
    public void updateQos(String p0,int p1){
       JSONArray jSONArray1;
       int i4;
       int i5;
       EditorEncodeConfigManager obj = this;
       Object obj1 = p0;
       EditorEncodeConfigManager uEditorEncod = EditorEncodeConfigManager.class;
       if (PatchProxy.isSupport(uEditorEncod) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, uEditorEncod, "9")) {
          return;
       }
       uEditorEncod = obj.mLock;
       _monitor_enter(uEditorEncod);
       if (obj1 == null) {
          _monitor_exit(uEditorEncod);
          return;
       }else {
          try{
             JSONArray jSONArray = new JSONObject(obj1).optJSONArray("editor_qos_stats");
             if (jSONArray == null || jSONArray.length() <= 0) {
                _monitor_exit(uEditorEncod);
                return;
             }else {
                EditorEncodeConfig$SupportHighEncodeConfig supportHighE = new EditorEncodeConfig$SupportHighEncodeConfig();
                long l = 0;
                int i = jSONArray.length();
                int i1 = 0;
                int i2 = 0;
                float f = 0;
                float f1 = 0;
                try{
                   while (i1 < jSONArray.length()) {
                      JSONObject jSONObject = jSONArray.optJSONObject(i1).optJSONObject("preview_player_realtime");
                      if (jSONObject == null) {
                         jSONArray1 = jSONArray;
                         i4 = i;
                         i5 = i1;
                      }else {
                         jSONArray1 = jSONArray;
                         i4 = i;
                         i5 = i1;
                         double d = (double)f + jSONObject.optDouble("play_fps");
                         f = (float)d;
                         i2 = i2 + jSONObject.optInt("stutter_count");
                         l = l + (long)jSONObject.optInt("process_memory_size_KB");
                         f1 = f1 + (float)jSONObject.optInt("process_cpu_usage");
                      }
                      i1 = i5 + 1;
                      i = i4;
                      jSONArray = jSONArray1;
                   }
                   i4 = i;
                   if (!f) {
                      _monitor_exit(uEditorEncod);
                      return;
                   }else {
                      KSClipLog.v("ClipkitEditorEncode", "updateQos qosInfo:"+ClipKitUtils.COMMON_GSON.q(obj1));
                      int i6 = i4;
                      float f2 = (float)i6;
                      supportHighE.minAvgFps = f / f2;
                      supportHighE.maxStutterPerSecond = ((float)i2 * 1000.00f) / (float)p1;
                      supportHighE.maxProcessMemorySizeKb = l / (long)i6;
                      supportHighE.maxProcessCpuUsage = f1 / f2;
                      obj = this;
                      if (obj.mHighConfigQueue.size() > 99) {
                         obj.mHighConfigQueue.poll();
                      }
                      obj.mHighConfigQueue.offer(supportHighE);
                   label_00ef :
                      _monitor_exit(uEditorEncod);
                      return;
                   }
                }catch(org.json.JSONException e0){
                   int i3 = this;
                }
                KSClipLog.e("ClipkitEditorEncode", "updateQos Error", e0);
                goto label_00ef ;
             }
          }catch(org.json.JSONException e0){
             goto label_00e8 ;
          }
       }
    }
}
