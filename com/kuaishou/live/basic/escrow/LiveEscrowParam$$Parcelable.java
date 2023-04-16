package com.kuaishou.live.basic.escrow.LiveEscrowParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.basic.escrow.LiveEscrowParam$$Parcelable$a;
import com.kuaishou.live.basic.escrow.LiveEscrowParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$$Parcelable;
import com.kwai.feature.api.live.merchant.escrow.model.LiveEscrowEntryModel$LiveEscrowConfig;

public class LiveEscrowParam$$Parcelable implements Parcelable, d	// class@000cc9
{
    public LiveEscrowParam liveEscrowParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveEscrowParam$$Parcelable.CREATOR = new LiveEscrowParam$$Parcelable$a();
    }
    public void LiveEscrowParam$$Parcelable(LiveEscrowParam p0){
       super();
       this.liveEscrowParam$$0 = p0;
    }
    public static LiveEscrowParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveEscrowParam liveEscrowPa = new LiveEscrowParam();
          p1.f(p1.g(), liveEscrowPa);
          liveEscrowPa.mLiveCommentsConfig = p0.readSerializable();
          liveEscrowPa.mLiveStreamFeed = LiveStreamFeed$$Parcelable.read(p0, p1);
          liveEscrowPa.mLiveAudienceParam = LiveAudienceParam$$Parcelable.read(p0, p1);
          liveEscrowPa.mLiveEscrowConfig = p0.readSerializable();
          p1.f(i, liveEscrowPa);
          return liveEscrowPa;
       }
    }
    public static void write(LiveEscrowParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mLiveCommentsConfig);
          LiveStreamFeed$$Parcelable.write(p0.mLiveStreamFeed, p1, p2, p3);
          LiveAudienceParam$$Parcelable.write(p0.mLiveAudienceParam, p1, p2, p3);
          p1.writeSerializable(p0.mLiveEscrowConfig);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveEscrowParam getParcel(){
       return this.liveEscrowParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveEscrowParam$$Parcelable.write(this.liveEscrowParam$$0, p0, p1, new a());
    }
}
