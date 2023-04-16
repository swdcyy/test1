package com.amap.api.fence.DistrictItem$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.amap.api.fence.DistrictItem;

public final class DistrictItem$1 implements Parcelable$Creator	// class@000ebe
{

    public void DistrictItem$1(){
       super();
    }
    public static DistrictItem a(Parcel p0){
       return new DistrictItem(p0);
    }
    public static DistrictItem[] a(int p0){
       DistrictItem[] uDistrictIte = new DistrictItem[p0];
       return uDistrictIte;
    }
    public final Object createFromParcel(Parcel p0){
       return DistrictItem$1.a(p0);
    }
    public final Object[] newArray(int p0){
       return DistrictItem$1.a(p0);
    }
}
