package com.kwai.yoda.session.logger.batch.HybridBatchDataWebItem;
import com.kwai.yoda.session.logger.batch.HybridBatchDataItem;
import java.lang.Object;
import java.lang.String;
import com.kwai.yoda.logger.UrlPackage;

public final class HybridBatchDataWebItem extends HybridBatchDataItem	// class@0012d6
{
    public Object h5Extra;
    public String projectId;
    public String radarSessionId;
    public UrlPackage urlPackage;

    public void HybridBatchDataWebItem(){
       super();
    }
    public final Object getH5Extra(){
       return this.h5Extra;
    }
    public final String getProjectId(){
       return this.projectId;
    }
    public final String getRadarSessionId(){
       return this.radarSessionId;
    }
    public final UrlPackage getUrlPackage(){
       return this.urlPackage;
    }
    public final void setH5Extra(Object p0){
       this.h5Extra = p0;
    }
    public final void setProjectId(String p0){
       this.projectId = p0;
    }
    public final void setRadarSessionId(String p0){
       this.radarSessionId = p0;
    }
    public final void setUrlPackage(UrlPackage p0){
       this.urlPackage = p0;
    }
}
