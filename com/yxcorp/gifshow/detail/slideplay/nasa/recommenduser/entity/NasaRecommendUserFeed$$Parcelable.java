package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
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

public class NasaRecommendUserFeed$$Parcelable implements Parcelable, d	// class@00175f
{
    public NasaRecommendUserFeed nasaRecommendUserFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NasaRecommendUserFeed$$Parcelable.CREATOR = new NasaRecommendUserFeed$$Parcelable$a();
    }
    public void NasaRecommendUserFeed$$Parcelable(NasaRecommendUserFeed p0){
       super();
       this.nasaRecommendUserFeed$$0 = p0;
    }
    public static NasaRecommendUserFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NasaRecommendUserFeed nasaRecommen = new NasaRecommendUserFeed();
          p1.f(p1.g(), nasaRecommen);
          nasaRecommen.mRecommendUserMeta = p0.readSerializable();
          nasaRecommen.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, nasaRecommen, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, nasaRecommen, "dataMap", new c().d(p0));
          p1.f(i, nasaRecommen);
          return nasaRecommen;
       }
    }
    public static void write(NasaRecommendUserFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mRecommendUserMeta);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NasaRecommendUserFeed getParcel(){
       return this.nasaRecommendUserFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NasaRecommendUserFeed$$Parcelable.write(this.nasaRecommendUserFeed$$0, p0, p1, new a());
    }
}
