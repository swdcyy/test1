package com.kuaishou.android.model.mix.SurveyReason$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.SurveyReason$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.SurveyReason;

public class SurveyReason$$Parcelable$a implements Parcelable$Creator	// class@000e0d
{

    public void SurveyReason$$Parcelable$a(){
       super();
    }
    public SurveyReason$$Parcelable a(Parcel p0){
       return new SurveyReason$$Parcelable(SurveyReason$$Parcelable.read(p0, new a()));
    }
    public SurveyReason$$Parcelable[] b(int p0){
       SurveyReason$$Parcelable[] $ParcelableA = new SurveyReason$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
