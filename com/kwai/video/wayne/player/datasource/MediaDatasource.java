package com.kwai.video.wayne.player.datasource.MediaDatasource;
import com.kwai.video.wayne.player.datasource.BaseDatasource;
import com.kwai.video.player.misc.IMediaDataSource;
import java.lang.String;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;

public class MediaDatasource extends BaseDatasource	// class@000d1d
{
    public int mDatasourceType;
    public int mMediaType;
    public IMediaDataSource mediaDataSource;

    public void MediaDatasource(IMediaDataSource p0){
       super();
       this.mediaDataSource = p0;
       this.mMediaType = 1;
       this.mDatasourceType = 7;
    }
    public String getCacheKey(){
       return null;
    }
    public String getDatasourceStrUrl(){
       return null;
    }
    public int getKpmidMediaType(){
       return this.mMediaType;
    }
    public KwaiManifest getKwaiManifest(){
       return null;
    }
    public IMediaDataSource getMediaDatasSource(){
       return this.mediaDataSource;
    }
    public int getWayneDataSourceType(){
       return this.mDatasourceType;
    }
}
