package com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;

public class NearbyMapFeed$RoleInfo$$Parcelable$a implements Parcelable$Creator	// class@000ca5
{

    public void NearbyMapFeed$RoleInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NearbyMapFeed$RoleInfo$$Parcelable(NearbyMapFeed$RoleInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NearbyMapFeed$RoleInfo$$Parcelable[] roleInfo$$Pa = new NearbyMapFeed$RoleInfo$$Parcelable[p0];
       return roleInfo$$Pa;
    }
}
