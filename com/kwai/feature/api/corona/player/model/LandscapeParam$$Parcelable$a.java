package com.kwai.feature.api.corona.player.model.LandscapeParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.player.model.LandscapeParam$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.player.model.LandscapeParam;

public class LandscapeParam$$Parcelable$a implements Parcelable$Creator	// class@000e20
{

    public void LandscapeParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LandscapeParam$$Parcelable(LandscapeParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LandscapeParam$$Parcelable[] $ParcelableA = new LandscapeParam$$Parcelable[p0];
       return $ParcelableA;
    }
}
