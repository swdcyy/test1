package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionMeta$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionOptionMeta;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionOptionMeta$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class SurveyBigCardQuestionMeta$$Parcelable implements Parcelable, d	// class@0017ca
{
    public SurveyBigCardQuestionMeta surveyBigCardQuestionMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SurveyBigCardQuestionMeta$$Parcelable.CREATOR = new SurveyBigCardQuestionMeta$$Parcelable$a();
    }
    public void SurveyBigCardQuestionMeta$$Parcelable(SurveyBigCardQuestionMeta p0){
       super();
       this.surveyBigCardQuestionMeta$$0 = p0;
    }
    public static SurveyBigCardQuestionMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SurveyBigCardQuestionMeta surveyBigCar = new SurveyBigCardQuestionMeta();
          p1.f(p1.g(), surveyBigCar);
          surveyBigCar.mIconText = p0.readString();
          surveyBigCar.mId = p0.readInt();
          surveyBigCar.mText = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(SurveyBigCardQuestionOptionMeta$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          surveyBigCar.mOptions = list;
          surveyBigCar.mType = p0.readInt();
          p1.f(i, surveyBigCar);
          return surveyBigCar;
       }
    }
    public static void write(SurveyBigCardQuestionMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mIconText);
          p1.writeInt(p0.mId);
          p1.writeString(p0.mText);
          SurveyBigCardQuestionMeta mOptions = p0.mOptions;
          if (mOptions == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mOptions.size());
             Iterator iterator = p0.mOptions.iterator();
             while (iterator.hasNext()) {
                SurveyBigCardQuestionOptionMeta$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SurveyBigCardQuestionMeta getParcel(){
       return this.surveyBigCardQuestionMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SurveyBigCardQuestionMeta$$Parcelable.write(this.surveyBigCardQuestionMeta$$0, p0, p1, new a());
    }
}
