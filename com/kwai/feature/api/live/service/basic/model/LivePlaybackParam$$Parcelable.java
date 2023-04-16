package com.kwai.feature.api.live.service.basic.model.LivePlaybackParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam$$Parcelable$a;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.entity.QPreInfo$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;

public class LivePlaybackParam$$Parcelable implements Parcelable, d	// class@001006
{
    public LivePlaybackParam livePlaybackParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LivePlaybackParam$$Parcelable.CREATOR = new LivePlaybackParam$$Parcelable$a();
    }
    public void LivePlaybackParam$$Parcelable(LivePlaybackParam p0){
       super();
       this.livePlaybackParam$$0 = p0;
    }
    public static LivePlaybackParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LivePlaybackParam livePlayback = new LivePlaybackParam();
          p1.f(p1.g(), livePlayback);
          livePlayback.mPhotoSearchParams = p0.readString();
          livePlayback.mOpenedTimeStamp = p0.readLong();
          livePlayback.mSource = p0.readInt();
          livePlayback.mFromH5Page = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          livePlayback.mIsFromPlaybackList = b;
          livePlayback.mFromUtmSource = p0.readString();
          livePlayback.mSearchSessionId = p0.readString();
          livePlayback.mPreInfo = QPreInfo$$Parcelable.read(p0, p1);
          livePlayback.mCommodityId = p0.readString();
          livePlayback.mPhoto = QPhoto$$Parcelable.read(p0, p1);
          livePlayback.mPhotoId = p0.readString();
          p1.f(i, livePlayback);
          return livePlayback;
       }
    }
    public static void write(LivePlaybackParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPhotoSearchParams);
          p1.writeLong(p0.mOpenedTimeStamp);
          p1.writeInt(p0.mSource);
          p1.writeString(p0.mFromH5Page);
          p1.writeInt(p0.mIsFromPlaybackList);
          p1.writeString(p0.mFromUtmSource);
          p1.writeString(p0.mSearchSessionId);
          QPreInfo$$Parcelable.write(p0.mPreInfo, p1, p2, p3);
          p1.writeString(p0.mCommodityId);
          QPhoto$$Parcelable.write(p0.mPhoto, p1, p2, p3);
          p1.writeString(p0.mPhotoId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LivePlaybackParam getParcel(){
       return this.livePlaybackParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LivePlaybackParam$$Parcelable.write(this.livePlaybackParam$$0, p0, p1, new a());
    }
}
