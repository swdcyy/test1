package com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo;

public class SplashInfo$SplashLableInfo$$Parcelable$a implements Parcelable$Creator	// class@000aa9
{

    public void SplashInfo$SplashLableInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashLableInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashLableInfo$$Parcelable(SplashInfo$SplashLableInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashLableInfo$$Parcelable[] b(int p0){
       SplashInfo$SplashLableInfo$$Parcelable[] splashLableI = new SplashInfo$SplashLableInfo$$Parcelable[p0];
       return splashLableI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
