package com.amap.api.location.DPoint$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.amap.api.location.DPoint;

public final class DPoint$1 implements Parcelable$Creator	// class@000ed7
{

    public void DPoint$1(){
       super();
    }
    public static DPoint a(Parcel p0){
       return new DPoint(p0);
    }
    public static DPoint[] a(int p0){
       DPoint[] uDPointArray = new DPoint[p0];
       return uDPointArray;
    }
    public final Object createFromParcel(Parcel p0){
       return DPoint$1.a(p0);
    }
    public final Object[] newArray(int p0){
       return DPoint$1.a(p0);
    }
}
