package com.amap.api.fence.DistrictItem;
import android.os.Parcelable;
import com.amap.api.fence.DistrictItem$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import com.amap.api.location.DPoint;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import java.util.List;

public class DistrictItem implements Parcelable	// class@000ebf
{
    public String a;
    public String b;
    public String c;
    public List d;
    public static final Parcelable$Creator CREATOR;

    static {
       DistrictItem.CREATOR = new DistrictItem$1();
    }
    public void DistrictItem(){
       super();
       this.a = "";
       this.b = null;
       this.c = null;
       this.d = null;
    }
    public void DistrictItem(Parcel p0){
       super();
       this.a = "";
       this.b = null;
       this.c = null;
       this.d = null;
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = p0.readString();
       this.d = p0.createTypedArrayList(DPoint.CREATOR);
    }
    public static Parcelable$Creator getCreator(){
       return DistrictItem.CREATOR;
    }
    public int describeContents(){
       return 0;
    }
    public String getAdcode(){
       return this.c;
    }
    public String getCitycode(){
       return this.b;
    }
    public String getDistrictName(){
       return this.a;
    }
    public List getPolyline(){
       return this.d;
    }
    public void setAdcode(String p0){
       this.c = p0;
    }
    public void setCitycode(String p0){
       this.b = p0;
    }
    public void setDistrictName(String p0){
       this.a = p0;
    }
    public void setPolyline(List p0){
       this.d = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeTypedList(this.d);
    }
}
