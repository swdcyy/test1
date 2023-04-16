package com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager$Holder;
import android.content.Context;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import oe6.o;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$FallbackDecodeConfig;
import java.util.HashMap;
import android.content.SharedPreferences$Editor;
import com.kwai.video.clipkit.ClipKitUtils;
import com.google.gson.Gson;
import oe6.g;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AndroidDecoderConfig;
import com.kwai.video.devicepersona.config.DeviceConfigManager;
import com.kwai.video.devicepersona.config.DevicePersonaConfig;
import com.kwai.video.devicepersona.hardware.HardwareConfigs;
import com.kwai.video.devicepersona.hardware.HardwareDecoder;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem$HardwareDecodeItem;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkConfigManager;
import com.kwai.video.devicepersona.benchmark.BenchmarkCommonResult;
import com.kwai.video.devicepersona.benchmark.BenchmarkConfigs;
import com.kwai.video.devicepersona.benchmark.BenchmarkDecoderResult;
import com.kwai.video.devicepersona.benchmark.BenchmarkDecoderResultItem;
import com.kwai.video.editorsdk2.model.ModelBase;
import java.nio.charset.Charset;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EditDecoderConfig;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$SingleSrcTypeDecoderConfig;
import com.kwai.video.clipkit.hardware.KwaiplayerDecoderConfig;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$DecoderMax;
import com.kwai.video.devicepersona.hardware.HardwareEncoder;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncoderResult;
import com.kwai.video.devicepersona.hardware.HardwareEncoderItem;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import java.lang.Float;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EncodeResult;
import com.kwai.video.devicepersona.strategy.DeviceStrategyConfigs$Common;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.devicepersona.strategy.DeviceStrategyConfigs;
import com.kwai.video.editorsdk2.EditorSdk2Utils$VersionComparisonResult;
import java.lang.Enum;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager$1;
import java.lang.reflect.Type;
import el.a;

public class ClipDPHardwareConfigManager extends DPHardwareConfigManager	// class@001a83
{
    public AtomicBoolean mEnableAutoFallBack;
    public HashMap mFallbackDecodeConfigMap;
    public int mMinHWDecodeShortEdge;
    public static int CLOSE_HARDWARE_CONFIG = 254;

