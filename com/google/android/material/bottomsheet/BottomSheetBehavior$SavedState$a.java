package com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState;
import java.lang.ClassLoader;

public final class BottomSheetBehavior$SavedState$a implements Parcelable$ClassLoaderCreator	// class@001651
{

    public void BottomSheetBehavior$SavedState$a(){
       super();
    }
    public BottomSheetBehavior$SavedState a(Parcel p0){
       return new BottomSheetBehavior$SavedState(p0, null);
    }
    public BottomSheetBehavior$SavedState b(Parcel p0,ClassLoader p1){
       return new BottomSheetBehavior$SavedState(p0, p1);
    }
    public BottomSheetBehavior$SavedState[] c(int p0){
       BottomSheetBehavior$SavedState[] savedStateAr = new BottomSheetBehavior$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       return this.b(p0, p1);
    }
    public Object[] newArray(int p0){
       return this.c(p0);
    }
}
