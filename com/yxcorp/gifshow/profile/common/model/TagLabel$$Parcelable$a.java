package com.yxcorp.gifshow.profile.common.model.TagLabel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.profile.common.model.TagLabel$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.profile.common.model.TagLabel;

public class TagLabel$$Parcelable$a implements Parcelable$Creator	// class@0012d8
{

    public void TagLabel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TagLabel$$Parcelable(TagLabel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TagLabel$$Parcelable[] $ParcelableA = new TagLabel$$Parcelable[p0];
       return $ParcelableA;
    }
}
