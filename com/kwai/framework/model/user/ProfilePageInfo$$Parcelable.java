package com.kwai.framework.model.user.ProfilePageInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.ProfilePageInfo$$Parcelable$a;
import com.kwai.framework.model.user.ProfilePageInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ProfilePageInfo$$Parcelable implements Parcelable, d	// class@001713
{
    public ProfilePageInfo profilePageInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ProfilePageInfo$$Parcelable.CREATOR = new ProfilePageInfo$$Parcelable$a();
    }
    public void ProfilePageInfo$$Parcelable(ProfilePageInfo p0){
       super();
       this.profilePageInfo$$0 = p0;
    }
    public static ProfilePageInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ProfilePageInfo profilePageI = new ProfilePageInfo();
          p1.f(p1.g(), profilePageI);
          profilePageI.mUserType = p0.readInt();
          p1.f(i, profilePageI);
          return profilePageI;
       }
    }
    public static void write(ProfilePageInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mUserType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ProfilePageInfo getParcel(){
       return this.profilePageInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ProfilePageInfo$$Parcelable.write(this.profilePageInfo$$0, p0, p1, new a());
    }
}
