package com.kwai.framework.model.feed.UnknownFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.feed.UnknownFeed$$Parcelable;
import xwd.a;
import com.kwai.framework.model.feed.UnknownFeed;

public class UnknownFeed$$Parcelable$a implements Parcelable$Creator	// class@0016b7
{

    public void UnknownFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UnknownFeed$$Parcelable(UnknownFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UnknownFeed$$Parcelable[] $ParcelableA = new UnknownFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}