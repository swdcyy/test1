package com.amap.api.fence.GeoFence$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.amap.api.fence.GeoFence;

public final class GeoFence$1 implements Parcelable$Creator	// class@000ec0
{

    public void GeoFence$1(){
       super();
    }
    public static GeoFence a(Parcel p0){
       return new GeoFence(p0);
    }
    public static GeoFence[] a(int p0){
       GeoFence[] geoFenceArra = new GeoFence[p0];
       return geoFenceArra;
    }
    public final Object createFromParcel(Parcel p0){
       return GeoFence$1.a(p0);
    }
    public final Object[] newArray(int p0){
       return GeoFence$1.a(p0);
    }
}
