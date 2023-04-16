package com.yxcorp.gifshow.profile.model.feed.HostInfoModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.profile.model.feed.HostInfoModel$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.profile.model.feed.HostInfoModel;

public class HostInfoModel$$Parcelable$a implements Parcelable$Creator	// class@0013d8
{

    public void HostInfoModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new HostInfoModel$$Parcelable(HostInfoModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       HostInfoModel$$Parcelable[] $ParcelableA = new HostInfoModel$$Parcelable[p0];
       return $ParcelableA;
    }
}
