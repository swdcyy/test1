package com.kuaishou.android.model.mix.ScoreMark$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ScoreMark$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ScoreMark;

public class ScoreMark$$Parcelable$a implements Parcelable$Creator	// class@000df0
{

    public void ScoreMark$$Parcelable$a(){
       super();
    }
    public ScoreMark$$Parcelable a(Parcel p0){
       return new ScoreMark$$Parcelable(ScoreMark$$Parcelable.read(p0, new a()));
    }
    public ScoreMark$$Parcelable[] b(int p0){
       ScoreMark$$Parcelable[] $ParcelableA = new ScoreMark$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
