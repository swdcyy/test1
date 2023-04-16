package com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta;

public class DetailPhotoMeta$$Parcelable$a implements Parcelable$Creator	// class@001594
{

    public void DetailPhotoMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new DetailPhotoMeta$$Parcelable(DetailPhotoMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       DetailPhotoMeta$$Parcelable[] $ParcelableA = new DetailPhotoMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}
