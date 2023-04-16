package com.yxcorp.gifshow.tube.TubeBannerInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeBannerInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeBannerInfo;

public class TubeBannerInfo$$Parcelable$a implements Parcelable$Creator	// class@001dfd
{

    public void TubeBannerInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeBannerInfo$$Parcelable(TubeBannerInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeBannerInfo$$Parcelable[] $ParcelableA = new TubeBannerInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
