package com.google.android.material.bottomsheet.BottomSheetBehavior$d;
import java.lang.Runnable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import androidx.customview.widget.ViewDragHelper;
import a2.i0;

public class BottomSheetBehavior$d implements Runnable	// class@001656
{
    public final View b;
    public final int c;
    public final BottomSheetBehavior d;

    public void BottomSheetBehavior$d(BottomSheetBehavior p0,View p1,int p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       BottomSheetBehavior viewDragHelp = this.d.viewDragHelper;
       if (viewDragHelp != null && viewDragHelp.continueSettling(true)) {
          i0.k0(this.b, this);
       }else {
          this.d.setStateInternal(this.c);
       }
       return;
    }
}
