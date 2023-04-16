package com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo;

public class PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000a60
{

    public void PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable(PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable[] webViewNavig = new PhotoAdvertisement$WebViewNavigationBarInfo$$Parcelable[p0];
       return webViewNavig;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
