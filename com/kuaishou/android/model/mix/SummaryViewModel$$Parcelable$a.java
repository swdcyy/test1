package com.kuaishou.android.model.mix.SummaryViewModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.SummaryViewModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.SummaryViewModel;

public class SummaryViewModel$$Parcelable$a implements Parcelable$Creator	// class@000e03
{

    public void SummaryViewModel$$Parcelable$a(){
       super();
    }
    public SummaryViewModel$$Parcelable a(Parcel p0){
       return new SummaryViewModel$$Parcelable(SummaryViewModel$$Parcelable.read(p0, new a()));
    }
    public SummaryViewModel$$Parcelable[] b(int p0){
       SummaryViewModel$$Parcelable[] $ParcelableA = new SummaryViewModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
