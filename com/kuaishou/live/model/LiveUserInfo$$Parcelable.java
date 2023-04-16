package com.kuaishou.live.model.LiveUserInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.model.LiveUserInfo$$Parcelable$a;
import com.kuaishou.live.model.LiveUserInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class LiveUserInfo$$Parcelable implements Parcelable, d	// class@000cf1
{
    public LiveUserInfo liveUserInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveUserInfo$$Parcelable.CREATOR = new LiveUserInfo$$Parcelable$a();
    }
    public void LiveUserInfo$$Parcelable(LiveUserInfo p0){
       super();
       this.liveUserInfo$$0 = p0;
    }
    public static LiveUserInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveUserInfo liveUserInfo = new LiveUserInfo();
          p1.f(p1.g(), liveUserInfo);
          liveUserInfo.mKwaiId = p0.readString();
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
          liveUserInfo.mAvatars = uCDNUrlArray;
          liveUserInfo.mAvatar = p0.readString();
          liveUserInfo.mId = p0.readString();
          liveUserInfo.mSex = p0.readString();
          liveUserInfo.mName = p0.readString();
          p1.f(i, liveUserInfo);
          return liveUserInfo;
       }
    }
    public static void write(LiveUserInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mKwaiId);
          LiveUserInfo mAvatars = p0.mAvatars;
          if (mAvatars == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAvatars.length);
             mAvatars = p0.mAvatars;
             i1 = mAvatars.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mAvatars[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mAvatar);
          p1.writeString(p0.mId);
          p1.writeString(p0.mSex);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveUserInfo getParcel(){
       return this.liveUserInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveUserInfo$$Parcelable.write(this.liveUserInfo$$0, p0, p1, new a());
    }
}
