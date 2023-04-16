package com.yxcorp.gifshow.detail.model.meta.InterestLabelsFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsFeed$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsMeta;
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

public class InterestLabelsFeed$$Parcelable implements Parcelable, d	// class@001598
{
    public InterestLabelsFeed interestLabelsFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       InterestLabelsFeed$$Parcelable.CREATOR = new InterestLabelsFeed$$Parcelable$a();
    }
    public void InterestLabelsFeed$$Parcelable(InterestLabelsFeed p0){
       super();
       this.interestLabelsFeed$$0 = p0;
    }
    public static InterestLabelsFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          InterestLabelsFeed interestLabe = new InterestLabelsFeed();
          p1.f(p1.g(), interestLabe);
          interestLabe.mInterestLabelsMeta = p0.readSerializable();
          interestLabe.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, interestLabe, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, interestLabe, "dataMap", new c().d(p0));
          p1.f(i, interestLabe);
          return interestLabe;
       }
    }
    public static void write(InterestLabelsFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mInterestLabelsMeta);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public InterestLabelsFeed getParcel(){
       return this.interestLabelsFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       InterestLabelsFeed$$Parcelable.write(this.interestLabelsFeed$$0, p0, p1, new a());
    }
}
