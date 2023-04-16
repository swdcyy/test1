package com.kwai.framework.model.user.UserExtraInfo$Truncate$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserExtraInfo$Truncate$$Parcelable$a;
import com.kwai.framework.model.user.UserExtraInfo$Truncate;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserExtraInfo$Truncate$$Parcelable implements Parcelable, d	// class@00174d
{
    public UserExtraInfo$Truncate truncate$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserExtraInfo$Truncate$$Parcelable.CREATOR = new UserExtraInfo$Truncate$$Parcelable$a();
    }
    public void UserExtraInfo$Truncate$$Parcelable(UserExtraInfo$Truncate p0){
       super();
       this.truncate$$0 = p0;
    }
    public static UserExtraInfo$Truncate read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserExtraInfo$Truncate truncate = new UserExtraInfo$Truncate();
          p1.f(p1.g(), truncate);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          truncate.mUntruncableText = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          truncate.mTruncableText = b;
          p1.f(i, truncate);
          return truncate;
       }
    }
    public static void write(UserExtraInfo$Truncate p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mUntruncableText);
          p1.writeInt(p0.mTruncableText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserExtraInfo$Truncate getParcel(){
       return this.truncate$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserExtraInfo$Truncate$$Parcelable.write(this.truncate$$0, p0, p1, new a());
    }
}
