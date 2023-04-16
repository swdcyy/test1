package com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaSubChannelCommon$$Parcelable implements Parcelable, d	// class@001212
{
    public CoronaSubChannelCommon coronaSubChannelCommon$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaSubChannelCommon$$Parcelable.CREATOR = new CoronaSubChannelCommon$$Parcelable$a();
    }
    public void CoronaSubChannelCommon$$Parcelable(CoronaSubChannelCommon p0){
       super();
       this.coronaSubChannelCommon$$0 = p0;
    }
    public static CoronaSubChannelCommon read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaSubChannelCommon uCoronaSubCh = new CoronaSubChannelCommon();
          p1.f(p1.g(), uCoronaSubCh);
          uCoronaSubCh.mSubTabFeedId = p0.readInt();
          p1.f(i, uCoronaSubCh);
          return uCoronaSubCh;
       }
    }
    public static void write(CoronaSubChannelCommon p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSubTabFeedId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaSubChannelCommon getParcel(){
       return this.coronaSubChannelCommon$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaSubChannelCommon$$Parcelable.write(this.coronaSubChannelCommon$$0, p0, p1, new a());
    }
}
