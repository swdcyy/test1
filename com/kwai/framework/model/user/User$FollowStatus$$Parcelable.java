package com.kwai.framework.model.user.User$FollowStatus$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.User$FollowStatus$$Parcelable$a;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import java.lang.Enum;

public class User$FollowStatus$$Parcelable implements Parcelable, d	// class@001730
{
    public User$FollowStatus followStatus$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       User$FollowStatus$$Parcelable.CREATOR = new User$FollowStatus$$Parcelable$a();
    }
    public void User$FollowStatus$$Parcelable(User$FollowStatus p0){
       super();
       this.followStatus$$0 = p0;
    }
    public static User$FollowStatus read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          String str = p0.readString();
          User$FollowStatus uFollowStatu = (str == null)? null: Enum.valueOf(User$FollowStatus.class, str);
          p1.f(i, uFollowStatu);
          return uFollowStatu;
       }
    }
    public static void write(User$FollowStatus p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          String str = (p0 == null)? null: p0.name();
          p1.writeString(str);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public User$FollowStatus getParcel(){
       return this.followStatus$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       User$FollowStatus$$Parcelable.write(this.followStatus$$0, p0, p1, new a());
    }
}
