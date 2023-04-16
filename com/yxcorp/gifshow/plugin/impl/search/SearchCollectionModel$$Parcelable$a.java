package com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.plugin.impl.search.SearchCollectionModel;

public class SearchCollectionModel$$Parcelable$a implements Parcelable$Creator	// class@000fd1
{

    public void SearchCollectionModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SearchCollectionModel$$Parcelable(SearchCollectionModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SearchCollectionModel$$Parcelable[] $ParcelableA = new SearchCollectionModel$$Parcelable[p0];
       return $ParcelableA;
    }
}
