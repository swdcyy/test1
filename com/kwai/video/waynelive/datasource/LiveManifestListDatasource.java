package com.kwai.video.waynelive.datasource.LiveManifestListDatasource;
import com.kwai.video.waynelive.datasource.LiveBaseDatasource;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveManifestListDatasource extends LiveBaseDatasource	// class@000dea
{

    public void LiveManifestListDatasource(List p0){
       super();
       this.mDatasourceType = 5;
       this.mLiveAdaptiveManifests = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveManifestListDatasource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveManifestListDatasource";
    }
}
