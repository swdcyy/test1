package com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo;

public class PhotoAdvertisement$RewardEndInfo$$Parcelable$a implements Parcelable$Creator	// class@0009fb
{

    public void PhotoAdvertisement$RewardEndInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$RewardEndInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$RewardEndInfo$$Parcelable(PhotoAdvertisement$RewardEndInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$RewardEndInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$RewardEndInfo$$Parcelable[] rewardEndInf = new PhotoAdvertisement$RewardEndInfo$$Parcelable[p0];
       return rewardEndInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
