package com.kwai.video.waynelive.datasource.ILiveDatasource;
import java.util.List;
import java.lang.String;

public interface abstract ILiveDatasource	// class@000de1
{

    List getCurrentDatasource();
    String getSelectedQualityType();
    int getWayneDataSourceType();
    void setSelectedQualityType(String p0);
}
