package com.kwai.components.feedmodel.RewardPhotoInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.RewardPhotoInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.RewardPhotoInfo;

public class RewardPhotoInfo$$Parcelable$a implements Parcelable$Creator	// class@000c35
{

    public void RewardPhotoInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new RewardPhotoInfo$$Parcelable(RewardPhotoInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       RewardPhotoInfo$$Parcelable[] $ParcelableA = new RewardPhotoInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
