package com.yxcorp.gifshow.model.HotPlace;
import com.yxcorp.gifshow.model.Place;
import com.yxcorp.gifshow.model.HotPlace$a;
import android.os.Parcel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;

public class HotPlace extends Place	// class@001e22
{
    public boolean isHot;
    public String mAddress;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       HotPlace.CREATOR = new HotPlace$a();
    }
    public void HotPlace(Parcel p0){
       super(p0);
       this.mAddress = p0.readString();
       boolean b = (p0.readByte())? true: false;
       this.isHot = b;
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(HotPlace.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HotPlace.class, "1")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeString(this.mAddress);
       p0.writeByte((byte)this.isHot);
       return;
    }
}
