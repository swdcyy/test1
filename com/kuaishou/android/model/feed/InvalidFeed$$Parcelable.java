package com.kuaishou.android.model.feed.InvalidFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.InvalidFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.InvalidFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoMeta$$Parcelable;
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

public class InvalidFeed$$Parcelable implements Parcelable, d	// class@000af3
{
    public InvalidFeed invalidFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       InvalidFeed$$Parcelable.CREATOR = new InvalidFeed$$Parcelable$a();
    }
    public void InvalidFeed$$Parcelable(InvalidFeed p0){
       super();
       this.invalidFeed$$0 = p0;
    }
    public static InvalidFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          InvalidFeed invalidFeed = new InvalidFeed();
          p1.f(p1.g(), invalidFeed);
          invalidFeed.mUser = new a().c(p0);
          invalidFeed.mPhotoMeta = PhotoMeta$$Parcelable.read(p0, p1);
          invalidFeed.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, invalidFeed, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, invalidFeed, "dataMap", new c().d(p0));
          p1.f(i, invalidFeed);
          return invalidFeed;
       }
    }
    public static void write(InvalidFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          new a().d(p0.mUser, p1);
          PhotoMeta$$Parcelable.write(p0.mPhotoMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public InvalidFeed getParcel(){
       return this.invalidFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       InvalidFeed$$Parcelable.write(this.invalidFeed$$0, p0, p1, new a());
    }
}
