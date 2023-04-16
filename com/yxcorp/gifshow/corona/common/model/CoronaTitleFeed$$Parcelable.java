package com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent$$Parcelable;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class CoronaTitleFeed$$Parcelable implements Parcelable, d	// class@001221
{
    public CoronaTitleFeed coronaTitleFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaTitleFeed$$Parcelable.CREATOR = new CoronaTitleFeed$$Parcelable$a();
    }
    public void CoronaTitleFeed$$Parcelable(CoronaTitleFeed p0){
       super();
       this.coronaTitleFeed$$0 = p0;
    }
    public static CoronaTitleFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaTitleFeed uCoronaTitle = new CoronaTitleFeed();
          p1.f(p1.g(), uCoronaTitle);
          uCoronaTitle.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uCoronaTitle.mTitleMeta = CoronaTitleContent$$Parcelable.read(p0, p1);
          uCoronaTitle.mCoronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, uCoronaTitle, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uCoronaTitle, "dataMap", new c().d(p0));
          p1.f(i, uCoronaTitle);
          return uCoronaTitle;
       }
    }
    public static void write(CoronaTitleFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoronaTitleContent$$Parcelable.write(p0.mTitleMeta, p1, p2, p3);
          CoronaInfo$$Parcelable.write(p0.mCoronaInfo, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaTitleFeed getParcel(){
       return this.coronaTitleFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaTitleFeed$$Parcelable.write(this.coronaTitleFeed$$0, p0, p1, new a());
    }
}
