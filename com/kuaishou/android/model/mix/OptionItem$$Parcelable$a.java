package com.kuaishou.android.model.mix.OptionItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.OptionItem$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.OptionItem;

public class OptionItem$$Parcelable$a implements Parcelable$Creator	// class@000d2c
{

    public void OptionItem$$Parcelable$a(){
       super();
    }
    public OptionItem$$Parcelable a(Parcel p0){
       return new OptionItem$$Parcelable(OptionItem$$Parcelable.read(p0, new a()));
    }
    public OptionItem$$Parcelable[] b(int p0){
       OptionItem$$Parcelable[] $ParcelableA = new OptionItem$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
