package com.kuaishou.android.model.ads.SplashInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo;

public class SplashInfo$$Parcelable$a implements Parcelable$Creator	// class@000a7d
{

    public void SplashInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$$Parcelable(SplashInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$$Parcelable[] b(int p0){
       SplashInfo$$Parcelable[] $ParcelableA = new SplashInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
