package com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;

public class SplashInfo$SplashPlayableInfo$$Parcelable implements Parcelable, d	// class@000ab6
{
    public SplashInfo$SplashPlayableInfo splashPlayableInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SplashInfo$SplashPlayableInfo$$Parcelable.CREATOR = new SplashInfo$SplashPlayableInfo$$Parcelable$a();
    }
    public void SplashInfo$SplashPlayableInfo$$Parcelable(SplashInfo$SplashPlayableInfo p0){
       super();
       this.splashPlayableInfo$$0 = p0;
    }
    public static SplashInfo$SplashPlayableInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SplashInfo$SplashPlayableInfo splashPlayab = new SplashInfo$SplashPlayableInfo();
          p1.f(p1.g(), splashPlayab);
          splashPlayab.mPlayableLineInfo = p0.readSerializable();
          splashPlayab.mPlayablePopupInfo = p0.readSerializable();
          splashPlayab.mPlayableUrl = p0.readString();
          splashPlayab.mDrawLineBeginTime = p0.readInt();
          p1.f(i, splashPlayab);
          return splashPlayab;
       }
    }
    public static void write(SplashInfo$SplashPlayableInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mPlayableLineInfo);
          p1.writeSerializable(p0.mPlayablePopupInfo);
          p1.writeString(p0.mPlayableUrl);
          p1.writeInt(p0.mDrawLineBeginTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SplashInfo$SplashPlayableInfo getParcel(){
       return this.splashPlayableInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SplashInfo$SplashPlayableInfo$$Parcelable.write(this.splashPlayableInfo$$0, p0, p1, new a());
    }
}