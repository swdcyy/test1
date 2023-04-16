package com.kuaishou.android.model.mix.ExtMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ExtMeta;

public class ExtMeta$$Parcelable$a implements Parcelable$Creator	// class@000c64
{

    public void ExtMeta$$Parcelable$a(){
       super();
    }
    public ExtMeta$$Parcelable a(Parcel p0){
       return new ExtMeta$$Parcelable(ExtMeta$$Parcelable.read(p0, new a()));
    }
    public ExtMeta$$Parcelable[] b(int p0){
       ExtMeta$$Parcelable[] $ParcelableA = new ExtMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
