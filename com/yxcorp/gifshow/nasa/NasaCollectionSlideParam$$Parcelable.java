package com.yxcorp.gifshow.nasa.NasaCollectionSlideParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam$$Parcelable$a;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;

public class NasaCollectionSlideParam$$Parcelable implements Parcelable, d	// class@0020b9
{
    public NasaCollectionSlideParam nasaCollectionSlideParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NasaCollectionSlideParam$$Parcelable.CREATOR = new NasaCollectionSlideParam$$Parcelable$a();
    }
    public void NasaCollectionSlideParam$$Parcelable(NasaCollectionSlideParam p0){
       super();
       this.nasaCollectionSlideParam$$0 = p0;
    }
    public static NasaCollectionSlideParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NasaCollectionSlideParam nasaCollecti = new NasaCollectionSlideParam();
          p1.f(p1.g(), nasaCollecti);
          a.d(NasaCollectionSlideParam.class, nasaCollecti, "mFrom", p0.readString());
          a.d(NasaCollectionSlideParam.class, nasaCollecti, "mBizType", p0.readString());
          a.d(NasaCollectionSlideParam.class, nasaCollecti, "mHsDepartmentId", p0.readString());
          a.d(NasaCollectionSlideParam.class, nasaCollecti, "mPhotoId", p0.readString());
          p1.f(i, nasaCollecti);
          return nasaCollecti;
       }
    }
    public static void write(NasaCollectionSlideParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mFrom);
          p1.writeString(p0.mBizType);
          p1.writeString(p0.mHsDepartmentId);
          p1.writeString(p0.mPhotoId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NasaCollectionSlideParam getParcel(){
       return this.nasaCollectionSlideParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NasaCollectionSlideParam$$Parcelable.write(this.nasaCollectionSlideParam$$0, p0, p1, new a());
    }
}
