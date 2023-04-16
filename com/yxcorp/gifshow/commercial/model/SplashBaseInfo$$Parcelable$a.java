package com.yxcorp.gifshow.commercial.model.SplashBaseInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;

public class SplashBaseInfo$$Parcelable$a implements Parcelable$Creator	// class@00114c
{

    public void SplashBaseInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SplashBaseInfo$$Parcelable(SplashBaseInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SplashBaseInfo$$Parcelable[] $ParcelableA = new SplashBaseInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
