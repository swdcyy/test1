package com.kuaishou.android.model.feed.HotInsertFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.HotInsertFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.HotInsertFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.entity.HotInsertType;
import java.lang.Class;
import java.lang.Enum;
import com.kwai.framework.model.feed.BaseFeed;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class HotInsertFeed$$Parcelable implements Parcelable, d	// class@000aea
{
    public HotInsertFeed hotInsertFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotInsertFeed$$Parcelable.CREATOR = new HotInsertFeed$$Parcelable$a();
    }
    public void HotInsertFeed$$Parcelable(HotInsertFeed p0){
       super();
       this.hotInsertFeed$$0 = p0;
    }
    public static HotInsertFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HotInsertFeed hotInsertFee = new HotInsertFeed();
          p1.f(p1.g(), hotInsertFee);
          hotInsertFee.mUser = new a().c(p0);
          hotInsertFee.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          hotInsertFee.mId = p0.readString();
          String str = p0.readString();
          HotInsertType hotInsertTyp = (str == null)? null: Enum.valueOf(HotInsertType.class, str);
          hotInsertFee.mType = hotInsertTyp;
          a.d(BaseFeed.class, hotInsertFee, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, hotInsertFee, "dataMap", new c().d(p0));
          p1.f(i, hotInsertFee);
          return hotInsertFee;
       }
    }
    public static void write(HotInsertFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          new a().d(p0.mUser, p1);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(p0.mId);
          HotInsertFeed mType = p0.mType;
          String str = (mType == null)? null: mType.name();
          p1.writeString(str);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HotInsertFeed getParcel(){
       return this.hotInsertFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotInsertFeed$$Parcelable.write(this.hotInsertFeed$$0, p0, p1, new a());
    }
}
