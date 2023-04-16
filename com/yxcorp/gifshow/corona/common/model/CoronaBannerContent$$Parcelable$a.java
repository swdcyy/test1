package com.yxcorp.gifshow.corona.common.model.CoronaBannerContent$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent;

public class CoronaBannerContent$$Parcelable$a implements Parcelable$Creator	// class@0011f7
{

    public void CoronaBannerContent$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaBannerContent$$Parcelable(CoronaBannerContent$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaBannerContent$$Parcelable[] $ParcelableA = new CoronaBannerContent$$Parcelable[p0];
       return $ParcelableA;
    }
}
