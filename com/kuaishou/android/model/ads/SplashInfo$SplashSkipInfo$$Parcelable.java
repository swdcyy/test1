package com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SplashInfo$SplashSkipInfo$$Parcelable implements Parcelable, d	// class@000abe
{
    public SplashInfo$SplashSkipInfo splashSkipInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$SplashSkipInfo$$Parcelable.CREATOR = new SplashInfo$SplashSkipInfo$$Parcelable$a();
    }
    public void SplashInfo$SplashSkipInfo$$Parcelable(SplashInfo$SplashSkipInfo p0){
       super();
       this.splashSkipInfo$$0 = p0;
    }
    public static SplashInfo$SplashSkipInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SplashInfo$SplashSkipInfo splashSkipIn = new SplashInfo$SplashSkipInfo();
          p1.f(p1.g(), splashSkipIn);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          splashSkipIn.mHideSkipBtn = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          splashSkipIn.mHideCountdownTime = b;
          splashSkipIn.mSkipTitle = p0.readString();
          splashSkipIn.mSkipTagShowTime = p0.readInt();
          p1.f(i, splashSkipIn);
          return splashSkipIn;
       }
    }
    public static void write(SplashInfo$SplashSkipInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHideSkipBtn);
          p1.writeInt(p0.mHideCountdownTime);
          p1.writeString(p0.mSkipTitle);
          p1.writeInt(p0.mSkipTagShowTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo$SplashSkipInfo getParcel(){
       return this.splashSkipInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$SplashSkipInfo$$Parcelable.write(this.splashSkipInfo$$0, p0, p1, new a());
    }
}
