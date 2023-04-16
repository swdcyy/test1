package com.kwai.video.wayne.player.datasource.IDatasource;
import java.lang.String;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.misc.IMediaDataSource;

public interface abstract IDatasource	// class@000d1b
{

    String getCacheKey();
    String getDatasourceStrUrl();
    int getKpmidMediaType();
    KwaiManifest getKwaiManifest();
    IMediaDataSource getMediaDatasSource();
    String getResourceKey();
    String getSelectedQualityType();
    int getSelectedRepId();
    String getVideoId();
    int getWayneDataSourceType();
    void setCacheKey(String p0);
    void setSelectedQualityType(String p0);
    boolean setSelectedRepId(int p0);
    void setVideoId(String p0);
}
