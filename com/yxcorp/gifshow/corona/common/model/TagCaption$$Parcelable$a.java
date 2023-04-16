package com.yxcorp.gifshow.corona.common.model.TagCaption$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.TagCaption$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.TagCaption;

public class TagCaption$$Parcelable$a implements Parcelable$Creator	// class@001248
{

    public void TagCaption$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TagCaption$$Parcelable(TagCaption$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TagCaption$$Parcelable[] $ParcelableA = new TagCaption$$Parcelable[p0];
       return $ParcelableA;
    }
}
