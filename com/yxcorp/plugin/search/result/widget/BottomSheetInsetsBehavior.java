package com.yxcorp.plugin.search.result.widget.BottomSheetInsetsBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import a2.u0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a2.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.os.Parcelable;
import com.yxcorp.plugin.search.result.widget.BottomSheetInsetsBehavior$SavedState;
import android.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.Exception;

public class BottomSheetInsetsBehavior extends BottomSheetBehavior	// class@00075b
{
    public static final String a = "BottomSheetInsetsBehavior";

    public void BottomSheetInsetsBehavior(){
       super();
    }
    public void BottomSheetInsetsBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public u0 onApplyWindowInsets(CoordinatorLayout p0,View p1,u0 p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetInsetsBehavior.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.i(p1, p2);
       return super.onApplyWindowInsets(p0, p1, p2);
    }
    public void onRestoreInstanceState(CoordinatorLayout p0,View p1,Parcelable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BottomSheetInsetsBehavior.class, "3")) {
          return;
       }
       super.onRestoreInstanceState(p0, p1, p2.getSuperState());
       this.setHideable(p2.b);
       return;
    }
    public Parcelable onSaveInstanceState(CoordinatorLayout p0,View p1){
       Field obj = PatchProxy.applyTwoRefs(p0, p1, this, BottomSheetInsetsBehavior.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getState() == 2) {
          try{
             obj = BottomSheetBehavior.class.getDeclaredField("mState");
             obj.setAccessible(true);
             obj.setInt(this, 5);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
