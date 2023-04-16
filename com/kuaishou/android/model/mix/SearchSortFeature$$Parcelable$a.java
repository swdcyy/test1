package com.kuaishou.android.model.mix.SearchSortFeature$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.SearchSortFeature$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.SearchSortFeature;

public class SearchSortFeature$$Parcelable$a implements Parcelable$Creator	// class@000df4
{

    public void SearchSortFeature$$Parcelable$a(){
       super();
    }
    public SearchSortFeature$$Parcelable a(Parcel p0){
       return new SearchSortFeature$$Parcelable(SearchSortFeature$$Parcelable.read(p0, new a()));
    }
    public SearchSortFeature$$Parcelable[] b(int p0){
       SearchSortFeature$$Parcelable[] $ParcelableA = new SearchSortFeature$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
