package com.yxcorp.gifshow.model.SimpleMagicFace$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.SimpleMagicFace$$Parcelable$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class SimpleMagicFace$$Parcelable implements Parcelable, d	// class@001e90
{
    public SimpleMagicFace simpleMagicFace$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SimpleMagicFace$$Parcelable.CREATOR = new SimpleMagicFace$$Parcelable$a();
    }
    public void SimpleMagicFace$$Parcelable(SimpleMagicFace p0){
       super();
       this.simpleMagicFace$$0 = p0;
    }
    public static SimpleMagicFace read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SimpleMagicFace simpleMagicF = new SimpleMagicFace();
          p1.f(p1.g(), simpleMagicF);
          simpleMagicF.mUnSupportReason = p0.readString();
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          simpleMagicF.mImages = uCDNUrlArray;
          simpleMagicF.mVersion = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          simpleMagicF.mIsOffline = b;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          simpleMagicF.mHdImageUrls = list;
          simpleMagicF.magicFacePlayCount = p0.readLong();
          simpleMagicF.mId = p0.readString();
          simpleMagicF.mChildId = p0.readString();
          simpleMagicF.mImage = p0.readString();
          simpleMagicF.mResourceType = p0.readInt();
          simpleMagicF.mName = p0.readString();
          p1.f(i, simpleMagicF);
          return simpleMagicF;
       }
    }
    public static void write(SimpleMagicFace p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUnSupportReason);
          SimpleMagicFace mImages = p0.mImages;
          if (mImages == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImages.length);
             mImages = p0.mImages;
             int len = mImages.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mImages[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mVersion);
          p1.writeInt(p0.mIsOffline);
          mImages = p0.mHdImageUrls;
          if (mImages == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImages.size());
             Iterator iterator = p0.mHdImageUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeLong(p0.magicFacePlayCount);
          p1.writeString(p0.mId);
          p1.writeString(p0.mChildId);
          p1.writeString(p0.mImage);
          p1.writeInt(p0.mResourceType);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SimpleMagicFace getParcel(){
       return this.simpleMagicFace$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SimpleMagicFace$$Parcelable.write(this.simpleMagicFace$$0, p0, p1, new a());
    }
}
