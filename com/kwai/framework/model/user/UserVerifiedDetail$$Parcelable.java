package com.kwai.framework.model.user.UserVerifiedDetail$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserVerifiedDetail$$Parcelable$a;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserVerifiedDetail$$Parcelable implements Parcelable, d	// class@00177b
{
    public UserVerifiedDetail userVerifiedDetail$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserVerifiedDetail$$Parcelable.CREATOR = new UserVerifiedDetail$$Parcelable$a();
    }
    public void UserVerifiedDetail$$Parcelable(UserVerifiedDetail p0){
       super();
       this.userVerifiedDetail$$0 = p0;
    }
    public static UserVerifiedDetail read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserVerifiedDetail userVerified = new UserVerifiedDetail();
          p1.f(p1.g(), userVerified);
          userVerified.mIconType = p0.readInt();
          userVerified.mDescription = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          userVerified.mIsMusician = b;
          userVerified.mType = p0.readInt();
          p1.f(i, userVerified);
          return userVerified;
       }
    }
    public static void write(UserVerifiedDetail p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIconType);
          p1.writeString(p0.mDescription);
          p1.writeInt(p0.mIsMusician);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserVerifiedDetail getParcel(){
       return this.userVerifiedDetail$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserVerifiedDetail$$Parcelable.write(this.userVerifiedDetail$$0, p0, p1, new a());
    }
}
