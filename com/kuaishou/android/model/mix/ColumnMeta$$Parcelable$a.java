package com.kuaishou.android.model.mix.ColumnMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.ColumnMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.ColumnMeta;

public class ColumnMeta$$Parcelable$a implements Parcelable$Creator	// class@000bf5
{

    public void ColumnMeta$$Parcelable$a(){
       super();
    }
    public ColumnMeta$$Parcelable a(Parcel p0){
       return new ColumnMeta$$Parcelable(ColumnMeta$$Parcelable.read(p0, new a()));
    }
    public ColumnMeta$$Parcelable[] b(int p0){
       ColumnMeta$$Parcelable[] $ParcelableA = new ColumnMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
