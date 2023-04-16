package com.kwai.feature.api.social.moment.model.MomentForwardObject$ForwardFilterReason$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.moment.model.MomentForwardObject$ForwardFilterReason$$Parcelable$a;
import com.kwai.feature.api.social.moment.model.MomentForwardObject$ForwardFilterReason;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MomentForwardObject$ForwardFilterReason$$Parcelable implements Parcelable, d	// class@001184
{
    public MomentForwardObject$ForwardFilterReason forwardFilterReason$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MomentForwardObject$ForwardFilterReason$$Parcelable.CREATOR = new MomentForwardObject$ForwardFilterReason$$Parcelable$a();
    }
    public void MomentForwardObject$ForwardFilterReason$$Parcelable(MomentForwardObject$ForwardFilterReason p0){
       super();
       this.forwardFilterReason$$0 = p0;
    }
    public static MomentForwardObject$ForwardFilterReason read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MomentForwardObject$ForwardFilterReason uForwardFilt = new MomentForwardObject$ForwardFilterReason();
          p1.f(p1.g(), uForwardFilt);
          uForwardFilt.mText = p0.readString();
          uForwardFilt.mType = p0.readInt();
          p1.f(i, uForwardFilt);
          return uForwardFilt;
       }
    }
    public static void write(MomentForwardObject$ForwardFilterReason p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mText);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MomentForwardObject$ForwardFilterReason getParcel(){
       return this.forwardFilterReason$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MomentForwardObject$ForwardFilterReason$$Parcelable.write(this.forwardFilterReason$$0, p0, p1, new a());
    }
}
