package com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;

public class SlidePlayConfig$$Parcelable$a implements Parcelable$Creator	// class@001711
{

    public void SlidePlayConfig$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SlidePlayConfig$$Parcelable(SlidePlayConfig$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SlidePlayConfig$$Parcelable[] $ParcelableA = new SlidePlayConfig$$Parcelable[p0];
       return $ParcelableA;
    }
}
