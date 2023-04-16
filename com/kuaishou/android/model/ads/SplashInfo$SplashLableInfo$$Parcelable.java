package com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SplashInfo$SplashLableInfo$$Parcelable implements Parcelable, d	// class@000aaa
{
    public SplashInfo$SplashLableInfo splashLableInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$SplashLableInfo$$Parcelable.CREATOR = new SplashInfo$SplashLableInfo$$Parcelable$a();
    }
    public void SplashInfo$SplashLableInfo$$Parcelable(SplashInfo$SplashLableInfo p0){
       super();
       this.splashLableInfo$$0 = p0;
    }
    public static SplashInfo$SplashLableInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SplashInfo$SplashLableInfo splashLableI = new SplashInfo$SplashLableInfo();
          p1.f(p1.g(), splashLableI);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          splashLableI.mHideLable = b;
          splashLableI.mLableDescription = p0.readString();
          p1.f(i, splashLableI);
          return splashLableI;
       }
    }
    public static void write(SplashInfo$SplashLableInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHideLable);
          p1.writeString(p0.mLableDescription);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo$SplashLableInfo getParcel(){
       return this.splashLableInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$SplashLableInfo$$Parcelable.write(this.splashLableInfo$$0, p0, p1, new a());
    }
}
