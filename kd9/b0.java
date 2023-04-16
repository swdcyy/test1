package kd9.b0;
import u07.t;
import lnc.a1;
import u07.t$a;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import com.yxcorp.gifshow.camera.record.base.b;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import kd9.c0;
import kd9.u;
import android.os.Bundle;
import j8c.a;
import q87.c;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class b0 extends t	// class@002c47
{
    public final CoverVideoView r;
    public static final int s;
    public static final float t;
    public static final int u;
    public static final int v;
    public static final int w;

    static {
       int i = a1.e(0x43cf0000);
       b0.s = i;
       float f = (float)a1.h() / (float)i;
       b0.t = f;
       b0.u = (int)((float)a1.e(312.00f) * f);
       b0.v = (int)((float)a1.e(0x438f0000) * f);
       b0.w = a1.e(32.00f);
    }
    public void b0(t$a p0,CoverVideoView p1){
       super(p0);
       this.r = p1;
    }
    public static void e0(t p0,b p1,e0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b0.class, "7")) {
          return;
       }
       p0.o();
       if (p2 != null) {
          c0.a(p2, "try_full_frame");
       }
       p1.m(new u());
       return;
    }
    public static void f0(t p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b0.class, "6")) {
          return;
       }
       p0.o();
       if (p1 != null) {
          c0.a(p1, "status_quo");
       }
       return;
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "11")) {
          return;
       }
       super.N(p0);
       Object[] objArray = new Object[0];
       a.D().w("FrameGuideDialog", "dismiss popup", objArray);
       this.r.i();
       return;
    }
    public void O(Bundle p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "8")) {
          return;
       }
       super.O(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FrameGuideDialog", "onShow popup", objArray);
       objArray = null;
       int i1 = 0x7f0a130c;
       if (!PatchProxy.applyVoid(objArray, this, b0.class, "10")) {
          view = this.t(i1);
          View view1 = this.t(R.id.negative);
          View view2 = this.t(R.id.positive);
          if (view != null && view2 != null) {
             ViewGroup parent1 = view.getParent();
             if (parent1 != null) {
                ViewGroup$LayoutParams layoutParams1 = parent1.getLayoutParams();
                if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                   layoutParams1.bottomMargin = i;
                   parent1.setLayoutParams(layoutParams1);
                }
             }
             if (view1 != null) {
                parent1 = view1.getParent();
                if (parent1 != null) {
                   parent1.setPadding(b0.w, parent1.getPaddingTop(), b0.w, parent1.getPaddingBottom());
                }
             }
             view = this.t(R.id.close);
             if (view != null) {
                view.bringToFront();
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, b0.class, "9")) {
          view = this.t(i1);
          if (view != null) {
             ViewGroup parent = view.getParent();
             if (parent != null) {
                int i2 = parent.indexOfChild(view);
                if (i2 != -1) {
                   ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                   layoutParams.height = b0.v;
                   layoutParams.width = b0.u;
                   parent.removeView(view);
                   parent.addView(this.r, i2, layoutParams);
                }
             }
          }
       }
       this.r.l();
       return;
    }
}
