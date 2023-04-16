package com.yxcorp.gifshow.model.MusicCategory$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.MusicCategory$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.MusicCategory;

public class MusicCategory$$Parcelable$a implements Parcelable$Creator	// class@001e5e
{

    public void MusicCategory$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MusicCategory$$Parcelable(MusicCategory$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MusicCategory$$Parcelable[] $ParcelableA = new MusicCategory$$Parcelable[p0];
       return $ParcelableA;
    }
}
