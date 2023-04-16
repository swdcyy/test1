package com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NearbyMapFeed$RoleInfo$Moment$$Parcelable implements Parcelable, d	// class@000ca8
{
    public NearbyMapFeed$RoleInfo$Moment moment$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyMapFeed$RoleInfo$Moment$$Parcelable.CREATOR = new NearbyMapFeed$RoleInfo$Moment$$Parcelable$a();
    }
    public void NearbyMapFeed$RoleInfo$Moment$$Parcelable(NearbyMapFeed$RoleInfo$Moment p0){
       super();
       this.moment$$0 = p0;
    }
    public static NearbyMapFeed$RoleInfo$Moment read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NearbyMapFeed$RoleInfo$Moment roleInfo$Mom = new NearbyMapFeed$RoleInfo$Moment();
          p1.f(p1.g(), roleInfo$Mom);
          roleInfo$Mom.mId = p0.readInt();
          roleInfo$Mom.mImage = p0.readString();
          roleInfo$Mom.mMessage = p0.readString();
          roleInfo$Mom.mName = p0.readString();
          roleInfo$Mom.mType = p0.readInt();
          p1.f(i, roleInfo$Mom);
          return roleInfo$Mom;
       }
    }
    public static void write(NearbyMapFeed$RoleInfo$Moment p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mId);
          p1.writeString(p0.mImage);
          p1.writeString(p0.mMessage);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyMapFeed$RoleInfo$Moment getParcel(){
       return this.moment$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyMapFeed$RoleInfo$Moment$$Parcelable.write(this.moment$$0, p0, p1, new a());
    }
}
