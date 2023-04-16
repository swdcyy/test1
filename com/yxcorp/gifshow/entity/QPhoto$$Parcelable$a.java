package com.yxcorp.gifshow.entity.QPhoto$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.QPhoto;

public class QPhoto$$Parcelable$a implements Parcelable$Creator	// class@000d6a
{

    public void QPhoto$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new QPhoto$$Parcelable(QPhoto$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       QPhoto$$Parcelable[] $ParcelableA = new QPhoto$$Parcelable[p0];
       return $ParcelableA;
    }
}
