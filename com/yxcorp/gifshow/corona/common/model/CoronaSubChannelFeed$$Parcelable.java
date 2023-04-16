package com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelContent;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelContent$$Parcelable;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class CoronaSubChannelFeed$$Parcelable implements Parcelable, d	// class@001218
{
    public CoronaSubChannelFeed coronaSubChannelFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaSubChannelFeed$$Parcelable.CREATOR = new CoronaSubChannelFeed$$Parcelable$a();
    }
    public void CoronaSubChannelFeed$$Parcelable(CoronaSubChannelFeed p0){
       super();
       this.coronaSubChannelFeed$$0 = p0;
    }
    public static CoronaSubChannelFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaSubChannelFeed uCoronaSubCh = new CoronaSubChannelFeed();
          p1.f(p1.g(), uCoronaSubCh);
          uCoronaSubCh.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uCoronaSubCh.mCoronaSubChannelContent = CoronaSubChannelContent$$Parcelable.read(p0, p1);
          uCoronaSubCh.mCoronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          uCoronaSubCh.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          uCoronaSubCh.mCoronaSubChannelCommon = CoronaSubChannelCommon$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, uCoronaSubCh, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uCoronaSubCh, "dataMap", new c().d(p0));
          p1.f(i, uCoronaSubCh);
          return uCoronaSubCh;
       }
    }
    public static void write(CoronaSubChannelFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoronaSubChannelContent$$Parcelable.write(p0.mCoronaSubChannelContent, p1, p2, p3);
          CoronaInfo$$Parcelable.write(p0.mCoronaInfo, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          CoronaSubChannelCommon$$Parcelable.write(p0.mCoronaSubChannelCommon, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaSubChannelFeed getParcel(){
       return this.coronaSubChannelFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaSubChannelFeed$$Parcelable.write(this.coronaSubChannelFeed$$0, p0, p1, new a());
    }
}
