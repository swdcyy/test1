package com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneCommon;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneCommon$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class CoronaZoneFeed$$Parcelable implements Parcelable, d	// class@00122e
{
    public CoronaZoneFeed coronaZoneFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaZoneFeed$$Parcelable.CREATOR = new CoronaZoneFeed$$Parcelable$a();
    }
    public void CoronaZoneFeed$$Parcelable(CoronaZoneFeed p0){
       super();
       this.coronaZoneFeed$$0 = p0;
    }
    public static CoronaZoneFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaZoneFeed uCoronaZoneF = new CoronaZoneFeed();
          p1.f(p1.g(), uCoronaZoneF);
          uCoronaZoneF.mContent = CoronaZoneContent$$Parcelable.read(p0, p1);
          uCoronaZoneF.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uCoronaZoneF.mCoronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          uCoronaZoneF.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          uCoronaZoneF.mCoronaZoneCommon = CoronaZoneCommon$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, uCoronaZoneF, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uCoronaZoneF, "dataMap", new c().d(p0));
          p1.f(i, uCoronaZoneF);
          return uCoronaZoneF;
       }
    }
    public static void write(CoronaZoneFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaZoneContent$$Parcelable.write(p0.mContent, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoronaInfo$$Parcelable.write(p0.mCoronaInfo, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          CoronaZoneCommon$$Parcelable.write(p0.mCoronaZoneCommon, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaZoneFeed getParcel(){
       return this.coronaZoneFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaZoneFeed$$Parcelable.write(this.coronaZoneFeed$$0, p0, p1, new a());
    }
}