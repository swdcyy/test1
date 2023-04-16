package com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilterV2;
import com.kwai.video.player.mid.manifest.v2.filter.RepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilterV2$Companion;
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
import kotlin.text.StringsKt__StringsKt;
import com.kwai.video.wayne.player.config.ks_sub.AzerothGmvAdConfig;
import java.util.Collection;

public final class VipRepresentationFilterV2 implements RepresentationFilter	// class@000b7f
{
    public boolean isAd;
    public boolean isGmv;
    public static final VipRepresentationFilterV2$Companion Companion;
    public static CopyOnWriteArraySet adTypeList;
    public static CopyOnWriteArraySet plcTypeList;

    static {
       VipRepresentationFilterV2.Companion = new VipRepresentationFilterV2$Companion(null);
       VipRepresentationFilterV2.adTypeList = new CopyOnWriteArraySet();
       VipRepresentationFilterV2.plcTypeList = new CopyOnWriteArraySet();
    }
    public void VipRepresentationFilterV2(PhotoInfo p0){
       a.p(p0, "photoInfo");
       super();
       String str = "VipRepFilterV2";
       if (VipRepresentationFilterV2.Companion.shouldParseConfig()) {
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
                         VipRepresentationFilterV2.adTypeList.add(Integer.valueOf(Integer.parseInt(obj1)));
                      }else if(obj1 instanceof Integer){
                         VipRepresentationFilterV2.adTypeList.add(obj1);
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
                         VipRepresentationFilterV2.plcTypeList.add(Integer.valueOf(Integer.parseInt(obj3)));
                      }else if(obj3 instanceof Integer){
                         VipRepresentationFilterV2.plcTypeList.add(obj3);
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
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, VipRepresentationFilterV2.class, "1");
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
          String str1 = "-ad";
          int i = 2;
          if (!u.H1(qualityType, str1, b, i, null)) {
             qualityType = representati.getMinorInfo();
             a.o(qualityType, "it.getMinorInfo\(\)");
             if (!StringsKt__StringsKt.O2(qualityType, str1, b, i, null)) {
             label_0055 :
                if (!b1) {
                   if (!(representati.getQualityType()).equals("720p-ad")) {
                      if ((representati.getQualityType()).equals("720p")) {
                         String minorInfo = representati.getMinorInfo();
                         a.o(minorInfo, "it.getMinorInfo\(\)");
                         if (!StringsKt__StringsKt.O2(minorInfo, str1, b, i, null)) {
                         }
                      }
                   }
                   b1 = true;
                }
             }
          }
          obj.add(representati);
          goto label_0055 ;
       }
       int userGmvValue = AzerothGmvAdConfig.getConfig().getUserGmvValue();
       int userAdValue = AzerothGmvAdConfig.getConfig().getUserAdValue();
       VipRepresentationFilterV2 tisGmv = this.isGmv;
       if (tisGmv != null && this.isAd != null) {
          if (userGmvValue > 0 || userAdValue > 0) {
          label_009a :
             b2 = true;
          label_00a9 :
             if (!b1 || !b2) {
                DebugLog.i("VipRepFilterV2", "Remove All VipRep if needed. has720pad: "+b1+' '+"useVipRep: "+b2+' '+"gmv value: "+userGmvValue+' '+"ad value: "+userAdValue);
                p0.removeAll(obj);
                return b;
             }else {
                DebugLog.i("VipRepFilterV2", "Use vipRep! oldSize: "+p0.size()+" vipSize: "+obj.size());
                p0.clear();
                p0.addAll(obj);
                return str;
             }
          }
       }else if(tisGmv != null){
          if (userGmvValue > 0) {
             goto label_009a ;
          }
       }else if(this.isAd != null && userAdValue > 0){
          goto label_009a ;
       }
       b2 = false;
       goto label_00a9 ;
    }
}
