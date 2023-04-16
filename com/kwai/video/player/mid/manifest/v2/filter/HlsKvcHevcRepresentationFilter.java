package com.kwai.video.player.mid.manifest.v2.filter.HlsKvcHevcRepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.RepresentationFilter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Iterator;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.lang.CharSequence;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.Context;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.HlsAtlasKitConfig;

public class HlsKvcHevcRepresentationFilter implements RepresentationFilter	// class@000b75
{

    public void HlsKvcHevcRepresentationFilter(){
       super();
    }
    public boolean execute(List p0){
       Representation representati;
       String videoCodec;
       String key;
       Representation representati1;
       Representation representati2;
       Object obj = PatchProxy.applyOneRefs(p0, this, HlsKvcHevcRepresentationFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.isEmpty()) {
          return false;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       String str = null;
       String str1 = str;
       String str2 = str1;
       String str3 = "720p";
       String str4 = "kvc";
       int i = 1;
       while (iterator.hasNext()) {
          representati = iterator.next();
          videoCodec = representati.getVideoCodec();
          String qualityType = representati.getQualityType();
          if (qualityType.equals("720p-kvc")) {
             representati.setQualityType(str3);
             if (videoCodec != null && videoCodec.contains(str4)) {
                str = videoCodec;
             }else {
                iterator.remove();
                i = 0;
             }
          }else {
             str3 = qualityType;
          }
          String str5 = "576p";
          if (str3.equals("576p-kvc")) {
             representati.setQualityType(str5);
             if (videoCodec != null && videoCodec.contains(str4)) {
                str1 = videoCodec;
                str3 = str5;
             }else {
                iterator.remove();
                str3 = str5;
                i = 0;
             }
          }
          str5 = "480p";
          if (str3.equals("480p-kvc")) {
             representati.setQualityType(str5);
             if (videoCodec != null && videoCodec.contains(str4)) {
                str2 = videoCodec;
                str3 = str5;
             }else {
                iterator.remove();
                str3 = str5;
                i = 0;
             }
          }
          if (i) {
             if (hashMap.containsKey(str3)) {
                hashMap.get(str3).add(representati);
             }else {
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(representati);
                hashMap.put(str3, uArrayList);
             }
          }
       }
       Set set = (str != null && (str1 != null && (str2 != null && (str.equals(str1) && str.equals(str2)))))? 1: null;
       if (set) {
          iterator = hashMap.entrySet().iterator();
          str1 = 1;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             key = uEntry.getKey();
             List value = uEntry.getValue();
             if (key.equals(str3) && value.size() == 2) {
                key = value.get(false).getVideoCodec();
                videoCodec = value.get(i).getVideoCodec();
                if (key != null && key.contains(str4)) {
                   representati = value.get(false);
                   representati1 = value.get(i);
                }else if(videoCodec != null && videoCodec.contains(str4)){
                   representati = value.get(i);
                   representati1 = value.get(false);
                }else if(value.get(false).getQuality() - value.get(i).getQuality() > 0){
                   representati = value.get(false);
                   representati1 = value.get(i);
                }else {
                   representati = value.get(i);
                   representati1 = value.get(false);
                }
                int avgBitrate = representati.getAvgBitrate();
                int avgBitrate1 = representati1.getAvgBitrate();
                KwaiBatteryInfoUtil.collectBatteryInfo(WaynePlayerInitor.APP_CONTEXT);
                HlsAtlasKitConfig hlsAtlasKitC = InjectConfig.getConfig().getHlsAtlasKitConfig();
                HlsAtlasKitConfig hardDecodeKv = (KwaiBatteryInfoUtil.getIsCharging())? hlsAtlasKitC.hardDecodeKvcHevcBitrateThresForCharging: hlsAtlasKitC.hardDecodeKvcHevcBitrateThres;
                double d = (double)avgBitrate1 * hardDecodeKv;
                if ((double)avgBitrate - d <= 0) {
                   str1 = 0;
                }
             }
          }
       }else {
          str1 = 1;
       }
       Iterator iterator1 = hashMap.entrySet().iterator();
       while (iterator1.hasNext()) {
          List value1 = iterator1.next().getValue();
          if (value1.size() == 2) {
             str2 = value1.get(false).getVideoCodec();
             key = value1.get(i).getVideoCodec();
             if (str2 != null && str2.contains(str4)) {
                representati1 = value1.get(false);
                representati2 = value1.get(i);
             }else if(key != null && key.contains(str4)){
                representati1 = value1.get(i);
                representati2 = value1.get(false);
             }else if(value1.get(false).getQuality() - value1.get(i).getQuality() > 0){
                representati1 = value1.get(false);
                representati2 = value1.get(i);
             }else {
                representati1 = value1.get(i);
                representati2 = value1.get(false);
             }
             if (str1) {
                p0.remove(representati1);
             }else {
                p0.remove(representati2);
             }
          }
       }
       return i;
    }
}
