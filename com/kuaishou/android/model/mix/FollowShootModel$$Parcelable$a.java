package com.kuaishou.android.model.mix.FollowShootModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FollowShootModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FollowShootModel;

public class FollowShootModel$$Parcelable$a implements Parcelable$Creator	// class@000c8b
{

    public void FollowShootModel$$Parcelable$a(){
       super();
    }
    public FollowShootModel$$Parcelable a(Parcel p0){
       return new FollowShootModel$$Parcelable(FollowShootModel$$Parcelable.read(p0, new a()));
    }
    public FollowShootModel$$Parcelable[] b(int p0){
       FollowShootModel$$Parcelable[] $ParcelableA = new FollowShootModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
