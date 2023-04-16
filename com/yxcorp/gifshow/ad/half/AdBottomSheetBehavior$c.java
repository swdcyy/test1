package com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.customview.widget.ViewDragHelper;
import a2.i0;

public class AdBottomSheetBehavior$c implements Runnable	// class@001779
{
    public final View b;
    public boolean c;
    public int d;
    public final AdBottomSheetBehavior e;

    public void AdBottomSheetBehavior$c(AdBottomSheetBehavior p0,View p1,int p2){
       this.e = p0;
       super();
       this.b = p1;
       this.d = p2;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AdBottomSheetBehavior$c.class, "1")) {
          return;
       }
       AdBottomSheetBehavior r = this.e.r;
       if (r != null && r.continueSettling(true)) {
          i0.k0(this.b, this);
       }else {
          this.e.setStateInternal(this.d);
       }
       this.c = false;
       return;
    }
}
