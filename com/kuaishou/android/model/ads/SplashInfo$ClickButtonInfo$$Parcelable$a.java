package com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;

public class SplashInfo$ClickButtonInfo$$Parcelable$a implements Parcelable$Creator	// class@000a8b
{

    public void SplashInfo$ClickButtonInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$ClickButtonInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$ClickButtonInfo$$Parcelable(SplashInfo$ClickButtonInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$ClickButtonInfo$$Parcelable[] b(int p0){
       SplashInfo$ClickButtonInfo$$Parcelable[] uClickButton = new SplashInfo$ClickButtonInfo$$Parcelable[p0];
       return uClickButton;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