    public void ClipDPHardwareConfigManager(){
       super();
       this.mEnableAutoFallBack = new AtomicBoolean(false);
       this.mMinHWDecodeShortEdge = 0;
    }
    public static ClipDPHardwareConfigManager getInstance(){
       return ClipDPHardwareConfigManager$Holder.sManager;
    }
    private SharedPreferences getPreferences(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipDPHardwareConfigManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.c(p0, "hardware_config", 4);
    }
    public final void addFallbackDecodeConfig(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ClipDPHardwareConfigManager.class, "6")) {
          return;
       }
       int i = 0;
       while (i < p1.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = p1.trackAssets(i);
          if (!TextUtils.isEmpty(trackAsset.assetPath())) {
             DPHardwareConfigManager$FallbackDecodeConfig uFallbackDec = new DPHardwareConfigManager$FallbackDecodeConfig();
             uFallbackDec.cvdType = p2;
             uFallbackDec.tvdType = p2;
             this.mFallbackDecodeConfigMap.put(trackAsset.assetPath(), uFallbackDec);
          }
          i = i + 1;
       }
       this.resetDecoderConfig(p1);
       g.a(this.getPreferences(p0).edit().putString("SwDecoderPath", ClipKitUtils.COMMON_GSON.q(this.mFallbackDecodeConfigMap)));
       return;
    }
    public final boolean enableAutoFallback(){
       Object obj = PatchProxy.apply(null, this, ClipDPHardwareConfigManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mEnableAutoFallBack.get();
    }
    public boolean fallBackDecoderConfig(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2){
       if (PatchProxy.isSupport(ClipDPHardwareConfigManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipDPHardwareConfigManager.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.enableAutoFallback()) {
          return false;
       }else {
          KSClipLog.i("ClipDPHardware", "fallBackDecoderConfig,errorCode:"+p2);
          if (p2 <= -11002 && (p2 >= -11017 && p2 != -11014)) {
             this.addFallbackDecodeConfig(p0.getApplicationContext(), p1, "sw");
             return true;
          }else if(p2 == -11014){
             this.addFallbackDecodeConfig(p0.getApplicationContext(), p1, "mcbb");
             return true;
          }else {
             return false;
          }
       }
    }
    public EditorSdk2$AndroidDecoderConfig getAndroidDecodeConfig(){
       Object obj = PatchProxy.apply(null, this, ClipDPHardwareConfigManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getAndroidDecodeConfig(false);
    }
    public EditorSdk2$AndroidDecoderConfig getAndroidDecodeConfig(boolean p0){
       DPHardwareConfigManager obj;
       HardwareConfigs hardwareConf;
       String str;
       String str1;
       HardwareDecoderItem$HardwareDecodeItem hardwareDeco1;
       HardwareDecoderItem$HardwareDecodeItem hardwareDeco2;
       HardwareDecoderItem$HardwareDecodeItem maxLongEdge;
       HardwareDecoderItem$HardwareDecodeItem maxLongEdge1;
       ClipDPHardwareConfigManager uClipDPHardw = ClipDPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uClipDPHardw)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uClipDPHardw, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mLock;
       _monitor_enter(obj);
       EditorSdk2$AndroidDecoderConfig uAndroidDeco = new EditorSdk2$AndroidDecoderConfig();
       try{
          int i = 0;
          DevicePersonaConfig config = DeviceConfigManager.getInstance().getConfig();
          if (config != null) {
             hardwareConf = config.getHardwareConfigs();
          }
          if (this.openHwDecodeStrategyOpt()) {
             KSClipLog.i("ClipDPHardware", "getAndroidDecodeConfig by Opt Strategy");
             this.getAndroidDecodeConfigByOptStrategy(uAndroidDeco);
          }else {
             HardwareDecoderItem$HardwareDecodeItem hardwareDeco = null;
             if (hardwareConf == null || hardwareConf.getHardwareDecoder() == null) {
                KSClipLog.i("ClipDPHardware", "getAndroidDecodeConfig hardwareConfigs empty");
                str = null;
                str1 = null;
                hardwareDeco1 = null;
             label_0128 :
                hardwareDeco2 = null;
             }else {
                KSClipLog.i("ClipDPHardware", "getAndroidDecodeConfig by Default");
                if (hardwareConf.getHardwareDecoder().avcDecoder != null) {
                   HardwareDecoder avcDecoder1 = hardwareConf.getHardwareDecoder().avcDecoder;
                   HardwareDecoderItem mcbbItem2 = avcDecoder1.mcbbItem;
                   if (mcbbItem2 != null) {
                      hardwareDeco1 = mcbbItem2.maxLongEdge;
                      if (hardwareDeco1 > null) {
                         uAndroidDeco.setTvdType(this.getDecodeConfigByEdge("mcbb", hardwareDeco1));
                         uAndroidDeco.setCvdType(this.getDecodeConfigByEdge("mcbb", avcDecoder1.mcbbItem.maxLongEdge));
                      }else if(hardwareDeco1 < null){
                         uAndroidDeco.setTvdType("sw");
                         uAndroidDeco.setCvdType("sw");
                      }
                   }else {
                      hardwareDeco1 = null;
                   }
                   HardwareDecoderItem mcsItem1 = avcDecoder1.mcsItem;
                   if (mcsItem1 != null) {
                      maxLongEdge1 = mcsItem1.maxLongEdge;
                      if (maxLongEdge1 < null) {
                         if (TextUtils.isEmpty(uAndroidDeco.tvdType())) {
                            uAndroidDeco.setTvdType("sw");
                         }
                      }else if(maxLongEdge1 > null && maxLongEdge1 > hardwareDeco1){
                         uAndroidDeco.setTvdType(this.getDecodeConfigByEdge("mcs", maxLongEdge1));
                      }
                   }else {
                      str1 = null;
                   }
                }else {
                   str1 = null;
                   hardwareDeco1 = null;
                }
             label_00b9 :
                if (hardwareConf.getHardwareDecoder().hevcDecoder != null) {
                   HardwareDecoder hevcDecoder1 = hardwareConf.getHardwareDecoder().hevcDecoder;
                   HardwareDecoderItem mcbbItem3 = hevcDecoder1.mcbbItem;
                   if (mcbbItem3 != null) {
                      hardwareDeco2 = mcbbItem3.maxLongEdge;
                      if (hardwareDeco2 > null) {
                         uAndroidDeco.setTvdTypeHevc(this.getDecodeConfigByEdge("mcbb", hardwareDeco2));
                         uAndroidDeco.setCvdTypeHevc(this.getDecodeConfigByEdge("mcbb", hevcDecoder1.mcbbItem.maxLongEdge));
                      }else if(hardwareDeco2 < null){
                         uAndroidDeco.setTvdTypeHevc("sw");
                         uAndroidDeco.setCvdTypeHevc("sw");
                      }
                   }else {
                      hardwareDeco2 = null;
                   }
                   HardwareDecoderItem mcsItem2 = hevcDecoder1.mcsItem;
                   if (mcsItem2 != null) {
                      str = mcsItem2.maxLongEdge;
                      if (str < null) {
                         if (TextUtils.isEmpty(uAndroidDeco.tvdType())) {
                            uAndroidDeco.setTvdTypeHevc("sw");
                         }
                      }else if(str > null && str > hardwareDeco2){
                         uAndroidDeco.setTvdTypeHevc(this.getDecodeConfigByEdge("mcs", str));
                      }
                   }else {
                      str = null;
                   }
                }else {
                   str = null;
                   goto label_0128 ;
                }
             }
          label_0129 :
             BenchmarkCommonResult benchmarkRes = DPBenchmarkConfigManager.getInstance().getBenchmarkResult();
             BenchmarkConfigs benchmarkCon = DPBenchmarkConfigManager.getInstance().getBenchmarkConfigs();
             if (benchmarkRes != null && (benchmarkRes.benchmarkDecoder != null && (benchmarkCon != null && benchmarkCon.enableAutoBenchmarkDecode()))) {
                BenchmarkDecoderResult avcDecoder = benchmarkRes.benchmarkDecoder.avcDecoder;
                if (avcDecoder != null) {
                   BenchmarkDecoderResultItem mcbbItem = avcDecoder.mcbbItem;
                   if (mcbbItem != null) {
                      maxLongEdge = mcbbItem.maxLongEdge;
                      if (maxLongEdge > hardwareDeco1) {
                         uAndroidDeco.setTvdType(this.getDecodeConfigByEdge("mcbb", maxLongEdge));
                         uAndroidDeco.setCvdType(this.getDecodeConfigByEdge("mcbb", benchmarkRes.benchmarkDecoder.avcDecoder.mcbbItem.maxLongEdge));
                      }else if(maxLongEdge < null){
                         if (TextUtils.isEmpty(uAndroidDeco.tvdType())) {
                            uAndroidDeco.setTvdType("sw");
                         }
                         if (TextUtils.isEmpty(uAndroidDeco.cvdType())) {
                            uAndroidDeco.setCvdType("sw");
                         }
                      }
                   }else {
                      maxLongEdge = null;
                   }
                   BenchmarkDecoderResultItem mcsItem = benchmarkRes.benchmarkDecoder.avcDecoder.mcsItem;
                   if (mcsItem != null) {
                      hardwareDeco1 = mcsItem.maxLongEdge;
                      if (hardwareDeco1 < null) {
                         if (TextUtils.isEmpty(uAndroidDeco.tvdType())) {
                            uAndroidDeco.setTvdType("sw");
                         }
                      }else if(hardwareDeco1 > null && (hardwareDeco1 > maxLongEdge && hardwareDeco1 > str1)){
                         uAndroidDeco.setTvdType(this.getDecodeConfigByEdge("mcs", hardwareDeco1));
                      }
                   }
                }
             label_01bd :
                BenchmarkDecoderResult hevcDecoder = benchmarkRes.benchmarkDecoder.hevcDecoder;
                if (hevcDecoder != null) {
                   BenchmarkDecoderResultItem mcbbItem1 = hevcDecoder.mcbbItem;
                   if (mcbbItem1 != null) {
                      hardwareDeco = mcbbItem1.maxLongEdge;
                      if (hardwareDeco > hardwareDeco2) {
                         uAndroidDeco.setTvdTypeHevc(this.getDecodeConfigByEdge("mcbb", hardwareDeco));
                         uAndroidDeco.setCvdTypeHevc(this.getDecodeConfigByEdge("mcbb", benchmarkRes.benchmarkDecoder.hevcDecoder.mcbbItem.maxLongEdge));
                      }else if(hardwareDeco < null){
                         if (TextUtils.isEmpty(uAndroidDeco.tvdTypeHevc())) {
                            uAndroidDeco.setTvdTypeHevc("sw");
                         }
                         if (TextUtils.isEmpty(uAndroidDeco.cvdTypeHevc())) {
                            uAndroidDeco.setCvdTypeHevc("sw");
                         }
                      }
                   }
                   mcbbItem1 = benchmarkRes.benchmarkDecoder.hevcDecoder.mcsItem;
                   if (mcbbItem1 != null) {
                      maxLongEdge1 = mcbbItem1.maxLongEdge;
                      if (maxLongEdge1 < null) {
                         if (TextUtils.isEmpty(uAndroidDeco.tvdTypeHevc())) {
                            uAndroidDeco.setTvdTypeHevc("sw");
                         }
                      }else if(maxLongEdge1 > null && (maxLongEdge1 > hardwareDeco && maxLongEdge1 > str)){
                         uAndroidDeco.setTvdTypeHevc(this.getDecodeConfigByEdge("mcs", maxLongEdge1));
                      }
                   }
                }
             }
          }
       label_0231 :
          if (TextUtils.isEmpty(uAndroidDeco.cvdType()) && TextUtils.isEmpty(uAndroidDeco.tvdType())) {
             if (!p0) {
                uAndroidDeco.setTvdType("sw");
                uAndroidDeco.setCvdType("sw");
                uAndroidDeco.setTvdTypeHevc("sw");
                uAndroidDeco.setCvdTypeHevc("sw");
                _monitor_exit(obj);
                return uAndroidDeco;
             }else {
                uAndroidDeco.setTvdType("mcbb");
                uAndroidDeco.setCvdType("mcbb");
                uAndroidDeco.setCvdCacheOn("false");
             }
          }
          KSClipLog.d("ClipDPHardware", "forceHw:"+p0+"£¬androidDecoderConfig:"+new String(uAndroidDeco.toByteArray(), Charset.forName("UTF-8")));
       }catch(java.lang.Exception e0){
          KSClipLog.e("ClipDPHardware", "forceHw:"+p0+"£¬androidDecoderConfig crash return sw");
          uAndroidDeco.setTvdType("mcs");
          uAndroidDeco.setCvdType("mcbb");
          uAndroidDeco.setCvdCacheOn("false");
       }
       _monitor_exit(e0);
       return uAndroidDeco;
    }
    public void getAndroidDecodeConfigByOptStrategy(EditorSdk2$AndroidDecoderConfig p0){
       DPHardwareConfigManager tmHardwareCo;
       HardwareConfigs hardwareDeco;
       HardwareDecoder avcDecoder;
       DPHardwareConfigManager$SingleSrcTypeDecoderConfig mcbbMaxLongE;
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipDPHardwareConfigManager.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       DPHardwareConfigManager$EditDecoderConfig editDecoderC = this.getEditDecoderConfig();
       if (editDecoderC != null) {
          this.mMinHWDecodeShortEdge = editDecoderC.minHwShortEdge;
          DPHardwareConfigManager$EditDecoderConfig avc = editDecoderC.avc;
          if (avc != null) {
             if ("sw".equals(avc.suggestDecodeType)) {
                p0.setTvdType("sw");
                p0.setCvdType("sw");
             }else if("mcbb".equals(editDecoderC.avc.suggestDecodeType)){
                p0.setTvdType(this.getDecodeConfigByEdge("mcbb", editDecoderC.avc.tryMaxLongEdge));
             }else if("mcs".equals(editDecoderC.avc.suggestDecodeType)){
                p0.setTvdType(this.getDecodeConfigByEdge("mcs", editDecoderC.avc.tryMaxLongEdge));
             }
             mcbbMaxLongE = editDecoderC.avc.mcbbMaxLongEdge;
             if (mcbbMaxLongE > null) {
                p0.setCvdType(this.getDecodeConfigByEdge("mcbb", mcbbMaxLongE));
             }else {
                p0.setCvdType("sw");
             }
             tmHardwareCo = this.mHardwareConfigs;
             if (tmHardwareCo != null) {
                hardwareDeco = tmHardwareCo.hardwareDecoder;
                if (hardwareDeco != null) {
                   avcDecoder = hardwareDeco.avcDecoder;
                   if (avcDecoder != null) {
                      if ("sw".equals(avcDecoder.cvdType)) {
                         p0.setCvdType("sw");
                      }else if("mcs".equals(this.mHardwareConfigs.hardwareDecoder.avcDecoder.cvdType)){
                         p0.setCvdType(this.getDecodeConfigByEdge("mcs", editDecoderC.avc.mcsMaxLongEdge));
                      }else if("mcbb".equals(this.mHardwareConfigs.hardwareDecoder.avcDecoder.cvdType)){
                         p0.setCvdType(this.getDecodeConfigByEdge("mcbb", editDecoderC.avc.mcbbMaxLongEdge));
                      }
                   }
                }
             }
          }
       label_00b8 :
          avc = editDecoderC.hevc;
          if (avc != null) {
             if ("sw".equals(avc.suggestDecodeType)) {
                p0.setTvdTypeHevc("sw");
                p0.setCvdTypeHevc("sw");
             }else if("mcbb".equals(editDecoderC.hevc.suggestDecodeType)){
                p0.setTvdTypeHevc(this.getDecodeConfigByEdge("mcbb", editDecoderC.hevc.tryMaxLongEdge));
             }else if("mcs".equals(editDecoderC.hevc.suggestDecodeType)){
                p0.setTvdTypeHevc(this.getDecodeConfigByEdge("mcs", editDecoderC.hevc.tryMaxLongEdge));
             }
             mcbbMaxLongE = editDecoderC.hevc.mcbbMaxLongEdge;
             if (mcbbMaxLongE > null) {
                p0.setCvdTypeHevc(this.getDecodeConfigByEdge("mcbb", mcbbMaxLongE));
             }else {
                p0.setCvdTypeHevc("sw");
             }
             tmHardwareCo = this.mHardwareConfigs;
             if (tmHardwareCo != null) {
                hardwareDeco = tmHardwareCo.hardwareDecoder;
                if (hardwareDeco != null) {
                   avcDecoder = hardwareDeco.hevcDecoder;
                   if (avcDecoder != null) {
                      if ("sw".equals(avcDecoder.cvdType)) {
                         p0.setCvdTypeHevc("sw");
                      }else if("mcs".equals(this.mHardwareConfigs.hardwareDecoder.hevcDecoder.cvdType)){
                         p0.setCvdTypeHevc(this.getDecodeConfigByEdge("mcs", editDecoderC.hevc.mcsMaxLongEdge));
                      }else if("mcbb".equals(this.mHardwareConfigs.hardwareDecoder.hevcDecoder.cvdType)){
                         p0.setCvdTypeHevc(this.getDecodeConfigByEdge("mcbb", editDecoderC.hevc.mcbbMaxLongEdge));
                      }
                   }
                }
             }
          }
       }
    label_0152 :
       return;
    }
    public String getDecodeConfigByEdge(String p0,int p1){
       ClipDPHardwareConfigManager uClipDPHardw = ClipDPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uClipDPHardw)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClipDPHardw, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p1 = (p1 / 16) * 9;
       if (p1 < this.mMinHWDecodeShortEdge) {
          return "sw";
       }else {
          return p0+"_max_"+p1+"_min_"+this.mMinHWDecodeShortEdge;
       }
    }
    public KwaiplayerDecoderConfig getKwaiplayerDecoderConfig(){
       DPHardwareConfigManager$DecoderMax obj = PatchProxy.apply(null, this, ClipDPHardwareConfigManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       DPHardwareConfigManager$DecoderMax maxDecodeNum = this.getMaxDecodeNumEdge("mcs", b);
       DPHardwareConfigManager$DecoderMax maxDecodeNum1 = this.getMaxDecodeNumEdge("mcbb", b);
       obj = this.getMaxDecodeNumEdge("mcs", false);
       DPHardwareConfigManager$DecoderMax maxDecodeNum2 = this.getMaxDecodeNumEdge("mcbb", false);
       KwaiplayerDecoderConfig kwaiplayerDe = new KwaiplayerDecoderConfig();
       int i = this.findMin(maxDecodeNum.maxNum, obj.maxNum);
       int i1 = this.findMin(maxDecodeNum1.maxNum, maxDecodeNum2.maxNum);
       if (i >= i1) {
          kwaiplayerDe.useMediaCodecByteBuffer = false;
          kwaiplayerDe.mediaCodecMaxNum = i;
          maxDecodeNum = maxDecodeNum.maxLongEdge;
          kwaiplayerDe.mediaCodecAvcHeightLimit = maxDecodeNum;
          kwaiplayerDe.mediaCodecAvcWidthLimit = this.findWidth(maxDecodeNum);
          obj = obj.maxLongEdge;
          kwaiplayerDe.mediaCodecHevcHeightLimit = obj;
          kwaiplayerDe.mediaCodecHevcWidthLimit = this.findWidth(obj);
       }else {
          kwaiplayerDe.useMediaCodecByteBuffer = b;
          kwaiplayerDe.mediaCodecMaxNum = i1;
          obj = maxDecodeNum1.maxLongEdge;
          kwaiplayerDe.mediaCodecAvcHeightLimit = obj;
          kwaiplayerDe.mediaCodecAvcWidthLimit = this.findWidth(obj);
          obj = maxDecodeNum2.maxLongEdge;
          kwaiplayerDe.mediaCodecHevcHeightLimit = obj;
          kwaiplayerDe.mediaCodecHevcWidthLimit = this.findWidth(obj);
       }
       KwaiplayerDecoderConfig mediaCodecAv = kwaiplayerDe.mediaCodecAvcHeightLimit;
       if (mediaCodecAv > null) {
          kwaiplayerDe.supportAvcMediaCodec = b;
          if (mediaCodecAv == 960) {
             kwaiplayerDe.mediaCodecAvcWidthLimit = 576;
             kwaiplayerDe.mediaCodecAvcHeightLimit = 1024;
          }
       }
       mediaCodecAv = kwaiplayerDe.mediaCodecHevcHeightLimit;
       if (mediaCodecAv > null) {
          kwaiplayerDe.supportHevcMediaCodec = b;
          if (mediaCodecAv == 960) {
             kwaiplayerDe.mediaCodecHevcWidthLimit = 576;
             kwaiplayerDe.mediaCodecHevcHeightLimit = 1024;
          }
       }
       KSClipLog.d("ClipDPHardware", "kwaiplayerDecoderConfig:"+ClipKitUtils.COMMON_GSON.q(kwaiplayerDe));
       return kwaiplayerDe;
    }
    public boolean isEncodeFallbackErrorCode(int p0){
       boolean b = (p0 <= -10001 && (p0 >= -10013 && (p0 != -10011 && p0 != -10012)))? true: false;
       return b;
    }
    public boolean isSupportCape(Context p0,int p1,boolean p2){
       DPHardwareConfigManager tmHardwareCo;
       HardwareConfigs hardwareEnco1;
       HardwareEncoder avc1920;
       BenchmarkCommonResult benchmarkEnc;
       if (PatchProxy.isSupport(ClipDPHardwareConfigManager.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, ClipDPHardwareConfigManager.class, "19");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = false;
       if (!p2) {
          KSClipLog.d("ClipDPHardware", "isSupportCape,not support hw,return false");
          return b;
       }else {
          HardwareEncoderItem hardwareEnco = null;
          BenchmarkCommonResult benchmarkRes = DPBenchmarkConfigManager.getInstance().getBenchmarkResult();
          if (p1 > 1920) {
             KSClipLog.e("ClipDPHardware", "isSupportCape,maxEdge>1920,return false");
             return b;
          }else if(p1 > 1280){
             tmHardwareCo = this.mHardwareConfigs;
             if (tmHardwareCo != null) {
                hardwareEnco1 = tmHardwareCo.hardwareEncoder;
                if (hardwareEnco1 != null) {
                   avc1920 = hardwareEnco1.avc1920;
                   if (avc1920 != null) {
                   label_0053 :
                      hardwareEnco = avc1920;
                   }
                }
             }
             if (benchmarkRes != null) {
                benchmarkEnc = benchmarkRes.benchmarkEncoder;
                if (benchmarkEnc != null) {
                   avc1920 = benchmarkEnc.avc1920;
                   if (avc1920 != null) {
                      goto label_0053 ;
                   }
                }
             }
          }else if(p1 > 960){
             tmHardwareCo = this.mHardwareConfigs;
             if (tmHardwareCo != null) {
                hardwareEnco1 = tmHardwareCo.hardwareEncoder;
                if (hardwareEnco1 != null) {
                   avc1920 = hardwareEnco1.avc1280;
                   if (avc1920 != null) {
                      goto label_0053 ;
                   }
                }
             }
             if (benchmarkRes != null) {
                benchmarkEnc = benchmarkRes.benchmarkEncoder;
                if (benchmarkEnc != null) {
                   avc1920 = benchmarkEnc.avc1280;
                   if (avc1920 != null) {
                      goto label_0053 ;
                   }
                }
             }
          }else {
             tmHardwareCo = this.mHardwareConfigs;
             if (tmHardwareCo != null) {
                hardwareEnco1 = tmHardwareCo.hardwareEncoder;
                if (hardwareEnco1 != null) {
                   avc1920 = hardwareEnco1.avc960;
                   if (avc1920 != null) {
                      goto label_0053 ;
                   }
                }
             }
             if (benchmarkRes != null) {
                benchmarkEnc = benchmarkRes.benchmarkEncoder;
                if (benchmarkEnc != null) {
                   avc1920 = benchmarkEnc.avc960;
                   if (avc1920 != null) {
                      goto label_0053 ;
                   }
                }
             }
          }
       label_0094 :
          if (hardwareEnco != null && hardwareEnco.encodeProfile >= BenchmarkEncodeProfile.HIGH.getValue()) {
             b = true;
          }
          KSClipLog.d("ClipDPHardware", "isSupportCape,return:"+b);
          return b;
       }
    }
    public boolean isSupportEncode(Context p0,int p1){
       ClipDPHardwareConfigManager uClipDPHardw = ClipDPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uClipDPHardw)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClipDPHardw, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isSupportEncode(p0, p1, 0x3f000000, true, BenchmarkEncodeProfile.MAIN);
    }
    public boolean isSupportEncode(Context p0,int p1,float p2,boolean p3,BenchmarkEncodeProfile p4){
       ClipDPHardwareConfigManager uClipDPHardw = ClipDPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uClipDPHardw)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Float.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uClipDPHardw, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isSupportEncode(p0, "avc", p1, p2, p3, p4, 2);
    }
    public boolean isSupportEncode(Context p0,String p1,int p2,float p3,boolean p4,BenchmarkEncodeProfile p5,int p6){
       ClipDPHardwareConfigManager uClipDPHardw = ClipDPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uClipDPHardw)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Float.valueOf(p3),Boolean.valueOf(p4),p5,Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, this, uClipDPHardw, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isSupportEncodeWithResult(p0, p1, p2, p3, p4, p5, p6).isSupport;
    }
    public boolean isUseDecodeConfigs(){
       DeviceStrategyConfigs$Common obj = PatchProxy.apply(null, this, ClipDPHardwareConfigManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.updateConfig();
       obj = DeviceConfigManager.getInstance().getCommonStrategyConfig();
       String str = "ClipDPHardware";
       boolean b = false;
       int i = 1;
       if (obj != null) {
          DeviceStrategyConfigs$Common useCodecConf = obj.useCodecConfig;
          if (useCodecConf >= null) {
             if ((useCodecConf & i) > 0) {
                b = true;
             }
             KSClipLog.i(str, "isUseDecodeConfigs strategyConfigs.useCodecConfig is "+obj.useCodecConfig+" return "+b);
             return b;
          }
       }
       DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
       if (tmHardwareCo == null || tmHardwareCo.hardwareDecoder == null) {
          StringBuilder str1 = "isUseDecodeConfigs mHardwareConfigs is null: ";
          if (this.mHardwareConfigs != null) {
             i = false;
          }
          KSClipLog.w(str, str1+i+" mHardwareConfigs.hardwareDecoder is null: true");
          return b;
       }else {
          KSClipLog.i(str, "isUseDecodeConfigs mHardwareConfigs.hardwareDecoder.autoTestDecodeVersion is "+this.mHardwareConfigs.hardwareDecoder.autoTestDecodeVersion);
          if (this.mHardwareConfigs.hardwareDecoder.autoTestDecodeVersion != ClipDPHardwareConfigManager.CLOSE_HARDWARE_CONFIG) {
             b = true;
          }
          return b;
       }
    }
    public boolean isUseEncodeConfigs(){
       DeviceStrategyConfigs$Common obj = PatchProxy.apply(null, this, ClipDPHardwareConfigManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.updateConfig();
       obj = DeviceConfigManager.getInstance().getCommonStrategyConfig();
       boolean b = true;
       StringBuilder str = null;
       String str1 = "ClipDPHardware";
       if (obj != null) {
          DeviceStrategyConfigs$Common useCodecConf = obj.useCodecConfig;
          if (useCodecConf >= null) {
             if ((useCodecConf & 0x06) <= 0) {
                b = false;
             }
             KSClipLog.i(str1, "isUseEncodeConfigs strategyConfigs.useCodecConfig is "+obj.useCodecConfig+" return "+b);
             return b;
          }
       }
       DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
       if (tmHardwareCo == null || tmHardwareCo.hardwareEncoder == null) {
          KSClipLog.w(str1, "isUseEncodeConfigs mHardwareConfigs not valid: "+ClipKitUtils.COMMON_GSON.q(this.mHardwareConfigs));
          return str;
       }else {
          KSClipLog.i(str1, "isUseEncodeConfigs mHardwareConfigs.hardwareEncoder.autoTestEncodeVersion is "+this.mHardwareConfigs.hardwareEncoder.autoTestEncodeVersion);
          if (this.mHardwareConfigs.hardwareEncoder.autoTestEncodeVersion == ClipDPHardwareConfigManager.CLOSE_HARDWARE_CONFIG) {
             b = false;
          }
          return b;
       }
    }
    public boolean resetDecoderConfig(EditorSdk2V2$TrackAsset p0){
       EditorSdk2$AndroidDecoderConfig obj = PatchProxy.applyOneRefs(p0, this, ClipDPHardwareConfigManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.enableAutoFallback()) {
          return b;
       }
       obj = this.getAndroidDecodeConfig();
       if (obj == null) {
          return b;
       }
       boolean b1 = true;
       if (p0 != null) {
          if (TextUtils.isEmpty(p0.assetPath())) {
             return b;
          }else if(this.mFallbackDecodeConfigMap.containsKey(p0.assetPath())){
             DPHardwareConfigManager$FallbackDecodeConfig uFallbackDec = this.mFallbackDecodeConfigMap.get(p0.assetPath());
             String str = "mcbb";
             if (str.equals(uFallbackDec.tvdType) && ("mcs").equals(obj.tvdType())) {
                obj.setTvdType(this.getDecodeConfigByEdge(str, this.getAvcMaxDecodeEdge(str, b1)));
                obj.setTvdTypeHevc(this.getDecodeConfigByEdge(str, this.getHevcMaxDecodeEdge(str, b1)));
             }else if("sw".equals(uFallbackDec.tvdType)){
                obj.setTvdType("sw");
                obj.setTvdTypeHevc("sw");
             }else if("sw".equals(uFallbackDec.cvdType)){
                obj.setCvdType("sw");
                obj.setCvdTypeHevc("sw");
                b = true;
             }
             b = true;
             goto label_0086 ;
          }
       }
       if (b) {
          KSClipLog.i("ClipDPHardware", "resetDecoderConfig,decoderConfig:"+new String(obj.toByteArray(), Charset.forName("UTF-8")));
       }
       EditorSdk2Utils.setAndroidDecoderConfig(obj);
       return b;
    }
    public boolean resetDecoderConfig(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipDPHardwareConfigManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.enableAutoFallback()) {
          return b;
       }
       if (p0 != null) {
          boolean b1 = false;
          while (b < p0.trackAssetsSize()) {
             EditorSdk2V2$TrackAsset trackAsset = p0.trackAssets(b);
             if (!TextUtils.isEmpty(trackAsset.assetPath())) {
                b1 = this.resetDecoderConfig(trackAsset);
             }
             b = b + 1;
          }
          b = b1;
       }
       return b;
    }
    public void setEnableAutoFallBack(boolean p0){
       ClipDPHardwareConfigManager uClipDPHardw = ClipDPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uClipDPHardw) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uClipDPHardw, "8")) {
          return;
       }
       this.mEnableAutoFallBack.set(p0);
       return;
    }
    public void updateConfig(){
       if (PatchProxy.applyVoid(null, this, ClipDPHardwareConfigManager.class, "12")) {
          return;
       }
       super.updateConfig();
       DevicePersonaConfig config = DeviceConfigManager.getInstance().getConfig();
       if (config != null && (config.getDeviceStrategyConfigs() != null && config.getDeviceStrategyConfigs().common != null)) {
          this.mMinHWDecodeShortEdge = config.getDeviceStrategyConfigs().common.minHWDecodeShortEdge;
       }
    label_0031 :
       return;
    }
    public void updateEditVersion(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipDPHardwareConfigManager.class, "2")) {
          return;
       }
       String sDKVersion = EditorSdk2Utils.getSDKVersion();
       String str = "EditSdkVersion";
       String str1 = this.getPreferences(p0).getString(str, "");
       if (TextUtils.isEmpty(str1) || EditorSdk2Utils.CompareSDKVersion(sDKVersion, str1).ordinal() == 2) {
          g.a(this.getPreferences(p0).edit().putString(str, sDKVersion));
          g.a(this.getPreferences(p0).edit().putString("SwDecoderPath", ""));
          KSClipLog.d("ClipDPHardware", "updateEditVersion:"+sDKVersion);
       }
       String str2 = this.getPreferences(p0).getString("SwDecoderPath", "");
       if (!TextUtils.isEmpty(str2)) {
          this.mFallbackDecodeConfigMap = ClipKitUtils.COMMON_GSON.i(str2, new ClipDPHardwareConfigManager$1(this).getType());
       }
       if (this.mFallbackDecodeConfigMap == null) {
          this.mFallbackDecodeConfigMap = new HashMap();
       }
       return;
    }
}
