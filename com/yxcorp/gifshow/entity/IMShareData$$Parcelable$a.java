package com.yxcorp.gifshow.entity.IMShareData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.IMShareData$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.IMShareData;

public class IMShareData$$Parcelable$a implements Parcelable$Creator	// class@000d63
{

    public void IMShareData$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new IMShareData$$Parcelable(IMShareData$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       IMShareData$$Parcelable[] $ParcelableA = new IMShareData$$Parcelable[p0];
       return $ParcelableA;
    }
}
