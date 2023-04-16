package com.kwai.framework.model.channel.HotChannel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.channel.HotChannel$$Parcelable;
import xwd.a;
import com.kwai.framework.model.channel.HotChannel;

public class HotChannel$$Parcelable$a implements Parcelable$Creator	// class@001688
{

    public void HotChannel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new HotChannel$$Parcelable(HotChannel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       HotChannel$$Parcelable[] $ParcelableA = new HotChannel$$Parcelable[p0];
       return $ParcelableA;
    }
}
