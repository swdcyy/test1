package com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam$$Parcelable$a;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveAdNeoMerchantParam$$Parcelable implements Parcelable, d	// class@000f7a
{
    public LiveAdNeoMerchantParam liveAdNeoMerchantParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveAdNeoMerchantParam$$Parcelable.CREATOR = new LiveAdNeoMerchantParam$$Parcelable$a();
    }
    public void LiveAdNeoMerchantParam$$Parcelable(LiveAdNeoMerchantParam p0){
       super();
       this.liveAdNeoMerchantParam$$0 = p0;
    }
    public static LiveAdNeoMerchantParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveAdNeoMerchantParam liveAdNeoMer = new LiveAdNeoMerchantParam();
          p1.f(p1.g(), liveAdNeoMer);
          liveAdNeoMer.mLiveStreamId = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          liveAdNeoMer.mNeedShowPendant = b;
          p1.f(i, liveAdNeoMer);
          return liveAdNeoMer;
       }
    }
    public static void write(LiveAdNeoMerchantParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLiveStreamId);
          p1.writeInt(p0.mNeedShowPendant);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveAdNeoMerchantParam getParcel(){
       return this.liveAdNeoMerchantParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveAdNeoMerchantParam$$Parcelable.write(this.liveAdNeoMerchantParam$$0, p0, p1, new a());
    }
}
