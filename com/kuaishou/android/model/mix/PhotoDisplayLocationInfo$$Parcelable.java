package com.kuaishou.android.model.mix.PhotoDisplayLocationInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoDisplayLocationInfo$$Parcelable implements Parcelable, d	// class@000d4c
{
    public PhotoDisplayLocationInfo photoDisplayLocationInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoDisplayLocationInfo$$Parcelable.CREATOR = new PhotoDisplayLocationInfo$$Parcelable$a();
    }
    public void PhotoDisplayLocationInfo$$Parcelable(PhotoDisplayLocationInfo p0){
       super();
       this.photoDisplayLocationInfo$$0 = p0;
    }
    public static PhotoDisplayLocationInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoDisplayLocationInfo photoDisplay = new PhotoDisplayLocationInfo();
          p1.f(p1.g(), photoDisplay);
          photoDisplay.mHeightRatio = p0.readFloat();
          photoDisplay.mDisplayWidth = p0.readFloat();
          photoDisplay.mTopRatio = p0.readFloat();
          photoDisplay.mWidthRatio = p0.readFloat();
          photoDisplay.mPhotoWidth = p0.readFloat();
          photoDisplay.mPhotoHeight = p0.readFloat();
          photoDisplay.mDisplayHeight = p0.readFloat();
          photoDisplay.mLeftRatio = p0.readFloat();
          p1.f(i, photoDisplay);
          return photoDisplay;
       }
    }
    public static void write(PhotoDisplayLocationInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeFloat(p0.mHeightRatio);
          p1.writeFloat(p0.mDisplayWidth);
          p1.writeFloat(p0.mTopRatio);
          p1.writeFloat(p0.mWidthRatio);
          p1.writeFloat(p0.mPhotoWidth);
          p1.writeFloat(p0.mPhotoHeight);
          p1.writeFloat(p0.mDisplayHeight);
          p1.writeFloat(p0.mLeftRatio);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoDisplayLocationInfo getParcel(){
       return this.photoDisplayLocationInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoDisplayLocationInfo$$Parcelable.write(this.photoDisplayLocationInfo$$0, p0, p1, new a());
    }
}
