package com.kwai.video.waynelive.datasource.LiveBaseDatasource;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import java.lang.Object;
import java.util.List;
import java.lang.String;

public abstract class LiveBaseDatasource implements ILiveDatasource	// class@000de2
{
    public int mDatasourceType;
    public List mLiveAdaptiveManifests;
    public String mQualityType;

    public void LiveBaseDatasource(){
       super();
    }
    public List getCurrentDatasource(){
       return this.mLiveAdaptiveManifests;
    }
    public String getSelectedQualityType(){
       return this.mQualityType;
    }
    public int getWayneDataSourceType(){
       return this.mDatasourceType;
    }
    public void setSelectedQualityType(String p0){
       this.mQualityType = p0;
    }
}
