package com.yxcorp.gifshow.hotinsert.HotInsertTypes$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.hotinsert.HotInsertTypes$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.hotinsert.HotInsertTypes;

public class HotInsertTypes$$Parcelable$a implements Parcelable$Creator	// class@0018df
{

    public void HotInsertTypes$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new HotInsertTypes$$Parcelable(HotInsertTypes$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       HotInsertTypes$$Parcelable[] $ParcelableA = new HotInsertTypes$$Parcelable[p0];
       return $ParcelableA;
    }
}
