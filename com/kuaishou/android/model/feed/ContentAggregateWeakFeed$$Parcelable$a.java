package com.kuaishou.android.model.feed.ContentAggregateWeakFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;

public class ContentAggregateWeakFeed$$Parcelable$a implements Parcelable$Creator	// class@000ada
{

    public void ContentAggregateWeakFeed$$Parcelable$a(){
       super();
    }
    public ContentAggregateWeakFeed$$Parcelable a(Parcel p0){
       return new ContentAggregateWeakFeed$$Parcelable(ContentAggregateWeakFeed$$Parcelable.read(p0, new a()));
    }
    public ContentAggregateWeakFeed$$Parcelable[] b(int p0){
       ContentAggregateWeakFeed$$Parcelable[] $ParcelableA = new ContentAggregateWeakFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
