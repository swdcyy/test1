package com.kuaishou.android.model.feed.MiniAppFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.MiniAppFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.MiniAppFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.mix.MiniAppMeta;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kuaishou.android.model.mix.LogParam;
import com.kuaishou.android.model.mix.LogParam$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class MiniAppFeed$$Parcelable implements Parcelable, d	// class@000b21
{
    public MiniAppFeed miniAppFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MiniAppFeed$$Parcelable.CREATOR = new MiniAppFeed$$Parcelable$a();
    }
    public void MiniAppFeed$$Parcelable(MiniAppFeed p0){
       super();
       this.miniAppFeed$$0 = p0;
    }
    public static MiniAppFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MiniAppFeed miniAppFeed = new MiniAppFeed();
          p1.f(p1.g(), miniAppFeed);
          miniAppFeed.mMiniAppMeta = p0.readSerializable();
          miniAppFeed.mUser = new a().c(p0);
          miniAppFeed.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          miniAppFeed.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          miniAppFeed.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          miniAppFeed.mLogParam = LogParam$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, miniAppFeed, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, miniAppFeed, "dataMap", new c().d(p0));
          p1.f(i, miniAppFeed);
          return miniAppFeed;
       }
    }
    public static void write(MiniAppFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mMiniAppMeta);
          new a().d(p0.mUser, p1);
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          LogParam$$Parcelable.write(p0.mLogParam, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MiniAppFeed getParcel(){
       return this.miniAppFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MiniAppFeed$$Parcelable.write(this.miniAppFeed$$0, p0, p1, new a());
    }
}
