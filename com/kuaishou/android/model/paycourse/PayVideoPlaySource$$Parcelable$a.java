package com.kuaishou.android.model.paycourse.PayVideoPlaySource$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.paycourse.PayVideoPlaySource$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.paycourse.PayVideoPlaySource;

public class PayVideoPlaySource$$Parcelable$a implements Parcelable$Creator	// class@000e8b
{

    public void PayVideoPlaySource$$Parcelable$a(){
       super();
    }
    public PayVideoPlaySource$$Parcelable a(Parcel p0){
       return new PayVideoPlaySource$$Parcelable(PayVideoPlaySource$$Parcelable.read(p0, new a()));
    }
    public PayVideoPlaySource$$Parcelable[] b(int p0){
       PayVideoPlaySource$$Parcelable[] $ParcelableA = new PayVideoPlaySource$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
