package com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role$Animation;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role$Animation$$Parcelable;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$MapDarkLightModel;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$MapDarkLightModel$$Parcelable;

public class NearbyMapFeed$RoleInfo$Role$$Parcelable implements Parcelable, d	// class@000cab
{
    public NearbyMapFeed$RoleInfo$Role role$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyMapFeed$RoleInfo$Role$$Parcelable.CREATOR = new NearbyMapFeed$RoleInfo$Role$$Parcelable$a();
    }
    public void NearbyMapFeed$RoleInfo$Role$$Parcelable(NearbyMapFeed$RoleInfo$Role p0){
       super();
       this.role$$0 = p0;
    }
    public static NearbyMapFeed$RoleInfo$Role read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NearbyMapFeed$RoleInfo$Role roleInfo$Rol = new NearbyMapFeed$RoleInfo$Role();
          p1.f(p1.g(), roleInfo$Rol);
          roleInfo$Rol.mAnimation = NearbyMapFeed$RoleInfo$Role$Animation$$Parcelable.read(p0, p1);
          roleInfo$Rol.mId = p0.readInt();
          roleInfo$Rol.mImage = p0.readString();
          roleInfo$Rol.avatar = NearbyMapFeed$MapDarkLightModel$$Parcelable.read(p0, p1);
          roleInfo$Rol.mName = p0.readString();
          p1.f(i, roleInfo$Rol);
          return roleInfo$Rol;
       }
    }
    public static void write(NearbyMapFeed$RoleInfo$Role p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          NearbyMapFeed$RoleInfo$Role$Animation$$Parcelable.write(p0.mAnimation, p1, p2, p3);
          p1.writeInt(p0.mId);
          p1.writeString(p0.mImage);
          NearbyMapFeed$MapDarkLightModel$$Parcelable.write(p0.avatar, p1, p2, p3);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyMapFeed$RoleInfo$Role getParcel(){
       return this.role$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyMapFeed$RoleInfo$Role$$Parcelable.write(this.role$$0, p0, p1, new a());
    }
}
