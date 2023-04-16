package com.kwai.feature.component.entry.SearchEntryParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.component.entry.SearchEntryParams$$Parcelable;
import xwd.a;
import com.kwai.feature.component.entry.SearchEntryParams;

public class SearchEntryParams$$Parcelable$a implements Parcelable$Creator	// class@001204
{

    public void SearchEntryParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SearchEntryParams$$Parcelable(SearchEntryParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SearchEntryParams$$Parcelable[] $ParcelableA = new SearchEntryParams$$Parcelable[p0];
       return $ParcelableA;
    }
}
