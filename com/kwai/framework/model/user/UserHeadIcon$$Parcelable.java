package com.kwai.framework.model.user.UserHeadIcon$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserHeadIcon$$Parcelable$a;
import com.kwai.framework.model.user.UserHeadIcon;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class UserHeadIcon$$Parcelable implements Parcelable, d	// class@001758
{
    public UserHeadIcon userHeadIcon$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserHeadIcon$$Parcelable.CREATOR = new UserHeadIcon$$Parcelable$a();
    }
    public void UserHeadIcon$$Parcelable(UserHeadIcon p0){
       super();
       this.userHeadIcon$$0 = p0;
    }
    public static UserHeadIcon read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserHeadIcon userHeadIcon = new UserHeadIcon();
          p1.f(p1.g(), userHeadIcon);
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          userHeadIcon.mHeadIconUrls = uCDNUrlArray;
          userHeadIcon.mHeadIconName = p0.readString();
          p1.f(i, userHeadIcon);
          return userHeadIcon;
       }
    }
    public static void write(UserHeadIcon p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          UserHeadIcon mHeadIconUrl = p0.mHeadIconUrls;
          if (mHeadIconUrl == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mHeadIconUrl.length);
             mHeadIconUrl = p0.mHeadIconUrls;
             i1 = mHeadIconUrl.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mHeadIconUrl[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mHeadIconName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserHeadIcon getParcel(){
       return this.userHeadIcon$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserHeadIcon$$Parcelable.write(this.userHeadIcon$$0, p0, p1, new a());
    }
}
