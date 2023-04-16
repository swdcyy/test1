package com.kwai.feature.api.corona.model.CoronaFeatureApiCommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaFeatureApiCommonMeta$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaFeatureApiCommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaFeatureApiCommonMeta$$Parcelable implements Parcelable, d	// class@000dee
{
    public CoronaFeatureApiCommonMeta coronaFeatureApiCommonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaFeatureApiCommonMeta$$Parcelable.CREATOR = new CoronaFeatureApiCommonMeta$$Parcelable$a();
    }
    public void CoronaFeatureApiCommonMeta$$Parcelable(CoronaFeatureApiCommonMeta p0){
       super();
       this.coronaFeatureApiCommonMeta$$0 = p0;
    }
    public static CoronaFeatureApiCommonMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaFeatureApiCommonMeta uCoronaFeatu = new CoronaFeatureApiCommonMeta();
          p1.f(p1.g(), uCoronaFeatu);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uCoronaFeatu.mScaledPlaying = b;
          p1.f(i, uCoronaFeatu);
          return uCoronaFeatu;
       }
    }
    public static void write(CoronaFeatureApiCommonMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mScaledPlaying);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaFeatureApiCommonMeta getParcel(){
       return this.coronaFeatureApiCommonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaFeatureApiCommonMeta$$Parcelable.write(this.coronaFeatureApiCommonMeta$$0, p0, p1, new a());
    }
}
