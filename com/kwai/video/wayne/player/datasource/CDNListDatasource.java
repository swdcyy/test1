package com.kwai.video.wayne.player.datasource.CDNListDatasource;
import com.kwai.video.wayne.player.datasource.BaseDatasource;
import java.util.List;
import java.lang.String;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.misc.IMediaDataSource;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.video.player.mid.manifest.v2.Adaptation;
import com.kwai.video.player.mid.manifest.v2.Representation;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.util.VodPlayerUtils;

public class CDNListDatasource extends BaseDatasource	// class@000d19
{
    public List mCdnList;
    public int mDatasourceType;
    public KwaiManifest mKwaiManifest;
    public int mMediaType;
    public String mUrl;

    public void CDNListDatasource(List p0,int p1){
       super();
       this.init(p0, p1, null);
    }
    public void CDNListDatasource(List p0,int p1,String p2){
       super();
       this.init(p0, p1, p2);
    }
    public String getDatasourceStrUrl(){
       return this.mUrl;
    }
    public int getKpmidMediaType(){
       return this.mMediaType;
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
    public final void init(List p0,int p1,String p2){
       if (PatchProxy.isSupport(CDNListDatasource.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, CDNListDatasource.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(p0);
       this.mCdnList = uArrayList;
       if (uArrayList.isEmpty()) {
          return;
       }
       this.mUrl = this.mCdnList.get(0);
       this.mMediaType = p1;
       this.mDatasourceType = 6;
       KwaiManifest kwaiManifest = new KwaiManifest();
       this.mKwaiManifest = kwaiManifest;
       kwaiManifest.mVersion = "1.0.0";
       kwaiManifest.mBusinessType = 2;
       kwaiManifest.mMediaType = this.mMediaType;
       ArrayList uArrayList1 = new ArrayList();
       Adaptation uAdaptation = new Adaptation();
       int i = 1;
       uAdaptation.mId = i;
       ArrayList uArrayList2 = new ArrayList();
       Representation representati = new Representation();
       representati.mMailUrl = this.mUrl;
       representati.mId = i;
       if (WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("usemidCacheKey", i)) {
          String str = "extra cacheKey";
          if (!TextUtils.isEmpty(p2)) {
             DebugLog.i(this.TAG, str+p2);
             representati.cacheKey = p2;
          }else {
             DebugLog.i(this.TAG, str+p2);
             representati.cacheKey = VodPlayerUtils.getCacheKey(this.mUrl);
          }
       }
       while (i < this.mCdnList.size()) {
          representati.mBackupUrls.add(this.mCdnList.get(i));
          i = i + 1;
       }
       uArrayList2.add(representati);
       uAdaptation.mRepresentation = uArrayList2;
       uArrayList1.add(uAdaptation);
       uAdaptation.mAdaptationSet = uArrayList1;
       return;
    }
}
