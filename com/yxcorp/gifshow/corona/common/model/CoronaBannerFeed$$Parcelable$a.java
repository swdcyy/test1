package com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;

public class CoronaBannerFeed$$Parcelable$a implements Parcelable$Creator	// class@0011fa
{

    public void CoronaBannerFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaBannerFeed$$Parcelable(CoronaBannerFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaBannerFeed$$Parcelable[] $ParcelableA = new CoronaBannerFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}
