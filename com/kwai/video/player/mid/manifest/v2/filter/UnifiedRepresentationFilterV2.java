package com.kwai.video.player.mid.manifest.v2.filter.UnifiedRepresentationFilterV2;
import com.kwai.video.player.mid.manifest.v2.filter.RepresentationFilter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.mid.manifest.v2.Representation;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.Context;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;
import com.kwai.video.wayne.player.config.ks_sub.AASVersionConfig;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.google.gson.Gson;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.AtlasKitConfig;
import com.kwai.video.wayne.player.config.ks_sub.AtlasKitPostConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map$Entry;

public class UnifiedRepresentationFilterV2 implements RepresentationFilter	// class@000b7b
{

    public void UnifiedRepresentationFilterV2(){
       super();
    }
    public boolean execute(List p0){
       double d1;
       int i2;
       double d2;
       String str2;
       Iterator iterator2;
       Iterator iterator3;
       Representation obj2;
       boolean b;
       int iterator2;
       Representation representati1;
       int avgBitrate;
       int i4;
       String str4;
       HashMap hashMap1;
       int avgBitrate1;
       double d5;
       Representation representati2;
       ArrayList uArrayList1;
       Representation representati3;
       Object obj = p0;
       AtlasKitConfig obj1 = PatchProxy.applyOneRefs(obj, this, UnifiedRepresentationFilterV2.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       int i = 0;
       if (obj == null || p0.isEmpty()) {
          return false;
       }
       int i1 = (obj.get(i).getMinorInfo()).isEmpty() ^ 1;
       KwaiBatteryInfoUtil.collectBatteryInfo(WaynePlayerInitor.APP_CONTEXT);
       boolean isCharging = KwaiBatteryInfoUtil.getIsCharging();
       int batteryLevel = KwaiBatteryInfoUtil.getBatteryLevel();
       int currentTherm = KwaiBatteryInfoUtil.getCurrentThermalStatus();
       int isPowerSaveM = KwaiBatteryInfoUtil.getIsPowerSaveMode();
       String str = "";
       if (i1) {
          AASVersionConfig uAASVersionC = new AASVersionConfig();
          String jSON = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getJSON("AASVersionConfig", str);
          if (jSON != null && jSON.length()) {
             uAASVersionC = new Gson().h(jSON, AASVersionConfig.class);
          }
          double d = 100.00f;
          if (isCharging) {
             d1 = (double)uAASVersionC.kvcBitrateThres / d;
             i2 = i1;
             d2 = (double)uAASVersionC.postBitrateThres;
          }else {
             i2 = i1;
             d1 = (double)uAASVersionC.kvcBitrateThresForCharging / d;
             d2 = (double)uAASVersionC.postBitrateThresForCharging;
          }
          d2 = d2 / d;
       }else {
          i2 = i1;
          obj1 = InjectConfig.getConfig().getAtlasKitConfig();
          obj1 = (isCharging)? obj1.hardDecodeKvcHevcBitrateThresForCharging: obj1.hardDecodeKvcHevcBitrateThres;
          d1 = obj1;
          AtlasKitPostConfig uAtlasKitPos = new AtlasKitPostConfig();
          String jSON1 = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getJSON("AtlasKitPostConfig", str);
          if (jSON1 != null && jSON1.length()) {
             uAtlasKitPos = new Gson().h(jSON1, AtlasKitPostConfig.class);
          }
          if (isCharging) {
             uAtlasKitPos = uAtlasKitPos.postBitrateThresForCharging;
          }else {
             uAtlasKitPos = uAtlasKitPos.postBitrateThres;
          }
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       String str1 = "-kvc";
       while (iterator.hasNext()) {
          Representation representati = iterator.next();
          if (i2) {
             if (!(representati.getMinorInfo()).contains("-ad")) {
                str2 = representati.getQualityType()+representati.getSubLevel();
             label_0115 :
                if (hashMap.containsKey(str2)) {
                   hashMap.get(str2).add(representati);
                }else {
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(representati);
                   hashMap.put(str2, uArrayList);
                }
             }
          }else {
             str2 = (representati.getQualityType()).replaceAll(str1, str);
             goto label_0115 ;
          }
          str2 = 1;
       }
       Iterator iterator1 = hashMap.entrySet().iterator();
       String str3 = "-post";
       while (iterator1.hasNext()) {
          List value = iterator1.next().getValue();
          if (i2) {
             if (batteryLevel > 20 && (currentTherm >= 2 || isPowerSaveM)) {
                iterator2 = value.iterator();
                while (iterator2.hasNext()) {
                   iterator3 = iterator1;
                   obj2 = iterator2.next();
                   b = isPowerSaveM;
                   if ((obj2.getMinorInfo()).contains(str3)) {
                      obj.remove(obj2);
                      iterator2.remove();
                   }
                   iterator1 = iterator3;
                   isPowerSaveM = b;
                }
             }
             iterator3 = iterator1;
             b = isPowerSaveM;
             int i3 = 1;
             if (value.size() > i3) {
                iterator2 = value.size() - i3;
                while (iterator2 > 0) {
                   representati1 = value.get(0);
                   obj2 = value.get(i3);
                   if (!(representati1.getMinorInfo()).contains(str1) || (!(obj2.getMinorInfo()).contains(str1) || (!(representati1.getMinorInfo()).contains(str1) && (obj2.getMinorInfo()).contains(str1)))) {
                      if ((representati1.getMinorInfo()).contains(str1)) {
                         iterator2 = representati1.getAvgBitrate();
                         avgBitrate = obj2.getAvgBitrate();
                      }else {
                         iterator2 = obj2.getAvgBitrate();
                         avgBitrate = representati1.getAvgBitrate();
                      }
                      i4 = currentTherm;
                      str4 = str;
                      hashMap1 = hashMap;
                      iterator2 = batteryLevel;
                      double d3 = (double)avgBitrate * d1;
                      if ((double)iterator2 - d3 > 0) {
                         if ((representati1.getMinorInfo()).contains(str1)) {
                            obj.remove(representati1);
                            value.remove(0);
                         }else {
                            obj.remove(obj2);
                            value.remove(1);
                         }
                      }else {
                         currentTherm = 1;
                         if ((representati1.getMinorInfo()).contains(str1)) {
                            obj.remove(obj2);
                            value.remove(currentTherm);
                         }else {
                            obj.remove(representati1);
                            value.remove(0);
                         }
                      }
                   }else {
                      iterator2 = batteryLevel;
                      i4 = currentTherm;
                      str4 = str;
                      hashMap1 = hashMap;
                      if (!(representati1.getMinorInfo()).contains(str3) || (!(obj2.getMinorInfo()).contains(str3) || (!(representati1.getMinorInfo()).contains(str3) && (obj2.getMinorInfo()).contains(str3)))) {
                         if ((representati1.getMinorInfo()).contains(str3)) {
                            currentTherm = representati1.getAvgBitrate();
                            avgBitrate1 = obj2.getAvgBitrate();
                         }else {
                            currentTherm = obj2.getAvgBitrate();
                            avgBitrate1 = representati1.getAvgBitrate();
                         }
                         double d4 = (double)avgBitrate1 * d2;
                         if ((double)currentTherm - d4 > 0) {
                            if ((representati1.getMinorInfo()).contains(str3)) {
                               obj.remove(representati1);
                               value.remove(0);
                            }else {
                               obj.remove(obj2);
                               value.remove(1);
                            }
                         }else {
                            currentTherm = 1;
                            if ((representati1.getMinorInfo()).contains(str3)) {
                               obj.remove(obj2);
                               value.remove(currentTherm);
                            }else {
                               obj.remove(representati1);
                               value.remove(0);
                            label_02ce :
                               batteryLevel = iterator2;
                               currentTherm = i4;
                               str = str4;
                               hashMap = hashMap1;
                               i3 = 1;
                            }
                         }
                      }else {
                         batteryLevel = 0;
                         if (representati1.getAvgBitrate() > obj2.getAvgBitrate()) {
                            obj.remove(representati1);
                            value.remove(batteryLevel);
                            goto label_02ce ;
                         }else {
                            obj.remove(obj2);
                            value.remove(1);
                            goto label_02ce ;
                         }
                      }
                   }
                   batteryLevel = 0;
                   goto label_02ce ;
                }
             }
             iterator2 = batteryLevel;
             i4 = currentTherm;
             str4 = str;
             hashMap1 = hashMap;
          label_0350 :
             d5 = d1;
          }else {
             iterator3 = iterator1;
             iterator2 = batteryLevel;
             i4 = currentTherm;
             b = isPowerSaveM;
             str4 = str;
             hashMap1 = hashMap;
             batteryLevel = 0;
             if (value.size() == 2) {
                if ((value.get(batteryLevel).getQualityType()).contains(str1)) {
                   obj2 = value.get(batteryLevel);
                   representati1 = value.get(1);
                }else {
                   obj2 = value.get(1);
                   representati1 = value.get(batteryLevel);
                }
                obj2.setQualityType(representati1.getQualityType());
                currentTherm = obj2.getAvgBitrate();
                avgBitrate1 = representati1.getAvgBitrate();
                AtlasKitConfig atlasKitConf = InjectConfig.getConfig().getAtlasKitConfig();
                atlasKitConf = (isCharging)? atlasKitConf.hardDecodeKvcHevcBitrateThresForCharging: atlasKitConf.hardDecodeKvcHevcBitrateThres;
                d5 = d1;
                double d6 = (double)avgBitrate1 * atlasKitConf;
                if ((double)currentTherm - d6 > 0) {
                   obj.remove(obj2);
                }else {
                   obj.remove(representati1);
                }
             }else {
                goto label_0350 ;
             }
          }
          batteryLevel = iterator2;
          iterator1 = iterator3;
          isPowerSaveM = b;
          currentTherm = i4;
          str = str4;
          hashMap = hashMap1;
          d1 = d5;
          iterator2 = this;
       }
       iterator2 = batteryLevel;
       i4 = currentTherm;
       b = isPowerSaveM;
       str4 = str;
       hashMap1 = hashMap;
       if (!i2) {
          hashMap1.clear();
          iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             representati2 = iterator1.next();
             String str5 = str4;
             String str6 = (representati2.getQualityType()).replaceAll(str3, str5);
             HashMap hashMap2 = hashMap1;
             if (hashMap2.containsKey(str6)) {
                hashMap2.get(str6).add(representati2);
             }else {
                uArrayList1 = new ArrayList();
                uArrayList1.add(representati2);
                hashMap2.put(str6, uArrayList1);
             }
             str4 = str5;
             hashMap1 = hashMap2;
          }
          iterator1 = hashMap1.entrySet().iterator();
          while (iterator1.hasNext()) {
             List value1 = iterator1.next().getValue();
             if (value1.size() == 2) {
                batteryLevel = 0;
                if ((value1.get(batteryLevel).getQualityType()).contains(str3)) {
                   representati3 = value1.get(batteryLevel);
                   representati2 = value1.get(1);
                }else {
                   representati3 = value1.get(1);
                   representati2 = value1.get(batteryLevel);
                }
                isPowerSaveM = i4;
                uArrayList1 = 2;
                if (iterator2 > 20 && (isPowerSaveM >= uArrayList1 || b)) {
                   obj.remove(representati3);
                }else {
                   double d7 = (double)representati2.getAvgBitrate() * d2;
                   if ((double)representati3.getAvgBitrate() - d7 > 0) {
                      obj.remove(representati3);
                   }else {
                      obj.remove(representati2);
                   }
                }
             }else {
                isPowerSaveM = i4;
                uArrayList1 = 2;
             }
             i4 = isPowerSaveM;
          }
       }
       return true;
    }
}
