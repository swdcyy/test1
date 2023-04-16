package com.kwai.feature.api.social.message.model.ResultResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.message.model.ResultResponse$$Parcelable$a;
import com.kwai.feature.api.social.message.model.ResultResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ResultResponse$$Parcelable implements Parcelable, d	// class@001176
{
    public ResultResponse resultResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ResultResponse$$Parcelable.CREATOR = new ResultResponse$$Parcelable$a();
    }
    public void ResultResponse$$Parcelable(ResultResponse p0){
       super();
       this.resultResponse$$0 = p0;
    }
    public static ResultResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ResultResponse resultRespon = new ResultResponse();
          p1.f(p1.g(), resultRespon);
          resultRespon.mResult = p0.readInt();
          resultRespon.mData = p0.readString();
          resultRespon.mErrMsg = p0.readString();
          p1.f(i, resultRespon);
          return resultRespon;
       }
    }
    public static void write(ResultResponse p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mResult);
          p1.writeString(p0.mData);
          p1.writeString(p0.mErrMsg);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ResultResponse getParcel(){
       return this.resultResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ResultResponse$$Parcelable.write(this.resultResponse$$0, p0, p1, new a());
    }
}
