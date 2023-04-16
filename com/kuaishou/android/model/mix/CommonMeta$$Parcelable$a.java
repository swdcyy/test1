package com.kuaishou.android.model.mix.CommonMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CommonMeta;

public class CommonMeta$$Parcelable$a implements Parcelable$Creator	// class@000c02
{

    public void CommonMeta$$Parcelable$a(){
       super();
    }
    public CommonMeta$$Parcelable a(Parcel p0){
       return new CommonMeta$$Parcelable(CommonMeta$$Parcelable.read(p0, new a()));
    }
    public CommonMeta$$Parcelable[] b(int p0){
       CommonMeta$$Parcelable[] $ParcelableA = new CommonMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
