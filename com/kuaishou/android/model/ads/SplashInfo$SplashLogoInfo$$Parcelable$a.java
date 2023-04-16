package com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;

public class SplashInfo$SplashLogoInfo$$Parcelable$a implements Parcelable$Creator	// class@000ab1
{

    public void SplashInfo$SplashLogoInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashLogoInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashLogoInfo$$Parcelable(SplashInfo$SplashLogoInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashLogoInfo$$Parcelable[] b(int p0){
       SplashInfo$SplashLogoInfo$$Parcelable[] splashLogoIn = new SplashInfo$SplashLogoInfo$$Parcelable[p0];
       return splashLogoIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
