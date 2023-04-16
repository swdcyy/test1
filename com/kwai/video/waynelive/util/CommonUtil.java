package com.kwai.video.waynelive.util.CommonUtil;
import java.lang.Object;
import com.kuaishou.aegon.httpdns.ResolvedIP;
import c0d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.httpdns.ResolverType;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.live.model.AdaptationUrl;
import java.lang.Integer;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import java.lang.Boolean;
import com.kuaishou.android.live.model.AdaptationSet;
import java.util.ArrayList;
import com.kuaishou.android.live.model.LiveAdaptiveManifest$ManifestType;
import java.util.Set;
import java.util.List;
import com.kwai.video.waynelive.debug.DebugLog;
import java.lang.System;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Character;
import android.content.Context;
import com.kwai.video.waynelive.LivePlayerInitModule;
import android.content.res.Resources;

public class CommonUtil	// class@000e19
{

    public void CommonUtil(){
       super();
    }
    public static d aegonDNS2HttpDNS(ResolvedIP p0){
       ResolverType obj = PatchProxy.applyOneRefs(p0, null, CommonUtil.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ResolverType.HTTP;
       ResolvedIP mResolver = p0.mResolver;
       if (mResolver != null && mResolver.contains("local")) {
          obj = ((p0.mResolver).contains("http"))? ResolverType.LOCAL_AND_HTTP: ResolverType.LOCAL;
       }
    label_002d :
       d uod = new d(p0.mHost, p0.mIP, obj, p0.mTtl);
       return obj;
    }
    public static AdaptationUrl cdnlist2AdaptationUrl(CDNUrl p0,int p1){
       CommonUtil uCommonUtil = CommonUtil.class;
       if (PatchProxy.isSupport(uCommonUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uCommonUtil, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return CommonUtil.cdnlist2AdaptationUrl(p0.mUrl, p1, p0.mUrlType);
    }
    public static AdaptationUrl cdnlist2AdaptationUrl(String p0,int p1,String p2){
       AdaptationUrl obj;
       if (PatchProxy.isSupport(CommonUtil.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, CommonUtil.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AdaptationUrl(p0, (long)p1, 500, "", "", "", 0, false, false, true, p2);
       return v14;
    }
    public static LiveAdaptiveManifest cdnlist2manifest(CDNUrl p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, CommonUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AdaptationSet uAdaptationS = new AdaptationSet();
       uAdaptationS.mGopDuration = 2000;
       obj = new ArrayList();
       obj.add(CommonUtil.cdnlist2AdaptationUrl(p0, 0));
       uAdaptationS.mRepresentation = obj;
       LiveAdaptiveManifest liveAdaptive = new LiveAdaptiveManifest(Boolean.valueOf(p0.isFreeTrafficCdn()), p0.mFeature, uAdaptationS, CommonUtil.getManifestTypeFromUrl(p0.mUrl), true, true);
       return p0.mUrl;
    }
    public static LiveAdaptiveManifest cdnlist2manifest(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, CommonUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AdaptationSet uAdaptationS = new AdaptationSet();
       uAdaptationS.mGopDuration = 2000;
       obj = new ArrayList();
       obj.add(CommonUtil.cdnlist2AdaptationUrl(p0, 0, "flv"));
       uAdaptationS.mRepresentation = obj;
       LiveAdaptiveManifest liveAdaptive = new LiveAdaptiveManifest(Boolean.FALSE, null, uAdaptationS, CommonUtil.getManifestTypeFromUrl(p0), true, true);
       return p0;
    }
    public static LiveAdaptiveManifest$ManifestType getManifestTypeFromUrl(String p0){
       LiveAdaptiveManifest$ManifestType obj = PatchProxy.applyOneRefs(p0, null, CommonUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAdaptiveManifest$ManifestType.FLV;
       if (!p0.startsWith("http") || !p0.contains(".flv")) {
          obj = (p0.contains(".m3u8"))? LiveAdaptiveManifest$ManifestType.HLS: LiveAdaptiveManifest$ManifestType.OTHER;
       }
    label_0030 :
       return obj;
    }
    public static String getManifestURLByQualityType(LiveAdaptiveManifest p0,String p1){
       AdaptationUrl obj = PatchProxy.applyTwoRefs(p0, p1, null, CommonUtil.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       obj = p0.mAdaptationSet.mRepresentation.get(i);
       while (i < p0.mAdaptationSet.mRepresentation.size()) {
          if (p1.equals(p0.mAdaptationSet.mRepresentation.get(i).mQualityType)) {
             obj = p0.mAdaptationSet.mRepresentation.get(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       if (obj != null) {
          return obj.mUrl;
       }
       DebugLog.e("CommonUtil", "manifest2CDNURL null");
       return null;
    }
    public static ResolvedIP httpDNS2aegonDNS(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommonUtil.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ResolvedIP resolvedIP = new ResolvedIP(p0.b, p0.c, p0.e, (p0.d - System.currentTimeMillis()), p0.f);
       return obj;
    }
    public static boolean isCollectionEmpty(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommonUtil.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static String removeSurrogates(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, CommonUtil.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (!Character.isHighSurrogate(c) && !Character.isLowSurrogate(c)) {
             obj = obj+c;
          }
          i = i + 1;
       }
       return obj;
    }
    public static String string(int p0){
       CommonUtil uCommonUtil = CommonUtil.class;
       if (PatchProxy.isSupport(uCommonUtil)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uCommonUtil, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LivePlayerInitModule.getContext().getResources().getString(p0);
    }
}
