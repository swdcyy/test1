package com.amap.api.fence.PoiItem$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.amap.api.fence.PoiItem;

public final class PoiItem$1 implements Parcelable$Creator	// class@000ec4
{

    public void PoiItem$1(){
       super();
    }
    public static PoiItem a(Parcel p0){
       return new PoiItem(p0);
    }
    public static PoiItem[] a(int p0){
       PoiItem[] poiItemArray = new PoiItem[p0];
       return poiItemArray;
    }
    public final Object createFromParcel(Parcel p0){
       return PoiItem$1.a(p0);
    }
    public final Object[] newArray(int p0){
       return PoiItem$1.a(p0);
    }
}
