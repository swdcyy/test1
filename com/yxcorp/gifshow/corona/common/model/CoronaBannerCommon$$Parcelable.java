package com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaBannerCommon$$Parcelable implements Parcelable, d	// class@0011f5
{
    public CoronaBannerCommon coronaBannerCommon$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaBannerCommon$$Parcelable.CREATOR = new CoronaBannerCommon$$Parcelable$a();
    }
    public void CoronaBannerCommon$$Parcelable(CoronaBannerCommon p0){
       super();
       this.coronaBannerCommon$$0 = p0;
    }
    public static CoronaBannerCommon read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaBannerCommon uCoronaBanne = new CoronaBannerCommon();
          p1.f(p1.g(), uCoronaBanne);
          uCoronaBanne.mBannerFeedId = p0.readInt();
          p1.f(i, uCoronaBanne);
          return uCoronaBanne;
       }
    }
    public static void write(CoronaBannerCommon p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mBannerFeedId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaBannerCommon getParcel(){
       return this.coronaBannerCommon$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaBannerCommon$$Parcelable.write(this.coronaBannerCommon$$0, p0, p1, new a());
    }
}
