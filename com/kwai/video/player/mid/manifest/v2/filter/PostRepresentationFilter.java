package com.kwai.video.player.mid.manifest.v2.filter.PostRepresentationFilter;
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
import com.kwai.video.wayne.player.config.ks_sub.AtlasKitPostConfig;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.google.gson.Gson;

public class PostRepresentationFilter implements RepresentationFilter	// class@000b79
{

    public void PostRepresentationFilter(){
       super();
    }
    public boolean execute(List p0){
       Representation representati1;
       Representation representati2;
       Object obj = PatchProxy.applyOneRefs(p0, this, PostRepresentationFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.isEmpty()) {
          return false;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       String str = "";
       while (iterator.hasNext()) {
          Representation representati = iterator.next();
          String qualityType = representati.getQualityType();
          if (qualityType.contains("-post")) {
             if (hashMap.containsKey(qualityType.replaceAll("-post", str))) {
                hashMap.get(qualityType.replaceAll("-post", str)).add(representati);
             }else {
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(representati);
                hashMap.put(qualityType.replaceAll("-post", str), uArrayList);
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
       boolean i = 1;
       while (iterator1.hasNext()) {
          List value = iterator1.next().getValue();
          int i1 = 2;
          if (value.size() == i1) {
             if ((value.get(false).getQualityType()).contains("-post")) {
                representati1 = value.get(false);
                representati2 = value.get(i);
             }else {
                representati1 = value.get(i);
                representati2 = value.get(false);
             }
             KwaiBatteryInfoUtil.collectBatteryInfo(WaynePlayerInitor.APP_CONTEXT);
             i = KwaiBatteryInfoUtil.getIsCharging();
             int currentTherm = KwaiBatteryInfoUtil.getCurrentThermalStatus();
             boolean isPowerSaveM = KwaiBatteryInfoUtil.getIsPowerSaveMode();
             if (KwaiBatteryInfoUtil.getBatteryLevel() > 20 && (currentTherm >= i1 || isPowerSaveM)) {
                p0.remove(representati1);
             }else {
                i1 = representati1.getAvgBitrate();
                int avgBitrate = representati2.getAvgBitrate();
                AtlasKitPostConfig uAtlasKitPos = new AtlasKitPostConfig();
                String jSON = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getJSON("AtlasKitPostConfig", str);
                if (jSON != null && jSON.length()) {
                   uAtlasKitPos = new Gson().h(jSON, AtlasKitPostConfig.class);
                }
                uAtlasKitPos = (i)? uAtlasKitPos.postBitrateThresForCharging: uAtlasKitPos.postBitrateThres;
                double d = (double)avgBitrate * uAtlasKitPos;
                if ((double)i1 - d > 0) {
                   p0.remove(representati1);
                }else {
                   p0.remove(representati2);
                }
             }
          }
       }
       return i;
    }
}
