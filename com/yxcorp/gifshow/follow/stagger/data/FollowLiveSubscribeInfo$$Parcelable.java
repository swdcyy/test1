package com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo$$Parcelable$a;
import com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FollowLiveSubscribeInfo$$Parcelable implements Parcelable, d	// class@001167
{
    public FollowLiveSubscribeInfo followLiveSubscribeInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowLiveSubscribeInfo$$Parcelable.CREATOR = new FollowLiveSubscribeInfo$$Parcelable$a();
    }
    public void FollowLiveSubscribeInfo$$Parcelable(FollowLiveSubscribeInfo p0){
       super();
       this.followLiveSubscribeInfo$$0 = p0;
    }
    public static FollowLiveSubscribeInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FollowLiveSubscribeInfo uFollowLiveS = new FollowLiveSubscribeInfo();
          p1.f(p1.g(), uFollowLiveS);
          uFollowLiveS.mSubscribeId = p0.readString();
          uFollowLiveS.mSubscribeAuthorId = p0.readString();
          uFollowLiveS.mSubscribeType = p0.readInt();
          uFollowLiveS.mSubscribeStatus = p0.readInt();
          p1.f(i, uFollowLiveS);
          return uFollowLiveS;
       }
    }
    public static void write(FollowLiveSubscribeInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSubscribeId);
          p1.writeString(p0.mSubscribeAuthorId);
          p1.writeInt(p0.mSubscribeType);
          p1.writeInt(p0.mSubscribeStatus);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FollowLiveSubscribeInfo getParcel(){
       return this.followLiveSubscribeInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowLiveSubscribeInfo$$Parcelable.write(this.followLiveSubscribeInfo$$0, p0, p1, new a());
    }
}
