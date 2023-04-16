package com.kuaishou.android.model.feed.IMMessageLocalFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.IMMessageLocalFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.IMMessageLocalFeed;

public class IMMessageLocalFeed$$Parcelable$a implements Parcelable$Creator	// class@000aec
{

    public void IMMessageLocalFeed$$Parcelable$a(){
       super();
    }
    public IMMessageLocalFeed$$Parcelable a(Parcel p0){
       return new IMMessageLocalFeed$$Parcelable(IMMessageLocalFeed$$Parcelable.read(p0, new a()));
    }
    public IMMessageLocalFeed$$Parcelable[] b(int p0){
       IMMessageLocalFeed$$Parcelable[] $ParcelableA = new IMMessageLocalFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
