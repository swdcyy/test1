package com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SplashInfo$SplashLogoInfo$$Parcelable implements Parcelable, d	// class@000ab2
{
    public SplashInfo$SplashLogoInfo splashLogoInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$SplashLogoInfo$$Parcelable.CREATOR = new SplashInfo$SplashLogoInfo$$Parcelable$a();
    }
    public void SplashInfo$SplashLogoInfo$$Parcelable(SplashInfo$SplashLogoInfo p0){
       super();
       this.splashLogoInfo$$0 = p0;
    }
    public static SplashInfo$SplashLogoInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SplashInfo$SplashLogoInfo splashLogoIn = new SplashInfo$SplashLogoInfo();
          p1.f(p1.g(), splashLogoIn);
          splashLogoIn.mLogoDarkUrl = p0.readString();
          splashLogoIn.mLogoWidth = p0.readInt();
          splashLogoIn.mLogoUrl = p0.readString();
          splashLogoIn.mLogoHeight = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          splashLogoIn.mHideSplasshLogo = b;
          p1.f(i, splashLogoIn);
          return splashLogoIn;
       }
    }
    public static void write(SplashInfo$SplashLogoInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLogoDarkUrl);
          p1.writeInt(p0.mLogoWidth);
          p1.writeString(p0.mLogoUrl);
          p1.writeInt(p0.mLogoHeight);
          p1.writeInt(p0.mHideSplasshLogo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo$SplashLogoInfo getParcel(){
       return this.splashLogoInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$SplashLogoInfo$$Parcelable.write(this.splashLogoInfo$$0, p0, p1, new a());
    }
}
