package com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;

public class SplashInfo$SplashPlayableInfo$$Parcelable$a implements Parcelable$Creator	// class@000ab5
{

    public void SplashInfo$SplashPlayableInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashPlayableInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashPlayableInfo$$Parcelable(SplashInfo$SplashPlayableInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashPlayableInfo$$Parcelable[] b(int p0){
       SplashInfo$SplashPlayableInfo$$Parcelable[] splashPlayab = new SplashInfo$SplashPlayableInfo$$Parcelable[p0];
       return splashPlayab;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
