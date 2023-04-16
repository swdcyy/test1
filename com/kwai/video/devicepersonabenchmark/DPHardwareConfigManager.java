package com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import com.kwai.video.devicepersona.benchmark.BenchmarkDecoderResultItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.devicepersona.DevicePersonaLog;
import com.kwai.video.devicepersona.benchmark.BenchmarkDecoderResultItem$BenchmarkDecodeResultItem;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$Holder;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import java.lang.Boolean;
import com.kwai.video.devicepersona.hardware.HardwareDecoder;
import com.kwai.video.devicepersona.hardware.HardwareConfigs;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem$HardwareDecodeItem;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem$HardwareMaxDecoderNum;
import java.lang.StringBuilder;
import com.kwai.video.devicepersona.util.DevicePersonaUtil;
import com.kwai.video.devicepersona.strategy.DeviceStrategyConfigs$Common;
import com.kwai.video.devicepersona.hardware.HardwareDecoderItem$HardwareConfigDecodeItem;
import com.kwai.video.devicepersona.benchmark.BenchmarkDoubleValue;
import com.kwai.video.devicepersona.benchmark.BenchmarkSpeed;
import com.kwai.video.devicepersona.benchmark.BenchmarkFirstFrameCost;
import com.kwai.video.devicepersona.benchmark.BenchmarkIntValue;
import java.util.List;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EditDecoderConfig;
import com.kwai.video.devicepersona.config.DeviceConfigManager;
import ca7.f;
import com.google.gson.Gson;
import com.kwai.video.devicepersona.benchmark.BaseDecoderItem;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$SingleSrcTypeDecoderConfig;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkConfigManager;
import com.kwai.video.devicepersona.hardware.HardwareEncoderItem;
import com.kwai.video.devicepersona.hardware.HardwareEncoder;
import com.kwai.video.devicepersona.hardware.HDRDecoderInfo;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$HwEncodeLimit;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EncodeResult;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncoderResult;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$DecoderMax;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Float;
import java.lang.Double;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import com.kwai.video.devicepersona.benchmark.BenchmarkErrorCode;
import com.kwai.video.devicepersona.benchmark.HardwareMultiErrorCodes;
import java.lang.Exception;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import com.kwai.video.devicepersona.config.DevicePersonaConfig;
import com.kwai.video.devicepersona.strategy.DeviceStrategyConfigs;

public class DPHardwareConfigManager	// class@001b6e
{
    public HardwareConfigs mHardwareConfigs;
    public AtomicBoolean mIsInit;
    public Object mLock;
    public int mMaxEncode1080PLongEdge;

