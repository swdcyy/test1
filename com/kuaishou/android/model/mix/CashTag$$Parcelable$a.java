package com.kuaishou.android.model.mix.CashTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CashTag$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CashTag;

public class CashTag$$Parcelable$a implements Parcelable$Creator	// class@000bd6
{

    public void CashTag$$Parcelable$a(){
       super();
    }
    public CashTag$$Parcelable a(Parcel p0){
       return new CashTag$$Parcelable(CashTag$$Parcelable.read(p0, new a()));
    }
    public CashTag$$Parcelable[] b(int p0){
       CashTag$$Parcelable[] $ParcelableA = new CashTag$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
