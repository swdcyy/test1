package com.yxcorp.gifshow.model.MagicEmoji$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.MagicEmoji$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.MagicEmoji;

public class MagicEmoji$$Parcelable$a implements Parcelable$Creator	// class@001e47
{

    public void MagicEmoji$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MagicEmoji$$Parcelable(MagicEmoji$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MagicEmoji$$Parcelable[] $ParcelableA = new MagicEmoji$$Parcelable[p0];
       return $ParcelableA;
    }
}
