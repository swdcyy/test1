package com.kwai.video.player.mid.manifest.v2.filter.HlsKvcHevcRepresentationFilterV2;
import com.kwai.video.player.mid.manifest.v2.filter.RepresentationFilter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.Context;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.HlsAtlasKitConfig;

public class HlsKvcHevcRepresentationFilterV2 implements RepresentationFilter	// class@000b76
{

    public void HlsKvcHevcRepresentationFilterV2(){
       super();
    }
    public boolean execute(List p0){
       String videoCodec;
       String qualityType;
       String this;
       String str4;
       int i2;
       ArrayList uArrayList1;
       Set set;
       Iterator iterator2;
       String key;
       List value;
       Representation representati2;
       Representation representati3;
       int i5;
       Representation representati4;
       Representation uEntry11;
       int uEntry11;
       String obj = p0;
       String obj1 = PatchProxy.applyOneRefs(obj, this, HlsKvcHevcRepresentationFilterV2.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       int i = 0;
       if (obj == null || p0.isEmpty()) {
          return false;
       }
       int i1 = (obj.get(i).getMinorInfo()).isEmpty() ^ 1;
       HashMap hashMap = new HashMap();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       Representation representati = 1;
       String str = null;
       String str1 = null;
       String str2 = null;
       String str3 = "720p";
       while (iterator.hasNext()) {
          Representation representati1 = iterator.next();
          videoCodec = representati1.getVideoCodec();
          qualityType = representati1.getQualityType();
          obj1 = representati1.getMinorInfo();
          this = "480p";
          obj = "576p";
          if (!i1) {
             str4 = str2;
             if (qualityType.equals("720p-kvc")) {
                representati1.setQualityType(str3);
                if (videoCodec != null && videoCodec.contains("kvc")) {
                   str = videoCodec;
                }else {
                   iterator.remove();
                   qualityType = null;
                label_0084 :
                   if (str3.equals("576p-kvc")) {
                      representati1.setQualityType(obj);
                      if (videoCodec != null && videoCodec.contains("kvc")) {
                         str1 = videoCodec;
                         qualityType = obj;
                         i2 = qualityType;
                      }else {
                         iterator.remove();
                         qualityType = obj;
                         i2 = false;
                      }
                   }else {
                      i2 = qualityType;
                      qualityType = str3;
                   }
                   if (qualityType.equals("480p-kvc")) {
                      representati1.setQualityType(this);
                      if (videoCodec != null && videoCodec.contains("kvc")) {
                         qualityType = this;
                         str2 = videoCodec;
                      }else {
                         iterator.remove();
                         qualityType = this;
                      label_012c :
                         str2 = str4;
                         i2 = null;
                      }
                   }else {
                      str2 = str4;
                   }
                }
             }else {
                str3 = qualityType;
             }
             qualityType = 1;
             goto label_0084 ;
          }else {
             str4 = str2;
             if (!qualityType.equals(str3) && (qualityType.equals(obj) || qualityType.equals(this))) {
                if (obj1.contains("-kvc") && (videoCodec != null && videoCodec.contains("kvc"))) {
                   if (representati) {
                      if (qualityType.equals(str3)) {
                         str = videoCodec;
                      }else if(qualityType.equals(obj)){
                         str1 = videoCodec;
                      }else if(qualityType.equals(this)){
                         str2 = videoCodec;
                      label_010b :
                         Iterator iterator1 = uArrayList.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               if (!videoCodec.equals(iterator1.next())) {
                                  representati = null;
                               }
                            }
                         }
                      }
                      str2 = str4;
                      goto label_010b ;
                   }else {
                      str2 = str4;
                   }
                   uArrayList.add(videoCodec);
                }else {
                   iterator.remove();
                   goto label_012c ;
                }
             }else {
                str2 = str4;
             }
             i2 = 1;
          }
          if (i2 != null) {
             if (!i1) {
                if (hashMap.containsKey(qualityType)) {
                   hashMap.get(qualityType).add(representati1);
                }else {
                   uArrayList1 = new ArrayList();
                   uArrayList1.add(representati1);
                   hashMap.put(qualityType, uArrayList1);
                }
             }else if(hashMap.containsKey(qualityType+obj1)){
                hashMap.get(qualityType+obj1).add(representati1);
             }else {
                uArrayList1 = new ArrayList();
                uArrayList1.add(representati1);
                hashMap.put(qualityType+obj1, uArrayList1);
             }
          }
          qualityType = 1;
       }
       str4 = str2;
       if (!i1) {
          set = (str != null && (str1 != null && (str4 != null && (str.equals(str1) && str.equals(str4)))))? 1: null;
          if (set) {
             iterator2 = hashMap.entrySet().iterator();
             this = 1;
             while (iterator2.hasNext()) {
                Map$Entry uEntry = iterator2.next();
                key = uEntry.getKey();
                value = uEntry.getValue();
                if (key.equals(str3) && value.size() == 2) {
                   int i3 = 0;
                   String videoCodec1 = value.get(i3).getVideoCodec();
                   int i4 = 1;
                   String videoCodec2 = value.get(i4).getVideoCodec();
                   if (videoCodec1 != null && videoCodec1.contains("kvc")) {
                      representati2 = value.get(i3);
                      representati3 = value.get(i4);
                   }else if(videoCodec2 != null && videoCodec2.contains("kvc")){
                      representati2 = value.get(i4);
                      representati3 = value.get(0);
                   }else {
                      i3 = 0;
                      if (value.get(i3).getQuality() - value.get(i4).getQuality() > 0) {
                         representati2 = value.get(i3);
                         representati3 = value.get(i4);
                      }else {
                         representati2 = value.get(i4);
                         representati3 = value.get(i3);
                      }
                   }
                   i3 = representati2.getAvgBitrate();
                   int avgBitrate = representati3.getAvgBitrate();
                   KwaiBatteryInfoUtil.collectBatteryInfo(WaynePlayerInitor.APP_CONTEXT);
                   HlsAtlasKitConfig hlsAtlasKitC = InjectConfig.getConfig().getHlsAtlasKitConfig();
                   HlsAtlasKitConfig hardDecodeKv = (KwaiBatteryInfoUtil.getIsCharging())? hlsAtlasKitC.hardDecodeKvcHevcBitrateThresForCharging: hlsAtlasKitC.hardDecodeKvcHevcBitrateThres;
                   double d = (double)avgBitrate * hardDecodeKv;
                   if ((double)i3 - d <= 0) {
                      this = 0;
                   }
                }
             }
          label_0333 :
             iterator2 = hashMap.entrySet().iterator();
             while (iterator2.hasNext()) {
                value = iterator2.next().getValue();
                if (!i1) {
                   if (value.size() == 2) {
                      i5 = 0;
                      key = value.get(i5).getVideoCodec();
                      int i6 = 1;
                      videoCodec = value.get(i6).getVideoCodec();
                      if (key != null && key.contains("kvc")) {
                         representati4 = value.get(i5);
                         representati3 = value.get(i6);
                      }else if(videoCodec != null && videoCodec.contains("kvc")){
                         representati4 = value.get(i6);
                         representati3 = value.get(0);
                      }else {
                         i5 = 0;
                         if (value.get(i5).getQuality() - value.get(i6).getQuality() > 0) {
                            representati4 = value.get(i5);
                            representati3 = value.get(i6);
                         }else {
                            representati4 = value.get(i6);
                            representati3 = value.get(i5);
                         }
                      }
                      if (this) {
                         p0.remove(representati4);
                      }else {
                         p0.remove(representati3);
                      }
                   }else {
                      i5 = p0;
                   }
                }else {
                   List list = p0;
                   if (value.size() >= 2) {
                      Iterator iterator3 = value.iterator();
                      while (iterator3.hasNext()) {
                         representati4 = iterator3.next();
                         if (this) {
                            if (representati4.getVideoCodec() != null && (representati4.getVideoCodec()).contains("kvc")) {
                               list.remove(representati4);
                            }else {
                               continue ;
                            }
                         }else if(representati4.getVideoCodec() != null && !(representati4.getVideoCodec()).contains("kvc")){
                            list.remove(representati4);
                            continue ;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
             return true;
          }
       }else {
          videoCodec = str4;
          if (representati != null) {
             representati = (str != null && (str1 != null && videoCodec != null))? 1: null;
          }
       label_0296 :
          if (representati != null) {
             iterator2 = hashMap.entrySet().iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   Map$Entry List uEntry1 = iterator2.next();
                   qualityType = uEntry1.getKey();
                   uEntry1 = uEntry1.getValue();
                   if (qualityType.equals("720p-b1f1") && uEntry1.size() >= 2) {
                      iterator2 = uEntry1.iterator();
                      Representation representati5 = null;
                      Representation representati6 = null;
                      while (iterator2.hasNext()) {
                         uEntry11 = iterator2.next();
                         if (uEntry11.getVideoCodec() != null && (uEntry11.getVideoCodec()).contains("kvc")) {
                            representati5 = uEntry11;
                         }else if(uEntry11.getVideoCodec() != null && !(uEntry11.getVideoCodec()).contains("kvc")){
                            representati6 = uEntry11;
                         }
                         if (representati5 != null && representati6 != null) {
                         }else {
                            continue ;
                         }
                      }
                      if (representati5 != null && representati6 != null) {
                         i = representati5.getAvgBitrate();
                         uEntry11 = representati6.getAvgBitrate();
                         KwaiBatteryInfoUtil.collectBatteryInfo(WaynePlayerInitor.APP_CONTEXT);
                         HlsAtlasKitConfig hlsAtlasKitC1 = InjectConfig.getConfig().getHlsAtlasKitConfig();
                         hlsAtlasKitC1 = (KwaiBatteryInfoUtil.getIsCharging())? hlsAtlasKitC1.hardDecodeKvcHevcBitrateThresForCharging: hlsAtlasKitC1.hardDecodeKvcHevcBitrateThres;
                         set = ((double)i - ((double)uEntry11 * hlsAtlasKitC1) <= 0)? null: 1;
                         uEntry11 = set;
                         goto label_0333 ;
                      }
                   }
                }
             }
          }
       }
    label_0332 :
       this = 1;
       goto label_0333 ;
    }
}
