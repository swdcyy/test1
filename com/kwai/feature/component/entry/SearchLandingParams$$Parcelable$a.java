package com.kwai.feature.component.entry.SearchLandingParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.component.entry.SearchLandingParams$$Parcelable;
import xwd.a;
import com.kwai.feature.component.entry.SearchLandingParams;

public class SearchLandingParams$$Parcelable$a implements Parcelable$Creator	// class@001207
{

    public void SearchLandingParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SearchLandingParams$$Parcelable(SearchLandingParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SearchLandingParams$$Parcelable[] $ParcelableA = new SearchLandingParams$$Parcelable[p0];
       return $ParcelableA;
    }
}
