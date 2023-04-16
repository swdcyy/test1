package com.yxcorp.plugin.search.startup.SearchStartEndTime$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.plugin.search.startup.SearchStartEndTime$$Parcelable;
import xwd.a;
import com.yxcorp.plugin.search.startup.SearchStartEndTime;

public class SearchStartEndTime$$Parcelable$a implements Parcelable$Creator	// class@000765
{

    public void SearchStartEndTime$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SearchStartEndTime$$Parcelable(SearchStartEndTime$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SearchStartEndTime$$Parcelable[] $ParcelableA = new SearchStartEndTime$$Parcelable[p0];
       return $ParcelableA;
    }
}
