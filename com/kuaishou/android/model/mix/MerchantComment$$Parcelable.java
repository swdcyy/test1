package com.kuaishou.android.model.mix.MerchantComment$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.MerchantComment$$Parcelable$a;
import com.kuaishou.android.model.mix.MerchantComment;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.MerchantComment$Card;
import com.kuaishou.android.model.mix.MerchantComment$Card$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class MerchantComment$$Parcelable implements Parcelable, d	// class@000d1b
{
    public MerchantComment merchantComment$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MerchantComment$$Parcelable.CREATOR = new MerchantComment$$Parcelable$a();
    }
    public void MerchantComment$$Parcelable(MerchantComment p0){
       super();
       this.merchantComment$$0 = p0;
    }
    public static MerchantComment read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MerchantComment merchantComm = new MerchantComment();
          p1.f(p1.g(), merchantComm);
          merchantComm.mShowCustomerMillis = p0.readLong();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(MerchantComment$Card$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          merchantComm.mCards = list;
          merchantComm.mCustomerToDisappearMillis = p0.readLong();
          p1.f(i, merchantComm);
          return merchantComm;
       }
    }
    public static void write(MerchantComment p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mShowCustomerMillis);
          MerchantComment mCards = p0.mCards;
          if (mCards == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCards.size());
             Iterator iterator = p0.mCards.iterator();
             while (iterator.hasNext()) {
                MerchantComment$Card$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeLong(p0.mCustomerToDisappearMillis);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MerchantComment getParcel(){
       return this.merchantComment$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MerchantComment$$Parcelable.write(this.merchantComment$$0, p0, p1, new a());
    }
}
