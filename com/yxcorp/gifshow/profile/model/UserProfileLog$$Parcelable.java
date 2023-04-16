package com.yxcorp.gifshow.profile.model.UserProfileLog$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.UserProfileLog$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.UserProfileLog;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserProfileLog$$Parcelable implements Parcelable, d	// class@0013c6
{
    public UserProfileLog userProfileLog$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserProfileLog$$Parcelable.CREATOR = new UserProfileLog$$Parcelable$a();
    }
    public void UserProfileLog$$Parcelable(UserProfileLog p0){
       super();
       this.userProfileLog$$0 = p0;
    }
    public static UserProfileLog read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserProfileLog userProfileL = new UserProfileLog();
          p1.f(p1.g(), userProfileL);
          userProfileL.mUserStatus = p0.readString();
          p1.f(i, userProfileL);
          return userProfileL;
       }
    }
    public static void write(UserProfileLog p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUserStatus);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserProfileLog getParcel(){
       return this.userProfileLog$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserProfileLog$$Parcelable.write(this.userProfileLog$$0, p0, p1, new a());
    }
}
