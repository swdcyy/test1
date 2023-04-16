package com.kuaishou.android.model.paycourse.TrialPlayInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.paycourse.TrialPlayInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.paycourse.TrialPlayInfo;

public class TrialPlayInfo$$Parcelable$a implements Parcelable$Creator	// class@000e8e
{

    public void TrialPlayInfo$$Parcelable$a(){
       super();
    }
    public TrialPlayInfo$$Parcelable a(Parcel p0){
       return new TrialPlayInfo$$Parcelable(TrialPlayInfo$$Parcelable.read(p0, new a()));
    }
    public TrialPlayInfo$$Parcelable[] b(int p0){
       TrialPlayInfo$$Parcelable[] $ParcelableA = new TrialPlayInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
