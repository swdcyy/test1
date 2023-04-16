package com.kds.headertabscrollview.layout.FixedFlingNestedScrollView$SavedState;
import android.view.View$BaseSavedState;
import com.kds.headertabscrollview.layout.FixedFlingNestedScrollView$SavedState$a;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.System;
import java.lang.Integer;

public class FixedFlingNestedScrollView$SavedState extends View$BaseSavedState	// class@000720
{
    public int b;
    public static final Parcelable$Creator CREATOR;

    static {
       FixedFlingNestedScrollView$SavedState.CREATOR = new FixedFlingNestedScrollView$SavedState$a();
    }
    public void FixedFlingNestedScrollView$SavedState(Parcel p0){
       super(p0);
       this.b = p0.readInt();
    }
    public void FixedFlingNestedScrollView$SavedState(Parcelable p0){
       super(p0);
    }
    public String toString(){
       return "HorizontalScrollView.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" scrollPosition="+this.b+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
    }
}
