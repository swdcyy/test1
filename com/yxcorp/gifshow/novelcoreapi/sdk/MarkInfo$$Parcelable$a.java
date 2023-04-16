package com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.novelcoreapi.sdk.MarkInfo;

public class MarkInfo$$Parcelable$a implements Parcelable$Creator	// class@0021bf
{

    public void MarkInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MarkInfo$$Parcelable(MarkInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MarkInfo$$Parcelable[] $ParcelableA = new MarkInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
