package com.kuaishou.android.model.feed.HotInsertFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.HotInsertFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.HotInsertFeed;

public class HotInsertFeed$$Parcelable$a implements Parcelable$Creator	// class@000ae9
{

    public void HotInsertFeed$$Parcelable$a(){
       super();
    }
    public HotInsertFeed$$Parcelable a(Parcel p0){
       return new HotInsertFeed$$Parcelable(HotInsertFeed$$Parcelable.read(p0, new a()));
    }
    public HotInsertFeed$$Parcelable[] b(int p0){
       HotInsertFeed$$Parcelable[] $ParcelableA = new HotInsertFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
