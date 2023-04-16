package com.yxcorp.gifshow.push.model.DetectorItemData;
import android.os.Parcelable;
import com.yxcorp.gifshow.push.model.DetectorItemData$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class DetectorItemData implements Parcelable	// class@001686
{
    public String className;
    public long timestamp;
    public static final Parcelable$Creator CREATOR;

    static {
       DetectorItemData.CREATOR = new DetectorItemData$1();
    }
    public void DetectorItemData(){
       super();
       this.timestamp = 0;
       this.className = "";
    }
    public void DetectorItemData(Parcel p0){
       super();
       this.timestamp = 0;
       this.className = "";
       this.timestamp = p0.readLong();
       this.className = p0.readString();
    }
    public int describeContents(){
       return 0;
    }
    public void readFromParcel(Parcel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetectorItemData.class, "2")) {
          return;
       }
       this.timestamp = p0.readLong();
       this.className = p0.readString();
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(DetectorItemData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DetectorItemData.class, "1")) {
          return;
       }
       p0.writeLong(this.timestamp);
       p0.writeString(this.className);
       return;
    }
}
