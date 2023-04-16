package com.yxcorp.gifshow.model.response.UserProfileResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.response.UserProfileResponse$$Parcelable$a;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserProfile$$Parcelable;
import fa6.a;
import ga6.c;
import java.util.Map;
import ywd.j;
import java.lang.Class;
import org.parceler.a;
import org.parceler.a$c;

public class UserProfileResponse$$Parcelable implements Parcelable, d	// class@001f6a
{
    public UserProfileResponse userProfileResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserProfileResponse$$Parcelable.CREATOR = new UserProfileResponse$$Parcelable$a();
    }
    public void UserProfileResponse$$Parcelable(UserProfileResponse p0){
       super();
       this.userProfileResponse$$0 = p0;
    }
    public static UserProfileResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserProfileResponse userProfileR = new UserProfileResponse();
          p1.f(p1.g(), userProfileR);
          userProfileR.mUserProfile = UserProfile$$Parcelable.read(p0, p1);
          a.d(a.class, userProfileR, "dataMap", new c().d(p0));
          p1.f(i, userProfileR);
          return userProfileR;
       }
    }
    public static void write(UserProfileResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          UserProfile$$Parcelable.write(p0.mUserProfile, p1, p2, p3);
          new c().i(a.c(new a$c(), a.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserProfileResponse getParcel(){
       return this.userProfileResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserProfileResponse$$Parcelable.write(this.userProfileResponse$$0, p0, p1, new a());
    }
}
