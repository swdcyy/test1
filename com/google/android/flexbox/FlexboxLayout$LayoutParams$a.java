package com.google.android.flexbox.FlexboxLayout$LayoutParams$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;

public final class FlexboxLayout$LayoutParams$a implements Parcelable$Creator	// class@0015fc
{

    public void FlexboxLayout$LayoutParams$a(){
       super();
    }
    public FlexboxLayout$LayoutParams a(Parcel p0){
       return new FlexboxLayout$LayoutParams(p0);
    }
    public FlexboxLayout$LayoutParams[] b(int p0){
       FlexboxLayout$LayoutParams[] layoutParams = new FlexboxLayout$LayoutParams[p0];
       return layoutParams;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
