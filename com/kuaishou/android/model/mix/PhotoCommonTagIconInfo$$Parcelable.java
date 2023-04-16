package com.kuaishou.android.model.mix.PhotoCommonTagIconInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoCommonTagIconInfo$$Parcelable implements Parcelable, d	// class@000d38
{
    public PhotoCommonTagIconInfo photoCommonTagIconInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoCommonTagIconInfo$$Parcelable.CREATOR = new PhotoCommonTagIconInfo$$Parcelable$a();
    }
    public void PhotoCommonTagIconInfo$$Parcelable(PhotoCommonTagIconInfo p0){
       super();
       this.photoCommonTagIconInfo$$0 = p0;
    }
    public static PhotoCommonTagIconInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoCommonTagIconInfo photoCommonT = new PhotoCommonTagIconInfo();
          p1.f(p1.g(), photoCommonT);
          photoCommonT.mIconWidth = p0.readInt();
          photoCommonT.mIconHeight = p0.readInt();
          photoCommonT.mIconUrl = p0.readString();
          p1.f(i, photoCommonT);
          return photoCommonT;
       }
    }
    public static void write(PhotoCommonTagIconInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconWidth);
          p1.writeInt(p0.mIconHeight);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoCommonTagIconInfo getParcel(){
       return this.photoCommonTagIconInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoCommonTagIconInfo$$Parcelable.write(this.photoCommonTagIconInfo$$0, p0, p1, new a());
    }
}
