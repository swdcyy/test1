package com.kwai.components.nearbymodel.model.NearbyPhotoMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.NearbyPhotoMeta$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.NearbyPhotoMeta;

public class NearbyPhotoMeta$$Parcelable$a implements Parcelable$Creator	// class@000cb8
{

    public void NearbyPhotoMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NearbyPhotoMeta$$Parcelable(NearbyPhotoMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NearbyPhotoMeta$$Parcelable[] $ParcelableA = new NearbyPhotoMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}