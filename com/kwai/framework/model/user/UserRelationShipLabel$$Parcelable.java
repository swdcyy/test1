package com.kwai.framework.model.user.UserRelationShipLabel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserRelationShipLabel$$Parcelable$a;
import com.kwai.framework.model.user.UserRelationShipLabel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class UserRelationShipLabel$$Parcelable implements Parcelable, d	// class@00176f
{
    public UserRelationShipLabel userRelationShipLabel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserRelationShipLabel$$Parcelable.CREATOR = new UserRelationShipLabel$$Parcelable$a();
    }
    public void UserRelationShipLabel$$Parcelable(UserRelationShipLabel p0){
       super();
       this.userRelationShipLabel$$0 = p0;
    }
    public static UserRelationShipLabel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UserRelationShipLabel userRelation = new UserRelationShipLabel();
          p1.f(p1.g(), userRelation);
          userRelation.mBlackColor = p0.readString();
          userRelation.mLabelText = p0.readString();
          userRelation.mWhiteColor = p0.readString();
          userRelation.mBackgroundWhiteColor = p0.readString();
          userRelation.mBackgroundBlackColor = p0.readString();
          userRelation.mLinkUrl = p0.readString();
          userRelation.mLabelType = p0.readInt();
          p1.f(i, userRelation);
          return userRelation;
       }
    }
    public static void write(UserRelationShipLabel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mBlackColor);
          p1.writeString(p0.mLabelText);
          p1.writeString(p0.mWhiteColor);
          p1.writeString(p0.mBackgroundWhiteColor);
          p1.writeString(p0.mBackgroundBlackColor);
          p1.writeString(p0.mLinkUrl);
          p1.writeInt(p0.mLabelType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserRelationShipLabel getParcel(){
       return this.userRelationShipLabel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserRelationShipLabel$$Parcelable.write(this.userRelationShipLabel$$0, p0, p1, new a());
    }
}
