package com.kwai.video.waynelive.LivePlayerUtils;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.model.AdaptationSet;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.live.model.AdaptationUrl;
import android.content.Context;
import com.kwai.video.waynelive.LivePlayerInitModule;
import ekd.p0;
import java.util.Objects;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfo;
import com.kwai.video.player.IMediaPlayer;
import ci7.a;
import com.kwai.video.player.KsMediaMeta;
import android.os.Bundle;
import com.kwai.player.qos.KwaiQosInfo;
import java.lang.Boolean;
import android.view.Surface;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.player.IMediaPlayer$OnLiveVoiceCommentListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.kwai_player.AspectAwesomeCache;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import com.kwai.video.waynelive.LivePlayUrlInfo;
import elb.e;
import java.lang.Math;
import com.kuaishou.aegon.httpdns.ResolvedIP;
import com.kwai.video.waynelive.LivePlayUrlInfo$DataSourceType;
import c0d.d;

public final class LivePlayerUtils	// class@000dda
{

    public void LivePlayerUtils(){
       super();
    }
    public static int getAdaptiveIndexTargetQuality(LiveAdaptiveManifest p0,String p1){
       LiveAdaptiveManifest obj = PatchProxy.applyTwoRefs(p0, p1, null, LivePlayerUtils.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!TextUtils.x(p1) && p0 != null) {
          obj = p0.mAdaptationSet;
          if (obj != null && !q.f(obj.mRepresentation)) {
             int i = 0;
             Iterator iterator = p0.mAdaptationSet.mRepresentation.iterator();
             while (iterator.hasNext()) {
                if (TextUtils.n(p1, (iterator.next().mQualityType).toLowerCase())) {
                   return i;
                }
                i = i + 1;
             }
          }
       }
       return -1;
    }
    public static int getAdaptiveNetType(){
       Context obj = PatchProxy.apply(null, null, LivePlayerUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = LivePlayerInitModule.getContext();
       int i = 1;
       if (p0.F(obj)) {
          return i;
       }
       String str = p0.u(obj);
       Objects.requireNonNull(str);
       switch (str.hashCode()){
           case 1653:
             if (str.equals("2g")) {
                i = 0;
             }else {
             }
             break;
           case 1684:
             if (str.equals("3g")) {
             }else {
             }
             break;
           case 1715:
             if (str.equals("4g")) {
                i = 2;
             }else {
             }
             break;
           case 1746:
             if (str.equals("5g")) {
                i = 3;
             }else {
             }
             break;
           default:
             i = -1;
       }
       switch (i){
           case 0:
             return 4;
           case 1:
             return 3;
           case 2:
             return 2;
           case 3:
             return 5;
           default:
             return 0;
       }
    }
    public static AppLiveQosDebugInfo getAppLiveQosDebugInfo(IKwaiMediaPlayer p0){
       AppLiveQosDebugInfo uAppLiveQosD = null;
       Object obj = PatchProxy.applyOneRefs(p0, uAppLiveQosD, LivePlayerUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          uAppLiveQosD = p0.getAppLiveQosDebugInfo();
       }
       return uAppLiveQosD;
    }
    public static int getBufferEmptyCount(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 != null)? p0.bufferEmptyCount(): 0;
       return i;
    }
    public static float getBufferEmptyDurationSec(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (p0 == null) {
          return 0;
       }
       return ((float)p0.bufferEmptyDuration() / 1000.00f);
    }
    public static String getDataSource(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String dataSource = (p0 != null)? p0.getDataSource(): "";
       return dataSource;
    }
    public static long getDecodedDataSize(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long decodedDataS = (p0 != null)? p0.getDecodedDataSize(): 0;
       return decodedDataS;
    }
    public static long getDownloadDataSize(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long downloadData = (p0 != null)? p0.getDownloadDataSize(): 0;
       return downloadData;
    }
    public static long getDtsDuration(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long dtsDuration = (p0 != null)? p0.getDtsDuration(): 0;
       return dtsDuration;
    }
    public static String getKwaiSignature(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String kwaiSign = (p0 != null)? p0.getKwaiSign(): "";
       return kwaiSign;
    }
    public static int getLiveManifestRepId(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int curPlayingId = (p0 != null)? p0.getCurPlayingId(): 0;
       return curPlayingId;
    }
    public static KsMediaMeta getMediaMeta(IKwaiMediaPlayer p0){
       KsMediaMeta ksMediaMeta = null;
       Object obj = PatchProxy.applyOneRefs(p0, ksMediaMeta, LivePlayerUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          ksMediaMeta = KsMediaMeta.parse(p0.getMediaMeta());
       }
       return ksMediaMeta;
    }
    public static int getOldBufferEmptyCount(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 != null)? p0.bufferEmptyCountOld(): 0;
       return i;
    }
    public static float getOldBufferEmptyDurationSec(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (p0 == null) {
          return 0;
       }
       return ((float)p0.bufferEmptyDurationOld() / 1000.00f);
    }
    public static String getPlayerQosJson(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String liveStatJson = (p0 != null)? p0.getLiveStatJson(): "";
       return liveStatJson;
    }
    public static String getServerAddress(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String serverAddres = (p0 != null)? p0.getServerAddress(): "";
       return serverAddres;
    }
    public static KwaiQosInfo getStreamQosInfo(IKwaiMediaPlayer p0){
       KwaiQosInfo kwaiQosInfo = null;
       Object obj = PatchProxy.applyOneRefs(p0, kwaiQosInfo, LivePlayerUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          kwaiQosInfo = p0.getStreamQosInfo();
       }
       return kwaiQosInfo;
    }
    public static float getVideoOutputFramesPerSecond(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float videoOutputF = (p0 != null)? p0.getVideoOutputFramesPerSecond(): 0;
       return videoOutputF;
    }
    public static String getXksCache(IKwaiMediaPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String xksCache = (p0 != null)? p0.getXksCache(): "";
       return xksCache;
    }
    public static boolean isHlsType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("hls").equals(p0);
    }
    public static boolean isPanoramicType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("panoramic").equals(p0);
    }
    public static void releasePlayer(IKwaiMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LivePlayerUtils.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setVolume(0, 0);
       p0.setSurface(null);
       p0.setOnErrorListener(null);
       p0.setOnCompletionListener(null);
       p0.setOnPreparedListener(null);
       p0.setOnInfoListener(null);
       p0.setOnSeekCompleteListener(null);
       p0.setOnBufferingUpdateListener(null);
       p0.setOnLiveVoiceCommentListener(null);
       p0.setOnLiveInterActiveListener(null);
       p0.setOnAudioProcessPCMAvailableListener(null);
       p0.getAspectAwesomeCache().setAwesomeCacheCallback(null);
       p0.setOnLiveSrvTsptInfoListener(null);
       p0.setOnLiveSeiInfoListener(null);
       p0.setOnLiveExtraInfoListener(null);
       p0.releaseAsync();
       return;
    }
    public static void updatePlayUrlInfo(LivePlayUrlInfo p0,LiveAdaptiveManifest p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LivePlayerUtils.class, "23")) {
          return;
       }
       LiveAdaptiveManifest mAdaptationS = p1.mAdaptationSet;
       e uoe = null;
       AdaptationSet mRepresentat = (mAdaptationS != null)? mAdaptationS.mRepresentation: uoe;
       p0.setAdaptiveManifest(p1);
       p0.setDnsResolvedUrl(uoe);
       if (!q.f(mRepresentat)) {
          int i = Math.max(LivePlayerUtils.getAdaptiveIndexTargetQuality(p1, p2), 0);
          AdaptationUrl uAdaptationU = mRepresentat.get(i);
          p0.setUrl(TextUtils.k(mRepresentat.get(i).mUrl));
          p0.setUrlType(TextUtils.k(uAdaptationU.mUrlType));
          p0.setHost(TextUtils.k(p1.mHost));
          LiveAdaptiveManifest mResolvedIP = p1.mResolvedIP;
          if (mResolvedIP != null) {
             p0.setIP(TextUtils.k(mResolvedIP.mIP));
          }
          p0.setFreeTraffic(p1.mIsFreeTrafficCdn.booleanValue());
          p0.setDataSourceType(LivePlayUrlInfo$DataSourceType.ADAPTIVE_MANIFESTS);
       }
       return;
    }
    public static void updatePlayUrlInfo(LivePlayUrlInfo p0,e p1,boolean p2){
       if (PatchProxy.isSupport(LivePlayerUtils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, LivePlayerUtils.class, "24")) {
          return;
       }
       p0.setDnsResolvedUrl(p1);
       p0.setAdaptiveManifest(null);
       p0.setUrl(TextUtils.k(p1.b));
       p0.setUrlType(TextUtils.k(p1.g));
       p0.setHost(TextUtils.k(p1.a));
       e c = p1.c;
       if (c != null) {
          p0.setIP(TextUtils.k(c.c));
       }
       p0.setFreeTraffic(p1.d);
       LivePlayUrlInfo$DataSourceType mULTI_RESOLU = (p2)? LivePlayUrlInfo$DataSourceType.MULTI_RESOLUTION: LivePlayUrlInfo$DataSourceType.NORMAL_CDN;
       p0.setDataSourceType(mULTI_RESOLU);
       return;
    }
}
