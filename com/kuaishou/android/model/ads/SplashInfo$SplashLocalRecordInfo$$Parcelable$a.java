package com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;

public class SplashInfo$SplashLocalRecordInfo$$Parcelable$a implements Parcelable$Creator	// class@000aad
{

    public void SplashInfo$SplashLocalRecordInfo$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashLocalRecordInfo$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashLocalRecordInfo$$Parcelable(SplashInfo$SplashLocalRecordInfo$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashLocalRecordInfo$$Parcelable[] b(int p0){
       SplashInfo$SplashLocalRecordInfo$$Parcelable[] splashLocalR = new SplashInfo$SplashLocalRecordInfo$$Parcelable[p0];
       return splashLocalR;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
