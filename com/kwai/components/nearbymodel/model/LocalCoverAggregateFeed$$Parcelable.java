package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$$Parcelable$a;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import java.io.Serializable;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class LocalCoverAggregateFeed$$Parcelable implements Parcelable, d	// class@000c70
{
    public LocalCoverAggregateFeed localCoverAggregateFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LocalCoverAggregateFeed$$Parcelable.CREATOR = new LocalCoverAggregateFeed$$Parcelable$a();
    }
    public void LocalCoverAggregateFeed$$Parcelable(LocalCoverAggregateFeed p0){
       super();
       this.localCoverAggregateFeed$$0 = p0;
    }
    public static LocalCoverAggregateFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LocalCoverAggregateFeed localCoverAg = new LocalCoverAggregateFeed();
          p1.f(p1.g(), localCoverAg);
          localCoverAg.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          localCoverAg.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          localCoverAg.mCoverAggregateMeta = p0.readSerializable();
          a.d(BaseFeed.class, localCoverAg, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, localCoverAg, "dataMap", new c().d(p0));
          p1.f(i, localCoverAg);
          return localCoverAg;
       }
    }
    public static void write(LocalCoverAggregateFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeSerializable(p0.mCoverAggregateMeta);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LocalCoverAggregateFeed getParcel(){
       return this.localCoverAggregateFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LocalCoverAggregateFeed$$Parcelable.write(this.localCoverAggregateFeed$$0, p0, p1, new a());
    }
}
