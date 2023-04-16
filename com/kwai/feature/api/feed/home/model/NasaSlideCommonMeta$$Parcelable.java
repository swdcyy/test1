package com.kwai.feature.api.feed.home.model.NasaSlideCommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.home.model.NasaSlideCommonMeta$$Parcelable$a;
import com.kwai.feature.api.feed.home.model.NasaSlideCommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NasaSlideCommonMeta$$Parcelable implements Parcelable, d	// class@000f15
{
    public NasaSlideCommonMeta nasaSlideCommonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NasaSlideCommonMeta$$Parcelable.CREATOR = new NasaSlideCommonMeta$$Parcelable$a();
    }
    public void NasaSlideCommonMeta$$Parcelable(NasaSlideCommonMeta p0){
       super();
       this.nasaSlideCommonMeta$$0 = p0;
    }
    public static NasaSlideCommonMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NasaSlideCommonMeta nasaSlideCom = new NasaSlideCommonMeta();
          p1.f(p1.g(), nasaSlideCom);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          nasaSlideCom.mShouldInsertBeforePrecacheFeed = b;
          p1.f(i, nasaSlideCom);
          return nasaSlideCom;
       }
    }
    public static void write(NasaSlideCommonMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShouldInsertBeforePrecacheFeed);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NasaSlideCommonMeta getParcel(){
       return this.nasaSlideCommonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NasaSlideCommonMeta$$Parcelable.write(this.nasaSlideCommonMeta$$0, p0, p1, new a());
    }
}
