package com.yxcorp.gifshow.model.Place;
import java.io.Serializable;
import android.os.Parcelable;
import com.yxcorp.gifshow.model.Place$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import com.kuaishou.android.model.mix.Location;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class Place implements Serializable, Parcelable	// class@001e6e
{
    public String mLatitude;
    public String mLongitude;
    public String mPlaceName;
    public String mPoiId;
    public boolean mShowed;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       Place.CREATOR = new Place$a();
    }
    public void Place(){
       super();
    }
    public void Place(Parcel p0){
       super();
       this.mPoiId = p0.readString();
       this.mPlaceName = p0.readString();
       this.mLongitude = p0.readString();
       this.mLatitude = p0.readString();
    }
    public static Place from(Location p0){
       Place obj = PatchProxy.applyOneRefs(p0, null, Place.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Place();
       obj.mPlaceName = p0.getTitle();
       obj.mLatitude = String.valueOf(p0.getLatitude());
       obj.mLongitude = String.valueOf(p0.getLongitude());
       obj.mPoiId = String.valueOf(p0.mId);
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(Place.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Place.class, "2")) {
          return;
       }
       p0.writeString(this.mPoiId);
       p0.writeString(this.mPlaceName);
       p0.writeString(this.mLongitude);
       p0.writeString(this.mLatitude);
       return;
    }
}
