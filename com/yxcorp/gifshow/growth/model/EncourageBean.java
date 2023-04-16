package com.yxcorp.gifshow.growth.model.EncourageBean;
import android.os.Parcelable;
import com.yxcorp.gifshow.growth.model.EncourageBean$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class EncourageBean implements Parcelable	// class@001432
{
    public String b;
    public String c;
    public String d;
    public String e;
    public static final Parcelable$Creator CREATOR;

    static {
       EncourageBean.CREATOR = new EncourageBean$a();
    }
    public void EncourageBean(Parcel p0){
       super();
       this.b = p0.readString();
       this.c = p0.readString();
       this.d = p0.readString();
       this.e = p0.readString();
    }
    public void EncourageBean(String p0,String p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public String a(){
       return this.b;
    }
    public String b(){
       return this.c;
    }
    public String c(){
       return this.e;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EncourageBean.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EncourageBean.class, "1")) {
          return;
       }
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeString(this.d);
       p0.writeString(this.e);
       return;
    }
}
