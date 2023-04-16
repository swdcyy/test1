package com.kwai.emotionsdk.bean.EmotionInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.emotionsdk.bean.EmotionInfo$$Parcelable$a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class EmotionInfo$$Parcelable implements Parcelable, d	// class@000d79
{
    public EmotionInfo emotionInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       EmotionInfo$$Parcelable.CREATOR = new EmotionInfo$$Parcelable$a();
    }
    public void EmotionInfo$$Parcelable(EmotionInfo p0){
       super();
       this.emotionInfo$$0 = p0;
    }
    public static EmotionInfo read(Parcel p0,a p1){
       List list1;
       ArrayList uArrayList;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          EmotionInfo uEmotionInfo = new EmotionInfo();
          p1.f(p1.g(), uEmotionInfo);
          uEmotionInfo.mPrice = p0.readInt();
          uEmotionInfo.mPayTime = p0.readLong();
          uEmotionInfo.mWidth = p0.readInt();
          uEmotionInfo.mBizType = p0.readInt();
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uEmotionInfo.mHidePanel = b;
          uEmotionInfo.mId = p0.readString();
          uEmotionInfo.mType = p0.readInt();
          uEmotionInfo.mHeight = p0.readInt();
          uEmotionInfo.mPayStatus = p0.readInt();
          uEmotionInfo.mEmotionName = p0.readString();
          int i2 = p0.readInt();
          List list = null;
          if (i2 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i2);
             for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          uEmotionInfo.mEmotionImageBigUrl = list1;
          uEmotionInfo.mEmotionPackageId = p0.readString();
          uEmotionInfo.mMessage = p0.readString();
          i2 = p0.readInt();
          if (i2 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i2);
             for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          uEmotionInfo.mEmotionImageSmallUrl = list1;
          i2 = p0.readInt();
          if (i2 >= 0) {
             list = new ArrayList(i2);
             for (; i1 < i2; i1 = i1 + 1) {
                list.add(EmotionInfo$EmotionCode$$Parcelable.read(p0, p1));
             }
          }
          uEmotionInfo.mEmotionCode = list;
          uEmotionInfo.mPayType = p0.readInt();
          p1.f(i, uEmotionInfo);
          return uEmotionInfo;
       }
    }
    public static void write(EmotionInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPrice);
          p1.writeLong(p0.mPayTime);
          p1.writeInt(p0.mWidth);
          p1.writeInt(p0.mBizType);
          p1.writeInt(p0.mHidePanel);
          p1.writeString(p0.mId);
          p1.writeInt(p0.mType);
          p1.writeInt(p0.mHeight);
          p1.writeInt(p0.mPayStatus);
          p1.writeString(p0.mEmotionName);
          EmotionInfo mEmotionImag = p0.mEmotionImageBigUrl;
          if (mEmotionImag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mEmotionImag.size());
             iterator = p0.mEmotionImageBigUrl.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mEmotionPackageId);
          p1.writeString(p0.mMessage);
          mEmotionImag = p0.mEmotionImageSmallUrl;
          if (mEmotionImag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mEmotionImag.size());
             iterator = p0.mEmotionImageSmallUrl.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mEmotionImag = p0.mEmotionCode;
          if (mEmotionImag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mEmotionImag.size());
             iterator = p0.mEmotionCode.iterator();
             while (iterator.hasNext()) {
                EmotionInfo$EmotionCode$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mPayType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public EmotionInfo getParcel(){
       return this.emotionInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       EmotionInfo$$Parcelable.write(this.emotionInfo$$0, p0, p1, new a());
    }
}
