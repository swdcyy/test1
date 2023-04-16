package com.kwai.components.feedmodel.feed.KaraokeModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.feed.KaraokeModel$$Parcelable$a;
import com.kwai.components.feedmodel.feed.KaraokeModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo$$Parcelable;

public class KaraokeModel$$Parcelable implements Parcelable, d	// class@000c4a
{
    public KaraokeModel karaokeModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       KaraokeModel$$Parcelable.CREATOR = new KaraokeModel$$Parcelable$a();
    }
    public void KaraokeModel$$Parcelable(KaraokeModel p0){
       super();
       this.karaokeModel$$0 = p0;
    }
    public static KaraokeModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          KaraokeModel karaokeModel = new KaraokeModel();
          p1.f(p1.g(), karaokeModel);
          karaokeModel.mKaraokeInfo = KaraokeModel$KaraokeInfo$$Parcelable.read(p0, p1);
          p1.f(i, karaokeModel);
          return karaokeModel;
       }
    }
    public static void write(KaraokeModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          KaraokeModel$KaraokeInfo$$Parcelable.write(p0.mKaraokeInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public KaraokeModel getParcel(){
       return this.karaokeModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       KaraokeModel$$Parcelable.write(this.karaokeModel$$0, p0, p1, new a());
    }
}
