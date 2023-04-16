package com.kuaishou.live.lite.LiveLiteParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.lite.LiveLiteParam$$Parcelable;
import xwd.a;
import com.kuaishou.live.lite.LiveLiteParam;

public class LiveLiteParam$$Parcelable$a implements Parcelable$Creator	// class@001d65
{

    public void LiveLiteParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveLiteParam$$Parcelable(LiveLiteParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveLiteParam$$Parcelable[] $ParcelableA = new LiveLiteParam$$Parcelable[p0];
       return $ParcelableA;
    }
}
