package com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo;

public class SplashInfo$SplashActionBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000aa1
{

    public void SplashInfo$SplashActionBarInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashActionBarInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashActionBarInfo$$Parcelable(SplashInfo$SplashActionBarInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashActionBarInfo$$Parcelable[] b(int p0){
       SplashInfo$SplashActionBarInfo$$Parcelable[] splashAction = new SplashInfo$SplashActionBarInfo$$Parcelable[p0];
       return splashAction;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
