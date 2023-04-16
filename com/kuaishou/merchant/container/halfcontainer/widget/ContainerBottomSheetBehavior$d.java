package com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$d;
import java.lang.Runnable;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.container.halfcontainer.widget.a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import e2.g;
import a2.i0;
import com.kuaishou.merchant.container.halfcontainer.widget.a$c;
import android.view.ViewGroup;

public class ContainerBottomSheetBehavior$d implements Runnable	// class@001638
{
    public final View b;
    public final int c;
    public final ContainerBottomSheetBehavior d;

    public void ContainerBottomSheetBehavior$d(ContainerBottomSheetBehavior p0,View p1,int p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, ContainerBottomSheetBehavior$d.class, "1")) {
          return;
       }
       ContainerBottomSheetBehavior n = this.d.n;
       if (n != null) {
          Objects.requireNonNull(n);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.TRUE, n, uoa, "15");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(n.d == 2){
                boolean b1 = n.t.b();
                int i = n.t.f();
                int i1 = n.t.g();
                int i2 = i - n.u.getLeft();
                int i3 = i1 - n.u.getTop();
                if (i2) {
                   i0.d0(n.u, i2);
                }
                if (i3) {
                   i0.e0(n.u, i3);
                }
                if (i2 || i3) {
                   n.b.e(n.u, i, i1, i2, i3);
                }
                if (b1 && (i == n.t.h() && i1 == n.t.i())) {
                   n.t.a();
                   b1 = false;
                }
             label_008b :
                if (!b1) {
                   n.c.post(n.v);
                }
             }
             if (n.d == 2) {
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
