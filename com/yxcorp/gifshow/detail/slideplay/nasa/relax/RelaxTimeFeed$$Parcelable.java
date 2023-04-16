package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeMeta;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeMeta$$Parcelable;
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

public class RelaxTimeFeed$$Parcelable implements Parcelable, d	// class@0017b3
{
    public RelaxTimeFeed relaxTimeFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RelaxTimeFeed$$Parcelable.CREATOR = new RelaxTimeFeed$$Parcelable$a();
    }
    public void RelaxTimeFeed$$Parcelable(RelaxTimeFeed p0){
       super();
       this.relaxTimeFeed$$0 = p0;
    }
    public static RelaxTimeFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RelaxTimeFeed relaxTimeFee = new RelaxTimeFeed();
          p1.f(p1.g(), relaxTimeFee);
          relaxTimeFee.mRelaxTimeMeta = RelaxTimeMeta$$Parcelable.read(p0, p1);
          relaxTimeFee.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, relaxTimeFee, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, relaxTimeFee, "dataMap", new c().d(p0));
          p1.f(i, relaxTimeFee);
          return relaxTimeFee;
       }
    }
    public static void write(RelaxTimeFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          RelaxTimeMeta$$Parcelable.write(p0.mRelaxTimeMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RelaxTimeFeed getParcel(){
       return this.relaxTimeFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RelaxTimeFeed$$Parcelable.write(this.relaxTimeFeed$$0, p0, p1, new a());
    }
}
