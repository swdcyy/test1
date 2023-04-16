package com.yxcorp.gifshow.detail.model.meta.QuickShareInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.detail.model.meta.QuickShareInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.detail.model.meta.QuickShareInfo;

public class QuickShareInfo$$Parcelable$a implements Parcelable$Creator	// class@0015a9
{

    public void QuickShareInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new QuickShareInfo$$Parcelable(QuickShareInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       QuickShareInfo$$Parcelable[] $ParcelableA = new QuickShareInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
