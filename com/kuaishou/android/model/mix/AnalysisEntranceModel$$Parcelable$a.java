package com.kuaishou.android.model.mix.AnalysisEntranceModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.AnalysisEntranceModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.AnalysisEntranceModel;

public class AnalysisEntranceModel$$Parcelable$a implements Parcelable$Creator	// class@000bbd
{

    public void AnalysisEntranceModel$$Parcelable$a(){
       super();
    }
    public AnalysisEntranceModel$$Parcelable a(Parcel p0){
       return new AnalysisEntranceModel$$Parcelable(AnalysisEntranceModel$$Parcelable.read(p0, new a()));
    }
    public AnalysisEntranceModel$$Parcelable[] b(int p0){
       AnalysisEntranceModel$$Parcelable[] $ParcelableA = new AnalysisEntranceModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
