package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class PadCoronaRankingListFeed$$Parcelable implements Parcelable, d	// class@001235
{
    public PadCoronaRankingListFeed padCoronaRankingListFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PadCoronaRankingListFeed$$Parcelable.CREATOR = new PadCoronaRankingListFeed$$Parcelable$a();
    }
    public void PadCoronaRankingListFeed$$Parcelable(PadCoronaRankingListFeed p0){
       super();
       this.padCoronaRankingListFeed$$0 = p0;
    }
    public static PadCoronaRankingListFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PadCoronaRankingListFeed padCoronaRan = new PadCoronaRankingListFeed();
          p1.f(p1.g(), padCoronaRan);
          padCoronaRan.coronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          padCoronaRan.rankingListMeta = PadCoronaRankingListMeta$$Parcelable.read(p0, p1);
          padCoronaRan.commonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, padCoronaRan, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, padCoronaRan, "dataMap", new c().d(p0));
          p1.f(i, padCoronaRan);
          return padCoronaRan;
       }
    }
    public static void write(PadCoronaRankingListFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaInfo$$Parcelable.write(p0.coronaInfo, p1, p2, p3);
          PadCoronaRankingListMeta$$Parcelable.write(p0.rankingListMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.commonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PadCoronaRankingListFeed getParcel(){
       return this.padCoronaRankingListFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PadCoronaRankingListFeed$$Parcelable.write(this.padCoronaRankingListFeed$$0, p0, p1, new a());
    }
}
