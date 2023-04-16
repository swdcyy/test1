package com.yxcorp.gifshow.profile.model.UserOperationEntrance$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.UserOperationEntrance$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.UserOperationEntrance;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserOperationEntrance$$Parcelable implements Parcelable, d	// class@0013b9
{
    public UserOperationEntrance userOperationEntrance$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserOperationEntrance$$Parcelable.CREATOR = new UserOperationEntrance$$Parcelable$a();
    }
    public void UserOperationEntrance$$Parcelable(UserOperationEntrance p0){
       super();
       this.userOperationEntrance$$0 = p0;
    }
    public static UserOperationEntrance read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserOperationEntrance userOperatio = new UserOperationEntrance();
          p1.f(p1.g(), userOperatio);
          userOperatio.mStatisticsParams = p0.readString();
          userOperatio.mActionUrl = p0.readString();
          userOperatio.mEntranceSubName = p0.readString();
          userOperatio.mEntranceDarkIcon = p0.readString();
          userOperatio.mEntranceName = p0.readString();
          userOperatio.mSourceEntranceType = p0.readString();
          userOperatio.mEntranceIcon = p0.readString();
          userOperatio.mActionType = p0.readInt();
          userOperatio.mExtParam = p0.readString();
          userOperatio.mGroupType = p0.readInt();
          p1.f(i, userOperatio);
          return userOperatio;
       }
    }
    public static void write(UserOperationEntrance p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mStatisticsParams);
          p1.writeString(p0.mActionUrl);
          p1.writeString(p0.mEntranceSubName);
          p1.writeString(p0.mEntranceDarkIcon);
          p1.writeString(p0.mEntranceName);
          p1.writeString(p0.mSourceEntranceType);
          p1.writeString(p0.mEntranceIcon);
          p1.writeInt(p0.mActionType);
          p1.writeString(p0.mExtParam);
          p1.writeInt(p0.mGroupType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserOperationEntrance getParcel(){
       return this.userOperationEntrance$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserOperationEntrance$$Parcelable.write(this.userOperationEntrance$$0, p0, p1, new a());
    }
}
