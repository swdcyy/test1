package com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.RepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilter$Companion;
import nsd.u;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.player.mid.manifest.v2.filter.PhotoInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.util.Map;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kwai.video.player.mid.manifest.v2.Representation;
import zsd.u;
import com.kwai.video.wayne.player.config.ks_sub.AzerothGmvAdConfig;
import java.util.Collection;

public final class VipRepresentationFilter implements RepresentationFilter	// class@000b7d
{
    public boolean isAd;
    public boolean isGmv;
    public static final VipRepresentationFilter$Companion Companion;
    public static CopyOnWriteArraySet adTypeList;
    public static CopyOnWriteArraySet plcTypeList;

    static {
       VipRepresentationFilter.Companion = new VipRepresentationFilter$Companion(null);
       VipRepresentationFilter.adTypeList = new CopyOnWriteArraySet();
       VipRepresentationFilter.plcTypeList = new CopyOnWriteArraySet();
    }
    public void VipRepresentationFilter(PhotoInfo p0){
       a.p(p0, "photoInfo");
       super();
       String str = "VipRepFilter";
       if (VipRepresentationFilter.Companion.shouldParseConfig()) {
          KSConfigGetInterface configGet = WaynePlayerConfigImpl.getConfigGet();
          a.o(configGet, "WaynePlayerConfigImpl.getConfigGet\(\)");
          String jSON = configGet.getSwitchProvider().getJSON("RepresentationVipOpenList", "");
          DebugLog.i(str, "openVipConfig: "+jSON);
          if (!TextUtils.isEmpty(jSON)) {
             try{
                Map map = new Gson().i(jSON, Map.class);
                Iterator obj = map.get("adType");
                Iterable iterable = null;
                if (!obj instanceof List) {
                   obj = iterable;
                }
                if (obj != null) {
                   obj = obj.iterator();
                   while (obj.hasNext()) {
                      Object obj1 = obj.next();
                      if (obj1 instanceof String) {
                         VipRepresentationFilter.adTypeList.add(Integer.valueOf(Integer.parseInt(obj1)));
                      }else if(obj1 instanceof Integer){
                         VipRepresentationFilter.adTypeList.add(obj1);
                      }
                   }
                }
                Iterator obj2 = map.get("plcType");
                if (obj2 instanceof List) {
                   iterable = obj2;
                }
                if (iterable != null) {
                   obj2 = iterable.iterator();
                   while (obj2.hasNext()) {
                      Object obj3 = obj2.next();
                      if (obj3 instanceof String) {
                         VipRepresentationFilter.plcTypeList.add(Integer.valueOf(Integer.parseInt(obj3)));
                      }else if(obj3 instanceof Integer){
                         VipRepresentationFilter.plcTypeList.add(obj3);
                      }
                   }
                }
             }catch(java.lang.Exception e0){
                DebugLog.e(str, e0.toString());
             }
          }
       }
    }
    public boolean execute(List p0){
       boolean b2;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, VipRepresentationFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "representationList");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       boolean b = false;
       boolean b1 = false;
       StringBuilder str = 1;
       while (iterator.hasNext()) {
          Representation representati = iterator.next();
          String qualityType = representati.getQualityType();
          a.o(qualityType, "it.qualityType");
          if (u.H1(qualityType, "-ad", b, 2, null)) {
             obj.add(representati);
          }
          if (!b1 && (representati.getQualityType()).equals("720p-ad")) {
             b1 = true;
          }
       }
       int userGmvValue = AzerothGmvAdConfig.getConfig().getUserGmvValue();
       int userAdValue = AzerothGmvAdConfig.getConfig().getUserAdValue();
       VipRepresentationFilter tisGmv = this.isGmv;
       if (tisGmv != null && this.isAd != null) {
          if (userGmvValue > 0 || userAdValue > 0) {
          label_0072 :
             b2 = true;
          label_0081 :
             if (!b1 || !b2) {
                DebugLog.i("VipRepFilter", "Remove All VipRep if needed. has720pad: "+b1+' '+"useVipRep: "+b2+' '+"gmv value: "+userGmvValue+' '+"ad value: "+userAdValue);
                p0.removeAll(obj);
                return b;
             }else {
                DebugLog.i("VipRepFilter", "Use vipRep! oldSize: "+p0.size()+" vipSize: "+obj.size());
                p0.clear();
                p0.addAll(obj);
                return str;
             }
          }
       }else if(tisGmv != null){
          if (userGmvValue > 0) {
             goto label_0072 ;
          }
       }else if(this.isAd != null && userAdValue > 0){
          goto label_0072 ;
       }
       b2 = false;
       goto label_0081 ;
    }
}
