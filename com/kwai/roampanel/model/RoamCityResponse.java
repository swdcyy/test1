package com.kwai.roampanel.model.RoamCityResponse;
import java.io.Serializable;
import mkd.a;
import android.os.Parcelable;
import com.kwai.roampanel.model.RoamCityResponse$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.List;
import com.kwai.robust.PatchProxy;
import java.util.Collections;
import java.lang.Integer;

public class RoamCityResponse implements Serializable, a, Parcelable	// class@0013d3
{
    public List mAllCitiesInfo;
    public List mHotCitiesInfo;
    public String mVersion;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       RoamCityResponse.CREATOR = new RoamCityResponse$a();
    }
    public void RoamCityResponse(){
       super();
    }
    public void RoamCityResponse(Parcel p0){
       super();
       this.mVersion = p0.readString();
       ArrayList uArrayList = new ArrayList();
       this.mAllCitiesInfo = uArrayList;
       p0.readList(uArrayList, CityInfo.class.getClassLoader());
       uArrayList = new ArrayList();
       this.mHotCitiesInfo = uArrayList;
       p0.readList(uArrayList, CityInfo.class.getClassLoader());
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RoamCityResponse.class, "1")) {
          return;
       }
       if (this.mAllCitiesInfo == null) {
          this.mAllCitiesInfo = Collections.emptyList();
       }
       if (this.mHotCitiesInfo == null) {
          this.mHotCitiesInfo = Collections.emptyList();
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(RoamCityResponse.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RoamCityResponse.class, "2")) {
          return;
       }
       p0.writeString(this.mVersion);
       p0.writeList(this.mAllCitiesInfo);
       p0.writeList(this.mHotCitiesInfo);
       return;
    }
}
