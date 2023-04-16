package com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;

public class SplashInfo$SplashSkipInfo$$Parcelable$a implements Parcelable$Creator	// class@000abd
{

    public void SplashInfo$SplashSkipInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashSkipInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashSkipInfo$$Parcelable(SplashInfo$SplashSkipInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashSkipInfo$$Parcelable[] b(int p0){
       SplashInfo$SplashSkipInfo$$Parcelable[] splashSkipIn = new SplashInfo$SplashSkipInfo$$Parcelable[p0];
       return splashSkipIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
