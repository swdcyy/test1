package com.yxcorp.gifshow.model.MagicEmoji$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.MagicEmoji$$Parcelable$a;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class MagicEmoji$$Parcelable implements Parcelable, d	// class@001e48
{
    public MagicEmoji magicEmoji$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MagicEmoji$$Parcelable.CREATOR = new MagicEmoji$$Parcelable$a();
    }
    public void MagicEmoji$$Parcelable(MagicEmoji p0){
       super();
       this.magicEmoji$$0 = p0;
    }
    public static MagicEmoji read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       List list1;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MagicEmoji magicEmoji = new MagicEmoji();
          p1.f(p1.g(), magicEmoji);
          magicEmoji.mGifShowEndTime = p0.readLong();
          boolean b = false;
          int b1 = (p0.readInt() == 1)? true: false;
          magicEmoji.mNoMore = b1;
          b1 = p0.readInt();
          List list = null;
          if (b1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          magicEmoji.mGifIconUrls = uCDNUrlArray;
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          magicEmoji.mIconUrls = uCDNUrlArray;
          magicEmoji.mId = p0.readString();
          magicEmoji.mLoadIndex = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                list1.add(MagicEmoji$MagicFace$$Parcelable.read(p0, p1));
             }
          }
          magicEmoji.mMagicFaces = list1;
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                list.add(p0.readString());
             }
          }
          magicEmoji.mNextPageIds = list;
          if (p0.readInt() == 1) {
             b = true;
          }
          magicEmoji.mUseLocalPageLoad = b;
          magicEmoji.mPCursor = p0.readString();
          magicEmoji.mGifShowStartTime = p0.readLong();
          magicEmoji.mName = p0.readString();
          magicEmoji.mTabType = p0.readInt();
          magicEmoji.mGifMaxShowCount = p0.readInt();
          p1.f(i, magicEmoji);
          return magicEmoji;
       }
    }
    public static void write(MagicEmoji p0,Parcel p1,int p2,a p3){
       int len;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mGifShowEndTime);
          p1.writeInt(p0.mNoMore);
          MagicEmoji mGifIconUrls = p0.mGifIconUrls;
          boolean b = false;
          if (mGifIconUrls == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mGifIconUrls.length);
             mGifIconUrls = p0.mGifIconUrls;
             len = mGifIconUrls.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(mGifIconUrls[i1], p1, p2, p3);
             }
          }
          mGifIconUrls = p0.mIconUrls;
          if (mGifIconUrls == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mGifIconUrls.length);
             mGifIconUrls = p0.mIconUrls;
             len = mGifIconUrls.length;
             for (; b < len; b = b + 1) {
                CDNUrl$$Parcelable.write(mGifIconUrls[b], p1, p2, p3);
             }
          }
          p1.writeString(p0.mId);
          p1.writeInt(p0.mLoadIndex);
          mGifIconUrls = p0.mMagicFaces;
          if (mGifIconUrls == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mGifIconUrls.size());
             Iterator iterator1 = p0.mMagicFaces.iterator();
             while (iterator1.hasNext()) {
                MagicEmoji$MagicFace$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          MagicEmoji mNextPageIds = p0.mNextPageIds;
          if (mNextPageIds == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mNextPageIds.size());
             Iterator iterator = p0.mNextPageIds.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeInt(p0.mUseLocalPageLoad);
          p1.writeString(p0.mPCursor);
          p1.writeLong(p0.mGifShowStartTime);
          p1.writeString(p0.mName);
          p1.writeInt(p0.mTabType);
          p1.writeInt(p0.mGifMaxShowCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MagicEmoji getParcel(){
       return this.magicEmoji$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MagicEmoji$$Parcelable.write(this.magicEmoji$$0, p0, p1, new a());
    }
}
