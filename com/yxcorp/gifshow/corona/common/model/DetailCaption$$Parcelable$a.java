package com.yxcorp.gifshow.corona.common.model.DetailCaption$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.DetailCaption$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.DetailCaption;

public class DetailCaption$$Parcelable$a implements Parcelable$Creator	// class@001230
{

    public void DetailCaption$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new DetailCaption$$Parcelable(DetailCaption$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       DetailCaption$$Parcelable[] $ParcelableA = new DetailCaption$$Parcelable[p0];
       return $ParcelableA;
    }
}
