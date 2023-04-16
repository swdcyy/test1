package com.kwai.video.waynelive.datasource.LiveDataSource;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.datasource.LiveWebRtcManifestListDatasource;
import com.kwai.video.waynelive.datasource.LiveManifestListDatasource;
import com.kwai.video.waynelive.datasource.MultiResolutionListDatasource;
import com.kwai.video.waynelive.datasource.CDNModelListDatasource;

public class LiveDataSource implements Serializable	// class@000de5
{
    public int dataSourceType;
    public List mLiveAdaptiveManifests;
    public List mMultiResolutionPlayUrls;
    public List mPlayUrls;
    public List mWebRTCAdaptiveManifests;
    public static final long serialVersionUID = 0xd31cc3af8945d984;

    public void LiveDataSource(){
       super();
       this.dataSourceType = 5;
       this.mPlayUrls = Collections.emptyList();
       this.mLiveAdaptiveManifests = Collections.emptyList();
       this.mMultiResolutionPlayUrls = Collections.emptyList();
       this.mWebRTCAdaptiveManifests = Collections.emptyList();
    }
    public void LiveDataSource(List p0,List p1,List p2,List p3){
       super();
       this.dataSourceType = 5;
       this.mPlayUrls = Collections.emptyList();
       this.mLiveAdaptiveManifests = Collections.emptyList();
       this.mMultiResolutionPlayUrls = Collections.emptyList();
       this.mWebRTCAdaptiveManifests = Collections.emptyList();
       if (p0 != null) {
          this.mPlayUrls = p0;
          this.dataSourceType = 2;
       }
       if (p1 != null) {
          this.mLiveAdaptiveManifests = p1;
          this.dataSourceType = 5;
       }
       if (p2 != null) {
          this.mMultiResolutionPlayUrls = p2;
          this.dataSourceType = 3;
       }
       if (p3 != null) {
          this.mWebRTCAdaptiveManifests = p3;
          this.dataSourceType = 4;
       }
       return;
    }
    public boolean isValidDataSource(){
       Object obj = PatchProxy.apply(null, this, LiveDataSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mPlayUrls.isEmpty() && (this.mLiveAdaptiveManifests.isEmpty() && (!this.mMultiResolutionPlayUrls.isEmpty() || !this.mWebRTCAdaptiveManifests.isEmpty())))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveDataSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveDataSource{playUrls:"+this.mPlayUrls+", liveAdaptiveManifest:"+this.mLiveAdaptiveManifests+", multiResolutionPlayUrls:"+this.mMultiResolutionPlayUrls+", webRTCAdaptiveManifest:"+this.mWebRTCAdaptiveManifests+"}";
    }
    public ILiveDatasource tranforms2ILiveDatasource(boolean p0){
       LiveWebRtcManifestListDatasource obj;
       LiveManifestListDatasource liveManifest;
       if (PatchProxy.isSupport(LiveDataSource.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveDataSource.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DebugLog.i("LiveDataSource", "original datasource "+this.toString());
       obj = null;
       LiveDataSource tmWebRTCAdap = this.mWebRTCAdaptiveManifests;
       if (tmWebRTCAdap != null && (!tmWebRTCAdap.isEmpty() && p0)) {
          obj = new LiveWebRtcManifestListDatasource(this.mWebRTCAdaptiveManifests);
       }else {
          LiveDataSource tmLiveAdapti = this.mLiveAdaptiveManifests;
          if (tmLiveAdapti != null && !tmLiveAdapti.isEmpty()) {
             liveManifest = new LiveManifestListDatasource(this.mLiveAdaptiveManifests);
          }else {
             tmLiveAdapti = this.mMultiResolutionPlayUrls;
             if (tmLiveAdapti != null && !tmLiveAdapti.isEmpty()) {
                liveManifest = new MultiResolutionListDatasource(this.mMultiResolutionPlayUrls);
             }else {
                tmLiveAdapti = this.mPlayUrls;
                if (tmLiveAdapti != null && !tmLiveAdapti.isEmpty()) {
                   liveManifest = new CDNModelListDatasource(this.mPlayUrls);
                }else {
                   DebugLog.e("LiveDataSource", "tranforms2ILiveDatasource null");
                }
             }
          }
       }
       DebugLog.i("LiveDataSource", "live datasourceType "+this.dataSourceType);
       return obj;
    }
}
