package com.yxcorp.gifshow.nearby.common.model.PhotoMapPreLoadData$CenterLocationLatLng;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PhotoMapPreLoadData$CenterLocationLatLng implements Serializable	// class@00212f
{
    public double mLatitude;
    public double mLongitude;
    public static final long serialVersionUID = 0x76bccd81b9b6fe9d;

    public void PhotoMapPreLoadData$CenterLocationLatLng(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoMapPreLoadData$CenterLocationLatLng.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CenterLocation{mLatitude="+this.mLatitude+", mLongitude="+this.mLongitude+'}';
    }
}
