package com.kwai.video.wayne.player.datasource.NormalUrlDatasource;
import com.kwai.video.wayne.player.datasource.BaseDatasource;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.wayne.player.util.VodPlayerUtils;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.misc.IMediaDataSource;

public class NormalUrlDatasource extends BaseDatasource	// class@000d1e
{
    public int mDatasourceType;
    public KwaiManifest mKwaiManifest;
    public int mMediaType;
    public String mUrl;

    public void NormalUrlDatasource(String p0,int p1){
       super();
       this.init(p0, p1, null);
    }
    public void NormalUrlDatasource(String p0,int p1,Boolean p2){
       super();
       this.init(p0, p1, null);
       if (p2.booleanValue()) {
          this.mMediaType = 2;
          this.mDatasourceType = 8;
       }
       return;
    }
    public String getCacheKey(){
       Object obj = PatchProxy.apply(null, this, NormalUrlDatasource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mCacheKey)) {
          this.mCacheKey = VodPlayerUtils.getCacheKey(this.getDatasourceStrUrl());
       }
       return this.mCacheKey;
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
    public final void init(String p0,int p1,String p2){
       this.mUrl = p0;
       this.mMediaType = p1;
       this.mDatasourceType = 1;
       this.mCacheKey = p2;
    }
}
