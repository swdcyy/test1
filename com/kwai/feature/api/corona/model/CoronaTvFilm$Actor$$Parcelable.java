package com.kwai.feature.api.corona.model.CoronaTvFilm$Actor$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Actor$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Actor;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaTvFilm$Actor$$Parcelable implements Parcelable, d	// class@000e01
{
    public CoronaTvFilm$Actor actor$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaTvFilm$Actor$$Parcelable.CREATOR = new CoronaTvFilm$Actor$$Parcelable$a();
    }
    public void CoronaTvFilm$Actor$$Parcelable(CoronaTvFilm$Actor p0){
       super();
       this.actor$$0 = p0;
    }
    public static CoronaTvFilm$Actor read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaTvFilm$Actor uActor = new CoronaTvFilm$Actor();
          p1.f(p1.g(), uActor);
          uActor.mRole = p0.readString();
          uActor.mAvatar = p0.readString();
          uActor.mName = p0.readString();
          p1.f(i, uActor);
          return uActor;
       }
    }
    public static void write(CoronaTvFilm$Actor p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mRole);
          p1.writeString(p0.mAvatar);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaTvFilm$Actor getParcel(){
       return this.actor$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaTvFilm$Actor$$Parcelable.write(this.actor$$0, p0, p1, new a());
    }
}
