package com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable implements Parcelable, d	// class@000d61
{
    public PhotoRelationEntrance$PhotoRelationEntranceExtParams photoRelationEntranceExtParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable.CREATOR = new PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable$a();
    }
    public void PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable(PhotoRelationEntrance$PhotoRelationEntranceExtParams p0){
       super();
       this.photoRelationEntranceExtParams$$0 = p0;
    }
    public static PhotoRelationEntrance$PhotoRelationEntranceExtParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoRelationEntrance$PhotoRelationEntranceExtParams photoRelatio = new PhotoRelationEntrance$PhotoRelationEntranceExtParams();
          p1.f(p1.g(), photoRelatio);
          photoRelatio.mPhotoRelationEntranceSource = p0.readInt();
          p1.f(i, photoRelatio);
          return photoRelatio;
       }
    }
    public static void write(PhotoRelationEntrance$PhotoRelationEntranceExtParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPhotoRelationEntranceSource);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoRelationEntrance$PhotoRelationEntranceExtParams getParcel(){
       return this.photoRelationEntranceExtParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoRelationEntrance$PhotoRelationEntranceExtParams$$Parcelable.write(this.photoRelationEntranceExtParams$$0, p0, p1, new a());
    }
}
