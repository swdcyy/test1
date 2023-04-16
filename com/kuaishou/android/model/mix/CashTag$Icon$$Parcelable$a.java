package com.kuaishou.android.model.mix.CashTag$Icon$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CashTag$Icon$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CashTag$Icon;

public class CashTag$Icon$$Parcelable$a implements Parcelable$Creator	// class@000bd8
{

    public void CashTag$Icon$$Parcelable$a(){
       super();
    }
    public CashTag$Icon$$Parcelable a(Parcel p0){
       return new CashTag$Icon$$Parcelable(CashTag$Icon$$Parcelable.read(p0, new a()));
    }
    public CashTag$Icon$$Parcelable[] b(int p0){
       CashTag$Icon$$Parcelable[] icon$$Parcel = new CashTag$Icon$$Parcelable[p0];
       return icon$$Parcel;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
