package com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;

public class PhotoAdvertisement$JumpLiveInfo$$Parcelable$a implements Parcelable$Creator	// class@000986
{

    public void PhotoAdvertisement$JumpLiveInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$JumpLiveInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$JumpLiveInfo$$Parcelable(PhotoAdvertisement$JumpLiveInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$JumpLiveInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$JumpLiveInfo$$Parcelable[] jumpLiveInfo = new PhotoAdvertisement$JumpLiveInfo$$Parcelable[p0];
       return jumpLiveInfo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
