package com.kuaishou.commercial.tachikoma.view.ScratchCardView$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tachikoma.view.ScratchCardView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.graphics.Bitmap;
import android.view.View;
import java.lang.Throwable;
import yx.j0;

public final class ScratchCardView$a implements Runnable	// class@00168f
{
    public final ScratchCardView b;

    public void ScratchCardView$a(ScratchCardView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ScratchCardView$a.class, "1")) {
          return;
       }
       try{
          ScratchCardView$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, ScratchCardView.class, "8")) {
             ScratchCardView e = tb.e;
             int i = 0;
             int width = (e != null)? e.getWidth(): 0;
             ScratchCardView e1 = tb.e;
             int i1 = (e1 != null)? e1.getHeight(): 0;
             float f = 0;
             int i2 = width * i1;
             float f1 = (float)i2;
             int[] ointArray = new int[i2];
             e1 = tb.e;
             if (e1 != null) {
                e1.getPixels(ointArray, 0, width, 0, 0, width, i1);
             }
             i2 = 0;
             while (i2 < width) {
                int i3 = 0;
                while (i3 < i1) {
                   int i4 = i3 * width;
                   i4 = i4 + i2;
                   if (!ointArray[i4]) {
                      f = f + 0x3f800000;
                   }
                   i3 = i3 + 1;
                }
                i2 = i2 + 1;
             }
             float f2 = (float)i;
             if (f - f2 > 0 && (f1 - f2 > 0 && (f / f1) - tb.i > 0)) {
                tb.l = true;
                tb.postInvalidate();
             }
          }
       }catch(java.lang.Exception e0){
          j0.b("ScratchCardView", "calculateScratchArea failed", e0);
       }
    label_007b :
       return;
    }
}
