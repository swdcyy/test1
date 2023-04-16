package com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Feed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Feed$$Parcelable$a;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Feed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class InterestManagementV3Feed$$Parcelable implements Parcelable, d	// class@0015a2
{
    public InterestManagementV3Feed interestManagementV3Feed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       InterestManagementV3Feed$$Parcelable.CREATOR = new InterestManagementV3Feed$$Parcelable$a();
    }
    public void InterestManagementV3Feed$$Parcelable(InterestManagementV3Feed p0){
       super();
       this.interestManagementV3Feed$$0 = p0;
    }
    public static InterestManagementV3Feed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          InterestManagementV3Feed interestMana = new InterestManagementV3Feed();
          p1.f(p1.g(), interestMana);
          interestMana.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          interestMana.mInterestManagementV3Meta = p0.readSerializable();
          a.d(BaseFeed.class, interestMana, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, interestMana, "dataMap", new c().d(p0));
          p1.f(i, interestMana);
          return interestMana;
       }
    }
    public static void write(InterestManagementV3Feed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeSerializable(p0.mInterestManagementV3Meta);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public InterestManagementV3Feed getParcel(){
       return this.interestManagementV3Feed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       InterestManagementV3Feed$$Parcelable.write(this.interestManagementV3Feed$$0, p0, p1, new a());
    }
}
