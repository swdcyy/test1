package com.yxcorp.gifshow.model.response.ChannelRecommendUser$ChannelLivingInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser$ChannelLivingInfo$$Parcelable$a;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser$ChannelLivingInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ChannelRecommendUser$ChannelLivingInfo$$Parcelable implements Parcelable, d	// class@001f1f
{
    public ChannelRecommendUser$ChannelLivingInfo channelLivingInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ChannelRecommendUser$ChannelLivingInfo$$Parcelable.CREATOR = new ChannelRecommendUser$ChannelLivingInfo$$Parcelable$a();
    }
    public void ChannelRecommendUser$ChannelLivingInfo$$Parcelable(ChannelRecommendUser$ChannelLivingInfo p0){
       super();
       this.channelLivingInfo$$0 = p0;
    }
    public static ChannelRecommendUser$ChannelLivingInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ChannelRecommendUser$ChannelLivingInfo uChannelLivi = new ChannelRecommendUser$ChannelLivingInfo();
          p1.f(p1.g(), uChannelLivi);
          uChannelLivi.mLivestreamId = p0.readString();
          p1.f(i, uChannelLivi);
          return uChannelLivi;
       }
    }
    public static void write(ChannelRecommendUser$ChannelLivingInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLivestreamId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ChannelRecommendUser$ChannelLivingInfo getParcel(){
       return this.channelLivingInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ChannelRecommendUser$ChannelLivingInfo$$Parcelable.write(this.channelLivingInfo$$0, p0, p1, new a());
    }
}
