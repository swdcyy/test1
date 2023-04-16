package com.kuaishou.android.model.mix.PhotoCoverStyle$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoCoverStyle$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoCoverStyle;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoCoverStyle$$Parcelable implements Parcelable, d	// class@000d48
{
    public PhotoCoverStyle photoCoverStyle$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoCoverStyle$$Parcelable.CREATOR = new PhotoCoverStyle$$Parcelable$a();
    }
    public void PhotoCoverStyle$$Parcelable(PhotoCoverStyle p0){
       super();
       this.photoCoverStyle$$0 = p0;
    }
    public static PhotoCoverStyle read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoCoverStyle photoCoverSt = new PhotoCoverStyle();
          p1.f(p1.g(), photoCoverSt);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          photoCoverSt.isShowDesc = b;
          photoCoverSt.mV3LeftBottomStyle = p0.readInt();
          photoCoverSt.mV3LeftBottomText = p0.readString();
          p1.f(i, photoCoverSt);
          return photoCoverSt;
       }
    }
    public static void write(PhotoCoverStyle p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.isShowDesc);
          p1.writeInt(p0.mV3LeftBottomStyle);
          p1.writeString(p0.mV3LeftBottomText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoCoverStyle getParcel(){
       return this.photoCoverStyle$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoCoverStyle$$Parcelable.write(this.photoCoverStyle$$0, p0, p1, new a());
    }
}
