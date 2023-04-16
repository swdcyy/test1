package com.kwai.framework.model.user.QCurrentUser$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.QCurrentUser$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.QCurrentUser;

public class QCurrentUser$$Parcelable$a implements Parcelable$Creator	// class@001719
{

    public void QCurrentUser$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new QCurrentUser$$Parcelable(QCurrentUser$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       QCurrentUser$$Parcelable[] $ParcelableA = new QCurrentUser$$Parcelable[p0];
       return $ParcelableA;
    }
}
