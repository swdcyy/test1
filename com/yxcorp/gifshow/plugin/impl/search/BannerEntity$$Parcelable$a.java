package com.yxcorp.gifshow.plugin.impl.search.BannerEntity$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.plugin.impl.search.BannerEntity$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.plugin.impl.search.BannerEntity;

public class BannerEntity$$Parcelable$a implements Parcelable$Creator	// class@000fc8
{

    public void BannerEntity$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BannerEntity$$Parcelable(BannerEntity$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BannerEntity$$Parcelable[] $ParcelableA = new BannerEntity$$Parcelable[p0];
       return $ParcelableA;
    }
}
