package com.yxcorp.gifshow.model.TagRankInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.TagRankInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.TagRankInfo;

public class TagRankInfo$$Parcelable$a implements Parcelable$Creator	// class@001e98
{

    public void TagRankInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TagRankInfo$$Parcelable(TagRankInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TagRankInfo$$Parcelable[] $ParcelableA = new TagRankInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
