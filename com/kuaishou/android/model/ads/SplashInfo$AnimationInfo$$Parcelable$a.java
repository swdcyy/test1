package com.kuaishou.android.model.ads.SplashInfo$AnimationInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo;

public class SplashInfo$AnimationInfo$$Parcelable$a implements Parcelable$Creator	// class@000a7f
{

    public void SplashInfo$AnimationInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$AnimationInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$AnimationInfo$$Parcelable(SplashInfo$AnimationInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$AnimationInfo$$Parcelable[] b(int p0){
       SplashInfo$AnimationInfo$$Parcelable[] uAnimationIn = new SplashInfo$AnimationInfo$$Parcelable[p0];
       return uAnimationIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
