package com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon$$Parcelable;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class CoronaBannerFeed$$Parcelable implements Parcelable, d	// class@0011fb
{
    public CoronaBannerFeed coronaBannerFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaBannerFeed$$Parcelable.CREATOR = new CoronaBannerFeed$$Parcelable$a();
    }
    public void CoronaBannerFeed$$Parcelable(CoronaBannerFeed p0){
       super();
       this.coronaBannerFeed$$0 = p0;
    }
    public static CoronaBannerFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaBannerFeed uCoronaBanne = new CoronaBannerFeed();
          p1.f(p1.g(), uCoronaBanne);
          uCoronaBanne.mCoronaBannerContent = CoronaBannerContent$$Parcelable.read(p0, p1);
          uCoronaBanne.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uCoronaBanne.mCoronaBannerCommon = CoronaBannerCommon$$Parcelable.read(p0, p1);
          uCoronaBanne.mCoronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          uCoronaBanne.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, uCoronaBanne, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uCoronaBanne, "dataMap", new c().d(p0));
          p1.f(i, uCoronaBanne);
          return uCoronaBanne;
       }
    }
    public static void write(CoronaBannerFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaBannerContent$$Parcelable.write(p0.mCoronaBannerContent, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoronaBannerCommon$$Parcelable.write(p0.mCoronaBannerCommon, p1, p2, p3);
          CoronaInfo$$Parcelable.write(p0.mCoronaInfo, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaBannerFeed getParcel(){
       return this.coronaBannerFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaBannerFeed$$Parcelable.write(this.coronaBannerFeed$$0, p0, p1, new a());
    }
}
