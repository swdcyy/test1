package com.kuaishou.android.model.mix.PosterSpecialEffect$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PosterSpecialEffect$$Parcelable$a;
import com.kuaishou.android.model.mix.PosterSpecialEffect;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PosterSpecialEffect$$Parcelable implements Parcelable, d	// class@000dc0
{
    public PosterSpecialEffect posterSpecialEffect$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PosterSpecialEffect$$Parcelable.CREATOR = new PosterSpecialEffect$$Parcelable$a();
    }
    public void PosterSpecialEffect$$Parcelable(PosterSpecialEffect p0){
       super();
       this.posterSpecialEffect$$0 = p0;
    }
    public static PosterSpecialEffect read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PosterSpecialEffect posterSpecia = new PosterSpecialEffect();
          p1.f(p1.g(), posterSpecia);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          posterSpecia.mHighLightTimePhoto = b;
          p1.f(i, posterSpecia);
          return posterSpecia;
       }
    }
    public static void write(PosterSpecialEffect p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHighLightTimePhoto);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PosterSpecialEffect getParcel(){
       return this.posterSpecialEffect$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PosterSpecialEffect$$Parcelable.write(this.posterSpecialEffect$$0, p0, p1, new a());
    }
}
