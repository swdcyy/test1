package com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo;

public class CoronaCoverInfo$$Parcelable$a implements Parcelable$Creator	// class@00120d
{

    public void CoronaCoverInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaCoverInfo$$Parcelable(CoronaCoverInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaCoverInfo$$Parcelable[] $ParcelableA = new CoronaCoverInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
