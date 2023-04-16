package com.kwai.feature.api.corona.player.model.LandscapeParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.player.model.LandscapeParam$$Parcelable$a;
import com.kwai.feature.api.corona.player.model.LandscapeParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.feature.api.corona.player.model.LandscapeTubeSerialEvent;
import java.lang.Class;
import org.parceler.a;
import java.lang.ClassLoader;
import com.kwai.feature.api.corona.player.model.PausePageState;
import java.lang.Boolean;
import java.util.HashSet;
import java.lang.Integer;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo$$Parcelable;
import java.lang.Float;
import com.kwai.feature.api.corona.player.model.LandscapePlcClickEvent;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse;
import java.util.ArrayList;
import java.lang.Long;
import com.kwai.feature.api.corona.player.model.CoronaVipState;
import org.parceler.a$c;
import java.util.Iterator;
import java.util.Set;

public class LandscapeParam$$Parcelable implements Parcelable, d	// class@000e21
{
    public LandscapeParam landscapeParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LandscapeParam$$Parcelable.CREATOR = new LandscapeParam$$Parcelable$a();
    }
    public void LandscapeParam$$Parcelable(LandscapeParam p0){
       super();
       this.landscapeParam$$0 = p0;
    }
    public static LandscapeParam read(Parcel p0,a p1){
       HashSet hashSet1;
       ArrayList uArrayList;
       HashSet hashSet2;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LandscapeParam landscapePar = new LandscapeParam();
          p1.f(p1.g(), landscapePar);
          a.d(LandscapeParam.class, landscapePar, "mOutputTubeSerialEvent", p0.readSerializable());
          a.d(LandscapeParam.class, landscapePar, "mPausePageState", p0.readParcelable(LandscapeParam$$Parcelable.class.getClassLoader()));
          a.d(LandscapeParam.class, landscapePar, "mEnterLandscapeMode", p0.readString());
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mImageDetailOpen", Boolean.valueOf(b1));
          b1 = p0.readInt();
          HashSet hashSet = null;
          if (b1 < 0) {
             hashSet1 = hashSet;
          }else {
             hashSet1 = new HashSet(b1);
             for (i3 = 0; i3 < b1; i3 = i3 + 1) {
                hashSet1.add(p0.readString());
             }
          }
          a.d(LandscapeParam.class, landscapePar, "mVideoHasShowedFinRecoPanelIdSet", hashSet1);
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mJoySoundIsOpen", Boolean.valueOf(b1));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mSyncItemInflateSuccess", Boolean.valueOf(b1));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mManualSharePlayer", Boolean.valueOf(b1));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mSyncPlayState", Boolean.valueOf(b1));
          a.d(LandscapeParam.class, landscapePar, "mRefUrlPackageId", Integer.valueOf(p0.readInt()));
          a.d(LandscapeParam.class, landscapePar, "mLandVideoStateEventId", Integer.valueOf(p0.readInt()));
          a.d(LandscapeParam.class, landscapePar, "mPlayerCover", p0.readParcelable(LandscapeParam$$Parcelable.class.getClassLoader()));
          a.d(LandscapeParam.class, landscapePar, "mPhoto", QPhoto$$Parcelable.read(p0, p1));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mPanelIsShowed", Boolean.valueOf(b1));
          a.d(LandscapeParam.class, landscapePar, "mClickPhoto", QPhoto$$Parcelable.read(p0, p1));
          a.d(LandscapeParam.class, landscapePar, "mShareLogPageInfo", ShareLogPageInfo$$Parcelable.read(p0, p1));
          a.d(LandscapeParam.class, landscapePar, "startPhotoClickIndex", Integer.valueOf(p0.readInt()));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mPlayPositionTipShow", Boolean.valueOf(b1));
          Integer integer = (p0.readInt() < 0)? hashSet: Integer.valueOf(p0.readInt());
          a.d(LandscapeParam.class, landscapePar, "mRenderType", integer);
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mPayCourseTrailFinishShow", Boolean.valueOf(b1));
          landscapePar.mStartPhoto = QPhoto$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mScreencastByLandscape", Boolean.valueOf(b1));
          a.d(LandscapeParam.class, landscapePar, "mPlayerSpeed", Float.valueOf(p0.readFloat()));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mHasChangedPhoto", Boolean.valueOf(b1));
          a.d(LandscapeParam.class, landscapePar, "mOutputPlcClickEvent", p0.readSerializable());
          a.d(LandscapeParam.class, landscapePar, "mClusterSerialFeed", p0.readSerializable());
          a.d(LandscapeParam.class, landscapePar, "mFragmentTag", p0.readString());
          b1 = p0.readInt();
          if (b1 < 0) {
             uArrayList = hashSet;
          }else {
             uArrayList = new ArrayList(b1);
             for (i3 = 0; i3 < b1; i3 = i3 + 1) {
                uArrayList.add(QPhoto$$Parcelable.read(p0, p1));
             }
          }
          a.d(LandscapeParam.class, landscapePar, "mFloatWindowPlayList", uArrayList);
          a.d(LandscapeParam.class, landscapePar, "mFullTimeSessionId", p0.readString());
          a.d(LandscapeParam.class, landscapePar, "mChangeLandscapeBeginTime", Long.valueOf(p0.readLong()));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mUseGravitySensor", Boolean.valueOf(b1));
          a.d(LandscapeParam.class, landscapePar, "mCommercialCallback", p0.readString());
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mShowFloatWindowGuideDialog", Boolean.valueOf(b1));
          a.d(LandscapeParam.class, landscapePar, "mPayCourseStartTime", Long.valueOf(p0.readLong()));
          b1 = (p0.readInt() == b)? true: false;
          a.d(LandscapeParam.class, landscapePar, "mSyncContainerInflateSuccess", Boolean.valueOf(b1));
          if (p0.readInt() != b) {
             b = false;
          }
          a.d(LandscapeParam.class, landscapePar, "mExitChangePhotoUploadVideoStateEvent", Boolean.valueOf(b));
          b1 = p0.readInt();
          if (b1 < 0) {
             hashSet2 = hashSet;
          }else {
             hashSet2 = new HashSet(b1);
             for (int i2 = 0; i2 < b1; i2 = i2 + 1) {
                hashSet2.add(p0.readString());
             }
          }
          a.d(LandscapeParam.class, landscapePar, "mVideoPlayCompleteIdSet", hashSet2);
          b1 = p0.readInt();
          if (b1 >= 0) {
             hashSet = new HashSet(b1);
             for (; i1 < b1; i1 = i1 + 1) {
                hashSet.add(p0.readString());
             }
          }
          a.d(LandscapeParam.class, landscapePar, "mVideoHasPlayedIdSet", hashSet);
          a.d(LandscapeParam.class, landscapePar, "mCoronaVipState", p0.readParcelable(LandscapeParam$$Parcelable.class.getClassLoader()));
          p1.f(i, landscapePar);
          return landscapePar;
       }
    }
    public static void write(LandscapeParam p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       Integer integer = Integer.class;
       String str = String.class;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(a.b(LandscapeTubeSerialEvent.class, LandscapeParam.class, p0, "mOutputTubeSerialEvent"));
          p1.writeParcelable(a.b(PausePageState.class, LandscapeParam.class, p0, "mPausePageState"), p2);
          p1.writeString(a.b(str, LandscapeParam.class, p0, "mEnterLandscapeMode"));
          p1.writeInt(a.b(Boolean.TYPE, LandscapeParam.class, p0, "mImageDetailOpen").booleanValue());
          String str1 = "mVideoHasShowedFinRecoPanelIdSet";
          if (a.c(new a$c(), LandscapeParam.class, p0, str1) == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(a.c(new a$c(), LandscapeParam.class, p0, str1).size());
             Iterator iterator2 = a.c(new a$c(), LandscapeParam.class, p0, str1).iterator();
             while (iterator2.hasNext()) {
                p1.writeString(iterator2.next());
             }
          }
          Class tYPE = Boolean.TYPE;
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mJoySoundIsOpen").booleanValue());
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mSyncItemInflateSuccess").booleanValue());
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mManualSharePlayer").booleanValue());
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mSyncPlayState").booleanValue());
          Class tYPE1 = Integer.TYPE;
          p1.writeInt(a.b(tYPE1, LandscapeParam.class, p0, "mRefUrlPackageId").intValue());
          p1.writeInt(a.b(tYPE1, LandscapeParam.class, p0, "mLandVideoStateEventId").intValue());
          p1.writeParcelable(a.b(Bitmap.class, LandscapeParam.class, p0, "mPlayerCover"), p2);
          QPhoto$$Parcelable.write(a.b(QPhoto.class, LandscapeParam.class, p0, "mPhoto"), p1, p2, p3);
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mPanelIsShowed").booleanValue());
          QPhoto$$Parcelable.write(a.b(QPhoto.class, LandscapeParam.class, p0, "mClickPhoto"), p1, p2, p3);
          ShareLogPageInfo$$Parcelable.write(a.b(ShareLogPageInfo.class, LandscapeParam.class, p0, "mShareLogPageInfo"), p1, p2, p3);
          p1.writeInt(a.b(tYPE1, LandscapeParam.class, p0, "startPhotoClickIndex").intValue());
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mPlayPositionTipShow").booleanValue());
          str1 = "mRenderType";
          if (a.b(integer, LandscapeParam.class, p0, str1) == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeInt(a.b(integer, LandscapeParam.class, p0, str1).intValue());
          }
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mPayCourseTrailFinishShow").booleanValue());
          QPhoto$$Parcelable.write(p0.mStartPhoto, p1, p2, p3);
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mScreencastByLandscape").booleanValue());
          p1.writeFloat(a.b(Float.TYPE, LandscapeParam.class, p0, "mPlayerSpeed").floatValue());
          p1.writeInt(a.b(tYPE, LandscapeParam.class, p0, "mHasChangedPhoto").booleanValue());
          p1.writeSerializable(a.b(LandscapePlcClickEvent.class, LandscapeParam.class, p0, "mOutputPlcClickEvent"));
          p1.writeSerializable(a.b(CoronaDetailFeedResponse.class, LandscapeParam.class, p0, "mClusterSerialFeed"));
          p1.writeString(a.b(str, LandscapeParam.class, p0, "mFragmentTag"));
          String str2 = "mFloatWindowPlayList";
          if (a.c(new a$c(), LandscapeParam.class, p0, str2) == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(a.c(new a$c(), LandscapeParam.class, p0, str2).size());
             Iterator iterator1 = a.c(new a$c(), LandscapeParam.class, p0, str2).iterator();
             while (iterator1.hasNext()) {
                QPhoto$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(a.b(str, LandscapeParam.class, p0, "mFullTimeSessionId"));
          Class tYPE2 = Long.TYPE;
          p1.writeLong(a.b(tYPE2, LandscapeParam.class, p0, "mChangeLandscapeBeginTime").longValue());
          Class tYPE3 = Boolean.TYPE;
          p1.writeInt(a.b(tYPE3, LandscapeParam.class, p0, "mUseGravitySensor").booleanValue());
          p1.writeString(a.b(str, LandscapeParam.class, p0, "mCommercialCallback"));
          p1.writeInt(a.b(tYPE3, LandscapeParam.class, p0, "mShowFloatWindowGuideDialog").booleanValue());
          p1.writeLong(a.b(tYPE2, LandscapeParam.class, p0, "mPayCourseStartTime").longValue());
          p1.writeInt(a.b(tYPE3, LandscapeParam.class, p0, "mSyncContainerInflateSuccess").booleanValue());
          p1.writeInt(a.b(tYPE3, LandscapeParam.class, p0, "mExitChangePhotoUploadVideoStateEvent").booleanValue());
          String str3 = "mVideoPlayCompleteIdSet";
          if (a.c(new a$c(), LandscapeParam.class, p0, str3) == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(a.c(new a$c(), LandscapeParam.class, p0, str3).size());
             iterator = a.c(new a$c(), LandscapeParam.class, p0, str3).iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          str3 = "mVideoHasPlayedIdSet";
          if (a.c(new a$c(), LandscapeParam.class, p0, str3) == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(a.c(new a$c(), LandscapeParam.class, p0, str3).size());
             iterator = a.c(new a$c(), LandscapeParam.class, p0, str3).iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeParcelable(a.b(CoronaVipState.class, LandscapeParam.class, p0, "mCoronaVipState"), p2);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LandscapeParam getParcel(){
       return this.landscapeParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LandscapeParam$$Parcelable.write(this.landscapeParam$$0, p0, p1, new a());
    }
}
