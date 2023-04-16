package com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SplashInfo$ShadowInfo$$Parcelable implements Parcelable, d	// class@000a9a
{
    public SplashInfo$ShadowInfo shadowInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$ShadowInfo$$Parcelable.CREATOR = new SplashInfo$ShadowInfo$$Parcelable$a();
    }
    public void SplashInfo$ShadowInfo$$Parcelable(SplashInfo$ShadowInfo p0){
       super();
       this.shadowInfo$$0 = p0;
    }
    public static SplashInfo$ShadowInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SplashInfo$ShadowInfo shadowInfo = new SplashInfo$ShadowInfo();
          p1.f(p1.g(), shadowInfo);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          shadowInfo.mHideTopShadow = b;
          p1.f(i, shadowInfo);
          return shadowInfo;
       }
    }
    public static void write(SplashInfo$ShadowInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHideTopShadow);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo$ShadowInfo getParcel(){
       return this.shadowInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$ShadowInfo$$Parcelable.write(this.shadowInfo$$0, p0, p1, new a());
    }
}
