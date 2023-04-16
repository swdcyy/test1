package com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo;

public class SplashInfo$SplashPreloadInfo$$Parcelable$a implements Parcelable$Creator	// class@000ab9
{

    public void SplashInfo$SplashPreloadInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashPreloadInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashPreloadInfo$$Parcelable(SplashInfo$SplashPreloadInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashPreloadInfo$$Parcelable[] b(int p0){
       SplashInfo$SplashPreloadInfo$$Parcelable[] splashPreloa = new SplashInfo$SplashPreloadInfo$$Parcelable[p0];
       return splashPreloa;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
