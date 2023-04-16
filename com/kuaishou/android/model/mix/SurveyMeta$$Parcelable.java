package com.kuaishou.android.model.mix.SurveyMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.SurveyMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.SurveyMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import lp.a;
import com.kwai.framework.model.user.User;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.SurveyReason;
import com.kuaishou.android.model.mix.SurveyReason$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class SurveyMeta$$Parcelable implements Parcelable, d	// class@000e0a
{
    public SurveyMeta surveyMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SurveyMeta$$Parcelable.CREATOR = new SurveyMeta$$Parcelable$a();
    }
    public void SurveyMeta$$Parcelable(SurveyMeta p0){
       super();
       this.surveyMeta$$0 = p0;
    }
    public static SurveyMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SurveyMeta surveyMeta = new SurveyMeta();
          p1.f(p1.g(), surveyMeta);
          surveyMeta.mSurveyType = p0.readInt();
          surveyMeta.mDescription = p0.readString();
          surveyMeta.mLinkUrl = p0.readString();
          surveyMeta.mSubTitle = p0.readString();
          surveyMeta.mIconUrl = p0.readString();
          surveyMeta.mUser = new a().c(p0);
          surveyMeta.mMultipleSelectToast = p0.readString();
          surveyMeta.mSurveyId = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(SurveyReason$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          surveyMeta.mSurveyReasons = list;
          surveyMeta.mCreateTime = p0.readLong();
          surveyMeta.mBackgroundImage = p0.readString();
          surveyMeta.mTitle = p0.readString();
          surveyMeta.mButtonText = p0.readString();
          p1.f(i, surveyMeta);
          return surveyMeta;
       }
    }
    public static void write(SurveyMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSurveyType);
          p1.writeString(p0.mDescription);
          p1.writeString(p0.mLinkUrl);
          p1.writeString(p0.mSubTitle);
          p1.writeString(p0.mIconUrl);
          new a().d(p0.mUser, p1);
          p1.writeString(p0.mMultipleSelectToast);
          p1.writeString(p0.mSurveyId);
          SurveyMeta mSurveyReaso = p0.mSurveyReasons;
          if (mSurveyReaso == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mSurveyReaso.size());
             Iterator iterator = p0.mSurveyReasons.iterator();
             while (iterator.hasNext()) {
                SurveyReason$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeLong(p0.mCreateTime);
          p1.writeString(p0.mBackgroundImage);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mButtonText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SurveyMeta getParcel(){
       return this.surveyMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SurveyMeta$$Parcelable.write(this.surveyMeta$$0, p0, p1, new a());
    }
}
