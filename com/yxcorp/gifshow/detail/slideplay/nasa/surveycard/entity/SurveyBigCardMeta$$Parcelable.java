package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionMeta;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionMeta$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class SurveyBigCardMeta$$Parcelable implements Parcelable, d	// class@0017c7
{
    public SurveyBigCardMeta surveyBigCardMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SurveyBigCardMeta$$Parcelable.CREATOR = new SurveyBigCardMeta$$Parcelable$a();
    }
    public void SurveyBigCardMeta$$Parcelable(SurveyBigCardMeta p0){
       super();
       this.surveyBigCardMeta$$0 = p0;
    }
    public static SurveyBigCardMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SurveyBigCardMeta surveyBigCar = new SurveyBigCardMeta();
          p1.f(p1.g(), surveyBigCar);
          surveyBigCar.mSubmitButtonText = p0.readString();
          surveyBigCar.mSubmittedButtonText = p0.readString();
          surveyBigCar.mReferer = p0.readString();
          surveyBigCar.mTitle = p0.readString();
          surveyBigCar.mSurveyTag = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(SurveyBigCardQuestionMeta$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          surveyBigCar.mQuestions = list;
          surveyBigCar.mSubmitSuccessToast = p0.readString();
          surveyBigCar.mSlideToContinueText = p0.readString();
          surveyBigCar.mType = p0.readInt();
          surveyBigCar.mFeedId = p0.readString();
          p1.f(i, surveyBigCar);
          return surveyBigCar;
       }
    }
    public static void write(SurveyBigCardMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSubmitButtonText);
          p1.writeString(p0.mSubmittedButtonText);
          p1.writeString(p0.mReferer);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mSurveyTag);
          SurveyBigCardMeta mQuestions = p0.mQuestions;
          if (mQuestions == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mQuestions.size());
             Iterator iterator = p0.mQuestions.iterator();
             while (iterator.hasNext()) {
                SurveyBigCardQuestionMeta$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mSubmitSuccessToast);
          p1.writeString(p0.mSlideToContinueText);
          p1.writeInt(p0.mType);
          p1.writeString(p0.mFeedId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SurveyBigCardMeta getParcel(){
       return this.surveyBigCardMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SurveyBigCardMeta$$Parcelable.write(this.surveyBigCardMeta$$0, p0, p1, new a());
    }
}
