package com.yxcorp.gifshow.corona.common.model.DetailCaption$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.DetailCaption$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.DetailCaption;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class DetailCaption$$Parcelable implements Parcelable, d	// class@001231
{
    public DetailCaption detailCaption$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailCaption$$Parcelable.CREATOR = new DetailCaption$$Parcelable$a();
    }
    public void DetailCaption$$Parcelable(DetailCaption p0){
       super();
       this.detailCaption$$0 = p0;
    }
    public static DetailCaption read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DetailCaption uDetailCapti = new DetailCaption();
          p1.f(p1.g(), uDetailCapti);
          uDetailCapti.mCaption = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uDetailCapti.mTagClickable = b;
          p1.f(i, uDetailCapti);
          return uDetailCapti;
       }
    }
    public static void write(DetailCaption p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCaption);
          p1.writeInt(p0.mTagClickable);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailCaption getParcel(){
       return this.detailCaption$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailCaption$$Parcelable.write(this.detailCaption$$0, p0, p1, new a());
    }
}
