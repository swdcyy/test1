package com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$d;

public class TopSheetBehavior$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0018f9
{
    public final View b;
    public final TopSheetBehavior c;

    public void TopSheetBehavior$a(TopSheetBehavior p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TopSheetBehavior$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.a.onStateChanged(1);
       return;
    }
}
