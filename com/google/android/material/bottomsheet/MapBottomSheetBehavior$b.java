package com.google.android.material.bottomsheet.MapBottomSheetBehavior$b;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Object;

public final class MapBottomSheetBehavior$b implements ViewTreeObserver$OnScrollChangedListener	// class@001662
{
    public final View a;
    public final CoordinatorLayout b;

    public void MapBottomSheetBehavior$b(View p0,CoordinatorLayout p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onScrollChanged(){
       if (!this.a.canScrollVertically(-1)) {
          this.b.requestDisallowInterceptTouchEvent(true);
       }
       return;
    }
}
