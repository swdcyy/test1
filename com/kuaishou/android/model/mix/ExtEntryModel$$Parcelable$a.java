package com.kuaishou.android.model.mix.ExtEntryModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ExtEntryModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ExtEntryModel;

public class ExtEntryModel$$Parcelable$a implements Parcelable$Creator	// class@000c60
{

    public void ExtEntryModel$$Parcelable$a(){
       super();
    }
    public ExtEntryModel$$Parcelable a(Parcel p0){
       return new ExtEntryModel$$Parcelable(ExtEntryModel$$Parcelable.read(p0, new a()));
    }
    public ExtEntryModel$$Parcelable[] b(int p0){
       ExtEntryModel$$Parcelable[] $ParcelableA = new ExtEntryModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
