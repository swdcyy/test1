package com.kwai.feature.component.photofeatures.reward.model.response.RewardRequireResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardRequireResponse$$Parcelable$a;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardRequireResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardCommentInfo;

public class RewardRequireResponse$$Parcelable implements Parcelable, d	// class@001256
{
    public RewardRequireResponse rewardRequireResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardRequireResponse$$Parcelable.CREATOR = new RewardRequireResponse$$Parcelable$a();
    }
    public void RewardRequireResponse$$Parcelable(RewardRequireResponse p0){
       super();
       this.rewardRequireResponse$$0 = p0;
    }
    public static RewardRequireResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RewardRequireResponse rewardRequir = new RewardRequireResponse();
          p1.f(p1.g(), rewardRequir);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          rewardRequir.mShowFansGroupGuidance = b;
          rewardRequir.mCommentInfo = p0.readSerializable();
          p1.f(i, rewardRequir);
          return rewardRequir;
       }
    }
    public static void write(RewardRequireResponse p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShowFansGroupGuidance);
          p1.writeSerializable(p0.mCommentInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardRequireResponse getParcel(){
       return this.rewardRequireResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardRequireResponse$$Parcelable.write(this.rewardRequireResponse$$0, p0, p1, new a());
    }
}
