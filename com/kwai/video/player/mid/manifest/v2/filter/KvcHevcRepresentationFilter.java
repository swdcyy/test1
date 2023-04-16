package com.kwai.video.player.mid.manifest.v2.filter.KvcHevcRepresentationFilter;
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
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.AtlasKitConfig;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.Context;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;

public class KvcHevcRepresentationFilter implements RepresentationFilter	// class@000b77
{

    public void KvcHevcRepresentationFilter(){
       super();
    }
    public boolean execute(List p0){
       Representation representati1;
       Representation representati2;
       Object obj = PatchProxy.applyOneRefs(p0, this, KvcHevcRepresentationFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.isEmpty()) {
          return false;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       String str = "-kvc";
       while (iterator.hasNext()) {
          Representation representati = iterator.next();
          String qualityType = representati.getQualityType();
          if (qualityType.contains(str)) {
             String str1 = "";
             if (hashMap.containsKey(qualityType.replaceAll(str, str1))) {
                hashMap.get(qualityType.replaceAll(str, str1)).add(representati);
             }else {
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(representati);
                hashMap.put(qualityType.replaceAll(str, str1), uArrayList);
             }
          }else if(hashMap.containsKey(qualityType)){
             hashMap.get(qualityType).add(representati);
          }else {
             ArrayList uArrayList1 = new ArrayList();
             uArrayList1.add(representati);
             hashMap.put(qualityType, uArrayList1);
          }
       }
       Iterator iterator1 = hashMap.entrySet().iterator();
       int i = 1;
       while (iterator1.hasNext()) {
          List value = iterator1.next().getValue();
          if (value.size() == 2) {
             if ((value.get(false).getQualityType()).contains(str)) {
                representati1 = value.get(false);
                representati2 = value.get(i);
             }else {
                representati1 = value.get(i);
                representati2 = value.get(false);
             }
             representati1.setQualityType(representati2.getQualityType());
             i = representati1.getAvgBitrate();
             int avgBitrate = representati2.getAvgBitrate();
             AtlasKitConfig atlasKitConf = InjectConfig.getConfig().getAtlasKitConfig();
             KwaiBatteryInfoUtil.collectBatteryInfo(WaynePlayerInitor.APP_CONTEXT);
             atlasKitConf = (KwaiBatteryInfoUtil.getIsCharging())? atlasKitConf.hardDecodeKvcHevcBitrateThresForCharging: atlasKitConf.hardDecodeKvcHevcBitrateThres;
             double d = (double)avgBitrate * atlasKitConf;
             if ((double)i - d > 0) {
                p0.remove(representati1);
             }else {
                p0.remove(representati2);
             }
          }
       }
       return i;
    }
}
