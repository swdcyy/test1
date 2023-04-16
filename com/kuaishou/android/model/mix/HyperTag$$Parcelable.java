package com.kuaishou.android.model.mix.HyperTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.HyperTag$$Parcelable$a;
import com.kuaishou.android.model.mix.HyperTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashMap;
import xwd.b;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.HyperTag$Icon;
import com.kuaishou.android.model.mix.HyperTag$Icon$$Parcelable;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.UserExtraInfo$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;

public class HyperTag$$Parcelable implements Parcelable, d	// class@000caa
{
    public HyperTag hyperTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HyperTag$$Parcelable.CREATOR = new HyperTag$$Parcelable$a();
    }
    public void HyperTag$$Parcelable(HyperTag p0){
       super();
       this.hyperTag$$0 = p0;
    }
    public static HyperTag read(Parcel p0,a p1){
       Map map;
       List list;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HyperTag hyperTag = new HyperTag();
          p1.f(p1.g(), hyperTag);
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          hyperTag.isAnimationShowed = b1;
          b1 = (p0.readInt() == b)? true: false;
          hyperTag.mShowArrow = b1;
          hyperTag.mPymlFollowingIntensifyType = p0.readInt();
          hyperTag.mActionUrl = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          hyperTag.mShowSeparator = b1;
          b1 = (p0.readInt() == b)? true: false;
          hyperTag.mEnableShowCommentPanel = b1;
          b1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (b1 < 0) {
             map = uCDNUrlArray;
          }else {
             map = new HashMap(b.a(b1));
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          hyperTag.mTrackMap = map;
          hyperTag.mTruncableText = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          hyperTag.mDisableTailSpace = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list = uCDNUrlArray;
          }else {
             list = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                list.add(p0.readString());
             }
          }
          hyperTag.mCommentIds = list;
          hyperTag.mHyperTagType = p0.readString();
          hyperTag.mUntruncableText = p0.readString();
          hyperTag.mExtraTagText = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          hyperTag.mUseRecoTextInfo = b1;
          if (p0.readInt() != b) {
             b = false;
          }
          hyperTag.mMustUseHyperTag = b;
          hyperTag.mCommentId = p0.readString();
          hyperTag.mNormalIcon = HyperTag$Icon$$Parcelable.read(p0, p1);
          hyperTag.mExtraData = UserExtraInfo$$Parcelable.read(p0, p1);
          b1 = p0.readInt();
          if (b1 >= 0) {
             uCDNUrlArray = new CDNUrl[b1];
             for (; i1 < b1; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          hyperTag.mIcons = uCDNUrlArray;
          p1.f(i, hyperTag);
          return hyperTag;
       }
    }
    public static void write(HyperTag p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.isAnimationShowed);
          p1.writeInt(p0.mShowArrow);
          p1.writeInt(p0.mPymlFollowingIntensifyType);
          p1.writeString(p0.mActionUrl);
          p1.writeInt(p0.mShowSeparator);
          p1.writeInt(p0.mEnableShowCommentPanel);
          HyperTag mTrackMap = p0.mTrackMap;
          if (mTrackMap == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTrackMap.size());
             iterator = p0.mTrackMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeString(p0.mTruncableText);
          p1.writeInt(p0.mDisableTailSpace);
          mTrackMap = p0.mCommentIds;
          if (mTrackMap == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTrackMap.size());
             iterator = p0.mCommentIds.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mHyperTagType);
          p1.writeString(p0.mUntruncableText);
          p1.writeString(p0.mExtraTagText);
          p1.writeInt(p0.mUseRecoTextInfo);
          p1.writeInt(p0.mMustUseHyperTag);
          p1.writeString(p0.mCommentId);
          HyperTag$Icon$$Parcelable.write(p0.mNormalIcon, p1, p2, p3);
          UserExtraInfo$$Parcelable.write(p0.mExtraData, p1, p2, p3);
          mTrackMap = p0.mIcons;
          if (mTrackMap == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTrackMap.length);
             p0 = p0.mIcons;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HyperTag getParcel(){
       return this.hyperTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HyperTag$$Parcelable.write(this.hyperTag$$0, p0, p1, new a());
    }
}
