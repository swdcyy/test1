package com.yxcorp.gifshow.model.Place$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.Place;

public class Place$a implements Parcelable$Creator	// class@001e6d
{

    public void Place$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       Place place = PatchProxy.applyOneRefs(p0, this, Place$a.class, "1");
       if (place != PatchProxyResult.class) {
       }else {
          place = new Place(p0);
       }
       return place;
    }
    public Object[] newArray(int p0){
       Place[] placeArray = new Place[p0];
       return placeArray;
    }
}
