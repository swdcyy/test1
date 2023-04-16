package com.kuaishou.android.model.feed.LocationPermissionFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LocationPermissionFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LocationPermissionFeed;

public class LocationPermissionFeed$$Parcelable$a implements Parcelable$Creator	// class@000b19
{

    public void LocationPermissionFeed$$Parcelable$a(){
       super();
    }
    public LocationPermissionFeed$$Parcelable a(Parcel p0){
       return new LocationPermissionFeed$$Parcelable(LocationPermissionFeed$$Parcelable.read(p0, new a()));
    }
    public LocationPermissionFeed$$Parcelable[] b(int p0){
       LocationPermissionFeed$$Parcelable[] $ParcelableA = new LocationPermissionFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
