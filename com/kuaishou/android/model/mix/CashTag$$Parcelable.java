package com.kuaishou.android.model.mix.CashTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CashTag$$Parcelable$a;
import com.kuaishou.android.model.mix.CashTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashMap;
import xwd.b;
import com.kuaishou.android.model.mix.CashTag$Icon;
import com.kuaishou.android.model.mix.CashTag$Icon$$Parcelable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class CashTag$$Parcelable implements Parcelable, d	// class@000bd7
{
    public CashTag cashTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CashTag$$Parcelable.CREATOR = new CashTag$$Parcelable$a();
    }
    public void CashTag$$Parcelable(CashTag p0){
       super();
       this.cashTag$$0 = p0;
    }
    public static CashTag read(Parcel p0,a p1){
       Map map;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CashTag uCashTag = new CashTag();
          p1.f(p1.g(), uCashTag);
          uCashTag.mBackground = p0.readString();
          uCashTag.mLink = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             map = null;
          }else {
             HashMap hashMap = new HashMap(b.a(i1));
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
             map = hashMap;
          }
          uCashTag.tack = map;
          uCashTag.mSuffix = CashTag$Icon$$Parcelable.read(p0, p1);
          uCashTag.mId = p0.readString();
          uCashTag.mPaddingLeft = p0.readFloat();
          uCashTag.mPaddingRight = p0.readFloat();
          uCashTag.mTextColor = p0.readString();
          uCashTag.mShowText = p0.readString();
          uCashTag.mType = p0.readInt();
          uCashTag.mPrefix = CashTag$Icon$$Parcelable.read(p0, p1);
          p1.f(i, uCashTag);
          return uCashTag;
       }
    }
    public static void write(CashTag p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mBackground);
          p1.writeString(p0.mLink);
          CashTag tack = p0.tack;
          if (tack == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(tack.size());
             Iterator iterator = p0.tack.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          CashTag$Icon$$Parcelable.write(p0.mSuffix, p1, p2, p3);
          p1.writeString(p0.mId);
          p1.writeFloat(p0.mPaddingLeft);
          p1.writeFloat(p0.mPaddingRight);
          p1.writeString(p0.mTextColor);
          p1.writeString(p0.mShowText);
          p1.writeInt(p0.mType);
          CashTag$Icon$$Parcelable.write(p0.mPrefix, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CashTag getParcel(){
       return this.cashTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CashTag$$Parcelable.write(this.cashTag$$0, p0, p1, new a());
    }
}
