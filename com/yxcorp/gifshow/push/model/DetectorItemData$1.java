package com.yxcorp.gifshow.push.model.DetectorItemData$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.push.model.DetectorItemData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class DetectorItemData$1 implements Parcelable$Creator	// class@001685
{

    public void DetectorItemData$1(){
       super();
    }
    public DetectorItemData createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetectorItemData$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DetectorItemData(p0);
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public DetectorItemData[] newArray(int p0){
       DetectorItemData[] uDetectorIte = new DetectorItemData[p0];
       return uDetectorIte;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
