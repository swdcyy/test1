package com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo;

public class PhotoAdvertisement$TransitionInfo$$Parcelable$a implements Parcelable$Creator	// class@000a47
{

    public void PhotoAdvertisement$TransitionInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TransitionInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TransitionInfo$$Parcelable(PhotoAdvertisement$TransitionInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TransitionInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$TransitionInfo$$Parcelable[] transitionIn = new PhotoAdvertisement$TransitionInfo$$Parcelable[p0];
       return transitionIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
