package com.kwai.video.clipkit.log.ClipEditPreviewLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import com.kwai.video.clipkit.KSClipLog;
import android.content.Context;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.util.Map;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.devicepersona.benchmark.BenchmarkDecoderResultItem$BenchmarkDecodeResultItem;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem$HardwareDecodeItem;
import com.kwai.video.editorsdk2.PreviewPlayerDetailedStats;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.kwai.video.editorsdk2.PreviewPlayerDecoderStats;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkConfigManager;
import com.kwai.video.devicepersona.benchmark.BenchmarkConfigs;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.devicepersona.hardware.HardwareConfigs;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import com.kwai.video.devicepersona.hardware.HardwareDecoder;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem;
import com.kwai.video.devicepersona.benchmark.BenchmarkCommonResult;
import com.kwai.video.devicepersona.benchmark.BenchmarkDecoderResult;
import com.kwai.video.devicepersona.benchmark.BenchmarkDecoderResultItem;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AndroidDecoderConfig;
import com.kwai.video.clipkit.hardware.HardwareUtils;
import org.json.JSONObject;
import com.kwai.video.clipkit.log.ClipEditLogger;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Boolean;
import com.kwai.video.clipkit.ClipKitUtils;
import org.json.JSONArray;
import java.lang.Throwable;

public class ClipEditPreviewLog extends ClipEditBaseLog	// class@001a91
{
    public boolean isFallback;
    public Context mContext;
    public EditorSdk2$EditorSdkError mError;
    public ClipEditExtraInfo mExtraInfo;
    public long mFristFrameCost;
    public PreviewPlayer mPlayer;
    public EditorSdk2V2$VideoEditorProject mProject;
    public Map mStatsMap;

