package com.kwai.framework.model.feed.UnknownFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.feed.UnknownFeed$$Parcelable$a;
import com.kwai.framework.model.feed.UnknownFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class UnknownFeed$$Parcelable implements Parcelable, d	// class@0016b8
{
    public UnknownFeed unknownFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UnknownFeed$$Parcelable.CREATOR = new UnknownFeed$$Parcelable$a();
    }
    public void UnknownFeed$$Parcelable(UnknownFeed p0){
       super();
       this.unknownFeed$$0 = p0;
    }
    public static UnknownFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          UnknownFeed unknownFeed = new UnknownFeed();
          p1.f(p1.g(), unknownFeed);
          a.d(BaseFeed.class, unknownFeed, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, unknownFeed, "dataMap", new c().d(p0));
          p1.f(i, unknownFeed);
          return unknownFeed;
       }
    }
    public static void write(UnknownFeed p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UnknownFeed getParcel(){
       return this.unknownFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UnknownFeed$$Parcelable.write(this.unknownFeed$$0, p0, p1, new a());
    }
}
