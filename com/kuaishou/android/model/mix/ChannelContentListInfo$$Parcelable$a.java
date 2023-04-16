package com.kuaishou.android.model.mix.ChannelContentListInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ChannelContentListInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ChannelContentListInfo;

public class ChannelContentListInfo$$Parcelable$a implements Parcelable$Creator	// class@000be0
{

    public void ChannelContentListInfo$$Parcelable$a(){
       super();
    }
    public ChannelContentListInfo$$Parcelable a(Parcel p0){
       return new ChannelContentListInfo$$Parcelable(ChannelContentListInfo$$Parcelable.read(p0, new a()));
    }
    public ChannelContentListInfo$$Parcelable[] b(int p0){
       ChannelContentListInfo$$Parcelable[] $ParcelableA = new ChannelContentListInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
