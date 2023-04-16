package com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$SavedState;
import java.lang.ClassLoader;

public class ContainerBottomSheetBehavior$SavedState$a implements Parcelable$ClassLoaderCreator	// class@001633
{

    public void ContainerBottomSheetBehavior$SavedState$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ContainerBottomSheetBehavior$SavedState savedState = PatchProxy.applyOneRefs(p0, this, ContainerBottomSheetBehavior$SavedState$a.class, "2");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new ContainerBottomSheetBehavior$SavedState(p0, null);
       }
       return savedState;
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       ContainerBottomSheetBehavior$SavedState savedState = PatchProxy.applyTwoRefs(p0, p1, this, ContainerBottomSheetBehavior$SavedState$a.class, "1");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new ContainerBottomSheetBehavior$SavedState(p0, p1);
       }
       return savedState;
    }
    public Object[] newArray(int p0){
       ContainerBottomSheetBehavior$SavedState[] savedStateAr = new ContainerBottomSheetBehavior$SavedState[p0];
       return savedStateAr;
    }
}
