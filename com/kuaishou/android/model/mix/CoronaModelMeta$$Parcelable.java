package com.kuaishou.android.model.mix.CoronaModelMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CoronaModelMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.CoronaModelMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.mix.CoronaFeedVipInfo;
import com.kuaishou.android.model.mix.CoronaExpParams;

public class CoronaModelMeta$$Parcelable implements Parcelable, d	// class@000c1b
{
    public CoronaModelMeta coronaModelMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaModelMeta$$Parcelable.CREATOR = new CoronaModelMeta$$Parcelable$a();
    }
    public void CoronaModelMeta$$Parcelable(CoronaModelMeta p0){
       super();
       this.coronaModelMeta$$0 = p0;
    }
    public static CoronaModelMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaModelMeta uCoronaModel = new CoronaModelMeta();
          p1.f(p1.g(), uCoronaModel);
          uCoronaModel.mCoronaFeedVipInfo = p0.readSerializable();
          uCoronaModel.mCoronaExpParams = p0.readSerializable();
          p1.f(i, uCoronaModel);
          return uCoronaModel;
       }
    }
    public static void write(CoronaModelMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mCoronaFeedVipInfo);
          p1.writeSerializable(p0.mCoronaExpParams);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaModelMeta getParcel(){
       return this.coronaModelMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaModelMeta$$Parcelable.write(this.coronaModelMeta$$0, p0, p1, new a());
    }
}
