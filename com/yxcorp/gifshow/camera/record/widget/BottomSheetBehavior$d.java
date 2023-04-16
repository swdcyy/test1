package com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.widget.i;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.widget.OverScroller;
import a2.i0;
import com.yxcorp.gifshow.camera.record.widget.i$c;
import android.view.ViewGroup;

public class BottomSheetBehavior$d implements Runnable	// class@000fba
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
       boolean b;
       int i;
       if (PatchProxy.applyVoid(null, this, BottomSheetBehavior$d.class, "1")) {
          return;
       }
       BottomSheetBehavior n = this.d.n;
       if (n != null) {
          Objects.requireNonNull(n);
          i oi = i.class;
          if (PatchProxy.isSupport(oi)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.TRUE, n, oi, "16");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(n.a == 2){
                boolean b1 = n.q.computeScrollOffset();
                int currX = n.q.getCurrX();
                int currY = n.q.getCurrY();
                i = currX - n.s.getLeft();
                int i1 = currY - n.s.getTop();
                if (i) {
                   i0.d0(n.s, i);
                }
                if (i1) {
                   i0.e0(n.s, i1);
                }
                if (i || i1) {
                   n.r.e(n.s, currX, currY, i, i1);
                }
                if (b1 && (currX == n.q.getFinalX() && currY == n.q.getFinalY())) {
                   n.q.abortAnimation();
                   b1 = false;
                }
             label_008b :
                if (!b1) {
                   n.u.post(n.w);
                }
             }
             if (n.a == 2) {
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_0030 ;
          }
          if (b) {
             i0.k0(this.b, this);
          label_00aa :
             return;
          }
       }
       this.d.setStateInternal(this.c);
       goto label_00aa ;
    }
}
