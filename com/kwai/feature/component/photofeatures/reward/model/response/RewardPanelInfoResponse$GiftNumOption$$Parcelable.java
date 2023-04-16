package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$GiftNumOption$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$GiftNumOption$$Parcelable$a;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$GiftNumOption;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class RewardPanelInfoResponse$GiftNumOption$$Parcelable implements Parcelable, d	// class@001249
{
    public RewardPanelInfoResponse$GiftNumOption giftNumOption$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPanelInfoResponse$GiftNumOption$$Parcelable.CREATOR = new RewardPanelInfoResponse$GiftNumOption$$Parcelable$a();
    }
    public void RewardPanelInfoResponse$GiftNumOption$$Parcelable(RewardPanelInfoResponse$GiftNumOption p0){
       super();
       this.giftNumOption$$0 = p0;
    }
    public static RewardPanelInfoResponse$GiftNumOption read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RewardPanelInfoResponse$GiftNumOption giftNumOptio = new RewardPanelInfoResponse$GiftNumOption();
          p1.f(p1.g(), giftNumOptio);
          giftNumOptio.mGiftNum = p0.readInt();
          giftNumOptio.mGiftDesc = p0.readString();
          p1.f(i, giftNumOptio);
          return giftNumOptio;
       }
    }
    public static void write(RewardPanelInfoResponse$GiftNumOption p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mGiftNum);
          p1.writeString(p0.mGiftDesc);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPanelInfoResponse$GiftNumOption getParcel(){
       return this.giftNumOption$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPanelInfoResponse$GiftNumOption$$Parcelable.write(this.giftNumOption$$0, p0, p1, new a());
    }
}
