package com.yxcorp.gifshow.model.ContactTargetItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.ContactTargetItem$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.ContactTargetItem;

public class ContactTargetItem$$Parcelable$a implements Parcelable$Creator	// class@001df9
{

    public void ContactTargetItem$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ContactTargetItem$$Parcelable(ContactTargetItem$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ContactTargetItem$$Parcelable[] $ParcelableA = new ContactTargetItem$$Parcelable[p0];
       return $ParcelableA;
    }
}
