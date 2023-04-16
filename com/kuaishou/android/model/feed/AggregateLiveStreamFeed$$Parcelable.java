package com.kuaishou.android.model.feed.AggregateLiveStreamFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.AggregateLiveStreamFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.AggregateLiveStreamFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class AggregateLiveStreamFeed$$Parcelable implements Parcelable, d	// class@000ad3
{
    public AggregateLiveStreamFeed aggregateLiveStreamFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       AggregateLiveStreamFeed$$Parcelable.CREATOR = new AggregateLiveStreamFeed$$Parcelable$a();
    }
    public void AggregateLiveStreamFeed$$Parcelable(AggregateLiveStreamFeed p0){
       super();
       this.aggregateLiveStreamFeed$$0 = p0;
    }
    public static AggregateLiveStreamFeed read(Parcel p0,a p1){
       LiveStreamFeed[] liveStreamFe;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          AggregateLiveStreamFeed uAggregateLi = new AggregateLiveStreamFeed();
          p1.f(p1.g(), uAggregateLi);
          uAggregateLi.mCursor = p0.readString();
          uAggregateLi.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          uAggregateLi.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          int i1 = p0.readInt();
          if (i1 < 0) {
             liveStreamFe = null;
          }else {
             LiveStreamFeed[] liveStreamFe1 = new LiveStreamFeed[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                liveStreamFe1[i2] = LiveStreamFeed$$Parcelable.read(p0, p1);
             }
             liveStreamFe = liveStreamFe1;
          }
          uAggregateLi.mLiveStreamFeeds = liveStreamFe;
          a.d(BaseFeed.class, uAggregateLi, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uAggregateLi, "dataMap", new c().d(p0));
          p1.f(i, uAggregateLi);
          return uAggregateLi;
       }
    }
    public static void write(AggregateLiveStreamFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCursor);
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          AggregateLiveStreamFeed mLiveStreamF = p0.mLiveStreamFeeds;
          if (mLiveStreamF == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLiveStreamF.length);
             mLiveStreamF = p0.mLiveStreamFeeds;
             i1 = mLiveStreamF.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                LiveStreamFeed$$Parcelable.write(mLiveStreamF[i2], p1, p2, p3);
             }
          }
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public AggregateLiveStreamFeed getParcel(){
       return this.aggregateLiveStreamFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       AggregateLiveStreamFeed$$Parcelable.write(this.aggregateLiveStreamFeed$$0, p0, p1, new a());
    }
}
