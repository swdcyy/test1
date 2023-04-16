package com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;

public class SearchCardMeta$$Parcelable$a implements Parcelable$Creator	// class@001802
{

    public void SearchCardMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SearchCardMeta$$Parcelable(SearchCardMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SearchCardMeta$$Parcelable[] $ParcelableA = new SearchCardMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}
