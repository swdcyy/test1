package com.amap.api.location.DPoint;
import android.os.Parcelable;
import com.amap.api.location.DPoint$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Double;

public class DPoint implements Parcelable	// class@000ed8
{
    public double a;
    public double b;
    public static final Parcelable$Creator CREATOR;

    static {
       DPoint.CREATOR = new DPoint$1();
    }
    public void DPoint(){
       super();
       this.a = 0;
       this.b = 0;
    }
    public void DPoint(double p0,double p1){
       super();
       this.a = 0;
       this.b = 0;
       int i = 0x4066800000000000;
       if (p1 - i > 0) {
          p1 = i;
       }
       i = 0xc066800000000000;
       if (p1 - i < 0) {
          p1 = i;
       }
       i = 0x4056800000000000;
       if (p0 - i > 0) {
          p0 = i;
       }
       if (p0 - 0xc056800000000000 < 0) {
          p0 = -90.00f;
       }
       this.a = p1;
       this.b = p0;
       return;
    }
    public void DPoint(Parcel p0){
       super();
       this.a = 0;
       this.b = 0;
       this.a = p0.readDouble();
       this.b = p0.readDouble();
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (!p0 instanceof DPoint) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       return true;
    }
    public double getLatitude(){
       return this.b;
    }
    public double getLongitude(){
       return this.a;
    }
    public int hashCode(){
       return Double.valueOf(((this.b + this.a) * 1000000.00f)).intValue();
    }
    public void setLatitude(double p0){
       int i = 0x4056800000000000;
       if (p0 - i > 0) {
          p0 = i;
       }
       if (p0 - 0xc056800000000000 < 0) {
          p0 = -90.00f;
       }
       this.b = p0;
       return;
    }
    public void setLongitude(double p0){
       int i = 0x4066800000000000;
       if (p0 - i > 0) {
          p0 = i;
       }
       if (p0 - 0xc066800000000000 < 0) {
          p0 = -180.00f;
       }
       this.a = p0;
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeDouble(this.a);
       p0.writeDouble(this.b);
    }
}
