package com.kuaishou.android.model.mix.SurveyMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.SurveyMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.SurveyMeta;

public class SurveyMeta$$Parcelable$a implements Parcelable$Creator	// class@000e09
{

    public void SurveyMeta$$Parcelable$a(){
       super();
    }
    public SurveyMeta$$Parcelable a(Parcel p0){
       return new SurveyMeta$$Parcelable(SurveyMeta$$Parcelable.read(p0, new a()));
    }
    public SurveyMeta$$Parcelable[] b(int p0){
       SurveyMeta$$Parcelable[] $ParcelableA = new SurveyMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
