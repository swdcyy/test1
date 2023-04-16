package com.kuaishou.android.model.mix.PhotoTextLocationInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoTextLocationInfo$$Parcelable implements Parcelable, d	// class@000d6a
{
    public PhotoTextLocationInfo photoTextLocationInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoTextLocationInfo$$Parcelable.CREATOR = new PhotoTextLocationInfo$$Parcelable$a();
    }
    public void PhotoTextLocationInfo$$Parcelable(PhotoTextLocationInfo p0){
       super();
       this.photoTextLocationInfo$$0 = p0;
    }
    public static PhotoTextLocationInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoTextLocationInfo photoTextLoc = new PhotoTextLocationInfo();
          p1.f(p1.g(), photoTextLoc);
          photoTextLoc.mHeightRatio = p0.readFloat();
          photoTextLoc.mTopRatio = p0.readFloat();
          photoTextLoc.mWidthRatio = p0.readFloat();
          photoTextLoc.mLeftRatio = p0.readFloat();
          p1.f(i, photoTextLoc);
          return photoTextLoc;
       }
    }
    public static void write(PhotoTextLocationInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeFloat(p0.mHeightRatio);
          p1.writeFloat(p0.mTopRatio);
          p1.writeFloat(p0.mWidthRatio);
          p1.writeFloat(p0.mLeftRatio);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoTextLocationInfo getParcel(){
       return this.photoTextLocationInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoTextLocationInfo$$Parcelable.write(this.photoTextLocationInfo$$0, p0, p1, new a());
    }
}
