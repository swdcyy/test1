package com.kuaishou.android.model.feed.ContentAggregateWeakFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.mix.AggregateV6Model;
import com.kuaishou.android.model.mix.AggregateV6Model$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed$AggregateContentInfo;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kuaishou.android.model.mix.ContentAggregateWeakMeta;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class ContentAggregateWeakFeed$$Parcelable implements Parcelable, d	// class@000adb
{
    public ContentAggregateWeakFeed contentAggregateWeakFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ContentAggregateWeakFeed$$Parcelable.CREATOR = new ContentAggregateWeakFeed$$Parcelable$a();
    }
    public void ContentAggregateWeakFeed$$Parcelable(ContentAggregateWeakFeed p0){
       super();
       this.contentAggregateWeakFeed$$0 = p0;
    }
    public static ContentAggregateWeakFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ContentAggregateWeakFeed uContentAggr = new ContentAggregateWeakFeed();
          p1.f(p1.g(), uContentAggr);
          uContentAggr.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          uContentAggr.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uContentAggr.mAggregateV6Model = AggregateV6Model$$Parcelable.read(p0, p1);
          uContentAggr.mRightBottomInfo = p0.readSerializable();
          uContentAggr.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          uContentAggr.mRankInfo = p0.readSerializable();
          a.d(BaseFeed.class, uContentAggr, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uContentAggr, "dataMap", new c().d(p0));
          p1.f(i, uContentAggr);
          return uContentAggr;
       }
    }
    public static void write(ContentAggregateWeakFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          AggregateV6Model$$Parcelable.write(p0.mAggregateV6Model, p1, p2, p3);
          p1.writeSerializable(p0.mRightBottomInfo);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          p1.writeSerializable(p0.mRankInfo);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ContentAggregateWeakFeed getParcel(){
       return this.contentAggregateWeakFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ContentAggregateWeakFeed$$Parcelable.write(this.contentAggregateWeakFeed$$0, p0, p1, new a());
    }
}