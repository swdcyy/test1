package com.kuaishou.android.model.mix.HyperTag$Icon$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.HyperTag$Icon$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.HyperTag$Icon;

public class HyperTag$Icon$$Parcelable$a implements Parcelable$Creator	// class@000cab
{

    public void HyperTag$Icon$$Parcelable$a(){
       super();
    }
    public HyperTag$Icon$$Parcelable a(Parcel p0){
       return new HyperTag$Icon$$Parcelable(HyperTag$Icon$$Parcelable.read(p0, new a()));
    }
    public HyperTag$Icon$$Parcelable[] b(int p0){
       HyperTag$Icon$$Parcelable[] icon$$Parcel = new HyperTag$Icon$$Parcelable[p0];
       return icon$$Parcel;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
