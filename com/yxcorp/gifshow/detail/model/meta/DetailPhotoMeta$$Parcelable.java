package com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.detail.model.meta.QuickShareInfo;
import com.yxcorp.gifshow.detail.model.meta.QuickShareInfo$$Parcelable;

public class DetailPhotoMeta$$Parcelable implements Parcelable, d	// class@001595
{
    public DetailPhotoMeta detailPhotoMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailPhotoMeta$$Parcelable.CREATOR = new DetailPhotoMeta$$Parcelable$a();
    }
    public void DetailPhotoMeta$$Parcelable(DetailPhotoMeta p0){
       super();
       this.detailPhotoMeta$$0 = p0;
    }
    public static DetailPhotoMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          DetailPhotoMeta uDetailPhoto = new DetailPhotoMeta();
          p1.f(p1.g(), uDetailPhoto);
          uDetailPhoto.mQuickShareInfo = QuickShareInfo$$Parcelable.read(p0, p1);
          p1.f(i, uDetailPhoto);
          return uDetailPhoto;
       }
    }
    public static void write(DetailPhotoMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          QuickShareInfo$$Parcelable.write(p0.mQuickShareInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailPhotoMeta getParcel(){
       return this.detailPhotoMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailPhotoMeta$$Parcelable.write(this.detailPhotoMeta$$0, p0, p1, new a());
    }
}
