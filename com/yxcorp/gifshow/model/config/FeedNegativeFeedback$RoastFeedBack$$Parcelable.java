package com.yxcorp.gifshow.model.config.FeedNegativeFeedback$RoastFeedBack$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$RoastFeedBack$$Parcelable$a;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$RoastFeedBack;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FeedNegativeFeedback$RoastFeedBack$$Parcelable implements Parcelable, d	// class@001ec7
{
    public FeedNegativeFeedback$RoastFeedBack roastFeedBack$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FeedNegativeFeedback$RoastFeedBack$$Parcelable.CREATOR = new FeedNegativeFeedback$RoastFeedBack$$Parcelable$a();
    }
    public void FeedNegativeFeedback$RoastFeedBack$$Parcelable(FeedNegativeFeedback$RoastFeedBack p0){
       super();
       this.roastFeedBack$$0 = p0;
    }
    public static FeedNegativeFeedback$RoastFeedBack read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FeedNegativeFeedback$RoastFeedBack roastFeedBac = new FeedNegativeFeedback$RoastFeedBack();
          p1.f(p1.g(), roastFeedBac);
          roastFeedBac.mContent = p0.readString();
          roastFeedBac.mIconImageUrl = p0.readString();
          p1.f(i, roastFeedBac);
          return roastFeedBac;
       }
    }
    public static void write(FeedNegativeFeedback$RoastFeedBack p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          p1.writeString(p0.mIconImageUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FeedNegativeFeedback$RoastFeedBack getParcel(){
       return this.roastFeedBack$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FeedNegativeFeedback$RoastFeedBack$$Parcelable.write(this.roastFeedBack$$0, p0, p1, new a());
    }
}
