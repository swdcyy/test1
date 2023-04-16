package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$$Parcelable$a;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo$$Parcelable;

public class RewardPanelInfoResponse$$Parcelable implements Parcelable, d	// class@001244
{
    public RewardPanelInfoResponse rewardPanelInfoResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPanelInfoResponse$$Parcelable.CREATOR = new RewardPanelInfoResponse$$Parcelable$a();
    }
    public void RewardPanelInfoResponse$$Parcelable(RewardPanelInfoResponse p0){
       super();
       this.rewardPanelInfoResponse$$0 = p0;
    }
    public static RewardPanelInfoResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RewardPanelInfoResponse rewardPanelI = new RewardPanelInfoResponse();
          p1.f(p1.g(), rewardPanelI);
          rewardPanelI.mPanelInfo = RewardPanelInfoResponse$PanelInfo$$Parcelable.read(p0, p1);
          p1.f(i, rewardPanelI);
          return rewardPanelI;
       }
    }
    public static void write(RewardPanelInfoResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          RewardPanelInfoResponse$PanelInfo$$Parcelable.write(p0.mPanelInfo, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPanelInfoResponse getParcel(){
       return this.rewardPanelInfoResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPanelInfoResponse$$Parcelable.write(this.rewardPanelInfoResponse$$0, p0, p1, new a());
    }
}
