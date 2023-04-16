package com.kwai.framework.model.user.UserStatusExt$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserStatusExt$$Parcelable$a;
import com.kwai.framework.model.user.UserStatusExt;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.framework.model.user.UserStatus;

public class UserStatusExt$$Parcelable implements Parcelable, d	// class@001778
{
    public UserStatusExt userStatusExt$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserStatusExt$$Parcelable.CREATOR = new UserStatusExt$$Parcelable$a();
    }
    public void UserStatusExt$$Parcelable(UserStatusExt p0){
       super();
       this.userStatusExt$$0 = p0;
    }
    public static UserStatusExt read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserStatusExt userStatusEx = new UserStatusExt();
          p1.f(p1.g(), userStatusEx);
          userStatusEx.mMoodTips = p0.readString();
          userStatusEx.mUserStatusMeta = p0.readSerializable();
          p1.f(i, userStatusEx);
          return userStatusEx;
       }
    }
    public static void write(UserStatusExt p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mMoodTips);
          p1.writeSerializable(p0.mUserStatusMeta);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserStatusExt getParcel(){
       return this.userStatusExt$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserStatusExt$$Parcelable.write(this.userStatusExt$$0, p0, p1, new a());
    }
}
