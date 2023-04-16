package com.kwai.feature.component.entry.SearchVerticalParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.component.entry.SearchVerticalParams$$Parcelable;
import xwd.a;
import com.kwai.feature.component.entry.SearchVerticalParams;

public class SearchVerticalParams$$Parcelable$a implements Parcelable$Creator	// class@00120b
{

    public void SearchVerticalParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SearchVerticalParams$$Parcelable(SearchVerticalParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SearchVerticalParams$$Parcelable[] $ParcelableA = new SearchVerticalParams$$Parcelable[p0];
       return $ParcelableA;
    }
}
