package com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed$$Parcelable$a;
import com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveStreamModel$$Parcelable;
import com.kwai.framework.model.ExtendableModelMap;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class LiveStreamNewStyleFeed$$Parcelable implements Parcelable, d	// class@001070
{
    public LiveStreamNewStyleFeed liveStreamNewStyleFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveStreamNewStyleFeed$$Parcelable.CREATOR = new LiveStreamNewStyleFeed$$Parcelable$a();
    }
    public void LiveStreamNewStyleFeed$$Parcelable(LiveStreamNewStyleFeed p0){
       super();
       this.liveStreamNewStyleFeed$$0 = p0;
    }
    public static LiveStreamNewStyleFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveStreamNewStyleFeed liveStreamNe = new LiveStreamNewStyleFeed();
          p1.f(p1.g(), liveStreamNe);
          liveStreamNe.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          liveStreamNe.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          liveStreamNe.mLiveStreamModel = LiveStreamModel$$Parcelable.read(p0, p1);
          liveStreamNe.mExtraMap = ExtendableModelMap$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, liveStreamNe, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, liveStreamNe, "dataMap", new c().d(p0));
          p1.f(i, liveStreamNe);
          return liveStreamNe;
       }
    }
    public static void write(LiveStreamNewStyleFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          LiveStreamModel$$Parcelable.write(p0.mLiveStreamModel, p1, p2, p3);
          ExtendableModelMap$$Parcelable.write(p0.mExtraMap, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveStreamNewStyleFeed getParcel(){
       return this.liveStreamNewStyleFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveStreamNewStyleFeed$$Parcelable.write(this.liveStreamNewStyleFeed$$0, p0, p1, new a());
    }
}
