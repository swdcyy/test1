package com.google.android.flexbox.FlexboxLayoutManager$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.flexbox.FlexboxLayoutManager$SavedState;
import com.google.android.flexbox.FlexboxLayoutManager$a;

public final class FlexboxLayoutManager$SavedState$a implements Parcelable$Creator	// class@001601
{

    public void FlexboxLayoutManager$SavedState$a(){
       super();
    }
    public FlexboxLayoutManager$SavedState a(Parcel p0){
       return new FlexboxLayoutManager$SavedState(p0, null);
    }
    public FlexboxLayoutManager$SavedState[] b(int p0){
       FlexboxLayoutManager$SavedState[] savedStateAr = new FlexboxLayoutManager$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
