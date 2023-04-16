package com.yxcorp.gifshow.model.FollowBackInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.FollowBackInfo$$Parcelable$a;
import com.yxcorp.gifshow.model.FollowBackInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FollowBackInfo$$Parcelable implements Parcelable, d	// class@001e16
{
    public FollowBackInfo followBackInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowBackInfo$$Parcelable.CREATOR = new FollowBackInfo$$Parcelable$a();
    }
    public void FollowBackInfo$$Parcelable(FollowBackInfo p0){
       super();
       this.followBackInfo$$0 = p0;
    }
    public static FollowBackInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FollowBackInfo uFollowBackI = new FollowBackInfo();
          p1.f(p1.g(), uFollowBackI);
          uFollowBackI.mTitle = p0.readString();
          uFollowBackI.mUserName = p0.readString();
          uFollowBackI.mLinkUrl = p0.readString();
          uFollowBackI.mSubTitle = p0.readString();
          p1.f(i, uFollowBackI);
          return uFollowBackI;
       }
    }
    public static void write(FollowBackInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mUserName);
          p1.writeString(p0.mLinkUrl);
          p1.writeString(p0.mSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FollowBackInfo getParcel(){
       return this.followBackInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowBackInfo$$Parcelable.write(this.followBackInfo$$0, p0, p1, new a());
    }
}