    static {
       KSClipLog.i("ksclipkit", "xbuild_"+System.currentTimeMillis());
    }
    public void ClipEditPreviewLog(Context p0,long p1,PreviewPlayer p2,EditorSdk2V2$VideoEditorProject p3,ClipEditExtraInfo p4){
       super();
       this.mContext = p0.getApplicationContext();
       this.mFristFrameCost = p1;
       this.mPlayer = p2;
       this.mProject = p3;
       this.mExtraInfo = p4;
    }
    public void ClipEditPreviewLog(Context p0,long p1,Map p2,EditorSdk2$EditorSdkError p3,EditorSdk2V2$VideoEditorProject p4,ClipEditExtraInfo p5){
       super();
       this.mContext = p0.getApplicationContext();
       this.mFristFrameCost = p1;
       this.mStatsMap = p2;
       this.mError = p3;
       this.mProject = p4;
       this.mExtraInfo = p5;
    }
    public final int getMaxLongEdgeFromDecodeItem(BenchmarkDecoderResultItem$BenchmarkDecodeResultItem p0){
       HardwareDecoderItem$HardwareDecodeItem maxLongEdge = (p0 != null)? p0.maxLongEdge: 0;
       return maxLongEdge;
    }
    public int getSoftReason(PreviewPlayerDetailedStats p0){
       HardwareDecoderItem mcsItem;
       BenchmarkDecoderResult avcDecoder;
       BenchmarkDecoderResultItem mcsItem1;
       HardwareDecoderItem mcbbItem;
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipEditPreviewLog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null && (p0.getDecoderStats() != null && (p0.getDecoderStats().size() && (TextUtils.isEmpty(p0.getDecoderStats().get(0).getDecoderType()) || (p0.getDecoderStats().get(0).getDecoderType()).startsWith("HW"))))) {
          return 0;
       }
       boolean b = (p0.getDecoderStats().get(0).getDecoderType()).contains("265");
       int i = 1;
       if (ClipKitConfigManager.getInstance().getConfig() == null && DPBenchmarkConfigManager.getInstance().getClientBenchmarkConfig() == null) {
          return i;
       }
       BenchmarkConfigs benchmarkCon = DPBenchmarkConfigManager.getInstance().getBenchmarkConfigs();
       if (benchmarkCon == null || !benchmarkCon.enableAutoBenchmarkDecode()) {
          return 2;
       }
       if (ClipDPHardwareConfigManager.getInstance().getHardwareConfigs() != null && ClipDPHardwareConfigManager.getInstance().getHardwareConfigs().getHardwareDecoder() != null) {
          HardwareDecoder hardwareDeco = ClipDPHardwareConfigManager.getInstance().getHardwareConfigs().getHardwareDecoder();
          if (!b) {
             hardwareDeco = hardwareDeco.avcDecoder;
             if (hardwareDeco != null) {
                mcsItem = hardwareDeco.mcsItem;
                if (mcsItem == null || mcsItem.maxLongEdge <= null) {
                   mcbbItem = hardwareDeco.mcbbItem;
                   if (mcbbItem == null || mcbbItem.maxLongEdge <= null) {
                   label_00e0 :
                      if (i) {
                         return 3;
                      }
                   }
                }
             }
          }else {
             hardwareDeco = hardwareDeco.hevcDecoder;
             if (hardwareDeco != null) {
                mcsItem = hardwareDeco.mcsItem;
                if (mcsItem == null || mcsItem.maxLongEdge <= null) {
                   mcbbItem = hardwareDeco.mcbbItem;
                   if (mcbbItem == null || mcbbItem.maxLongEdge <= null) {
                   }
                }
             }
          }
          i = 0;
          goto label_00e0 ;
       }
    label_00e4 :
       BenchmarkCommonResult benchmarkRes = DPBenchmarkConfigManager.getInstance().getBenchmarkResult();
       if (benchmarkRes == null) {
          return 4;
       }else if(DPBenchmarkConfigManager.getInstance().isReachMaxFailedCount()){
          return 5;
       }else {
          BenchmarkCommonResult benchmarkDec = benchmarkRes.benchmarkDecoder;
          if (benchmarkDec == null) {
             return 6;
          }else if(!b){
             avcDecoder = benchmarkDec.avcDecoder;
             if (avcDecoder != null) {
                mcsItem1 = avcDecoder.mcsItem;
                if (mcsItem1 != null || avcDecoder.mcbbItem != null) {
                   if (avcDecoder != null && (this.getMaxLongEdgeFromDecodeItem(mcsItem1) <= 0 && this.getMaxLongEdgeFromDecodeItem(benchmarkRes.benchmarkDecoder.avcDecoder.mcbbItem) <= 0)) {
                      return 5;
                   }
                }
             }
             return 6;
          }else {
             avcDecoder = benchmarkDec.hevcDecoder;
             if (avcDecoder != null) {
                mcsItem1 = avcDecoder.mcsItem;
                if (mcsItem1 != null || avcDecoder.mcbbItem != null) {
                   if (avcDecoder != null && (this.getMaxLongEdgeFromDecodeItem(mcsItem1) <= 0 && this.getMaxLongEdgeFromDecodeItem(benchmarkRes.benchmarkDecoder.hevcDecoder.mcbbItem) <= 0)) {
                      return 5;
                   }
                }
             }
             return 6;
          }
       label_0149 :
          if (this.isFallback != null) {
             return 8;
          }else {
             EditorSdk2$AndroidDecoderConfig androidDecod = ClipDPHardwareConfigManager.getInstance().getAndroidDecodeConfig();
             ClipEditPreviewLog tmProject = this.mProject;
             if (tmProject != null && !HardwareUtils.isAllTrackSupportMediaCodec(tmProject, androidDecod)) {
                return 7;
             }else {
                return 0;
             }
          }
       }
    }
    public String toJson(){
       boolean intExtra;
       ClipEditPreviewLog tmError;
       String str = "status";
       JSONObject obj = PatchProxy.apply(null, this, ClipEditPreviewLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          ClipEditPreviewLog tmProject = this.mProject;
          if (tmProject != null) {
             ClipEditLogger.addProjectJsonObject(obj, tmProject);
          }
          JSONObject jSONObject = new JSONObject();
          this.toJsonBase(obj);
          obj.put(str, jSONObject);
          ClipEditPreviewLog tmContext = this.mContext;
          if (tmContext != null) {
             Intent intent = UniversalReceiver.e(tmContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
             if (intent != null) {
                int i = -1;
                jSONObject.put("battery_level", ((intent.getIntExtra("level", i) * 100) / intent.getIntExtra("scale", i)));
                intExtra = intent.getIntExtra(str, i);
                intExtra = (intExtra == 2 || intExtra == 5)? true: false;
                jSONObject.put("is_charging", Boolean.valueOf(intExtra));
             }
          }
          String str1 = "qos";
          if (this.mStatsMap != null) {
             obj.put(str1, new JSONObject(this.mStatsMap));
          }else {
             tmError = this.mPlayer;
             if (tmError != null) {
                PreviewPlayerDetailedStats previewPlaye = tmError.consumeDetailedStats();
                if (previewPlaye != null) {
                   obj.put(str1, new JSONObject(previewPlaye.serializeToMap()));
                }
                intExtra = this.getSoftReason(previewPlaye);
                if (intExtra) {
                   jSONObject.put("swReason", intExtra);
                }
             }
          }
          obj.getJSONObject(str1).put("device_personal_preview_limits", ClipKitUtils.isPreviewSizeLimitationConfigAvaiable());
          if (this.mContext != null) {
             jSONObject.put("lowDevice", ClipKitConfigManager.getInstance().isLowDevice(this.mContext));
          }
          jSONObject.put("firstFrameRenderTimeCost", this.mFristFrameCost);
          tmError = this.mError;
          if (tmError == null) {
             tmContext = this.mPlayer;
             if (tmContext != null && tmContext.getError() != null) {
                tmError = this.mPlayer.getError();
             }
          }
          if (tmError != null) {
             jSONObject.put("errorCode", tmError.code());
             jSONObject.put("errorType", tmError.type());
             jSONObject.put("errorMsg", tmError.message());
          }
          tmError = this.mExtraInfo;
          if (tmError != null) {
             tmError.assetInfoArray = ClipEditExtraInfo.addTemplateJsonObject(this.mProject);
             obj.put("extraInfo", this.mExtraInfo.toJsonObject());
          }
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditPreviewLog", "to Json Error", e0);
          return null;
       }
    }
}
