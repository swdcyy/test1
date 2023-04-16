package com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role$$Parcelable;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment$$Parcelable;

public class NearbyMapFeed$RoleInfo$$Parcelable implements Parcelable, d	// class@000ca6
{
    public NearbyMapFeed$RoleInfo roleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyMapFeed$RoleInfo$$Parcelable.CREATOR = new NearbyMapFeed$RoleInfo$$Parcelable$a();
    }
    public void NearbyMapFeed$RoleInfo$$Parcelable(NearbyMapFeed$RoleInfo p0){
       super();
       this.roleInfo$$0 = p0;
    }
    public static NearbyMapFeed$RoleInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NearbyMapFeed$RoleInfo roleInfo = new NearbyMapFeed$RoleInfo();
          p1.f(p1.g(), roleInfo);
          roleInfo.mRole = NearbyMapFeed$RoleInfo$Role$$Parcelable.read(p0, p1);
          roleInfo.mMoment = NearbyMapFeed$RoleInfo$Moment$$Parcelable.read(p0, p1);
          roleInfo.mMessage = p0.readString();
          p1.f(i, roleInfo);
          return roleInfo;
       }
    }
    public static void write(NearbyMapFeed$RoleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          NearbyMapFeed$RoleInfo$Role$$Parcelable.write(p0.mRole, p1, p2, p3);
          NearbyMapFeed$RoleInfo$Moment$$Parcelable.write(p0.mMoment, p1, p2, p3);
          p1.writeString(p0.mMessage);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyMapFeed$RoleInfo getParcel(){
       return this.roleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyMapFeed$RoleInfo$$Parcelable.write(this.roleInfo$$0, p0, p1, new a());
    }
}
