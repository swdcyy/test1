package com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$$Parcelable$a;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class LiveAuthorHeadIdentityTag$$Parcelable implements Parcelable, d	// class@000af6
{
    public LiveAuthorHeadIdentityTag liveAuthorHeadIdentityTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveAuthorHeadIdentityTag$$Parcelable.CREATOR = new LiveAuthorHeadIdentityTag$$Parcelable$a();
    }
    public void LiveAuthorHeadIdentityTag$$Parcelable(LiveAuthorHeadIdentityTag p0){
       super();
       this.liveAuthorHeadIdentityTag$$0 = p0;
    }
    public static LiveAuthorHeadIdentityTag read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveAuthorHeadIdentityTag liveAuthorHe = new LiveAuthorHeadIdentityTag();
          p1.f(p1.g(), liveAuthorHe);
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
          liveAuthorHe.mIconUrls = uCDNUrlArray;
          liveAuthorHe.mTitle = p0.readString();
          p1.f(i, liveAuthorHe);
          return liveAuthorHe;
       }
    }
    public static void write(LiveAuthorHeadIdentityTag p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveAuthorHeadIdentityTag mIconUrls = p0.mIconUrls;
          if (mIconUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIconUrls.length);
             mIconUrls = p0.mIconUrls;
             i1 = mIconUrls.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mIconUrls[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveAuthorHeadIdentityTag getParcel(){
       return this.liveAuthorHeadIdentityTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveAuthorHeadIdentityTag$$Parcelable.write(this.liveAuthorHeadIdentityTag$$0, p0, p1, new a());
    }
}
