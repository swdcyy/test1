package com.yxcorp.gifshow.profile.model.feed.HostInfoModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.feed.HostInfoModel$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.feed.HostInfoModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class HostInfoModel$$Parcelable implements Parcelable, d	// class@0013d9
{
    public HostInfoModel hostInfoModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HostInfoModel$$Parcelable.CREATOR = new HostInfoModel$$Parcelable$a();
    }
    public void HostInfoModel$$Parcelable(HostInfoModel p0){
       super();
       this.hostInfoModel$$0 = p0;
    }
    public static HostInfoModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          HostInfoModel hostInfoMode = new HostInfoModel();
          p1.f(p1.g(), hostInfoMode);
          hostInfoMode.mLiveStreamId = p0.readString();
          hostInfoMode.mCoverType = p0.readInt();
          hostInfoMode.mUserId = p0.readString();
          hostInfoMode.mIsFollow = p0.readInt();
          p1.f(i, hostInfoMode);
          return hostInfoMode;
       }
    }
    public static void write(HostInfoModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLiveStreamId);
          p1.writeInt(p0.mCoverType);
          p1.writeString(p0.mUserId);
          p1.writeInt(p0.mIsFollow);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HostInfoModel getParcel(){
       return this.hostInfoModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HostInfoModel$$Parcelable.write(this.hostInfoModel$$0, p0, p1, new a());
    }
}
