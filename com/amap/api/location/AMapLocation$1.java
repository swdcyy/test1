package com.amap.api.location.AMapLocation$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.amap.api.location.AMapLocation;
import android.location.Location;
import java.lang.String;

public final class AMapLocation$1 implements Parcelable$Creator	// class@000ec6
{

    public void AMapLocation$1(){
       super();
    }
    public static AMapLocation a(Parcel p0){
       AMapLocation uAMapLocatio = new AMapLocation(Location.CREATOR.createFromParcel(p0));
       AMapLocation.a(uAMapLocatio, p0.readString());
       AMapLocation.b(uAMapLocatio, p0.readString());
       AMapLocation.c(uAMapLocatio, p0.readString());
       uAMapLocatio.a = p0.readString();
       AMapLocation.d(uAMapLocatio, p0.readString());
       AMapLocation.e(uAMapLocatio, p0.readString());
       AMapLocation.f(uAMapLocatio, p0.readString());
       AMapLocation.g(uAMapLocatio, p0.readString());
       AMapLocation.a(uAMapLocatio, p0.readInt());
       AMapLocation.h(uAMapLocatio, p0.readString());
       uAMapLocatio.b = p0.readString();
       boolean b = true;
       boolean b1 = (p0.readInt())? true: false;
       AMapLocation.a(uAMapLocatio, b1);
       b1 = (p0.readInt())? true: false;
       AMapLocation.b(uAMapLocatio, b1);
       AMapLocation.a(uAMapLocatio, p0.readDouble());
       AMapLocation.i(uAMapLocatio, p0.readString());
       AMapLocation.b(uAMapLocatio, p0.readInt());
       AMapLocation.b(uAMapLocatio, p0.readDouble());
       if (!p0.readInt()) {
          b = false;
       }
       AMapLocation.c(uAMapLocatio, b);
       AMapLocation.j(uAMapLocatio, p0.readString());
       AMapLocation.k(uAMapLocatio, p0.readString());
       AMapLocation.l(uAMapLocatio, p0.readString());
       AMapLocation.m(uAMapLocatio, p0.readString());
       AMapLocation.c(uAMapLocatio, p0.readInt());
       AMapLocation.d(uAMapLocatio, p0.readInt());
       AMapLocation.n(uAMapLocatio, p0.readString());
       AMapLocation.o(uAMapLocatio, p0.readString());
       AMapLocation.p(uAMapLocatio, p0.readString());
       AMapLocation.e(uAMapLocatio, p0.readInt());
       AMapLocation.f(uAMapLocatio, p0.readInt());
       return uAMapLocatio;
    }
    public static AMapLocation[] a(int p0){
       AMapLocation[] uAMapLocatio = new AMapLocation[p0];
       return uAMapLocatio;
    }
    public final Object createFromParcel(Parcel p0){
       return AMapLocation$1.a(p0);
    }
    public final Object[] newArray(int p0){
       return AMapLocation$1.a(p0);
    }
}
