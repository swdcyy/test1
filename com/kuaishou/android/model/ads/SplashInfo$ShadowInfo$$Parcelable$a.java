package com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo;

public class SplashInfo$ShadowInfo$$Parcelable$a implements Parcelable$Creator	// class@000a99
{

    public void SplashInfo$ShadowInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$ShadowInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$ShadowInfo$$Parcelable(SplashInfo$ShadowInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$ShadowInfo$$Parcelable[] b(int p0){
       SplashInfo$ShadowInfo$$Parcelable[] shadowInfo$$ = new SplashInfo$ShadowInfo$$Parcelable[p0];
       return shadowInfo$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
