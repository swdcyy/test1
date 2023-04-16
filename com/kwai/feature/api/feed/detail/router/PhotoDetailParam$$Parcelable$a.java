package com.kwai.feature.api.feed.detail.router.PhotoDetailParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam$$Parcelable;
import xwd.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class PhotoDetailParam$$Parcelable$a implements Parcelable$Creator	// class@000ea1
{

    public void PhotoDetailParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new PhotoDetailParam$$Parcelable(PhotoDetailParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       PhotoDetailParam$$Parcelable[] $ParcelableA = new PhotoDetailParam$$Parcelable[p0];
       return $ParcelableA;
    }
}
