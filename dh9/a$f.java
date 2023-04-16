package dh9.a$f;
import android.view.View$OnLayoutChangeListener;
import dh9.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import j8c.a;
import q87.c;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.camera.record.frame.a;
import java.util.List;
import oc9.e0;
import java.util.Iterator;
import oc9.t;
import kd9.n0;
import com.yxcorp.utility.n;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import sm6.b;
import android.view.ViewParent;
import android.view.ViewGroup;
import y4b.g;
import y4b.f;
import com.yxcorp.gifshow.camera.record.base.b;

public final class a$f implements View$OnLayoutChangeListener	// class@001f39
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       a v;
       Iterator iterator;
       AnimCameraView uAnimCameraV;
       Integer integer = Integer.valueOf(3);
       if (PatchProxy.isSupport(a$f.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, a$f.class, "1")) {
             return;
          }
       }
       a.p(p0, "v");
       v = this.b.v;
       if (v == null) {
          a.S("contentView");
       }
       v.removeOnLayoutChangeListener(this);
       Object[] objArray1 = new Object[0];
       a.D().w("StateFrameController", "update ui", objArray1);
       a$f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(integer, tb, a.class, "4")) {
          float f = g.d(3, tb.e, 0);
          if (f) {
             uAnimCameraV = tb.g2();
             if (uAnimCameraV != null) {
                uAnimCameraV = uAnimCameraV.getWidth();
                f = tb.q.l2(3, uAnimCameraV, (int)(((float)uAnimCameraV / f) + 0x3f000000));
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(integer, Integer.valueOf(f), tb, a.class, "5")) {
                   tb.t = f;
                   iterator = tb.getChildren().iterator();
                   while (iterator.hasNext()) {
                      t ot2 = iterator.next();
                      if (ot2 instanceof n0) {
                         ot2.N6(3, f);
                      }
                   }
                }
             }
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, tb, a.class, "8")) {
          uAnimCameraV = tb.g2();
          if (uAnimCameraV != null) {
             p3 = Math.min(n.j(tb.e), n.k(tb.e));
             p4 = uAnimCameraV.getWidth();
             tb.q.r2(0);
             ViewGroup$LayoutParams layoutParams = uAnimCameraV.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                p6 = (g.m(tb.e))? 0: tb.q.l2(3, p4, p4);
                p7.topMargin = p6;
             }
             layoutParams.height = p4;
             layoutParams.width = p4;
             uAnimCameraV.setLayoutParams(layoutParams);
             p3 = b.f(3, p3, p3, tb.e, 0);
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(integer, Integer.valueOf(p3), tb, a.class, "9")) {
                tb.t = p3;
                iterator = tb.getChildren().iterator();
                while (iterator.hasNext()) {
                   t ot1 = iterator.next();
                   if (ot1 instanceof n0) {
                      ot1.Rf(3, p3);
                   }
                }
             }
             ViewParent parent = uAnimCameraV.getParent();
             if (parent instanceof ViewGroup) {
                ViewParent viewParent = parent;
             }
             if (objArray1 != null) {
                objArray1.setClipChildren(1);
             }
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(integer, tb, a.class, "3")) {
          iterator = tb.getChildren().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof n0) {
                ot.mb(3);
             }
          }
       }
       tb = this.b;
       tb.d.m(new g(tb.x));
       return;
    }
}
