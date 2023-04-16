package com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.io.Serializable;
import java.lang.Object;
import f07.b;
import com.yxcorp.gifshow.map.PhotoSource;
import java.lang.String;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class MapCenterInfo implements Serializable	// class@001c98
{
    public MapLocationAddressResponse$LocationAddress mAddress;
    public b mCurrentCenterLatLng;
    public String mDefaultTitle;
    public boolean mIsLocation;
    public boolean mIsLocationWhenAuthorized;
    public boolean mIsRequestIpLocation;
    public String mMapEnterSource;
    public float mMapZoomLevel;
    public b mOriginalCenterLatLng;
    public String mPoiName;
    public String mRealDisplayTitle;
    public PhotoSource mSource;

    public void MapCenterInfo(){
       super();
       this.mOriginalCenterLatLng = new b(0, 0);
       this.mCurrentCenterLatLng = new b(0, 0);
       this.mRealDisplayTitle = "";
    }
    public void MapCenterInfo(double p0,double p1,PhotoSource p2,float p3){
       super();
       this.mOriginalCenterLatLng = new b(0, 0);
       this.mCurrentCenterLatLng = new b(0, 0);
       this.mRealDisplayTitle = "";
       this.mCurrentCenterLatLng = new b(p0, p1);
       this.mSource = p2;
       this.mMapZoomLevel = p3;
    }
    public void MapCenterInfo(double p0,double p1,String p2,MapLocationAddressResponse$LocationAddress p3,float p4){
       super();
       this.mOriginalCenterLatLng = new b(0, 0);
       this.mCurrentCenterLatLng = new b(0, 0);
       this.mRealDisplayTitle = "";
       this.mCurrentCenterLatLng = new b(p0, p1);
       this.mAddress = p3;
       this.mDefaultTitle = p2;
       this.mMapZoomLevel = p4;
    }
    public boolean isFromNearEnter(){
       Object obj = PatchProxy.apply(null, this, MapCenterInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return "1".equals(this.mMapEnterSource);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MapCenterInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MapCenterInfo{mCurrentCenterLatLng="+this.mCurrentCenterLatLng+", mSource="+this.mSource+", mAddress="+this.mAddress+", mDefaultTitle=\'"+this.mDefaultTitle+'''+", mMapZoomLevel="+this.mMapZoomLevel+", mIsLocation="+this.mIsLocation+", mIsRequestIpLocation="+this.mIsRequestIpLocation+", mIsLocationWhenAuthorized="+this.mIsLocationWhenAuthorized+", mPoiName=\'"+this.mPoiName+'''+'}';
    }
}
