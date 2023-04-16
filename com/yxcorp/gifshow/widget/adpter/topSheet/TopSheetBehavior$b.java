package com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$b;
import androidx.customview.widget.ViewDragHelper$c;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import u1.a;
import java.lang.Float;
import androidx.customview.widget.ViewDragHelper;
import com.yxcorp.gifshow.widget.adpter.topSheet.TopSheetBehavior$c;
import java.util.Objects;
import java.lang.Runnable;
import a2.i0;
import java.lang.Boolean;
import java.lang.ref.WeakReference;

public class TopSheetBehavior$b extends ViewDragHelper$c	// class@0018fa
{
    public final TopSheetBehavior a;

    public void TopSheetBehavior$b(TopSheetBehavior p0){
       this.a = p0;
       super();
    }
    public int b(View p0,int p1,int p2){
       if (PatchProxy.isSupport(TopSheetBehavior$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TopSheetBehavior$b.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       return a.b(p1, (this.a.c * -1), 0);
    }
    public void l(View p0,float p1,float p2){
       if (PatchProxy.isSupport(TopSheetBehavior$b.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, TopSheetBehavior$b.class, "3")) {
          return;
       }
       TopSheetBehavior$b ta = this.a;
       TopSheetBehavior c = ta.c;
       if ((double)p0.getTop() - ((double)c * 0xbfe0000000000000) < 0 || p2 < 0) {
          ta.b.settleCapturedViewAt(0, (c * -1));
       }else {
          ta.b.settleCapturedViewAt(0, 0);
       }
       TopSheetBehavior$b ta1 = this.a;
       Objects.requireNonNull(ta1);
       i0.k0(p0, new TopSheetBehavior$c(ta1, p0));
       return;
    }
    public boolean m(View p0,int p1){
       TopSheetBehavior obj;
       TopSheetBehavior$b uob = TopSheetBehavior$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.d;
       boolean b = (obj != null && obj.get() == p0)? true: false;
       return b;
    }
}
