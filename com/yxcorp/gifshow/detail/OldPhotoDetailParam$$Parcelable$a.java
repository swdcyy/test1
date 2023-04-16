package com.yxcorp.gifshow.detail.OldPhotoDetailParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.detail.OldPhotoDetailParam$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.detail.OldPhotoDetailParam;

public class OldPhotoDetailParam$$Parcelable$a implements Parcelable$Creator	// class@00133c
{

    public void OldPhotoDetailParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new OldPhotoDetailParam$$Parcelable(OldPhotoDetailParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       OldPhotoDetailParam$$Parcelable[] $ParcelableA = new OldPhotoDetailParam$$Parcelable[p0];
       return $ParcelableA;
    }
}
