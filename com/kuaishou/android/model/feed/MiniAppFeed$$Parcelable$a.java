package com.kuaishou.android.model.feed.MiniAppFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.MiniAppFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.MiniAppFeed;

public class MiniAppFeed$$Parcelable$a implements Parcelable$Creator	// class@000b20
{

    public void MiniAppFeed$$Parcelable$a(){
       super();
    }
    public MiniAppFeed$$Parcelable a(Parcel p0){
       return new MiniAppFeed$$Parcelable(MiniAppFeed$$Parcelable.read(p0, new a()));
    }
    public MiniAppFeed$$Parcelable[] b(int p0){
       MiniAppFeed$$Parcelable[] $ParcelableA = new MiniAppFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
