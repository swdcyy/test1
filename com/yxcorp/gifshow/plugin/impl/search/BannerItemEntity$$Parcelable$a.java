package com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity;

public class BannerItemEntity$$Parcelable$a implements Parcelable$Creator	// class@000fcb
{

    public void BannerItemEntity$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BannerItemEntity$$Parcelable(BannerItemEntity$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BannerItemEntity$$Parcelable[] $ParcelableA = new BannerItemEntity$$Parcelable[p0];
       return $ParcelableA;
    }
}
