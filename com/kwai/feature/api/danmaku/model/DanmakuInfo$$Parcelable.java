package com.kwai.feature.api.danmaku.model.DanmakuInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.danmaku.model.DanmakuInfo$$Parcelable$a;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.feature.api.danmaku.model.DanmakuInputHint;
import com.kwai.feature.api.danmaku.model.DanmakuShowDirection;
import java.lang.Class;
import java.lang.Enum;
import com.kwai.feature.api.danmaku.model.PhotoDanmakuGuideConfig;
import java.util.ArrayList;
import com.kwai.feature.api.danmaku.model.DanmakuWishActivityConfig;
import com.kwai.feature.api.danmaku.model.DanmakuShowType;
import java.util.List;
import java.util.Iterator;

public class DanmakuInfo$$Parcelable implements Parcelable, d	// class@000e78
{
    public DanmakuInfo danmakuInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DanmakuInfo$$Parcelable.CREATOR = new DanmakuInfo$$Parcelable$a();
    }
    public void DanmakuInfo$$Parcelable(DanmakuInfo p0){
       super();
       this.danmakuInfo$$0 = p0;
    }
    public static DanmakuInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DanmakuInfo uDanmakuInfo = new DanmakuInfo();
          p1.f(p1.g(), uDanmakuInfo);
          uDanmakuInfo.mDanmakuInputHint = p0.readSerializable();
          uDanmakuInfo.mCNY2023Preset = p0.readString();
          uDanmakuInfo.mDisableReasonTip = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uDanmakuInfo.mHasMask = b1;
          uDanmakuInfo.mDefaultDanmaku = p0.readString();
          uDanmakuInfo.mDanmakuCount = p0.readInt();
          uDanmakuInfo.mDisableReasoneyKey = p0.readString();
          String str = p0.readString();
          DanmakuShowType uDanmakuShow = null;
          DanmakuShowDirection uDanmakuShow1 = (str == null)? uDanmakuShow: Enum.valueOf(DanmakuShowDirection.class, str);
          uDanmakuInfo.mDanmakuShowDirection = uDanmakuShow1;
          uDanmakuInfo.mActivityInfoKey = p0.readString();
          uDanmakuInfo.mPhotoDanmakuGuideConfig = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          uDanmakuInfo.mHasDanmaku = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDanmakuInfo.mDisablePost = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDanmakuInfo.mPhotoDanmakuGuide = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDanmakuInfo.mHasDanmakuMaskNew = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list = uDanmakuShow;
          }else {
             list = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                list.add(p0.readSerializable());
             }
          }
          uDanmakuInfo.mDanmakuWishIconList = list;
          b1 = (p0.readInt() == 1)? true: false;
          uDanmakuInfo.mPaster = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uDanmakuInfo.mPhotoDanmakuCloseGuide = b;
          String str1 = p0.readString();
          if (str1 != null) {
             uDanmakuShow = Enum.valueOf(DanmakuShowType.class, str1);
          }
          uDanmakuInfo.mDanmakuShowType = uDanmakuShow;
          p1.f(i, uDanmakuInfo);
          return uDanmakuInfo;
       }
    }
    public static void write(DanmakuInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       int i = -1;
       if (p2 != i) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mDanmakuInputHint);
          p1.writeString(p0.mCNY2023Preset);
          p1.writeString(p0.mDisableReasonTip);
          p1.writeInt(p0.mHasMask);
          p1.writeString(p0.mDefaultDanmaku);
          p1.writeInt(p0.mDanmakuCount);
          p1.writeString(p0.mDisableReasoneyKey);
          DanmakuInfo mDanmakuShow = p0.mDanmakuShowDirection;
          String str = null;
          String str1 = (mDanmakuShow == null)? str: mDanmakuShow.name();
          p1.writeString(str1);
          p1.writeString(p0.mActivityInfoKey);
          p1.writeSerializable(p0.mPhotoDanmakuGuideConfig);
          p1.writeInt(p0.mHasDanmaku);
          p1.writeInt(p0.mDisablePost);
          p1.writeInt(p0.mPhotoDanmakuGuide);
          p1.writeInt(p0.mHasDanmakuMaskNew);
          mDanmakuShow = p0.mDanmakuWishIconList;
          if (mDanmakuShow == null) {
             p1.writeInt(i);
          }else {
             p1.writeInt(mDanmakuShow.size());
             Iterator iterator = p0.mDanmakuWishIconList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mPaster);
          p1.writeInt(p0.mPhotoDanmakuCloseGuide);
          p0 = p0.mDanmakuShowType;
          if (p0 != null) {
             str = p0.name();
          }
          p1.writeString(str);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DanmakuInfo getParcel(){
       return this.danmakuInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DanmakuInfo$$Parcelable.write(this.danmakuInfo$$0, p0, p1, new a());
    }
}