    public void DPHardwareConfigManager(){
       super();
       this.mLock = new Object();
       this.mIsInit = new AtomicBoolean(false);
       this.mMaxEncode1080PLongEdge = 1920;
    }
    public static BenchmarkDecoderResultItem covertBenchmarkDecoderItem(Map p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, DPHardwareConfigManager.class, "27");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = "DevicePersonaHardware";
       if (p0 == null) {
          DevicePersonaLog.e(obj1, "covertBenchmarkDecoderItem decoderMap null, return null");
          return obj;
       }else {
          Map map = p0.get("mcs");
          p0 = p0.get("mcbb");
          if (map == null && p0 == null) {
             DevicePersonaLog.e(obj1, "covertBenchmarkDecoderItem mcsResult and mcbbResult null, return null");
             return obj;
          }else {
             BenchmarkDecoderResultItem uBenchmarkDe = new BenchmarkDecoderResultItem();
             uBenchmarkDe.mcsItem = DPHardwareConfigManager.covertBenchmarkDecoderSubItem(map);
             uBenchmarkDe.mcbbItem = DPHardwareConfigManager.covertBenchmarkDecoderSubItem(p0);
             return uBenchmarkDe;
          }
       }
    }
    public static BenchmarkDecoderResultItem$BenchmarkDecodeResultItem covertBenchmarkDecoderSubItem(Map p0){
       BenchmarkDecoderResultItem$BenchmarkDecodeResultItem obj = PatchProxy.applyOneRefs(p0, null, DPHardwareConfigManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BenchmarkDecoderResultItem$BenchmarkDecodeResultItem();
       if (obj.convertFromMap(p0)) {
          return obj;
       }
       return null;
    }
    public static DPHardwareConfigManager getInstance(){
       return DPHardwareConfigManager$Holder.sManager;
    }
    public int findMin(int p0,int p1){
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uDPHardwareC, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 > 0 && p1 > 0) {
          return Math.min(p0, p1);
       }else if(p0 > 0){
          return p0;
       }else if(p1 > 0){
          return p1;
       }else {
          return 0;
       }
    }
    public int findWidth(int p0){
       if (p0 == 960) {
          return 540;
       }
       if (p0 == 1280) {
          return 720;
       }
       if (p0 == 1920) {
          return 1080;
       }
       if (p0 != 3840) {
          return -1;
       }
       return 2158;
    }
    public int getAvcMaxDecodeEdge(String p0,boolean p1){
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDPHardwareC, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uDPHardwareC = this.mLock;
       _monitor_enter(uDPHardwareC);
       DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
       if (tmHardwareCo != null && (tmHardwareCo.getHardwareDecoder() != null && this.mHardwareConfigs.getHardwareDecoder().avcDecoder != null)) {
          if (("mcbb").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcbbItem != null) {
             _monitor_exit(uDPHardwareC);
             return this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcbbItem.maxLongEdge;
          }else if(("mcs").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcsItem != null){
             _monitor_exit(uDPHardwareC);
             return this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcsItem.maxLongEdge;
          }
       }
       if (!p1) {
          _monitor_exit(uDPHardwareC);
          return 0;
       }else {
          _monitor_exit(uDPHardwareC);
          return 0;
       }
    }
    public int getAvcMaxDecodeNum(String p0,int p1){
       int maxNum;
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDPHardwareC, "16");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uDPHardwareC = this.mLock;
       _monitor_enter(uDPHardwareC);
       DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
       if (tmHardwareCo != null && (tmHardwareCo.getHardwareDecoder() != null && this.mHardwareConfigs.getHardwareDecoder().avcDecoder != null)) {
          if (("mcbb").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcbbItem != null) {
             maxNum = this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcbbItem.maxDecoderNum.getMaxNum(p1);
          }else if(("mcs").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcsItem != null){
             maxNum = this.mHardwareConfigs.getHardwareDecoder().avcDecoder.mcsItem.maxDecoderNum.getMaxNum(p1);
          }else {
          label_007f :
             maxNum = 0;
          }
       }else {
          goto label_007f ;
       }
       Number mapObject = DevicePersonaUtil.getMapObject(null, "decoder.hevc.portrait."+p0+"."+p1, Number.class, false);
       if (mapObject != null && mapObject.intValue() > maxNum) {
          maxNum = mapObject.intValue();
       }
       _monitor_exit(uDPHardwareC);
       return maxNum;
    }
    public String getDecodeConfigByEdge(String p0,int p1){
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDPHardwareC, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 > 1920) {
          return p0+"_360";
       }else if(p1 > 1280){
          return p0+"_max_1080";
       }else if(p1 > 960){
          return p0+"_max_720";
       }else {
          return p0+"_max_540";
       }
    }
    public final int getDecodeMaxLongEdge(HardwareDecoderItem$HardwareDecodeItem p0,DeviceStrategyConfigs$Common p1){
       int[] ointArray1;
       Object obj = p0;
       Object obj1 = p1;
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, DPHardwareConfigManager.class, "31");
       if (obj2 != PatchProxyResult.class) {
          return obj2.intValue();
       }
       int i = 0;
       if (obj == null) {
          DevicePersonaLog.w("DevicePersonaHardware", "getDecodeMaxLongEdge decodeItem null, return 0");
          return i;
       }else if(obj1 == null || obj1.reComputeMaxLongEdge == null){
          DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge strategyConfig not open recompute");
          return obj.maxLongEdge;
       }else {
          String str = null;
          if (v6 = obj instanceof HardwareDecoderItem$HardwareConfigDecodeItem) {
             DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge by hardwareConfig");
             str = obj.supportRate;
             if (str == null) {
                return obj.maxLongEdge;
             }
          }else {
             DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge by benchmark");
          }
          int i1 = 4;
          int[] ointArray = new int[i1]{3840,1920,1280,960};
          int i2 = 0;
          while (true) {
             if (i2 < i1) {
                int i3 = ointArray[i2];
                StringBuilder str1 = 0xbe112e0be826d695;
                if (v6) {
                   if (obj1.minHWSupportRate - str1 < 0) {
                      return obj.maxLongEdge;
                   }else {
                      obj2 = " supportRate ";
                      if (str.getValue(i3) - str1 < 0) {
                         DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge param invalid edge "+i3+obj2+str.getValue(i3)+" strategyConfig.minHWSupportRate "+obj1.minHWSupportRate);
                         ointArray1 = ointArray;
                      }else {
                         ointArray1 = ointArray;
                         if (str.getValue(i3) - obj1.minHWSupportRate < 0) {
                            DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge edge "+i3+obj2+str.getValue(i3)+" lower than strategyConfig.minHWSupportRate "+obj1.minHWSupportRate);
                         }else {
                         label_00f2 :
                            HardwareDecoderItem$HardwareDecodeItem speed = obj.speed;
                            String str2 = 0x3e112e0be826d695;
                            if (speed != null && (obj1.minHWDecodeSpeed - str2 > 0 && (speed.getSpeed(i3) - str1 > 0 && obj.speed.getSpeed(i3) - obj1.minHWDecodeSpeed < 0))) {
                               DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge edge "+i3+" speed "+obj.speed.getSpeed(i3)+" lower than strategyConfig.minHWDecodeSpeed "+obj1.minHWDecodeSpeed);
                            }else {
                               speed = obj.firstFrameCost;
                               if (speed != null && (obj1.maxHWFirstFrameCost - str2 > 0 && speed.getFirstFrameCost(i3) - obj1.maxHWFirstFrameCost > 0)) {
                                  DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge edge "+i3+" firstFrameCost "+obj.firstFrameCost.getFirstFrameCost(i3)+" larger than strategyConfig.maxHWFirstFrameCost "+obj1.maxHWFirstFrameCost);
                               }else {
                                  speed = obj.systemSupport;
                                  if (speed != null && (obj1.minHWSystemSupport - str2 > 0 && (speed.getValue(i3) - 0xbe112e0be826d695 > 0 && obj.systemSupport.getValue(i3) - obj1.minHWSystemSupport < 0))) {
                                     DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge edge "+i3+" systemSupport "+obj.systemSupport.getValue(i3)+" lower than strategyConfig.minHWSystemSupport "+obj1.minHWSystemSupport);
                                  }else {
                                     speed = obj.yuvCheck;
                                     if (speed != null && (obj1.ensureYuvCheck == 1 && !speed.getValue(i3))) {
                                        DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge edge "+i3+" yuvCheck "+obj.yuvCheck.getValue(i3)+" not pass");
                                     }else {
                                        i = i3;
                                        break ;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }else {
                   ointArray1 = ointArray;
                   if (i3 > obj.maxLongEdge) {
                      DevicePersonaLog.d("DevicePersonaHardware", "getDecodeMaxLongEdge benchmark edge "+i3+" higher than decodeItem.maxLongEdge "+obj.maxLongEdge);
                   }else {
                      goto label_00f2 ;
                   }
                }
                i2 = i2 + 1;
                ointArray = ointArray1;
                i1 = 4;
             }else {
                i = 0;
                break ;
             }
          }
          return i;
       }
    }
    public final List getDecoderSizeListConfig(String p0,DeviceStrategyConfigs$Common p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DPHardwareConfigManager.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          DeviceStrategyConfigs$Common decoderConfi = p1.decoderConfigSizeList;
          if (decoderConfi != null && !decoderConfi.isEmpty()) {
             Map map = p1.decoderConfigSizeList.get(p0);
             if (map == null || map.isEmpty()) {
                DevicePersonaLog.i("DevicePersonaHardware", "getDecoderSizeListConfig decoderConfigSizeList codecType empty, return null");
                return null;
             }else {
                return DevicePersonaUtil.getSortedDecodeSizeList(map);
             }
          }
       }
       DevicePersonaLog.i("DevicePersonaHardware", "getDecoderSizeListConfig no decoderConfigSizeList, return null");
       return null;
    }
    public DPHardwareConfigManager$EditDecoderConfig getEditDecoderConfig(){
       Object[] objArray1;
       Object[] objArray = null;
       DPHardwareConfigManager$EditDecoderConfig obj = PatchProxy.apply(objArray, this, DPHardwareConfigManager.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mHardwareConfigs == null) {
          this.updateConfig();
       }
       obj = new DPHardwareConfigManager$EditDecoderConfig();
       DeviceStrategyConfigs$Common commonStrate = DeviceConfigManager.getInstance().getCommonStrategyConfig();
       if (commonStrate != null) {
          DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig strategyConfig.common: "+f.b.q(commonStrate));
          obj.minHwShortEdge = commonStrate.minHWDecodeShortEdge;
          DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
          if (tmHardwareCo != null) {
             HardwareConfigs hardwareDeco = tmHardwareCo.hardwareDecoder;
             if (hardwareDeco != null && hardwareDeco.fromWhiteList != null) {
                DevicePersonaLog.i("DevicePersonaHardware", "getEditDecoderConfig fromWhiteList, no strategy");
                objArray1 = objArray;
             label_005f :
                DPHardwareConfigManager uDPHardwareC = null;
                if (this.isDecoderHardwareConfigValid("avc", commonStrate)) {
                   DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig avc use hardwareDecoder: "+f.b.q(this.mHardwareConfigs.hardwareDecoder));
                   obj.avc = this.getSingleSrcTypeDecoderConfig(this.mHardwareConfigs.hardwareDecoder.avcDecoder, objArray1);
                }else {
                   DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig avc no hardwareDecoder");
                   uDPHardwareC = 1;
                   DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig avc no benchmarkResult");
                }
                if (this.isDecoderHardwareConfigValid("hevc", commonStrate)) {
                   DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig hevc use hardwareDecoder: "+f.b.q(this.mHardwareConfigs.hardwareDecoder));
                   obj.hevc = this.getSingleSrcTypeDecoderConfig(this.mHardwareConfigs.hardwareDecoder.hevcDecoder, objArray1);
                }else {
                   DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig hevc no hardwareDecoder");
                   Map dPBenchmarkR = (uDPHardwareC == null)? DPBenchmarkConfigManager.getInstance().getDPBenchmarkResult(): objArray;
                   if (dPBenchmarkR == null) {
                      DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig hevc no benchmarkResult");
                   }else {
                      dPBenchmarkR = DevicePersonaUtil.combineTestResultMap(DevicePersonaUtil.getMapMap(dPBenchmarkR, "decoder"), DevicePersonaUtil.getMapMap(dPBenchmarkR, "fastDecoder"));
                      if (this.isDecoderBenchmarkResultValid("hevc", commonStrate, dPBenchmarkR)) {
                         BenchmarkDecoderResultItem uBenchmarkDe = DPHardwareConfigManager.covertBenchmarkDecoderItem(DevicePersonaUtil.getMapMap(dPBenchmarkR, "hevc.portrait"));
                         if (uBenchmarkDe != null) {
                            obj.hevc = this.getSingleSrcTypeDecoderConfig(uBenchmarkDe, objArray1);
                            DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig hevc use benchmarkDecoderV2: "+f.b.q(dPBenchmarkR));
                         }
                      }
                      DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig hevc no valid data");
                      obj.hevc = objArray;
                   }
                }
                DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig result: "+f.b.q(obj));
                return obj;
             }
          }
       }else {
          DevicePersonaLog.d("DevicePersonaHardware", "getEditDecoderConfig strategyConfig not ready");
       }
       objArray1 = commonStrate;
       goto label_005f ;
    }
    public double getEncodeSpeedBySize(int p0,String p1,int p2,int p3){
       DPHardwareConfigManager obj;
       HardwareConfigs hardwareSwEn;
       HardwareEncoderItem[] hardwareEnco;
       if (PatchProxy.isSupport(DPHardwareConfigManager.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, DPHardwareConfigManager.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       obj = this.mLock;
       _monitor_enter(obj);
       p2 = p2 * p3;
       int i = 2;
       if (p2 <= 0x7e900) {
          p2 = 0;
       }else if(p2 <= 0xe1000){
          p2 = 1;
       }else {
          p3 = Math.max(1920, this.mMaxEncode1080PLongEdge) * 1080;
          p2 = (p2 <= p3)? 2: 3;
       }
       DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
       if (tmHardwareCo != null) {
          object oobject = null;
          if (p0 == 1) {
             hardwareSwEn = tmHardwareCo.hardwareSwEncoder;
          }else if(p0 == 5){
             hardwareSwEn = tmHardwareCo.hardwareEncoder;
          }else {
             hardwareSwEn = oobject;
          }
          if (hardwareSwEn != null) {
             if (("avc").equals(p1)) {
                hardwareEnco = new HardwareEncoderItem[]{hardwareSwEn.avc960,hardwareSwEn.avc1280,hardwareSwEn.avc1920,hardwareSwEn.avc3840};
             }else if(("hevc").equals(p1)){
                hardwareEnco = new HardwareEncoderItem[4];
                hardwareEnco[0] = hardwareSwEn.hevc960;
                hardwareEnco[1] = hardwareSwEn.hevc1280;
                hardwareEnco[i] = hardwareSwEn.hevc1920;
                hardwareEnco[3] = hardwareSwEn.hevc3840;
             }
             while (p2 < hardwareEnco.length) {
                oobject = hardwareEnco[p2];
                if (oobject != null && oobject.encodeSpeed > 0) {
                   break ;
                }
                p2++;
             }
             if (oobject != null) {
                _monitor_exit(obj);
                return oobject.encodeSpeed;
             }
          }
       }
    label_00b4 :
       _monitor_exit(obj);
       return 0;
    }
    public HDRDecoderInfo getHDRDecoderInfo(){
       DPHardwareConfigManager obj = PatchProxy.apply(null, this, DPHardwareConfigManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.updateConfig();
       obj = this.mHardwareConfigs;
       if (obj == null) {
          return null;
       }
       return obj.hdrDecoder;
    }
    public HardwareConfigs getHardwareConfigs(){
       Object obj = PatchProxy.apply(null, this, DPHardwareConfigManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mHardwareConfigs == null) {
          this.updateConfig();
       }
       return this.mHardwareConfigs;
    }
    public int getHevcMaxDecodeEdge(String p0,boolean p1){
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDPHardwareC, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uDPHardwareC = this.mLock;
       _monitor_enter(uDPHardwareC);
       DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
       if (tmHardwareCo != null && (tmHardwareCo.getHardwareDecoder() != null && this.mHardwareConfigs.getHardwareDecoder().hevcDecoder != null)) {
          if (("mcbb").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcbbItem != null) {
             _monitor_exit(uDPHardwareC);
             return this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcbbItem.maxLongEdge;
          }else if(("mcs").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcsItem != null){
             _monitor_exit(uDPHardwareC);
             return this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcsItem.maxLongEdge;
          }
       }
       if (!p1) {
          _monitor_exit(uDPHardwareC);
          return 0;
       }else {
          _monitor_exit(uDPHardwareC);
          return 0;
       }
    }
    public int getHevcMaxDecodeNum(String p0,int p1){
       int maxNum;
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDPHardwareC, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uDPHardwareC = this.mLock;
       _monitor_enter(uDPHardwareC);
       DPHardwareConfigManager tmHardwareCo = this.mHardwareConfigs;
       if (tmHardwareCo != null && (tmHardwareCo.getHardwareDecoder() != null && this.mHardwareConfigs.getHardwareDecoder().hevcDecoder != null)) {
          if (("mcbb").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcbbItem != null) {
             maxNum = this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcbbItem.maxDecoderNum.getMaxNum(p1);
          }else if(("mcs").equals(p0) && this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcsItem != null){
             maxNum = this.mHardwareConfigs.getHardwareDecoder().hevcDecoder.mcsItem.maxDecoderNum.getMaxNum(p1);
          }else {
          label_007f :
             maxNum = 0;
          }
       }else {
          goto label_007f ;
       }
       Number mapObject = DevicePersonaUtil.getMapObject(DPBenchmarkConfigManager.getInstance().getDPBenchmarkResult(), "decoder.avc.portrait."+p0+"."+p1, Number.class, false);
       if (mapObject != null && mapObject.intValue() > maxNum) {
          maxNum = mapObject.intValue();
       }
       _monitor_exit(uDPHardwareC);
       return maxNum;
    }
    public DPHardwareConfigManager$EncodeResult getHwEncodeSupportByEncoderItems(DPHardwareConfigManager$HwEncodeLimit p0,int p1,HardwareEncoderItem[] p2,int[] p3){
       DPHardwareConfigManager$EncodeResult obj;
       if (PatchProxy.isSupport(DPHardwareConfigManager.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, DPHardwareConfigManager.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p2 != null && (p3 != null && (!p2.length || p2.length != p3.length))) {
          DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode getHwEncodeSupportByEncoderItems param invalid");
          return obj;
       }else if(p0 == null){
          p0 = new DPHardwareConfigManager$HwEncodeLimit();
       }
       boolean b = DeviceConfigManager.getInstance().canEncodeUseHigh();
       int i = 0;
       while (i < p2.length) {
          if (p1 <= p3[i]) {
             object oobject = p2[i];
             if (oobject == null) {
                if (p3[i] >= -7748281975669286300000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f && !b) {
                   break ;
                }
             }else {
                obj = new DPHardwareConfigManager$EncodeResult();
                if (oobject.supportEncode != null && oobject.encodeSpeed - (double)p0.minHWEncodeSpeed >= 0) {
                   HardwareEncoderItem encodeProfil = oobject.encodeProfile;
                   if (encodeProfil >= p0.minProfile && (p0.supportAlignmentFlag & oobject.encodeAlignment)) {
                      obj.isSupport = true;
                      obj.profile = encodeProfil;
                      break ;
                   }
                }
                obj.isSupport = false;
                obj.errorCode = oobject.encodeErrorCode;
                break ;
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public DPHardwareConfigManager$EncodeResult getHwEncodeSupportByHardwareConfig(String p0,DPHardwareConfigManager$HwEncodeLimit p1,int p2){
       DPHardwareConfigManager obj;
       HardwareEncoderItem[] hardwareEnco1;
       if (PatchProxy.isSupport(DPHardwareConfigManager.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, DPHardwareConfigManager.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mHardwareConfigs == null) {
          this.updateConfig();
       }
       obj = this.mHardwareConfigs;
       DPHardwareConfigManager$EncodeResult uEncodeResul = null;
       if (obj != null) {
          HardwareConfigs hardwareEnco = obj.hardwareEncoder;
          if (hardwareEnco != null) {
             DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode hardwareConfig.encoder: "+DevicePersonaUtil.COMMON_GSON.q(hardwareEnco));
             if (("avc").equals(p0)) {
                hardwareEnco1 = new HardwareEncoderItem[]{hardwareEnco.avc960,hardwareEnco.avc1280,hardwareEnco.avc1920,hardwareEnco.avc3840};
             }else if(("hevc").equals(p0)){
                hardwareEnco1 = new HardwareEncoderItem[]{hardwareEnco.hevc960,hardwareEnco.hevc1280,hardwareEnco.hevc1920,hardwareEnco.hevc3840};
             }
             DPHardwareConfigManager$EncodeResult hwEncodeSupp = this.getHwEncodeSupportByEncoderItems(p1, p2, hardwareEnco1, new int[4]{960,1280,1920,3840});
             if (hwEncodeSupp != null) {
                hwEncodeSupp.infoSource = 0;
                if (hwEncodeSupp.isSupport == null) {
                   hwEncodeSupp.notSupportReason = 11;
                }
                DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode hardwareConfig support:"+hwEncodeSupp.isSupport+",profile:"+hwEncodeSupp.profile);
             }else {
                DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode hardwareConfig null for videoLongEdge:"+p2);
             }
             return hwEncodeSupp;
          }
       }
       return uEncodeResul;
    }
    public DPHardwareConfigManager$EncodeResult getHwEncodeSupportByLocalBenchmarkResult(String p0,DPHardwareConfigManager$HwEncodeLimit p1,int p2){
       Map obj;
       DPHardwareConfigManager$EncodeResult uEncodeResul;
       HardwareEncoderItem[] hardwareEnco;
       if (PatchProxy.isSupport(DPHardwareConfigManager.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, DPHardwareConfigManager.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = DPBenchmarkConfigManager.getInstance().getDPBenchmarkResult();
       if (obj == null) {
          uEncodeResul = new DPHardwareConfigManager$EncodeResult();
          uEncodeResul.isSupport = false;
          uEncodeResul.notSupportReason = 4;
          DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode getHwEncodeSupportByLocalBenchmarkResult benchmarkResult is null");
          return uEncodeResul;
       }else {
          BenchmarkEncoderResult uBenchmarkEn = BenchmarkEncoderResult.convertFromMap(DevicePersonaUtil.getMapMap(obj, "encoder"));
          BenchmarkEncoderResult uBenchmarkEn1 = BenchmarkEncoderResult.convertFromMap(DevicePersonaUtil.getMapMap(obj, "fastEncoder"));
          if (uBenchmarkEn == null) {
             uBenchmarkEn = uBenchmarkEn1;
          }else {
             uBenchmarkEn.combineOtherResult(uBenchmarkEn1);
          }
          if (uBenchmarkEn == null) {
             uEncodeResul = new DPHardwareConfigManager$EncodeResult();
             uEncodeResul.isSupport = false;
             uEncodeResul.notSupportReason = 6;
             DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode getHwEncodeSupportByLocalBenchmarkResult benchmarkEncoder and fastEncoder is both null");
             return uEncodeResul;
          }else {
             DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode localBenchmarkResult.encoder: "+DevicePersonaUtil.COMMON_GSON.q(uBenchmarkEn));
             if (("avc").equals(p0)) {
                hardwareEnco = new HardwareEncoderItem[]{uBenchmarkEn.avc960,uBenchmarkEn.avc1280,uBenchmarkEn.avc1920,uBenchmarkEn.avc3840};
             }else if(("hevc").equals(p0)){
                hardwareEnco = new HardwareEncoderItem[]{uBenchmarkEn.hevc960,uBenchmarkEn.hevc1280,uBenchmarkEn.hevc1920,uBenchmarkEn.hevc3840};
             }else {
                return null;
             }
             uEncodeResul = this.getHwEncodeSupportByEncoderItems(p1, p2, hardwareEnco, new int[4]{960,1280,1920,3840});
             if (uEncodeResul != null) {
                uEncodeResul.infoSource = 1;
                if (uEncodeResul.isSupport == null) {
                   uEncodeResul.notSupportReason = 5;
                }
                DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode localBenchmarkResult support:"+uEncodeResul.isSupport+",profile:"+uEncodeResul.profile);
             }else {
                DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode localBenchmarkResult null for videoLongEdge:"+p2);
             }
             return uEncodeResul;
          }
       }
    }
    public DPHardwareConfigManager$DecoderMax getMaxDecodeNumEdge(String p0,boolean p1){
       HashMap obj;
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDPHardwareC, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashMap();
       int i = 3840;
       Integer integer = Integer.valueOf(i);
       i = (p1)? this.getAvcMaxDecodeNum(p0, i): this.getHevcMaxDecodeNum(p0, i);
       obj.put(integer, Integer.valueOf(i));
       i = 1920;
       integer = Integer.valueOf(i);
       int avcMaxDecode = (p1)? this.getAvcMaxDecodeNum(p0, i): this.getHevcMaxDecodeNum(p0, i);
       obj.put(integer, Integer.valueOf(avcMaxDecode));
       int i1 = 1280;
       Integer integer1 = Integer.valueOf(i1);
       int avcMaxDecode1 = (p1)? this.getAvcMaxDecodeNum(p0, i1): this.getHevcMaxDecodeNum(p0, i1);
       obj.put(integer1, Integer.valueOf(avcMaxDecode1));
       avcMaxDecode = 960;
       Integer integer2 = Integer.valueOf(avcMaxDecode);
       int avcMaxDecode2 = (p1)? this.getAvcMaxDecodeNum(p0, avcMaxDecode): this.getHevcMaxDecodeNum(p0, avcMaxDecode);
       obj.put(integer2, Integer.valueOf(avcMaxDecode2));
       Integer integer3 = null;
       Integer integer4 = -1;
       Iterator iterator = obj.keySet().iterator();
       while (iterator.hasNext()) {
          int i2 = iterator.next().intValue();
          int i3 = obj.get(Integer.valueOf(i2)).intValue();
          if (i3 > integer3) {
             integer4 = i2;
             integer3 = i3;
          }
       }
       if (integer4 == avcMaxDecode) {
          if (obj.get(Integer.valueOf(i1)).intValue() >= 2) {
             integer3 = obj.get(Integer.valueOf(i1)).intValue();
          }else {
             i1 = integer4;
          }
          if (obj.get(Integer.valueOf(i)).intValue() >= 2) {
             integer3 = obj.get(Integer.valueOf(i)).intValue();
          }else {
             i = i1;
          }
       }else {
          Integer integer5 = integer4;
       }
       return new DPHardwareConfigManager$DecoderMax(i, integer3);
    }
    public int getMaxEncodeEdge(String p0,float p1,int p2,int p3){
       DPHardwareConfigManager obj1;
       int this;
       DPHardwareConfigManager uDPHardwareC = this;
       HardwareEncoderItem[] obj = p0;
       if (PatchProxy.isSupport(DPHardwareConfigManager.class)) {
          obj1 = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DPHardwareConfigManager.class, "13");
          if (obj1 != PatchProxyResult.class) {
             return obj1.intValue();
          }
       }
       obj1 = uDPHardwareC.mLock;
       _monitor_enter(obj1);
       DPHardwareConfigManager mHardwareCon = uDPHardwareC.mHardwareConfigs;
       if (mHardwareCon != null) {
          HardwareConfigs hardwareEnco = mHardwareCon.hardwareEncoder;
          if (hardwareEnco != null) {
             this = 3;
             int i = 4;
             if (("avc").equals(obj)) {
                obj = new HardwareEncoderItem[i];
                obj[0] = hardwareEnco.avc3840;
                obj[1] = hardwareEnco.avc1920;
                obj[2] = hardwareEnco.avc1280;
                obj[this] = hardwareEnco.avc960;
             }else if(("hevc").equals(obj)){
                obj = new HardwareEncoderItem[i];
                obj[0] = hardwareEnco.hevc3840;
                obj[1] = hardwareEnco.hevc1920;
                obj[2] = hardwareEnco.hevc1280;
                obj[this] = hardwareEnco.hevc960;
             }else {
                _monitor_exit(obj1);
                return 0;
             }
             int[] ointArray = new int[i];
             ointArray[0] = 3840;
             ointArray[1] = 1920;
             ointArray[2] = 1280;
             ointArray[this] = 960;
             String[] stringArray = new String[]{"3840","1920","1280","960"};
             int i1 = 0;
             while (true) {
                if (i1 < obj.length) {
                   object oobject = obj[i1];
                   if (oobject == null || oobject.supportEncode == null) {
                      int i2 = 4;
                   }else {
                      HardwareEncoderItem encodeSpeed = oobject.encodeSpeed;
                      if (encodeSpeed - (double)p1 >= 0) {
                         if (oobject.encodeProfile >= p2) {
                            i = oobject.encodeAlignment & p3;
                            if (i) {
                               break ;
                            }
                         }
                      }else {
                         int i3 = p2;
                      }
                      Object[] objArray = new Object[]{stringArray[i1],Double.valueOf(encodeSpeed),Float.valueOf(p1),Integer.valueOf(oobject.encodeProfile),Integer.valueOf(p2),Integer.valueOf(oobject.encodeAlignment),Integer.valueOf(p3)};
                      DevicePersonaLog.d("DevicePersonaHardware", String.format("getMaxEncodeEdge %s failed,encodeSpeed:%f\(%f\), encodeProfile:%d\(%d\), encodeAlignment:%d\(%d\)", objArray));
                   }
                   i1 = i1 + 1;
                   double d = -765550435535687530000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f;
                }else {
                   _monitor_exit(obj1);
                   return 0;
                }
             }
             _monitor_exit(obj1);
             return ointArray[i1];
          }
       }
       _monitor_exit(obj1);
       return 0;
    }
    public final SharedPreferences getPreferences(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DPHardwareConfigManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.c(p0, "hardware_config", 4);
    }
    public final DPHardwareConfigManager$SingleSrcTypeDecoderConfig getSingleSrcTypeDecoderConfig(BaseDecoderItem p0,DeviceStrategyConfigs$Common p1){
       double speed1;
       DPHardwareConfigManager$SingleSrcTypeDecoderConfig obj = PatchProxy.applyTwoRefs(p0, p1, this, DPHardwareConfigManager.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DPHardwareConfigManager$SingleSrcTypeDecoderConfig();
       if (p0 == null) {
          DevicePersonaLog.w("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig decoderItem null, return");
          return obj;
       }else {
          DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig start compute mcbbMaxLongEdge");
          obj.mcbbMaxLongEdge = this.getDecodeMaxLongEdge(p0.getMcbbItem(), p1);
          DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig start compute mcsMaxLongEdge");
          obj.mcsMaxLongEdge = this.getDecodeMaxLongEdge(p0.getMcsItem(), p1);
          DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig recompute mcbbMaxLongEdge = "+obj.mcbbMaxLongEdge+"mcsMaxLongEdge = "+obj.mcsMaxLongEdge);
          if (p0 instanceof HardwareDecoderItem) {
             HardwareDecoderItem hardwareDeco = p0;
             if (!("default").equals(hardwareDeco.tvdType)) {
                obj.suggestDecodeType = hardwareDeco.tvdType;
                DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig white list force suggestDecodeType "+hardwareDeco.tvdType);
             }else {
             label_008d :
                DPHardwareConfigManager$SingleSrcTypeDecoderConfig mcbbMaxLongE = obj.mcbbMaxLongEdge;
                DPHardwareConfigManager$SingleSrcTypeDecoderConfig mcsMaxLongEd = obj.mcsMaxLongEdge;
                if (mcbbMaxLongE > mcsMaxLongEd && mcbbMaxLongE > null) {
                   obj.suggestDecodeType = "mcbb";
                }else if(mcsMaxLongEd > mcbbMaxLongE && mcsMaxLongEd > null){
                   obj.suggestDecodeType = "mcs";
                }else if(mcsMaxLongEd == mcbbMaxLongE && mcsMaxLongEd > null){
                   obj.suggestDecodeType = "mcbb";
                   if (p1 != null) {
                      if ("mcbb".equals(p1.preferHWDecodeType)) {
                         obj.suggestDecodeType = "mcbb";
                      }else if("mcs".equals(p1.preferHWDecodeType)){
                         obj.suggestDecodeType = "mcs";
                      }else {
                         mcsMaxLongEd = null;
                         double speed = (p0.getMcsItem() != null && p0.getMcsItem().speed != null)? p0.getMcsItem().speed.getSpeed(obj.mcsMaxLongEdge): mcsMaxLongEd;
                         if (p0.getMcbbItem() != null && p0.getMcbbItem().speed != null) {
                            speed1 = p0.getMcbbItem().speed.getSpeed(obj.mcbbMaxLongEdge);
                         }
                         DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig compare speed mcsSpeed = "+speed+"mcbbSpeed = "+speed1);
                         if ((speed * p1.mcsSpeedWeight) - speed1 > 0) {
                            obj.suggestDecodeType = "mcs";
                         }else {
                            obj.suggestDecodeType = "mcbb";
                         }
                      }
                   }
                }else {
                   obj.suggestDecodeType = "sw";
                }
             }
          }else {
             goto label_008d ;
          }
          DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig choose suggestType "+obj.suggestDecodeType);
          if ("mcs".equals(obj.suggestDecodeType)) {
             DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig mcs start getTryMaxLongEdgeByMargin");
             obj.tryMaxLongEdge = this.getTryMaxLongEdgeByMargin(p0.getMcsItem(), p1, obj.mcsMaxLongEdge);
          }else if("mcbb".equals(obj.suggestDecodeType)){
             DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig mcbb start getTryMaxLongEdgeByMargin");
             obj.tryMaxLongEdge = this.getTryMaxLongEdgeByMargin(p0.getMcbbItem(), p1, obj.mcbbMaxLongEdge);
          }
          DevicePersonaLog.d("DevicePersonaHardware", "getSingleSrcTypeDecoderConfig tryMaxLongEdge "+obj.tryMaxLongEdge);
          return obj;
       }
    }
    public int getTryMaxLongEdgeByMargin(HardwareDecoderItem$HardwareDecodeItem p0,DeviceStrategyConfigs$Common p1,int p2){
       int[] ointArray1;
       BenchmarkDecoderResultItem$BenchmarkDecodeResultItem errorCode;
       int errorCode1;
       StringBuilder str2;
       int i10;
       DeviceStrategyConfigs$Common uCommon1;
       String str4;
       float f;
       int i = p0;
       DeviceStrategyConfigs$Common uCommon = p1;
       int i1 = p2;
       if (PatchProxy.isSupport(DPHardwareConfigManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, DPHardwareConfigManager.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (i && uCommon) {
          DeviceStrategyConfigs$Common tryHWLongEdg = uCommon.tryHWLongEdgeMargin;
          if (tryHWLongEdg > null && i1 >= uCommon.marginMinSupportLongEdge) {
             DeviceStrategyConfigs$Common marginMaxLon = uCommon.marginMaxLongEdge;
             if (i1 < marginMaxLon) {
                int i2 = Math.min((tryHWLongEdg + i1), marginMaxLon);
                DevicePersonaLog.d("DevicePersonaHardware", "getTryMaxLongEdgeByMargin oriLongEdge "+i1+" targetMarginLongEdge "+i2);
                String str = null;
                int String i3 = 4;
                int[] ointArray = new int[i3]{960,1280,1920,3840};
                int i4 = i1;
                int i5 = 0;
                while (true) {
                   if (i5 < i3) {
                      int i6 = ointArray[i5];
                      if (i6 <= i1) {
                         ointArray1 = ointArray;
                      }else if(i6 > i2){
                         DevicePersonaLog.d("DevicePersonaHardware", "getTryMaxLongEdgeByMargin longEdge "+i6+" larger than targetMarginLongEdge, break");
                         break ;
                      }else {
                         String str1 = " match notSupportError ";
                         if (i instanceof BenchmarkDecoderResultItem$BenchmarkDecodeResultItem) {
                            errorCode = i.errorCode;
                            if (errorCode == null) {
                               DevicePersonaLog.d("DevicePersonaHardware", "getTryMaxLongEdgeByMargin benchmark errorCode null, return");
                               return i1;
                            }else {
                               errorCode1 = errorCode.getErrorCode(i6);
                               DeviceStrategyConfigs$Common marginNotSup = uCommon.marginNotSupportErrorCodes;
                               i3 = marginNotSup.length;
                               str2 = str;
                               int i7 = 0;
                               int i8 = 0;
                               while (true) {
                                  if (i7 < i3) {
                                     int i9 = i3;
                                     i3 = marginNotSup[i7];
                                     ointArray1 = ointArray;
                                     String str3 = "getTryMaxLongEdgeByMargin benchmark longEdge ";
                                     i10 = i4;
                                     if (i3 == -1000 || i3 == -2000) {
                                        i4 = Math.abs(errorCode1) % 10000;
                                        i4 = i4 / 1000;
                                        i4 = i4 * 1000;
                                        uCommon1 = marginNotSup;
                                        if (i4 == Math.abs(i3)) {
                                           DevicePersonaLog.d("DevicePersonaHardware", str3+i6+" errorCode "+errorCode1+" match notSupportErrorPrefix "+i3);
                                        label_0120 :
                                           i8 = 1;
                                        }
                                     }else if(errorCode1 == i3){
                                        DevicePersonaLog.d("DevicePersonaHardware", str3+i6+" errorCode "+errorCode1+str1+i3);
                                        uCommon1 = marginNotSup;
                                        goto label_0120 ;
                                     }else {
                                        uCommon1 = marginNotSup;
                                     }
                                     if (i8) {
                                     label_0134 :
                                        if (!i8) {
                                           str = 3840;
                                           if (i6 == str && i2 > str) {
                                              DevicePersonaLog.d("DevicePersonaHardware", "getTryMaxLongEdgeByMargin benchmark 4k is ok, use targetMarginLongEdge");
                                              break ;
                                           }else {
                                              i4 = i6;
                                              str = str2;
                                           }
                                        }else {
                                        label_0287 :
                                           i2 = i10;
                                           break ;
                                        }
                                     }else {
                                        i7 = i7 + 1;
                                        i3 = i9;
                                        ointArray = ointArray1;
                                        i4 = i10;
                                        marginNotSup = uCommon1;
                                     }
                                  }else {
                                     ointArray1 = ointArray;
                                     i10 = i4;
                                     goto label_0134 ;
                                  }
                               }
                               DevicePersonaLog.d("DevicePersonaHardware", "getTryMaxLongEdgeByMargin return "+i2);
                               return i2;
                            }
                         }else {
                            str2 = str;
                            ointArray1 = ointArray;
                            i10 = i4;
                            if (i instanceof HardwareDecoderItem$HardwareConfigDecodeItem) {
                               HardwareDecoderItem$HardwareConfigDecodeItem errorCode2 = i.errorCode;
                               if (errorCode2 == null) {
                                  DevicePersonaLog.d("DevicePersonaHardware", "getTryMaxLongEdgeByMargin hardware errorCode null, return");
                                  return i1;
                               }else {
                                  Map value = errorCode2.getValue(i6);
                                  i3 = "getTryMaxLongEdgeByMargin hardware longEdge ";
                                  if (value != null && uCommon.marginNotSupportErrorCodes != null) {
                                     Iterator iterator = value.keySet().iterator();
                                     while (iterator.hasNext()) {
                                        Integer integer = iterator.next();
                                        DeviceStrategyConfigs$Common marginNotSup1 = uCommon.marginNotSupportErrorCodes;
                                        int len = marginNotSup1.length;
                                        Iterator iterator1 = iterator;
                                        int i11 = 0;
                                        while (true) {
                                           if (i11 < len) {
                                              i = marginNotSup1[i11];
                                              DeviceStrategyConfigs$Common uCommon2 = marginNotSup1;
                                              if (i == -1000 || i == -2000) {
                                                 errorCode1 = Math.abs(integer.intValue()) % 10000;
                                                 errorCode1 = errorCode1 / 1000;
                                                 errorCode1 = errorCode1 * 1000;
                                                 str4 = str1;
                                                 if (errorCode1 == Math.abs(i)) {
                                                    DevicePersonaLog.d("DevicePersonaHardware", i3+i6+" errorCode "+integer+" match notSupportErrorPrefix "+i);
                                                 label_01f2 :
                                                    f = Float.MIN_VALUE;
                                                 label_01f5 :
                                                    if (f) {
                                                       Float uFloat = value.get(integer);
                                                       if (uFloat != null) {
                                                          f = str2 + uFloat.floatValue();
                                                          DevicePersonaLog.d("DevicePersonaHardware", i3+i6+" notSupportErrorRate add "+uFloat+" now is "+f);
                                                          float f1 = f;
                                                       label_0236 :
                                                          iterator = iterator1;
                                                          str1 = str4;
                                                       }else {
                                                          goto label_0236 ;
                                                       }
                                                    }else {
                                                       i11 = i11 + 1;
                                                       marginNotSup1 = uCommon2;
                                                       str1 = str4;
                                                    }
                                                 }
                                              }else if(integer.intValue() == i){
                                                 DevicePersonaLog.d("DevicePersonaHardware", i3+i6+" errorCode "+integer+str1+i);
                                                 str4 = str1;
                                                 goto label_01f2 ;
                                              }else {
                                                 str4 = str1;
                                              }
                                              f = 0;
                                              goto label_01f5 ;
                                           }else {
                                              str4 = str1;
                                              goto label_0236 ;
                                           }
                                        }
                                     }
                                  }
                                  str = str2;
                                  if ((double)str - uCommon.marginNotSupportErrorRate < 0) {
                                     ointArray = 3840;
                                     if (i6 == ointArray && i2 > ointArray) {
                                        DevicePersonaLog.d("DevicePersonaHardware", "getTryMaxLongEdgeByMargin hardware 4k is ok, use targetMarginLongEdge");
                                        goto label_0289 ;
                                     }else {
                                        i4 = i6;
                                     }
                                  }else {
                                     DevicePersonaLog.d("DevicePersonaHardware", i3+i6+" errorRate larger than minErrorrate "+uCommon.marginNotSupportErrorRate+", break");
                                     goto label_0287 ;
                                  }
                               }
                            }else {
                               DevicePersonaLog.e("DevicePersonaHardware", "getTryMaxLongEdgeByMargin decodeItem invalid, should not be base instance");
                               goto label_0287 ;
                            }
                         }
                      }
                      i5 = i5 + 1;
                      i = p0;
                      ointArray = ointArray1;
                      i3 = 4;
                   }else {
                      i10 = i4;
                      goto label_0287 ;
                   }
                }
             }
          }
       }
       DevicePersonaLog.w("DevicePersonaHardware", "getTryMaxLongEdgeByMargin do nothing, return");
       return i1;
    }
    public void init(){
       if (PatchProxy.applyVoid(null, this, DPHardwareConfigManager.class, "1")) {
          return;
       }
       DPHardwareConfigManager tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (this.mIsInit.get()) {
          DevicePersonaLog.w("DevicePersonaHardware", "already init, return");
          _monitor_exit(tmLock);
          return;
       }else {
          DevicePersonaLog.i("DevicePersonaHardware", "init");
          DeviceConfigManager.getInstance();
          this.updateConfig();
          this.mIsInit.set(true);
          _monitor_exit(tmLock);
          return;
       }
    }
    public final boolean isBenchmarkDecoderItemValid(Map p0,List p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DPHardwareConfigManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          DevicePersonaLog.d("DevicePersonaHardware", "isBenchmarkDecoderResultValid decodeItem null, return false");
          return false;
       }else {
          Iterator iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                i = iterator.next().intValue();
                Object mapObject = DevicePersonaUtil.getMapObject(p0, i+".testResult.supportDecode");
                if (!mapObject instanceof Boolean) {
                   break ;
                }else if(mapObject.booleanValue()){
                   DevicePersonaLog.d("DevicePersonaHardware", "isBenchmarkDecoderResultValid supportDecode for checkSize "+i+", return true");
                   return true;
                }
             }else {
                DevicePersonaLog.d("DevicePersonaHardware", "isBenchmarkDecoderResultValid all size valid, return true");
                return true;
             }
          }
          DevicePersonaLog.d("DevicePersonaHardware", "isBenchmarkDecoderResultValid testResult null for checkSize "+i+", return false");
          return false;
       }
    }
    public boolean isDecoderBenchmarkResultValid(String p0,DeviceStrategyConfigs$Common p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DPHardwareConfigManager.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p2 == null || p2.isEmpty()) {
          DevicePersonaLog.d("DevicePersonaHardware", "isDecoderBenchmarkResultValid decoderResult null, return false");
          return false;
       }else {
          boolean b = true;
          try{
             List decoderSizeL = this.getDecoderSizeListConfig(p0, p1);
             if (decoderSizeL == null || decoderSizeL.isEmpty()) {
                DevicePersonaLog.i("DevicePersonaHardware", "isDecoderBenchmarkResultValid decoderConfigSizeList sizeList empty, return true");
                return b;
             }else {
                Map mapObject = DevicePersonaUtil.getMapObject(p2, p0+"."+"portrait"+"."+"mcs");
                Map mapObject1 = DevicePersonaUtil.getMapObject(p2, p0+"."+"portrait"+"."+"mcbb");
                if (mapObject == null && mapObject1 == null) {
                   DevicePersonaLog.d("DevicePersonaHardware", "isDecoderBenchmarkResultValid mcsResult and mcbbResult null, return false");
                   return false;
                }else if(this.isBenchmarkDecoderItemValid(mapObject, decoderSizeL)){
                   DevicePersonaLog.i("DevicePersonaHardware", "isDecoderBenchmarkResultValid mcsResult valid, return true");
                   return b;
                }else if(this.isBenchmarkDecoderItemValid(mapObject1, decoderSizeL)){
                   DevicePersonaLog.i("DevicePersonaHardware", "isDecoderBenchmarkResultValid mcbbResult valid, return true");
                   return b;
                }else {
                   DevicePersonaLog.i("DevicePersonaHardware", "isDecoderBenchmarkResultValid mcs and mcbb both invalid, return false");
                   return false;
                }
             }
          }catch(java.lang.Exception e9){
             DevicePersonaLog.e("DevicePersonaHardware", "isDecoderBenchmarkResultValid error "+e9.getMessage());
             return b;
          }
       }
    }
    public boolean isDecoderHardwareConfigValid(String p0,DeviceStrategyConfigs$Common p1){
       HardwareDecoder avcDecoder;
       DPHardwareConfigManager obj = PatchProxy.applyTwoRefs(p0, p1, this, DPHardwareConfigManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       DevicePersonaLog.i("DevicePersonaHardware", "isDecoderHardwareConfigValid codecType "+p0);
       obj = this.mHardwareConfigs;
       if (obj == null || obj.hardwareDecoder == null) {
          DevicePersonaLog.d("DevicePersonaHardware", "isDecoderHardwareConfigValid hardwareDecoder null, return false");
          return false;
       }else if(("avc").equals(p0)){
          avcDecoder = this.mHardwareConfigs.hardwareDecoder.avcDecoder;
       }else {
          avcDecoder = this.mHardwareConfigs.hardwareDecoder.hevcDecoder;
       }
       if (avcDecoder == null) {
          DevicePersonaLog.d("DevicePersonaHardware", "isDecoderHardwareConfigValid decoderItem null, return false");
          return false;
       }else {
          boolean b = true;
          try{
             List decoderSizeL = this.getDecoderSizeListConfig(p0, p1);
             if (decoderSizeL == null || decoderSizeL.isEmpty()) {
                DevicePersonaLog.w("DevicePersonaHardware", "isDecoderHardwareConfigValid decoderConfigSizeList sizeList empty, return true");
                return b;
             }else if(this.isHardwareDecoderItemValid(avcDecoder.mcsItem, decoderSizeL)){
                DevicePersonaLog.i("DevicePersonaHardware", "isDecoderHardwareConfigValid mcs valid, return true");
                return b;
             }else if(this.isHardwareDecoderItemValid(avcDecoder.mcbbItem, decoderSizeL)){
                DevicePersonaLog.i("DevicePersonaHardware", "isDecoderHardwareConfigValid mcbb valid, return true");
                return b;
             }else {
                DevicePersonaLog.i("DevicePersonaHardware", "isDecoderHardwareConfigValid mcs and mcbb both invalid, return false");
                return false;
             }
          }catch(java.lang.Exception e5){
             DevicePersonaLog.e("DevicePersonaHardware", "isDecoderHardwareConfigValid error "+e5.getMessage());
             return b;
          }
       }
    }
    public final boolean isHardwareDecoderItemValid(HardwareDecoderItem$HardwareConfigDecodeItem p0,List p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DPHardwareConfigManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          DevicePersonaLog.d("DevicePersonaHardware", "isHardwareDecoderItemValid decodeItem null, return false");
          return b;
       }else {
          boolean b1 = true;
          if (p0.supportRate != null && (p1 == null || p1.isEmpty())) {
             DevicePersonaLog.d("DevicePersonaHardware", "isHardwareDecoderItemValid decodeItem.supportRate null, return true");
             return b1;
          }else {
             Iterator iterator = p1.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   i = iterator.next().intValue();
                   if (p0.maxLongEdge >= i) {
                      break ;
                   }else if(p0.supportRate.getValue(i) - 0xbe112e0be826d695 < 0){
                      DevicePersonaLog.d("DevicePersonaHardware", "isHardwareDecoderItemValid supportRate "+p0.supportRate.getValue(i)+" invalid for checkSize "+i+", return false");
                      return b;
                   }
                }else {
                   DevicePersonaLog.d("DevicePersonaHardware", "isHardwareDecoderItemValid all size valid, return true");
                   return b1;
                }
             }
             DevicePersonaLog.d("DevicePersonaHardware", "isHardwareDecoderItemValid maxLongEdge "+p0.maxLongEdge+" > checkSize "+i+", return true");
             return b1;
          }
       }
    }
    public boolean isHwDecodeSupport(String p0,int p1,int p2){
       DPHardwareConfigManager$EditDecoderConfig hevc;
       if (PatchProxy.isSupport(DPHardwareConfigManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, DPHardwareConfigManager.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       DevicePersonaLog.d("DevicePersonaHardware", "isHwDecodeSupport codec:"+p0+" longEdge:"+p2+" orientation:"+p1);
       DPHardwareConfigManager$EditDecoderConfig editDecoderC = this.getEditDecoderConfig();
       boolean b = false;
       if (editDecoderC == null) {
          DevicePersonaLog.e("DevicePersonaHardware", "isHwDecodeSupport EditDecoderConfig null return false");
          return b;
       }else {
          DPHardwareConfigManager$EditDecoderConfig avc = editDecoderC.avc;
          if (("hevc").equals(p0)) {
             hevc = editDecoderC.hevc;
             if (hevc != null) {
                avc = hevc;
             }
          }
          if (avc == null) {
             DevicePersonaLog.e("DevicePersonaHardware", "isHwDecodeSupport srcTypeDecoderConfig null return false");
             return b;
          }else if(("mcbb").equals(avc.suggestDecodeType)){
             if (avc.mcbbMaxLongEdge >= p2) {
             label_007e :
                b = true;
             }
          }else if(("mcs").equals(avc.suggestDecodeType)){
             if (avc.mcsMaxLongEdge >= p2) {
                goto label_007e ;
             }
          }else {
             DevicePersonaLog.e("DevicePersonaHardware", "isHwDecodeSupport srcTypeDecoderConfig.suggestDecodeType error return false");
             return b;
          }
          DevicePersonaLog.i("DevicePersonaHardware", "isHwDecodeSupport return "+b);
          return b;
       }
    }
    public boolean isInited(){
       Object obj = PatchProxy.apply(null, this, DPHardwareConfigManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mIsInit.get();
    }
    public DPHardwareConfigManager$EncodeResult isSupportEncodeWithResult(Context p0,String p1,int p2,float p3,boolean p4,BenchmarkEncodeProfile p5,int p6){
       DPHardwareConfigManager$EncodeResult uEncodeResul;
       DPHardwareConfigManager uDPHardwareC = DPHardwareConfigManager.class;
       if (PatchProxy.isSupport(uDPHardwareC)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Float.valueOf(p3),Boolean.valueOf(p4),p5,Integer.valueOf(p6)};
          p0 = PatchProxy.apply(objArray, this, uDPHardwareC, "10");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       DPHardwareConfigManager tmLock = this.mLock;
       _monitor_enter(tmLock);
       DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncodeWithResult codecType:"+p1+" videoLongEdge:"+p2+" minHWEncodeSpeed:"+p3+" supportBenchmarkResult:"+p4+" minProfile:"+p5.getValue()+" supportAlignmentFlag:"+p6);
       int i = 960;
       if (p2 <= 1024 && p2 >= i) {
          p2 = 960;
       }
       if (p2 > 1920 && p2 <= this.mMaxEncode1080PLongEdge) {
          p2 = 1920;
       }
       DPHardwareConfigManager$HwEncodeLimit hwEncodeLimi = new DPHardwareConfigManager$HwEncodeLimit(p3, p5.getValue(), p6);
       DPHardwareConfigManager$EncodeResult hwEncodeSupp = this.getHwEncodeSupportByHardwareConfig(p1, hwEncodeLimi, p2);
       if (hwEncodeSupp != null) {
          _monitor_exit(tmLock);
          return hwEncodeSupp;
       }else if(!p4){
          DevicePersonaLog.d("DevicePersonaHardware", "isSupportEncode not supportBenchmarkResult,return false");
          uEncodeResul = new DPHardwareConfigManager$EncodeResult();
          uEncodeResul.isSupport = false;
          uEncodeResul.notSupportReason = 9;
          _monitor_exit(tmLock);
          return uEncodeResul;
       }else {
          uEncodeResul = this.getHwEncodeSupportByLocalBenchmarkResult(p1, hwEncodeLimi, p2);
          if (uEncodeResul == null) {
             uEncodeResul = new DPHardwareConfigManager$EncodeResult();
             uEncodeResul.isSupport = false;
             uEncodeResul.notSupportReason = 6;
          }
          _monitor_exit(tmLock);
          return uEncodeResul;
       }
    }
    public boolean openHwDecodeStrategyOpt(){
       DevicePersonaConfig obj = PatchProxy.apply(null, this, DPHardwareConfigManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = DeviceConfigManager.getInstance().getConfig();
       boolean b = false;
       if (obj != null && obj.getDeviceStrategyConfigs() != null) {
          DeviceStrategyConfigs common = obj.getDeviceStrategyConfigs().common;
          if (common != null && (common.reComputeMaxLongEdge == null && (common.tryHWLongEdgeMargin > null || !("mcbb").equals(common.preferHWDecodeType)))) {
             b = true;
          }
       }
       return b;
    }
    public void updateConfig(){
       if (PatchProxy.applyVoid(null, this, DPHardwareConfigManager.class, "3")) {
          return;
       }
       DevicePersonaConfig config = DeviceConfigManager.getInstance().getConfig();
       if (config != null) {
          this.mHardwareConfigs = config.getHardwareConfigs();
          DeviceStrategyConfigs deviceStrate = config.getDeviceStrategyConfigs();
          if (deviceStrate != null) {
             deviceStrate = deviceStrate.common;
             if (deviceStrate != null) {
                this.mMaxEncode1080PLongEdge = deviceStrate.maxEncode1080PLongEdge;
             }
          }
       }
       return;
    }
}
