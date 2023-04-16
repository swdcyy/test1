package com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.mid.manifest.ManifestInterface;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import com.kwai.video.player.mid.manifest.v2.PlayInfo;
import java.util.HashMap;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest$Builder;
import com.kwai.video.player.mid.manifest.v2.Adaptation;
import java.util.ArrayList;
import java.util.List;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest$1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.util.GsonUtil;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Iterator;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.util.Locale;
import java.lang.Exception;
import com.kwai.video.wayne.player.config.ks_sub.AASVersionConfig;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.kwai.video.player.mid.manifest.v2.filter.HlsKvcHevcRepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.KvcHevcRepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.PostRepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.CheckRepresentationLegalFilter;
import com.kwai.video.player.mid.manifest.v2.filter.HlsKvcHevcRepresentationFilterV2;
import com.kwai.video.player.mid.manifest.v2.filter.UnifiedRepresentationFilterV2;
import com.kwai.video.player.mid.manifest.v2.filter.CheckRepresentationLegalFilterV2;
import com.kwai.video.player.mid.manifest.v2.filter.RepresentationFilter;
import java.util.Map;
import java.util.Collection;
import com.kwai.video.player.mid.manifest.RepInterface;
import java.lang.Number;
import com.kwai.video.hodor.VodAdaptivePreloadPriorityTask;
import com.kwai.video.hodor.util.HodorCacheUtil;
import com.kwai.video.hodor.HlsPreloadPriorityTask;
import java.lang.Math;
import com.kwai.video.player.mid.manifest.v2.filter.PhotoInfo;
import yv7.a;
import com.kwai.video.player.mid.manifest.v2.VideoFeature;
import com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilter;
import com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilterV2;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KwaiManifest implements ManifestInterface, Serializable, Cloneable	// class@000b68
{
    public boolean isExecutedRepFilter;
    public List mAdaptationSet;
    public boolean mAutoDefaultSelect;
    public int mBusinessType;
    public Map mExtraQosInfo;
    public boolean mHideAuto;
    public String mManifestString;
    public int mMediaType;
    public PhotoInfo mPhotoInfo;
    public PlayInfo mPlayInfo;
    public int mStereoType;
    public boolean mUseVipRep;
    public String mVersion;
    public VideoFeature mVideoFeature;
    public String mVideoId;

    public void KwaiManifest(){
       super();
       this.mPlayInfo = new PlayInfo();
       this.isExecutedRepFilter = false;
       this.mUseVipRep = false;
       this.mExtraQosInfo = new HashMap();
    }
    public void KwaiManifest(KwaiManifest$Builder p0){
       super();
       this.mPlayInfo = new PlayInfo();
       this.isExecutedRepFilter = false;
       this.mUseVipRep = false;
       this.mExtraQosInfo = new HashMap();
       this.mMediaType = p0.mMediaType;
       Adaptation uAdaptation = new Adaptation();
       uAdaptation.mRepresentation = p0.mRepresentation;
       ArrayList uArrayList = new ArrayList();
       this.mAdaptationSet = uArrayList;
       uArrayList.add(uAdaptation);
    }
    public void KwaiManifest(KwaiManifest$Builder p0,KwaiManifest$1 p1){
       super(p0);
    }
    public static KwaiManifest from(String p0){
       KwaiManifest obj = PatchProxy.applyOneRefs(p0, null, KwaiManifest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = GsonUtil.KP_MID_GSON.h(p0, KwaiManifest.class);
          obj.setManifestString(p0);
          obj.executeRepresentationFilter();
          return obj;
       }catch(java.lang.Exception e3){
          DebugLog.e("KwaiManifest", "[from]JsonString change to KwaiManifest fail! cause by: "+e3);
          return v1;
       }
    }
    public boolean canRetry(){
       Object obj = PatchProxy.apply(null, this, KwaiManifest.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.canRetry(-1);
    }
    public boolean canRetry(int p0){
       KwaiManifest obj;
       if (PatchProxy.isSupport(KwaiManifest.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KwaiManifest.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.mAdaptationSet;
       boolean b = false;
       if (obj == null || obj.isEmpty()) {
          DebugLog.e("KwaiManifest", "[canRetry]mAdaptationSet is null or empty");
          return b;
       }else {
          this.executeRepresentationFilter();
          Adaptation uAdaptation = this.mAdaptationSet.get(b);
          KwaiManifest tmMediaType = this.mMediaType;
          if (tmMediaType == true) {
             Iterator iterator = uAdaptation.mRepresentation.iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return true;
                }
                Representation mBackupUrls = iterator.next().mBackupUrls;
                if (mBackupUrls == null || mBackupUrls.isEmpty()) {
                   break ;
                }
             }
             return b;
          }else if(tmMediaType == 2){
             Iterator iterator1 = uAdaptation.mRepresentation.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Representation representati = iterator1.next();
                   if (representati.getId() == p0) {
                      Representation mBackupUrls1 = representati.mBackupUrls;
                      if (mBackupUrls1 != null && !mBackupUrls1.isEmpty()) {
                         b = true;
                         break ;
                      }
                      break ;
                   }
                }else {
                   Object[] objArray = new Object[true];
                   objArray[b] = Integer.valueOf(p0);
                   DebugLog.w("KwaiManifest", String.format(Locale.US, "[canRetry]warning, should not get here,mp4 rep id\(%d\) not found", objArray));
                   return b;
                }
             }
             return b;
          }else {
             Object[] objArray1 = new Object[true];
             objArray1[b] = Integer.valueOf(tmMediaType);
             DebugLog.w("KwaiManifest", String.format(Locale.US, "[canRetry]warning, invalid mediaType :%d", objArray1));
             return b;
          }
       }
    }
    public KwaiManifest clone(){
       KwaiManifest obj = PatchProxy.apply(null, this, KwaiManifest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          obj.mAdaptationSet = new ArrayList();
          Iterator iterator = this.mAdaptationSet.iterator();
          while (iterator.hasNext()) {
             obj.mAdaptationSet.add(iterator.next().clone());
          }
          return obj;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public void executeRepresentationFilter(){
       KwaiManifest mBusinessTyp;
       boolean b = this;
       if (PatchProxy.applyVoid(null, b, KwaiManifest.class, "3")) {
          return;
       }
       if (this.isValid() && b.isExecutedRepFilter == null) {
          boolean b1 = true;
          b.isExecutedRepFilter = b1;
          int i = 0;
          Adaptation mRepresentat = b.mAdaptationSet.get(i).mRepresentation;
          AASVersionConfig uAASVersionC = new AASVersionConfig();
          String jSON = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getJSON("AASVersionConfig", "");
          if (jSON != null && jSON.length()) {
             uAASVersionC = new Gson().h(jSON, AASVersionConfig.class);
          }
          AASVersionConfig aasParseVer = uAASVersionC.aasParseVer;
          String str = "ver: "+b.mVersion+"  type: "+b.mBusinessType+"  AAS version: "+aasParseVer+"\n"+"before dur: "+b.mAdaptationSet.get(i).mDurationMs+"\n";
          Iterator iterator = mRepresentat.iterator();
          int i1 = 1;
          while (iterator.hasNext()) {
             Representation representati = iterator.next();
             str = str+"rep id:"+i1+"    "+representati.getQualityType()+"    "+representati.getMinorInfo()+"   quality: "+representati.getQuality()+"\n";
             i1 = i1 + b1;
          }
          int i2 = mRepresentat.size();
          Representation representati1 = mRepresentat.get(i);
          ArrayList uArrayList = new ArrayList();
          String str1 = 2;
          if (aasParseVer == b1) {
             mBusinessTyp = b.mBusinessType;
             if (mBusinessTyp == b1) {
                uArrayList.add(new HlsKvcHevcRepresentationFilter());
             }else if(mBusinessTyp == str1){
                uArrayList.add(new KvcHevcRepresentationFilter());
                uArrayList.add(new PostRepresentationFilter());
             }
             uArrayList.add(new CheckRepresentationLegalFilter());
          }else {
             mBusinessTyp = b.mBusinessType;
             if (mBusinessTyp == b1) {
                uArrayList.add(new HlsKvcHevcRepresentationFilterV2());
             }else if(mBusinessTyp == str1){
                uArrayList.add(new UnifiedRepresentationFilterV2());
             }
             uArrayList.add(new CheckRepresentationLegalFilterV2());
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().execute(mRepresentat);
          }
          if (mRepresentat.isEmpty()) {
             DebugLog.e("KwaiManifest", "after rep filter executed all rep filtered, final add a random Rep");
             b.mExtraQosInfo.put("OtherFilterRisk", "true");
             mRepresentat.add(representati1);
          }
          DebugLog.d("KwaiManifest", "after rep filter, ver:"+aasParseVer+", business type:"+b.mBusinessType+", old size:"+aasParseVer+", new size:"+mRepresentat.size());
          if (mRepresentat.size() != i2) {
             this.markManifestChanged();
             String str2 = str+"after dur: "+b.mAdaptationSet.get(0).mDurationMs+"\n";
             Iterator iterator2 = mRepresentat.iterator();
             i = 1;
             while (iterator2.hasNext()) {
                Representation representati2 = iterator2.next();
                str2 = str2+"rep id:"+i+"    "+representati2.getQualityType()+"    "+representati2.getMinorInfo()+"   quality: "+representati2.getQuality()+"\n";
                i = i + 1;
             }
             str = str2+"ver: "+uAASVersionC.aasParseVer+"  postThres: "+uAASVersionC.postBitrateThres+"\n";
          }
          DebugLog.i("KwaiManifest", "executeRepresentationFilter: "+str);
       }
       return;
    }
    public List fetchSingleRepoPlayList(int p0){
       ArrayList obj;
       if (PatchProxy.isSupport(KwaiManifest.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KwaiManifest.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new ArrayList();
          Adaptation mRepresentat = this.mAdaptationSet.get(0).mRepresentation;
          Representation representati = null;
          Iterator iterator = mRepresentat.iterator();
          while (true) {
             if (iterator.hasNext()) {
                Representation representati1 = iterator.next();
                if (p0 < 0 || representati1.getId() == p0) {
                   representati = representati1;
                }
             }
             if (!mRepresentat.isEmpty() && representati == null) {
                representati = mRepresentat.get(0);
             }
             if (representati != null) {
                obj.add(representati.getMailUrl());
                obj.addAll(representati.getBackupUrls());
                break ;
             }
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return obj;
    }
    public Map getExtraQosInfo(){
       return this.mExtraQosInfo;
    }
    public RepInterface getHighestResolutionRep(){
       Object[] objArray = null;
       KwaiManifest obj = PatchProxy.apply(objArray, this, KwaiManifest.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAdaptationSet;
       if (obj == null || obj.isEmpty()) {
          DebugLog.e("KwaiManifest", "[getHighestResolutionRep]mAdaptationSet is null or empty");
          return objArray;
       }else {
          this.executeRepresentationFilter();
          Iterator iterator = this.mAdaptationSet.get(0).mRepresentation.iterator();
          while (iterator.hasNext()) {
             Representation representati = iterator.next();
             if (objArray == null || representati.mHeight > objArray.mHeight) {
                objArray = representati;
             }
          }
          return objArray;
       }
    }
    public String getManifestString(){
       Object obj = PatchProxy.apply(null, this, KwaiManifest.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mManifestString == null) {
          this.mManifestString = this.toJsonString();
       }
       return this.mManifestString;
    }
    public long getMaxCachedDurationMs(){
       long upmostCached;
       KwaiManifest obj = PatchProxy.apply(null, this, KwaiManifest.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mAdaptationSet;
       if (obj == null || obj.isEmpty()) {
          DebugLog.e("KwaiManifest", "mAdaptationSet null");
          return 0;
       }else if(this.mMediaType == 2){
          DebugLog.d("KwaiManifest", "mediatype mp4");
          upmostCached = VodAdaptivePreloadPriorityTask.getUpmostCachedDurationMs(this.getManifestString());
       }else {
          Iterator iterator = this.mAdaptationSet.iterator();
          long l = 0;
          while (iterator.hasNext()) {
             Adaptation mRepresentat = iterator.next().mRepresentation;
             if (mRepresentat != null) {
                Iterator iterator1 = mRepresentat.iterator();
                while (iterator1.hasNext()) {
                   Representation representati = iterator1.next();
                   String cacheKey = HodorCacheUtil.getCacheKey(representati.mMailUrl, false);
                   long cachedBytes = HlsPreloadPriorityTask.getCachedBytes(cacheKey);
                   long l1 = (long)representati.avgBitrate;
                   StringBuilder str = "cachekey = "+cacheKey;
                   DebugLog.d("KwaiManifest", str+" cachesize: "+cachedBytes+"avgVitrate:"+l1);
                   if (l1 > 0) {
                      cachedBytes = cachedBytes * 8;
                      cachedBytes = cachedBytes / l1;
                      l = Math.max(l, cachedBytes);
                   }else {
                      continue ;
                   }
                }
             }else {
                DebugLog.e("KwaiManifest", "Representation null");
             }
          }
          upmostCached = l;
       }
       return upmostCached;
    }
    public PhotoInfo getPhotoInfo(){
       return this.mPhotoInfo;
    }
    public PlayInfo getPlayInfo(){
       return this.mPlayInfo;
    }
    public int getRepCount(){
       return a.a(this);
    }
    public List getRepList(){
       Object[] objArray = null;
       KwaiManifest obj = PatchProxy.apply(objArray, this, KwaiManifest.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAdaptationSet;
       if (obj == null || obj.isEmpty()) {
          DebugLog.e("KwaiManifest", "[getRepList]mAdaptationSet is null or empty");
          return objArray;
       }else {
          this.executeRepresentationFilter();
          return this.mAdaptationSet.get(0).mRepresentation;
       }
    }
    public VideoFeature getVideoFeature(){
       return this.mVideoFeature;
    }
    public boolean isHdr(){
       KwaiManifest obj = PatchProxy.apply(null, this, KwaiManifest.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAdaptationSet;
       if (obj == null || obj.isEmpty()) {
          DebugLog.e("KwaiManifest", "[isHdr]mAdaptationSet is null or empty");
          return false;
       }else {
          this.executeRepresentationFilter();
          Iterator iterator = this.mAdaptationSet.get(false).mRepresentation.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return false;
             }
             Representation mDynamicType = iterator.next().mDynamicType;
             if (mDynamicType != true && (mDynamicType != 2 && (mDynamicType == 4 || mDynamicType == 3))) {
                break ;
             }
          }
          return true;
       }
    }
    public boolean isValid(){
       KwaiManifest obj = PatchProxy.apply(null, this, KwaiManifest.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAdaptationSet;
       int i = 0;
       if (obj != null && (obj.size() > 0 && (this.mAdaptationSet.get(i).mRepresentation != null && this.mAdaptationSet.get(i).mRepresentation.size() > 0))) {
          i = true;
       }
    label_003c :
       return i;
    }
    public final void markManifestChanged(){
       this.mManifestString = null;
    }
    public boolean moveToNextUrl(){
       Object obj = PatchProxy.apply(null, this, KwaiManifest.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.moveToNextUrl(-1);
    }
    public boolean moveToNextUrl(int p0){
       Adaptation obj;
       Representation representati1;
       if (PatchProxy.isSupport(KwaiManifest.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KwaiManifest.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.canRetry(p0)) {
          return false;
       }else {
          obj = this.mAdaptationSet.get(false);
          KwaiManifest tmMediaType = this.mMediaType;
          if (tmMediaType == true) {
             Iterator iterator = obj.mRepresentation.iterator();
             while (iterator.hasNext()) {
                Representation representati = iterator.next();
                representati.mMailUrl = representati.mBackupUrls.remove(false);
                representati.mM3u8Slice = "";
             }
             this.markManifestChanged();
             return true;
          }else if(tmMediaType == 2){
             Iterator iterator1 = obj.mRepresentation.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   representati1 = iterator1.next();
                   if (representati1.getId() == p0) {
                      break ;
                   }
                }else {
                   Object[] objArray = new Object[true];
                   objArray[0] = Integer.valueOf(p0);
                   DebugLog.w("KwaiManifest", String.format(Locale.US, "[moveToNextUrl]warning, should not get here,mp4 rep id\(%d\) not found", objArray));
                   return false;
                }
             }
             representati1.mMailUrl = representati1.mBackupUrls.remove(false);
             this.markManifestChanged();
             return true;
          }else {
             Object[] objArray1 = new Object[true];
             objArray1[0] = Integer.valueOf(tmMediaType);
             DebugLog.w("KwaiManifest", String.format(Locale.US, "[moveToNextUrl]warning, invalid mediaType :%d", objArray1));
             return false;
          }
       }
    }
    public void setManifestString(String p0){
       this.mManifestString = p0;
    }
    public void setPhotoInfo(PhotoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiManifest.class, "4")) {
          return;
       }
       if (!this.isValid()) {
          this.mExtraQosInfo.put("manifestValid", "false");
          return;
       }else {
          AASVersionConfig uAASVersionC = new AASVersionConfig();
          String jSON = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getJSON("AASVersionConfig", "");
          if (jSON != null && jSON.length()) {
             uAASVersionC = new Gson().h(jSON, AASVersionConfig.class);
          }
          uAASVersionC = uAASVersionC.aasParseVer;
          int i = 0;
          jSON = "ver: "+this.mVersion+"  type: "+this.mBusinessType+"  AAS version: "+uAASVersionC+"\n"+"before dur: "+this.mAdaptationSet.get(i).mDurationMs+"\n";
          Iterator iterator = this.mAdaptationSet.get(i).mRepresentation.iterator();
          boolean i1 = 1;
          while (iterator.hasNext()) {
             Representation representati = iterator.next();
             jSON = jSON+"rep id:"+i1+"    "+representati.getQualityType()+"    "+representati.getMinorInfo()+"   quality: "+representati.getQuality()+"\n";
             i1 = i1 + 1;
          }
          this.mPhotoInfo = p0;
          int i2 = this.mAdaptationSet.get(i).mRepresentation.size();
          VipRepresentationFilter vipRepresent = (uAASVersionC == 1)? new VipRepresentationFilter(p0): new VipRepresentationFilterV2(p0);
          Representation representati1 = this.mAdaptationSet.get(i).mRepresentation.get(i);
          i1 = vipRepresent.execute(this.mAdaptationSet.get(i).mRepresentation);
          this.mUseVipRep = i1;
          this.mExtraQosInfo.put("useVipRep", Boolean.toString(i1));
          this.mExtraQosInfo.put("shouldUseVip", Boolean.toString(this.mPhotoInfo.getShouldUseVip()));
          if (!TextUtils.isEmpty(this.mVideoId)) {
             this.mExtraQosInfo.put("videoId", this.mVideoId);
          }
          DebugLog.i("KwaiManifest", "VipRepFilter setPhotoInfo videoId: "+this.mVideoId+", AAS ver: "+uAASVersionC);
          if (this.mAdaptationSet.get(i).mRepresentation.isEmpty()) {
             DebugLog.e("KwaiManifest", "after vipRepFilter all rep filed, final add a random rep");
             this.mExtraQosInfo.put("VipFilterRisk", "true");
             this.mAdaptationSet.get(i).mRepresentation.add(representati1);
          }
          if (i2 != this.mAdaptationSet.get(i).mRepresentation.size()) {
             this.markManifestChanged();
             Iterator iterator1 = this.mAdaptationSet.get(i).mRepresentation.iterator();
             jSON = jSON+"after dur: "+this.mAdaptationSet.get(i).mDurationMs+"\n";
             int i3 = 1;
             while (iterator1.hasNext()) {
                Representation representati2 = iterator1.next();
                jSON = jSON+"rep id:"+i3+"    "+representati2.getQualityType()+"    "+representati2.getMinorInfo()+"   quality: "+representati2.getQuality()+"\n";
                i3 = i3 + 1;
             }
          }
          DebugLog.i("KwaiManifest", "executeRepresentationFilter ad: "+jSON);
          return;
       }
    }
    public void shuffleUrlList(){
       if (PatchProxy.applyVoid(null, this, KwaiManifest.class, "6")) {
          return;
       }
       Iterator iterator = this.mAdaptationSet.iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().mRepresentation.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().shuffleUrls();
          }
       }
       this.markManifestChanged();
       return;
    }
    public String toJsonString(){
       return a.b(this);
    }
}
