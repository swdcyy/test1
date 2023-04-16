package com.kuaishou.live.lite.slide.LiveLiteSlideParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.lite.slide.LiveLiteSlideParam$$Parcelable;
import xwd.a;
import com.kuaishou.live.lite.slide.LiveLiteSlideParam;

public class LiveLiteSlideParam$$Parcelable$a implements Parcelable$Creator	// class@000b52
{

    public void LiveLiteSlideParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveLiteSlideParam$$Parcelable(LiveLiteSlideParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveLiteSlideParam$$Parcelable[] $ParcelableA = new LiveLiteSlideParam$$Parcelable[p0];
       return $ParcelableA;
    }
}
