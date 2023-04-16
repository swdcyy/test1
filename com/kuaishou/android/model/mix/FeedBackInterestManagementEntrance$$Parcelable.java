package com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$$Parcelable$a;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class FeedBackInterestManagementEntrance$$Parcelable implements Parcelable, d	// class@000c73
{
    public FeedBackInterestManagementEntrance feedBackInterestManagementEntrance$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FeedBackInterestManagementEntrance$$Parcelable.CREATOR = new FeedBackInterestManagementEntrance$$Parcelable$a();
    }
    public void FeedBackInterestManagementEntrance$$Parcelable(FeedBackInterestManagementEntrance p0){
       super();
       this.feedBackInterestManagementEntrance$$0 = p0;
    }
    public static FeedBackInterestManagementEntrance read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          FeedBackInterestManagementEntrance uFeedBackInt = new FeedBackInterestManagementEntrance();
          p1.f(p1.g(), uFeedBackInt);
          uFeedBackInt.mUrl = p0.readString();
          uFeedBackInt.mENGText = p0.readString();
          uFeedBackInt.mCHSText = p0.readString();
          uFeedBackInt.mTCText = p0.readString();
          p1.f(i, uFeedBackInt);
          return uFeedBackInt;
       }
    }
    public static void write(FeedBackInterestManagementEntrance p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mENGText);
          p1.writeString(p0.mCHSText);
          p1.writeString(p0.mTCText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FeedBackInterestManagementEntrance getParcel(){
       return this.feedBackInterestManagementEntrance$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FeedBackInterestManagementEntrance$$Parcelable.write(this.feedBackInterestManagementEntrance$$0, p0, p1, new a());
    }
}
