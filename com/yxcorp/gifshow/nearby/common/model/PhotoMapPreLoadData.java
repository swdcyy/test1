package com.yxcorp.gifshow.nearby.common.model.PhotoMapPreLoadData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PhotoMapPreLoadData implements Serializable	// class@002130
{
    public PhotoMapPreLoadData$CenterLocationLatLng mCenterLocationLatLng;
    public List mQPhotos;
    public static final long serialVersionUID = 0x3bbbf23da8aeb75d;

    public void PhotoMapPreLoadData(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoMapPreLoadData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PhotoMapPreLoadData{mCenterLocation="+this.mCenterLocationLatLng+", mQPhotos="+this.mQPhotos+'}';
    }
}
