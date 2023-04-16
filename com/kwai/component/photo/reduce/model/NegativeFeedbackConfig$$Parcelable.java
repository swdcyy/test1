package com.kwai.component.photo.reduce.model.NegativeFeedbackConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.component.photo.reduce.model.NegativeFeedbackConfig$$Parcelable$a;
import com.kwai.component.photo.reduce.model.NegativeFeedbackConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$$Parcelable;

public class NegativeFeedbackConfig$$Parcelable implements Parcelable, d	// class@000af6
{
    public NegativeFeedbackConfig negativeFeedbackConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NegativeFeedbackConfig$$Parcelable.CREATOR = new NegativeFeedbackConfig$$Parcelable$a();
    }
    public void NegativeFeedbackConfig$$Parcelable(NegativeFeedbackConfig p0){
       super();
       this.negativeFeedbackConfig$$0 = p0;
    }
    public static NegativeFeedbackConfig read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NegativeFeedbackConfig negativeFeed = new NegativeFeedbackConfig();
          p1.f(p1.g(), negativeFeed);
          negativeFeed.mFrequentUserConfig = FeedNegativeFeedback$$Parcelable.read(p0, p1);
          negativeFeed.mAcquaintanceConfig = FeedNegativeFeedback$$Parcelable.read(p0, p1);
          p1.f(i, negativeFeed);
          return negativeFeed;
       }
    }
    public static void write(NegativeFeedbackConfig p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          FeedNegativeFeedback$$Parcelable.write(p0.mFrequentUserConfig, p1, p2, p3);
          FeedNegativeFeedback$$Parcelable.write(p0.mAcquaintanceConfig, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NegativeFeedbackConfig getParcel(){
       return this.negativeFeedbackConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NegativeFeedbackConfig$$Parcelable.write(this.negativeFeedbackConfig$$0, p0, p1, new a());
    }
}
