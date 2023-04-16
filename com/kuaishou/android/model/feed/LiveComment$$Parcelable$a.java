package com.kuaishou.android.model.feed.LiveComment$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LiveComment$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LiveComment;

public class LiveComment$$Parcelable$a implements Parcelable$Creator	// class@000afb
{

    public void LiveComment$$Parcelable$a(){
       super();
    }
    public LiveComment$$Parcelable a(Parcel p0){
       return new LiveComment$$Parcelable(LiveComment$$Parcelable.read(p0, new a()));
    }
    public LiveComment$$Parcelable[] b(int p0){
       LiveComment$$Parcelable[] $ParcelableA = new LiveComment$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
