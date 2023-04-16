package com.kwai.components.nearbymodel.model.PoiMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.PoiMeta$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.PoiMeta;

public class PoiMeta$$Parcelable$a implements Parcelable$Creator	// class@000cbf
{

    public void PoiMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new PoiMeta$$Parcelable(PoiMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       PoiMeta$$Parcelable[] $ParcelableA = new PoiMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}
