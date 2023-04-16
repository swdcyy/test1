package com.amap.api.location.AMapLocationClientOption$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.amap.api.location.AMapLocationClientOption;

public final class AMapLocationClientOption$1 implements Parcelable$Creator	// class@000ec9
{

    public void AMapLocationClientOption$1(){
       super();
    }
    public static AMapLocationClientOption a(Parcel p0){
       return new AMapLocationClientOption(p0);
    }
    public static AMapLocationClientOption[] a(int p0){
       AMapLocationClientOption[] uAMapLocatio = new AMapLocationClientOption[p0];
       return uAMapLocatio;
    }
    public final Object createFromParcel(Parcel p0){
       return AMapLocationClientOption$1.a(p0);
    }
    public final Object[] newArray(int p0){
       return AMapLocationClientOption$1.a(p0);
    }
}
