package com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta;
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

public class InterestManagementFeed$$Parcelable implements Parcelable, d	// class@00159d
{
    public InterestManagementFeed interestManagementFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       InterestManagementFeed$$Parcelable.CREATOR = new InterestManagementFeed$$Parcelable$a();
    }
    public void InterestManagementFeed$$Parcelable(InterestManagementFeed p0){
       super();
       this.interestManagementFeed$$0 = p0;
    }
    public static InterestManagementFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          InterestManagementFeed interestMana = new InterestManagementFeed();
          p1.f(p1.g(), interestMana);
          interestMana.mInterestManagementMeta = p0.readSerializable();
          interestMana.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, interestMana, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, interestMana, "dataMap", new c().d(p0));
          p1.f(i, interestMana);
          return interestMana;
       }
    }
    public static void write(InterestManagementFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mInterestManagementMeta);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public InterestManagementFeed getParcel(){
       return this.interestManagementFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       InterestManagementFeed$$Parcelable.write(this.interestManagementFeed$$0, p0, p1, new a());
    }
}