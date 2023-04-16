package com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class BottomSheetBehavior$a implements Runnable	// class@000fb7
{
    public final View b;
    public final int c;
    public final boolean d;
    public final BottomSheetBehavior e;

    public void BottomSheetBehavior$a(BottomSheetBehavior p0,View p1,int p2,boolean p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBehavior$a.class, "1")) {
          return;
       }
       this.e.i(this.b, this.c, this.d);
       return;
    }
}
