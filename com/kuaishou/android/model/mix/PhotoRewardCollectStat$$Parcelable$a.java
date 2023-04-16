package com.kuaishou.android.model.mix.PhotoRewardCollectStat$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoRewardCollectStat$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoRewardCollectStat;

public class PhotoRewardCollectStat$$Parcelable$a implements Parcelable$Creator	// class@000d66
{

    public void PhotoRewardCollectStat$$Parcelable$a(){
       super();
    }
    public PhotoRewardCollectStat$$Parcelable a(Parcel p0){
       return new PhotoRewardCollectStat$$Parcelable(PhotoRewardCollectStat$$Parcelable.read(p0, new a()));
    }
    public PhotoRewardCollectStat$$Parcelable[] b(int p0){
       PhotoRewardCollectStat$$Parcelable[] $ParcelableA = new PhotoRewardCollectStat$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
