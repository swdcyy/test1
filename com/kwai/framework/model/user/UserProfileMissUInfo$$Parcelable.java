package com.kwai.framework.model.user.UserProfileMissUInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserProfileMissUInfo$$Parcelable$a;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserProfileMissUInfo$$Parcelable implements Parcelable, d	// class@001768
{
    public UserProfileMissUInfo userProfileMissUInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserProfileMissUInfo$$Parcelable.CREATOR = new UserProfileMissUInfo$$Parcelable$a();
    }
    public void UserProfileMissUInfo$$Parcelable(UserProfileMissUInfo p0){
       super();
       this.userProfileMissUInfo$$0 = p0;
    }
    public static UserProfileMissUInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserProfileMissUInfo userProfileM = new UserProfileMissUInfo();
          p1.f(p1.g(), userProfileM);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          userProfileM.mShowMissYouButton = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userProfileM.mShowAlreadyMissUStatus = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userProfileM.mShowBubble = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          userProfileM.mShowMissYouButtonUnFollow = b;
          userProfileM.mMissUCount = p0.readInt();
          p1.f(i, userProfileM);
          return userProfileM;
       }
    }
    public static void write(UserProfileMissUInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShowMissYouButton);
          p1.writeInt(p0.mShowAlreadyMissUStatus);
          p1.writeInt(p0.mShowBubble);
          p1.writeInt(p0.mShowMissYouButtonUnFollow);
          p1.writeInt(p0.mMissUCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserProfileMissUInfo getParcel(){
       return this.userProfileMissUInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserProfileMissUInfo$$Parcelable.write(this.userProfileMissUInfo$$0, p0, p1, new a());
    }
}
