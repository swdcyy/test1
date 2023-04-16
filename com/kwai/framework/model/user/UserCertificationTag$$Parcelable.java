package com.kwai.framework.model.user.UserCertificationTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserCertificationTag$$Parcelable$a;
import com.kwai.framework.model.user.UserCertificationTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import java.util.HashMap;

public class UserCertificationTag$$Parcelable implements Parcelable, d	// class@001735
{
    public UserCertificationTag userCertificationTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserCertificationTag$$Parcelable.CREATOR = new UserCertificationTag$$Parcelable$a();
    }
    public void UserCertificationTag$$Parcelable(UserCertificationTag p0){
       super();
       this.userCertificationTag$$0 = p0;
    }
    public static UserCertificationTag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserCertificationTag userCertific = new UserCertificationTag();
          p1.f(p1.g(), userCertific);
          userCertific.mCertificationUrl = p0.readString();
          userCertific.mExtraInfo = p0.readSerializable();
          userCertific.mDescription = p0.readString();
          userCertific.mIconUrl = p0.readString();
          p1.f(i, userCertific);
          return userCertific;
       }
    }
    public static void write(UserCertificationTag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCertificationUrl);
          p1.writeSerializable(p0.mExtraInfo);
          p1.writeString(p0.mDescription);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserCertificationTag getParcel(){
       return this.userCertificationTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserCertificationTag$$Parcelable.write(this.userCertificationTag$$0, p0, p1, new a());
    }
}
