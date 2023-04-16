package com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;

public final class FlexboxLayoutManager$LayoutParams$a implements Parcelable$Creator	// class@0015ff
{

    public void FlexboxLayoutManager$LayoutParams$a(){
       super();
    }
    public FlexboxLayoutManager$LayoutParams a(Parcel p0){
       return new FlexboxLayoutManager$LayoutParams(p0);
    }
    public FlexboxLayoutManager$LayoutParams[] b(int p0){
       FlexboxLayoutManager$LayoutParams[] layoutParams = new FlexboxLayoutManager$LayoutParams[p0];
       return layoutParams;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
