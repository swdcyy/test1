package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionOptionMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionOptionMeta$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionOptionMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SurveyBigCardQuestionOptionMeta$$Parcelable implements Parcelable, d	// class@0017cd
{
    public SurveyBigCardQuestionOptionMeta surveyBigCardQuestionOptionMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SurveyBigCardQuestionOptionMeta$$Parcelable.CREATOR = new SurveyBigCardQuestionOptionMeta$$Parcelable$a();
    }
    public void SurveyBigCardQuestionOptionMeta$$Parcelable(SurveyBigCardQuestionOptionMeta p0){
       super();
       this.surveyBigCardQuestionOptionMeta$$0 = p0;
    }
    public static SurveyBigCardQuestionOptionMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SurveyBigCardQuestionOptionMeta surveyBigCar = new SurveyBigCardQuestionOptionMeta();
          p1.f(p1.g(), surveyBigCar);
          surveyBigCar.mText = p0.readString();
          surveyBigCar.mValue = p0.readString();
          p1.f(i, surveyBigCar);
          return surveyBigCar;
       }
    }
    public static void write(SurveyBigCardQuestionOptionMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mText);
          p1.writeString(p0.mValue);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SurveyBigCardQuestionOptionMeta getParcel(){
       return this.surveyBigCardQuestionOptionMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SurveyBigCardQuestionOptionMeta$$Parcelable.write(this.surveyBigCardQuestionOptionMeta$$0, p0, p1, new a());
    }
}
