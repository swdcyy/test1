package com.kwai.feature.api.corona.model.CoronaTvFilm$Directors$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Directors$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Directors;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaTvFilm$Directors$$Parcelable implements Parcelable, d	// class@000e04
{
    public CoronaTvFilm$Directors directors$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaTvFilm$Directors$$Parcelable.CREATOR = new CoronaTvFilm$Directors$$Parcelable$a();
    }
    public void CoronaTvFilm$Directors$$Parcelable(CoronaTvFilm$Directors p0){
       super();
       this.directors$$0 = p0;
    }
    public static CoronaTvFilm$Directors read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaTvFilm$Directors uDirectors = new CoronaTvFilm$Directors();
          p1.f(p1.g(), uDirectors);
          uDirectors.mAvatar = p0.readString();
          uDirectors.mName = p0.readString();
          p1.f(i, uDirectors);
          return uDirectors;
       }
    }
    public static void write(CoronaTvFilm$Directors p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mAvatar);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaTvFilm$Directors getParcel(){
       return this.directors$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaTvFilm$Directors$$Parcelable.write(this.directors$$0, p0, p1, new a());
    }
}
