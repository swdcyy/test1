package com.kuaishou.android.model.mix.PhotoCommonTags$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoCommonTags$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoCommonTags;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$$Parcelable;

public class PhotoCommonTags$$Parcelable implements Parcelable, d	// class@000d40
{
    public PhotoCommonTags photoCommonTags$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoCommonTags$$Parcelable.CREATOR = new PhotoCommonTags$$Parcelable$a();
    }
    public void PhotoCommonTags$$Parcelable(PhotoCommonTags p0){
       super();
       this.photoCommonTags$$0 = p0;
    }
    public static PhotoCommonTags read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoCommonTags photoCommonT = new PhotoCommonTags();
          p1.f(p1.g(), photoCommonT);
          photoCommonT.mPhotoCommonTagsStyleInfo = PhotoCommonTagsStyleInfo$$Parcelable.read(p0, p1);
          p1.f(i, photoCommonT);
          return photoCommonT;
       }
    }
    public static void write(PhotoCommonTags p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoCommonTagsStyleInfo$$Parcelable.write(p0.mPhotoCommonTagsStyleInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoCommonTags getParcel(){
       return this.photoCommonTags$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoCommonTags$$Parcelable.write(this.photoCommonTags$$0, p0, p1, new a());
    }
}
