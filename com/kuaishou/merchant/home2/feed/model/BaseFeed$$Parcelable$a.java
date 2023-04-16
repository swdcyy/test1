package com.kuaishou.merchant.home2.feed.model.BaseFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.home2.feed.model.BaseFeed$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;

public class BaseFeed$$Parcelable$a implements Parcelable$Creator	// class@00178f
{

    public void BaseFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BaseFeed$$Parcelable(BaseFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BaseFeed$$Parcelable[] $ParcelableA = new BaseFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}
