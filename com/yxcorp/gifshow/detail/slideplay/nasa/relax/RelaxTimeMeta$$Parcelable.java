package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeMeta$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class RelaxTimeMeta$$Parcelable implements Parcelable, d	// class@0017b6
{
    public RelaxTimeMeta relaxTimeMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RelaxTimeMeta$$Parcelable.CREATOR = new RelaxTimeMeta$$Parcelable$a();
    }
    public void RelaxTimeMeta$$Parcelable(RelaxTimeMeta p0){
       super();
       this.relaxTimeMeta$$0 = p0;
    }
    public static RelaxTimeMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RelaxTimeMeta relaxTimeMet = new RelaxTimeMeta();
          p1.f(p1.g(), relaxTimeMet);
          relaxTimeMet.mRelaxType = p0.readInt();
          p1.f(i, relaxTimeMet);
          return relaxTimeMet;
       }
    }
    public static void write(RelaxTimeMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mRelaxType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RelaxTimeMeta getParcel(){
       return this.relaxTimeMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RelaxTimeMeta$$Parcelable.write(this.relaxTimeMeta$$0, p0, p1, new a());
    }
}
