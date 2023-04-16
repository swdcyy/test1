package com.kwai.components.feedmodel.feed.KaraokeChorusModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel$$Parcelable$a;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class KaraokeChorusModel$$Parcelable implements Parcelable, d	// class@000c47
{
    public KaraokeChorusModel karaokeChorusModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       KaraokeChorusModel$$Parcelable.CREATOR = new KaraokeChorusModel$$Parcelable$a();
    }
    public void KaraokeChorusModel$$Parcelable(KaraokeChorusModel p0){
       super();
       this.karaokeChorusModel$$0 = p0;
    }
    public static KaraokeChorusModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          KaraokeChorusModel karaokeChoru = new KaraokeChorusModel();
          p1.f(p1.g(), karaokeChoru);
          karaokeChoru.mUserName = p0.readString();
          karaokeChoru.mPhotoId = p0.readString();
          karaokeChoru.mType = p0.readInt();
          p1.f(i, karaokeChoru);
          return karaokeChoru;
       }
    }
    public static void write(KaraokeChorusModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUserName);
          p1.writeString(p0.mPhotoId);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public KaraokeChorusModel getParcel(){
       return this.karaokeChorusModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       KaraokeChorusModel$$Parcelable.write(this.karaokeChorusModel$$0, p0, p1, new a());
    }
}
