package com.kuaishou.android.model.mix.QuestionnaireInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.QuestionnaireInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.QuestionnaireInfo;

public class QuestionnaireInfo$$Parcelable$a implements Parcelable$Creator	// class@000dd6
{

    public void QuestionnaireInfo$$Parcelable$a(){
       super();
    }
    public QuestionnaireInfo$$Parcelable a(Parcel p0){
       return new QuestionnaireInfo$$Parcelable(QuestionnaireInfo$$Parcelable.read(p0, new a()));
    }
    public QuestionnaireInfo$$Parcelable[] b(int p0){
       QuestionnaireInfo$$Parcelable[] $ParcelableA = new QuestionnaireInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
