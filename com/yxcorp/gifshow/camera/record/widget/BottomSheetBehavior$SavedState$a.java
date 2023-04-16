package com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$SavedState;
import java.lang.ClassLoader;

public class BottomSheetBehavior$SavedState$a implements Parcelable$ClassLoaderCreator	// class@000fb5
{

    public void BottomSheetBehavior$SavedState$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       BottomSheetBehavior$SavedState savedState = PatchProxy.applyOneRefs(p0, this, BottomSheetBehavior$SavedState$a.class, "2");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new BottomSheetBehavior$SavedState(p0, null);
       }
       return savedState;
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       BottomSheetBehavior$SavedState savedState = PatchProxy.applyTwoRefs(p0, p1, this, BottomSheetBehavior$SavedState$a.class, "1");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new BottomSheetBehavior$SavedState(p0, p1);
       }
       return savedState;
    }
    public Object[] newArray(int p0){
       BottomSheetBehavior$SavedState[] savedStateAr = new BottomSheetBehavior$SavedState[p0];
       return savedStateAr;
    }
}
