package com.yxcorp.gifshow.plugin.impl.search.SearchMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.plugin.impl.search.SearchMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.plugin.impl.search.SearchMeta;

public class SearchMeta$$Parcelable$a implements Parcelable$Creator	// class@000fd4
{

    public void SearchMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SearchMeta$$Parcelable(SearchMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SearchMeta$$Parcelable[] $ParcelableA = new SearchMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}
