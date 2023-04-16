package com.kuaishou.android.model.mix.CoronaLiveMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CoronaLiveMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.CoronaLiveMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CoronaLive;
import com.kuaishou.android.model.mix.CoronaLive$$Parcelable;

public class CoronaLiveMeta$$Parcelable implements Parcelable, d	// class@000c17
{
    public CoronaLiveMeta coronaLiveMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaLiveMeta$$Parcelable.CREATOR = new CoronaLiveMeta$$Parcelable$a();
    }
    public void CoronaLiveMeta$$Parcelable(CoronaLiveMeta p0){
       super();
       this.coronaLiveMeta$$0 = p0;
    }
    public static CoronaLiveMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaLiveMeta uCoronaLiveM = new CoronaLiveMeta();
          p1.f(p1.g(), uCoronaLiveM);
          uCoronaLiveM.mCoronaLive = CoronaLive$$Parcelable.read(p0, p1);
          p1.f(i, uCoronaLiveM);
          return uCoronaLiveM;
       }
    }
    public static void write(CoronaLiveMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaLive$$Parcelable.write(p0.mCoronaLive, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaLiveMeta getParcel(){
       return this.coronaLiveMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaLiveMeta$$Parcelable.write(this.coronaLiveMeta$$0, p0, p1, new a());
    }
}
