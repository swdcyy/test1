package com.amap.api.fence.PoiItem;
import android.os.Parcelable;
import com.amap.api.fence.PoiItem$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import android.os.Parcelable$Creator;

public class PoiItem implements Parcelable	// class@000ec5
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public double f;
    public double g;
    public String h;
    public String i;
    public String j;
    public String k;
    public static final Parcelable$Creator CREATOR;

    static {
       PoiItem.CREATOR = new PoiItem$1();
    }
    public void PoiItem(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = "";
       this.f = 0;
       this.g = 0;
       this.h = "";
       this.i = "";
       this.j = "";
       this.k = "";
    }
    public void PoiItem(Parcel p0){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = "";
       this.f = 0;
       this.g = 0;
       this.h = "";
       this.i = "";
       this.j = "";
       this.k = "";
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = p0.readString();
       this.d = p0.readString();
       this.e = p0.readString();
       this.f = p0.readDouble();
       this.g = p0.readDouble();
       this.h = p0.readString();
       this.i = p0.readString();
       this.j = p0.readString();
       this.k = p0.readString();
    }
    public static Parcelable$Creator getCreator(){
       return PoiItem.CREATOR;
    }
    public int describeContents(){
       return 0;
    }
    public String getAddress(){
       return this.e;
    }
    public String getAdname(){
       return this.k;
    }
    public String getCity(){
       return this.j;
    }
    public double getLatitude(){
       return this.f;
    }
    public double getLongitude(){
       return this.g;
    }
    public String getPoiId(){
       return this.b;
    }
    public String getPoiName(){
       return this.a;
    }
    public String getPoiType(){
       return this.c;
    }
    public String getProvince(){
       return this.i;
    }
    public String getTel(){
       return this.h;
    }
    public String getTypeCode(){
       return this.d;
    }
    public void setAddress(String p0){
       this.e = p0;
    }
    public void setAdname(String p0){
       this.k = p0;
    }
    public void setCity(String p0){
       this.j = p0;
    }
    public void setLatitude(double p0){
       this.f = p0;
    }
    public void setLongitude(double p0){
       this.g = p0;
    }
    public void setPoiId(String p0){
       this.b = p0;
    }
    public void setPoiName(String p0){
       this.a = p0;
    }
    public void setPoiType(String p0){
       this.c = p0;
    }
    public void setProvince(String p0){
       this.i = p0;
    }
    public void setTel(String p0){
       this.h = p0;
    }
    public void setTypeCode(String p0){
       this.d = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeString(this.d);
       p0.writeString(this.e);
       p0.writeDouble(this.f);
       p0.writeDouble(this.g);
       p0.writeString(this.h);
       p0.writeString(this.i);
       p0.writeString(this.j);
       p0.writeString(this.k);
    }
}
