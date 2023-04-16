package com.yxcorp.gifshow.entity.QPreInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.QPreInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.QPreInfo;

public class QPreInfo$$Parcelable$a implements Parcelable$Creator	// class@000d72
{

    public void QPreInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new QPreInfo$$Parcelable(QPreInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       QPreInfo$$Parcelable[] $ParcelableA = new QPreInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
