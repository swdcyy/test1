package com.kwai.feature.api.feed.detail.router.DetailLogParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.feed.detail.router.DetailLogParam$$Parcelable;
import xwd.a;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;

public class DetailLogParam$$Parcelable$a implements Parcelable$Creator	// class@000e9a
{

    public void DetailLogParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new DetailLogParam$$Parcelable(DetailLogParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       DetailLogParam$$Parcelable[] $ParcelableA = new DetailLogParam$$Parcelable[p0];
       return $ParcelableA;
    }
}
