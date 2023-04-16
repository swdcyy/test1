package com.kwai.framework.model.user.UserFollowerRelation$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserFollowerRelation$$Parcelable$a;
import com.kwai.framework.model.user.UserFollowerRelation;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.QUserContactName;
import com.kwai.framework.model.user.QUserContactName$$Parcelable;

public class UserFollowerRelation$$Parcelable implements Parcelable, d	// class@001755
{
    public UserFollowerRelation userFollowerRelation$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserFollowerRelation$$Parcelable.CREATOR = new UserFollowerRelation$$Parcelable$a();
    }
    public void UserFollowerRelation$$Parcelable(UserFollowerRelation p0){
       super();
       this.userFollowerRelation$$0 = p0;
    }
    public static UserFollowerRelation read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserFollowerRelation userFollower = new UserFollowerRelation();
          p1.f(p1.g(), userFollower);
          userFollower.mReason = p0.readString();
          userFollower.mContactName = QUserContactName$$Parcelable.read(p0, p1);
          userFollower.mMobileHash = p0.readString();
          userFollower.mType = p0.readInt();
          p1.f(i, userFollower);
          return userFollower;
       }
    }
    public static void write(UserFollowerRelation p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mReason);
          QUserContactName$$Parcelable.write(p0.mContactName, p1, p2, p3);
          p1.writeString(p0.mMobileHash);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserFollowerRelation getParcel(){
       return this.userFollowerRelation$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserFollowerRelation$$Parcelable.write(this.userFollowerRelation$$0, p0, p1, new a());
    }
}
