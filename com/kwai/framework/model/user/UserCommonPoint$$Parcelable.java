package com.kwai.framework.model.user.UserCommonPoint$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserCommonPoint$$Parcelable$a;
import com.kwai.framework.model.user.UserCommonPoint;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserCommonPoint$$Parcelable implements Parcelable, d	// class@001738
{
    public UserCommonPoint userCommonPoint$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserCommonPoint$$Parcelable.CREATOR = new UserCommonPoint$$Parcelable$a();
    }
    public void UserCommonPoint$$Parcelable(UserCommonPoint p0){
       super();
       this.userCommonPoint$$0 = p0;
    }
    public static UserCommonPoint read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserCommonPoint userCommonPo = new UserCommonPoint();
          p1.f(p1.g(), userCommonPo);
          userCommonPo.mContent = p0.readString();
          userCommonPo.mStartColor = p0.readString();
          userCommonPo.mType = p0.readString();
          userCommonPo.mIconUrl = p0.readString();
          userCommonPo.mEndColor = p0.readString();
          p1.f(i, userCommonPo);
          return userCommonPo;
       }
    }
    public static void write(UserCommonPoint p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          p1.writeString(p0.mStartColor);
          p1.writeString(p0.mType);
          p1.writeString(p0.mIconUrl);
          p1.writeString(p0.mEndColor);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserCommonPoint getParcel(){
       return this.userCommonPoint$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserCommonPoint$$Parcelable.write(this.userCommonPoint$$0, p0, p1, new a());
    }
}
