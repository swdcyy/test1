package com.kwai.framework.location.locationupload.LocationUploadConfig$DynamicConfig;
import java.lang.Object;
import com.kwai.framework.location.locationupload.LocationUploadConfig$Fire;

public class LocationUploadConfig$DynamicConfig	// class@001634
{
    public boolean bothCollectMacWithoutPermission;
    public boolean collectMacWhileKeepAlive;
    public int collectMacWhileKeepAliveMinInterval;
    public boolean collectMacWithoutPermission;
    public int collectMacWithoutPermissionMinInterval;
    public boolean enableBasestation;
    public boolean enableMacWithoutPermission;
    public boolean enableQueryWhenCellChanged;
    public boolean enableWifi;
    public String experimentTag;
    public LocationUploadConfig$Filter filter;
    public LocationUploadConfig$Fire fire;
    public String sdkType;
    public boolean shouldQuery;
    public String tag;
    public boolean uploadStatisticsData;

    public void LocationUploadConfig$DynamicConfig(){
       super();
    }
    public boolean a(){
       boolean b;
       if (this.filter != null) {
          LocationUploadConfig$DynamicConfig tfire = this.fire;
          if (tfire != null && tfire.timerConfig != null) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
}
