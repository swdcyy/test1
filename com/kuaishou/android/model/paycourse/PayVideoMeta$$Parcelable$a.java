package com.kuaishou.android.model.paycourse.PayVideoMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.paycourse.PayVideoMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.paycourse.PayVideoMeta;

public class PayVideoMeta$$Parcelable$a implements Parcelable$Creator	// class@000e88
{

    public void PayVideoMeta$$Parcelable$a(){
       super();
    }
    public PayVideoMeta$$Parcelable a(Parcel p0){
       return new PayVideoMeta$$Parcelable(PayVideoMeta$$Parcelable.read(p0, new a()));
    }
    public PayVideoMeta$$Parcelable[] b(int p0){
       PayVideoMeta$$Parcelable[] $ParcelableA = new PayVideoMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
