package com.yxcorp.plugin.search.result.widget.BottomSheetInsetsBehavior$SavedState;
import android.view.AbsSavedState;
import com.yxcorp.plugin.search.result.widget.BottomSheetInsetsBehavior$SavedState$a;
import w1.j;
import android.os.Parcelable$Creator;
import w1.i;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class BottomSheetInsetsBehavior$SavedState extends AbsSavedState	// class@00075a
{
    public boolean b;
    public static final Parcelable$Creator CREATOR;

    static {
       BottomSheetInsetsBehavior$SavedState.CREATOR = i.a(new BottomSheetInsetsBehavior$SavedState$a());
    }
    public void BottomSheetInsetsBehavior$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.b = b;
       return;
    }
    public void BottomSheetInsetsBehavior$SavedState(Parcelable p0,boolean p1){
       super(p0);
       this.b = p1;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(BottomSheetInsetsBehavior$SavedState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, BottomSheetInsetsBehavior$SavedState.class, "1")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
       return;
    }
}
