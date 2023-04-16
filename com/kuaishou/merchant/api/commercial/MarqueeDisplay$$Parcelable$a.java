package com.kuaishou.merchant.api.commercial.MarqueeDisplay$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.commercial.MarqueeDisplay$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.commercial.MarqueeDisplay;

public class MarqueeDisplay$$Parcelable$a implements Parcelable$Creator	// class@0014f0
{

    public void MarqueeDisplay$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MarqueeDisplay$$Parcelable(MarqueeDisplay$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MarqueeDisplay$$Parcelable[] $ParcelableA = new MarqueeDisplay$$Parcelable[p0];
       return $ParcelableA;
    }
}
