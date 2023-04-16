package com.kuaishou.android.model.mix.CashTag$Icon$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CashTag$Icon$$Parcelable$a;
import com.kuaishou.android.model.mix.CashTag$Icon;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class CashTag$Icon$$Parcelable implements Parcelable, d	// class@000bd9
{
    public CashTag$Icon icon$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CashTag$Icon$$Parcelable.CREATOR = new CashTag$Icon$$Parcelable$a();
    }
    public void CashTag$Icon$$Parcelable(CashTag$Icon p0){
       super();
       this.icon$$0 = p0;
    }
    public static CashTag$Icon read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CashTag$Icon icon = new CashTag$Icon();
          p1.f(p1.g(), icon);
          icon.mUrl = CDNUrl$$Parcelable.read(p0, p1);
          icon.mAspectRatio = p0.readFloat();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          icon.mCdnUrls = uCDNUrlArray;
          icon.mTxtHeightRatio = p0.readFloat();
          p1.f(i, icon);
          return icon;
       }
    }
    public static void write(CashTag$Icon p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CDNUrl$$Parcelable.write(p0.mUrl, p1, p2, p3);
          p1.writeFloat(p0.mAspectRatio);
          CashTag$Icon mCdnUrls = p0.mCdnUrls;
          if (mCdnUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCdnUrls.length);
             mCdnUrls = p0.mCdnUrls;
             i1 = mCdnUrls.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mCdnUrls[i2], p1, p2, p3);
             }
          }
          p1.writeFloat(p0.mTxtHeightRatio);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CashTag$Icon getParcel(){
       return this.icon$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CashTag$Icon$$Parcelable.write(this.icon$$0, p0, p1, new a());
    }
}
