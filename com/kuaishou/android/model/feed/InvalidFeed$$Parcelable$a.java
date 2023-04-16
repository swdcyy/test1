package com.kuaishou.android.model.feed.InvalidFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.InvalidFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.InvalidFeed;

public class InvalidFeed$$Parcelable$a implements Parcelable$Creator	// class@000af2
{

    public void InvalidFeed$$Parcelable$a(){
       super();
    }
    public InvalidFeed$$Parcelable a(Parcel p0){
       return new InvalidFeed$$Parcelable(InvalidFeed$$Parcelable.read(p0, new a()));
    }
    public InvalidFeed$$Parcelable[] b(int p0){
       InvalidFeed$$Parcelable[] $ParcelableA = new InvalidFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
