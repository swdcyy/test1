package com.kwai.feature.api.feed.detail.router.DetailPlayConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$$Parcelable;
import xwd.a;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;

public class DetailPlayConfig$$Parcelable$a implements Parcelable$Creator	// class@000e9d
{

    public void DetailPlayConfig$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new DetailPlayConfig$$Parcelable(DetailPlayConfig$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       DetailPlayConfig$$Parcelable[] $ParcelableA = new DetailPlayConfig$$Parcelable[p0];
       return $ParcelableA;
    }
}
