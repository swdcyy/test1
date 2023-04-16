package com.yxcorp.gifshow.share.model.guide.ShareGuide$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.share.model.guide.ShareGuide$$Parcelable$a;
import com.yxcorp.gifshow.share.model.guide.ShareGuide;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashMap;
import xwd.b;
import java.io.Serializable;
import com.kuaishou.android.model.mix.PhotoGuide;
import com.yxcorp.gifshow.share.model.guide.ShareFloatGuide;
import com.yxcorp.gifshow.share.model.guide.ShareFloatGuide$$Parcelable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class ShareGuide$$Parcelable implements Parcelable, d	// class@001be7
{
    public ShareGuide shareGuide$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareGuide$$Parcelable.CREATOR = new ShareGuide$$Parcelable$a();
    }
    public void ShareGuide$$Parcelable(ShareGuide p0){
       super();
       this.shareGuide$$0 = p0;
    }
    public static ShareGuide read(Parcel p0,a p1){
       Map map;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ShareGuide shareGuide = new ShareGuide();
          p1.f(p1.g(), shareGuide);
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             map = null;
          }else {
             HashMap hashMap = new HashMap(b.a(i1));
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                hashMap.put(p0.readString(), p0.readSerializable());
             }
             map = hashMap;
          }
          shareGuide.mGuides = map;
          shareGuide.mTextDisplayDurationInSeconds = p0.readInt();
          shareGuide.mShareFloatGuide = ShareFloatGuide$$Parcelable.read(p0, p1);
          shareGuide.mPlayTimes = p0.readInt();
          shareGuide.mMinPlayDurationInSeconds = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          shareGuide.mPhotoShareGuide = b;
          p1.f(i, shareGuide);
          return shareGuide;
       }
    }
    public static void write(ShareGuide p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          ShareGuide mGuides = p0.mGuides;
          if (mGuides == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mGuides.size());
             Iterator iterator = p0.mGuides.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeSerializable(uEntry.getValue());
             }
          }
          p1.writeInt(p0.mTextDisplayDurationInSeconds);
          ShareFloatGuide$$Parcelable.write(p0.mShareFloatGuide, p1, p2, p3);
          p1.writeInt(p0.mPlayTimes);
          p1.writeInt(p0.mMinPlayDurationInSeconds);
          p1.writeInt(p0.mPhotoShareGuide);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareGuide getParcel(){
       return this.shareGuide$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareGuide$$Parcelable.write(this.shareGuide$$0, p0, p1, new a());
    }
}
