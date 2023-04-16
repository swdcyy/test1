package com.yxcorp.gifshow.entity.LinkInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.LinkInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.LinkInfo;

public class LinkInfo$$Parcelable$a implements Parcelable$Creator	// class@000d66
{

    public void LinkInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LinkInfo$$Parcelable(LinkInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LinkInfo$$Parcelable[] $ParcelableA = new LinkInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
