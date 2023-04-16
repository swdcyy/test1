package com.kuaishou.android.model.mix.SurveyReason$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.SurveyReason$$Parcelable$a;
import com.kuaishou.android.model.mix.SurveyReason;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SurveyReason$$Parcelable implements Parcelable, d	// class@000e0e
{
    public SurveyReason surveyReason$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SurveyReason$$Parcelable.CREATOR = new SurveyReason$$Parcelable$a();
    }
    public void SurveyReason$$Parcelable(SurveyReason p0){
       super();
       this.surveyReason$$0 = p0;
    }
    public static SurveyReason read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SurveyReason surveyReason = new SurveyReason();
          p1.f(p1.g(), surveyReason);
          surveyReason.mScore = p0.readInt();
          surveyReason.mScoreId = p0.readString();
          surveyReason.mToast = p0.readString();
          surveyReason.mText = p0.readString();
          p1.f(i, surveyReason);
          return surveyReason;
       }
    }
    public static void write(SurveyReason p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mScore);
          p1.writeString(p0.mScoreId);
          p1.writeString(p0.mToast);
          p1.writeString(p0.mText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SurveyReason getParcel(){
       return this.surveyReason$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SurveyReason$$Parcelable.write(this.surveyReason$$0, p0, p1, new a());
    }
}
