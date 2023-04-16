package com.oplus.ocs.base.common.Feature;
import android.os.Parcelable;
import com.oplus.ocs.base.common.Feature$1;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;

public class Feature implements Parcelable	// class@000ab9
{
    public String a;
    public long b;
    public static final Parcelable$Creator CREATOR;

    static {
       Feature.CREATOR = new Feature$1();
    }
    public void Feature(Parcel p0){
       super();
       this.a = p0.readString();
       this.b = p0.readLong();
    }
    public void Feature(String p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public int describeContents(){
       return 0;
    }
    public String getName(){
       return this.a;
    }
    public long getVersion(){
       Feature tb = this.b;
       if (!tb - -1) {
          return -1;
       }
       return tb;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeLong(this.b);
    }
}
