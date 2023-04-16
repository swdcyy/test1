package com.kuaishou.android.model.mix.Location$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.Location$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.Location;

public class Location$$Parcelable$a implements Parcelable$Creator	// class@000d0b
{

    public void Location$$Parcelable$a(){
       super();
    }
    public Location$$Parcelable a(Parcel p0){
       return new Location$$Parcelable(Location$$Parcelable.read(p0, new a()));
    }
    public Location$$Parcelable[] b(int p0){
       Location$$Parcelable[] $ParcelableA = new Location$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
