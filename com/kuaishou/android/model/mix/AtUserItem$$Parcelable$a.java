package com.kuaishou.android.model.mix.AtUserItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.AtUserItem$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.AtUserItem;

public class AtUserItem$$Parcelable$a implements Parcelable$Creator	// class@000bc4
{

    public void AtUserItem$$Parcelable$a(){
       super();
    }
    public AtUserItem$$Parcelable a(Parcel p0){
       return new AtUserItem$$Parcelable(AtUserItem$$Parcelable.read(p0, new a()));
    }
    public AtUserItem$$Parcelable[] b(int p0){
       AtUserItem$$Parcelable[] $ParcelableA = new AtUserItem$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
