package com.kwai.video.waynelive.datasource.LiveWebRtcManifestListDatasource;
import com.kwai.video.waynelive.datasource.LiveBaseDatasource;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import zk.d;
import com.google.gson.Gson;

public class LiveWebRtcManifestListDatasource extends LiveBaseDatasource	// class@000dee
{

    public void LiveWebRtcManifestListDatasource(List p0){
       super();
       this.mDatasourceType = 4;
       this.mLiveAdaptiveManifests = p0;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, LiveWebRtcManifestListDatasource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "LiveWebRtcManifestListDatasource";
       if (this.mLiveAdaptiveManifests != null) {
          d uod = new d();
          uod.c();
          Gson gson = uod.b();
          for (int i = 0; i < this.mLiveAdaptiveManifests.size(); i = i + 1) {
             obj = obj+" index-"+i+": "+gson.q(this.mLiveAdaptiveManifests.get(i));
          }
       }
       return obj;
    }
}
