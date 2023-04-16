package com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls;

public class SplashInfo$SplashButtonClickUrls$$Parcelable$a implements Parcelable$Creator	// class@000aa5
{

    public void SplashInfo$SplashButtonClickUrls$$Parcelable$a(){
       super();
    }
    public SplashInfo$SplashButtonClickUrls$$Parcelable a(Parcel p0){
       return new SplashInfo$SplashButtonClickUrls$$Parcelable(SplashInfo$SplashButtonClickUrls$$Parcelable.read(p0, new a()));
    }
    public SplashInfo$SplashButtonClickUrls$$Parcelable[] b(int p0){
       SplashInfo$SplashButtonClickUrls$$Parcelable[] splashButton = new SplashInfo$SplashButtonClickUrls$$Parcelable[p0];
       return splashButton;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
