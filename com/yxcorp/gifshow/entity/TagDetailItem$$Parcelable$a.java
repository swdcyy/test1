package com.yxcorp.gifshow.entity.TagDetailItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.TagDetailItem$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.TagDetailItem;

public class TagDetailItem$$Parcelable$a implements Parcelable$Creator	// class@000d75
{

    public void TagDetailItem$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TagDetailItem$$Parcelable(TagDetailItem$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TagDetailItem$$Parcelable[] $ParcelableA = new TagDetailItem$$Parcelable[p0];
       return $ParcelableA;
    }
}
