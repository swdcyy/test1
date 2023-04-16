package com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$CoronaTVWatchHistoryRecord;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$OwnerCount;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$OwnerCount$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption$$Parcelable;

public class CoronaCommonMeta$$Parcelable implements Parcelable, d	// class@001204
{
    public CoronaCommonMeta coronaCommonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaCommonMeta$$Parcelable.CREATOR = new CoronaCommonMeta$$Parcelable$a();
    }
    public void CoronaCommonMeta$$Parcelable(CoronaCommonMeta p0){
       super();
       this.coronaCommonMeta$$0 = p0;
    }
    public static CoronaCommonMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaCommonMeta uCoronaCommo = new CoronaCommonMeta();
          p1.f(p1.g(), uCoronaCommo);
          uCoronaCommo.mTVWatchRecord = CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable.read(p0, p1);
          uCoronaCommo.mOwnerCount = CoronaCommonMeta$OwnerCount$$Parcelable.read(p0, p1);
          uCoronaCommo.mCoronaCoverInfo = CoronaCoverInfo$$Parcelable.read(p0, p1);
          uCoronaCommo.mCoronaCaption = CoronaCaption$$Parcelable.read(p0, p1);
          p1.f(i, uCoronaCommo);
          return uCoronaCommo;
       }
    }
    public static void write(CoronaCommonMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaCommonMeta$CoronaTVWatchHistoryRecord$$Parcelable.write(p0.mTVWatchRecord, p1, p2, p3);
          CoronaCommonMeta$OwnerCount$$Parcelable.write(p0.mOwnerCount, p1, p2, p3);
          CoronaCoverInfo$$Parcelable.write(p0.mCoronaCoverInfo, p1, p2, p3);
          CoronaCaption$$Parcelable.write(p0.mCoronaCaption, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaCommonMeta getParcel(){
       return this.coronaCommonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaCommonMeta$$Parcelable.write(this.coronaCommonMeta$$0, p0, p1, new a());
    }
}
