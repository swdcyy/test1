package com.kuaishou.android.model.mix.QuestionnaireInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.QuestionnaireInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class QuestionnaireInfo$$Parcelable implements Parcelable, d	// class@000dd7
{
    public QuestionnaireInfo questionnaireInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QuestionnaireInfo$$Parcelable.CREATOR = new QuestionnaireInfo$$Parcelable$a();
    }
    public void QuestionnaireInfo$$Parcelable(QuestionnaireInfo p0){
       super();
       this.questionnaireInfo$$0 = p0;
    }
    public static QuestionnaireInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          QuestionnaireInfo questionnair = new QuestionnaireInfo();
          p1.f(p1.g(), questionnair);
          questionnair.mBackgroundColorStr = p0.readString();
          questionnair.mKsOrderId = p0.readString();
          questionnair.mTargetUrl = p0.readString();
          questionnair.mBackgroundColor = p0.readInt();
          questionnair.mHeight = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          questionnair.mIsBold = b;
          questionnair.mTextColorStr = p0.readString();
          questionnair.mFontSize = p0.readInt();
          questionnair.mTextColor = p0.readInt();
          questionnair.mPressedBackgroundColor = p0.readInt();
          questionnair.mOperationType = p0.readInt();
          questionnair.mText = p0.readString();
          questionnair.mPressedTextColor = p0.readInt();
          p1.f(i, questionnair);
          return questionnair;
       }
    }
    public static void write(QuestionnaireInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mBackgroundColorStr);
          p1.writeString(p0.mKsOrderId);
          p1.writeString(p0.mTargetUrl);
          p1.writeInt(p0.mBackgroundColor);
          p1.writeInt(p0.mHeight);
          p1.writeInt(p0.mIsBold);
          p1.writeString(p0.mTextColorStr);
          p1.writeInt(p0.mFontSize);
          p1.writeInt(p0.mTextColor);
          p1.writeInt(p0.mPressedBackgroundColor);
          p1.writeInt(p0.mOperationType);
          p1.writeString(p0.mText);
          p1.writeInt(p0.mPressedTextColor);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QuestionnaireInfo getParcel(){
       return this.questionnaireInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QuestionnaireInfo$$Parcelable.write(this.questionnaireInfo$$0, p0, p1, new a());
    }
}
