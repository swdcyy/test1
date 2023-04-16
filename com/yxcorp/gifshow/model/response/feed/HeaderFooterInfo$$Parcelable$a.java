package com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo;

public class HeaderFooterInfo$$Parcelable$a implements Parcelable$Creator	// class@001f8c
{

    public void HeaderFooterInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new HeaderFooterInfo$$Parcelable(HeaderFooterInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       HeaderFooterInfo$$Parcelable[] $ParcelableA = new HeaderFooterInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
