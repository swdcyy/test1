package com.kwai.video.waynelive.datasource.MultiResolutionListDatasource;
import com.kwai.video.waynelive.datasource.LiveBaseDatasource;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.ResolutionPlayUrls;
import java.util.Iterator;
import java.lang.Math;
import com.kuaishou.android.live.model.LiveAdaptiveManifest$ManifestType;
import com.kuaishou.android.live.model.AdaptationSet;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.live.model.AdaptationUrl;
import com.kwai.video.waynelive.util.CommonUtil;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import java.util.Set;

public class MultiResolutionListDatasource extends LiveBaseDatasource	// class@000def
{
    public List mMultiResolutionPlayUrls;
    public List manifests;

    public void MultiResolutionListDatasource(List p0){
       super();
       this.manifests = new ArrayList();
       this.mDatasourceType = 3;
       this.mMultiResolutionPlayUrls = p0;
       this.manifests = this.convert(p0);
    }
    public final List convert(List p0){
       int i;
       Object obj = p0;
       ArrayList obj1 = PatchProxy.applyOneRefs(obj, this, MultiResolutionListDatasource.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new ArrayList();
       if (obj != null && p0.size() > 0) {
          i = obj.get(0).mUrls.size();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             i = Math.min(i, iterator.next().mUrls.size());
          }
       }else {
          i = 0;
       }
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          AdaptationSet uAdaptationS = new AdaptationSet();
          Boolean fALSE = Boolean.FALSE;
          ArrayList uArrayList = new ArrayList();
          Iterator iterator1 = p0.iterator();
          LiveAdaptiveManifest$ManifestType manifestType = LiveAdaptiveManifest$ManifestType.FLV;
          int i2 = 0;
          while (iterator1.hasNext()) {
             ResolutionPlayUrls resolutionPl = iterator1.next();
             CDNUrl uCDNUrl = resolutionPl.mUrls.get(i1);
             fALSE = Boolean.valueOf(uCDNUrl.isFreeTrafficCdn());
             AdaptationUrl uAdaptationU = CommonUtil.cdnlist2AdaptationUrl(uCDNUrl, 0);
             uAdaptationU.mName = resolutionPl.mName;
             uAdaptationU.mShortName = resolutionPl.mShortName;
             uAdaptationU.mLevel = resolutionPl.mLevel;
             uAdaptationU.mDefaultSelect = resolutionPl.mDefaultSelect;
             uAdaptationU.mQualityType = resolutionPl.mType;
             uArrayList.add(uAdaptationU);
             manifestType = CommonUtil.getManifestTypeFromUrl(uCDNUrl.mUrl);
             i2 = uCDNUrl.mFeature;
          }
          uAdaptationS.mRepresentation = uArrayList;
          LiveAdaptiveManifest liveAdaptive = new LiveAdaptiveManifest(fALSE, i2, uAdaptationS, manifestType, 1, 1);
          obj1.add(v14);
       }
       return obj1;
    }
    public List getCurrentDatasource(){
       return this.manifests;
    }
}
