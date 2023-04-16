package com.kwai.framework.model.user.QUserContactName$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.QUserContactName$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.QUserContactName;

public class QUserContactName$$Parcelable$a implements Parcelable$Creator	// class@00171c
{

    public void QUserContactName$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new QUserContactName$$Parcelable(QUserContactName$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       QUserContactName$$Parcelable[] $ParcelableA = new QUserContactName$$Parcelable[p0];
       return $ParcelableA;
    }
}
