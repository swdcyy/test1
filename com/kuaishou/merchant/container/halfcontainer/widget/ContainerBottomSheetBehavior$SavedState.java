package com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$SavedState;
import androidx.customview.view.AbsSavedState;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class ContainerBottomSheetBehavior$SavedState extends AbsSavedState	// class@001634
{
    public final int d;
    public static final Parcelable$Creator CREATOR;

    static {
       ContainerBottomSheetBehavior$SavedState.CREATOR = new ContainerBottomSheetBehavior$SavedState$a();
    }
    public void ContainerBottomSheetBehavior$SavedState(Parcel p0){
       super(p0, null);
    }
    public void ContainerBottomSheetBehavior$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = p0.readInt();
    }
    public void ContainerBottomSheetBehavior$SavedState(Parcelable p0,int p1){
       super(p0);
       this.d = p1;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior$SavedState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ContainerBottomSheetBehavior$SavedState.class, "1")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeInt(this.d);
       return;
    }
}
