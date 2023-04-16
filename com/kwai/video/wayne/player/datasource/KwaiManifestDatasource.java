package com.kwai.video.wayne.player.datasource.KwaiManifestDatasource;
import com.kwai.video.wayne.player.datasource.BaseDatasource;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.List;
import java.util.ArrayList;
import com.kwai.video.player.mid.manifest.v2.Adaptation;
import com.kwai.video.player.mid.manifest.v2.Representation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.util.GsonUtil;
import com.google.gson.Gson;
import com.kwai.video.player.misc.IMediaDataSource;
import java.lang.Boolean;

public class KwaiManifestDatasource extends BaseDatasource	// class@000d1c
{
    public int mDatasourceType;
    public int mKpmidMediaType;
    public KwaiManifest mKwaiManifest;
    public static String logTag = "KwaiManifestDatasource";

    public void KwaiManifestDatasource(KwaiManifest p0){
       super(p0, false);
    }
    public void KwaiManifestDatasource(KwaiManifest p0,boolean p1){
       super();
       DebugLog.i(KwaiManifestDatasource.logTag, "setKwaiManifest "+p0+" useRandomUrlStrategy: "+p1);
       if (p1) {
          p0.shuffleUrlList();
       }
       p0.executeRepresentationFilter();
       this.mKwaiManifest = p0;
       this.parseBasicInfoFromKwaiManifest(p0);
       return;
    }
    public void KwaiManifestDatasource(String p0){
       super(p0, false);
    }
    public void KwaiManifestDatasource(String p0,boolean p1){
       super(KwaiManifestDatasource.from(p0), p1);
    }
    public void KwaiManifestDatasource(List p0,int p1){
       super();
       KwaiManifest kwaiManifest = new KwaiManifest();
       this.mKwaiManifest = kwaiManifest;
       kwaiManifest.mVersion = "1.0.0";
       kwaiManifest.mBusinessType = 2;
       kwaiManifest.mMediaType = p1;
       ArrayList uArrayList = new ArrayList();
       Adaptation uAdaptation = new Adaptation();
       int i = 1;
       uAdaptation.mId = i;
       ArrayList uArrayList1 = new ArrayList();
       Representation representati = new Representation();
       representati.mMailUrl = p0.get(0);
       representati.mId = i;
       for (; i < p0.size(); i = i + 1) {
          representati.mBackupUrls.add(p0.get(i));
       }
       uArrayList1.add(representati);
       uAdaptation.mRepresentation = uArrayList1;
       uArrayList.add(uAdaptation);
       KwaiManifestDatasource tmKwaiManife = this.mKwaiManifest;
       tmKwaiManife.mAdaptationSet = uArrayList;
       tmKwaiManife.executeRepresentationFilter();
       this.parseBasicInfoFromKwaiManifest(this.mKwaiManifest);
       return;
    }
    public static KwaiManifest from(String p0){
       KwaiManifest obj = PatchProxy.applyOneRefs(p0, null, KwaiManifestDatasource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = GsonUtil.KP_MID_GSON.h(p0, KwaiManifest.class);
          obj.setManifestString(p0);
          obj.executeRepresentationFilter();
          return obj;
       }catch(java.lang.Exception e4){
          DebugLog.e(KwaiManifestDatasource.logTag, "[from]JsonString change to KwaiManifest fail! cause by: "+e4);
          return v1;
       }
    }
    public String getDatasourceStrUrl(){
       Object obj = PatchProxy.apply(null, this, KwaiManifestDatasource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mKwaiManifest.getManifestString();
    }
    public int getKpmidMediaType(){
       return this.mKpmidMediaType;
    }
    public KwaiManifest getKwaiManifest(){
       return this.mKwaiManifest;
    }
    public IMediaDataSource getMediaDatasSource(){
       return null;
    }
    public int getWayneDataSourceType(){
       return this.mDatasourceType;
    }
    public boolean isHdr(){
       Object obj = PatchProxy.apply(null, this, KwaiManifestDatasource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mKwaiManifest.isHdr();
    }
    public final void parseBasicInfoFromKwaiManifest(KwaiManifest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiManifestDatasource.class, "1")) {
          return;
       }
       DebugLog.i(KwaiManifestDatasource.logTag, "parseBasicInfoFromKwaiManifest "+p0);
       this.setVideoId(p0.mVideoId);
       this.mDatasourceType = 6;
       p0 = p0.mMediaType;
       int i = 1;
       if (p0 == 2) {
          this.mKpmidMediaType = i;
       }else if(p0 == i){
          this.mKpmidMediaType = 2;
       }else {
          DebugLog.e(KwaiManifestDatasource.logTag, "invalid manifest.mMediaType:");
       }
       return;
    }
}
