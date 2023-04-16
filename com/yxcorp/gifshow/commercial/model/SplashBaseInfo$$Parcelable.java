package com.yxcorp.gifshow.commercial.model.SplashBaseInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo$$Parcelable$a;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SplashBaseInfo$$Parcelable implements Parcelable, d	// class@00114d
{
    public SplashBaseInfo splashBaseInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashBaseInfo$$Parcelable.CREATOR = new SplashBaseInfo$$Parcelable$a();
    }
    public void SplashBaseInfo$$Parcelable(SplashBaseInfo p0){
       super();
       this.splashBaseInfo$$0 = p0;
    }
    public static SplashBaseInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SplashBaseInfo splashBaseIn = new SplashBaseInfo();
          p1.f(p1.g(), splashBaseIn);
          splashBaseIn.mSplashMaterialType = p0.readInt();
          splashBaseIn.mEndTime = p0.readLong();
          splashBaseIn.mSplashId = p0.readString();
          splashBaseIn.mStartTime = p0.readLong();
          p1.f(i, splashBaseIn);
          return splashBaseIn;
       }
    }
    public static void write(SplashBaseInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSplashMaterialType);
          p1.writeLong(p0.mEndTime);
          p1.writeString(p0.mSplashId);
          p1.writeLong(p0.mStartTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashBaseInfo getParcel(){
       return this.splashBaseInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashBaseInfo$$Parcelable.write(this.splashBaseInfo$$0, p0, p1, new a());
    }
}
