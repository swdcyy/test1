package com.yxcorp.gifshow.model.response.feed.HeaderFooterData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData;

public class HeaderFooterData$$Parcelable$a implements Parcelable$Creator	// class@001f88
{

    public void HeaderFooterData$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new HeaderFooterData$$Parcelable(HeaderFooterData$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       HeaderFooterData$$Parcelable[] $ParcelableA = new HeaderFooterData$$Parcelable[p0];
       return $ParcelableA;
    }
}
