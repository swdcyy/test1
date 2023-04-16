package ci9.j;
import java.lang.Runnable;
import ci9.l;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewStub;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import android.view.ViewGroup;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.SparseArray;
import java.util.List;
import nm6.c$b;
import android.content.Intent;
import gh9.i;
import lnc.s6;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.TextView;
import java.lang.Integer;
import lnc.a1;
import java.lang.Float;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import a2.i0;
import ci9.h;
import com.kwai.library.widget.popup.common.f;
import oc9.d0;
import ci9.k;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$c;
import yh9.j;
import com.yxcorp.gifshow.camera.record.base.b;

public final class j implements Runnable	// class@0005fa
{
    public final l b;
    public final View c;

    public void j(l p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int i;
       int i1;
       int i5;
       j tb = this.b;
       Objects.requireNonNull(tb);
       l ol = l.class;
       ViewStub viewStub = this.c.findViewById(R.id.time_mode_stub);
       if (viewStub != null) {
          View view = viewStub.inflate();
          if (view != null) {
             tb.q = tb.e.findViewById(0x7f0a063e);
             tb.o = view.findViewById(0x7f0a0641);
             tb.p = view.findViewById(0x7f0a0640);
             if (!PatchProxy.applyVoid(null, tb, ol, "12")) {
                tb.t.clear();
                int i3 = 4;
                int[] ointArray = new int[i3]{0x7f0a34b3,0x7f0a34b4,0x7f0a34b5,0x7f0a34b6};
                for (int i4 = 0; i4 < tb.s.size() && i4 < i3; i4 = i4 + 1) {
                   c$b uob = tb.s.get(i4);
                   if (!i.a(tb.e.getIntent())) {
                      i5 = (s6.m())? 0x7f0d0199: 0x7f0d019a;
                   }else {
                      i5 = 0x7f0d0198;
                   }
                   TextView textView1 = n.G(tb.e, i5);
                   textView1.setTag(Integer.valueOf(uob.a));
                   textView1.setText(uob.a);
                   textView1.setId(ointArray[i4]);
                   tb.t.put(ointArray[i4], Integer.valueOf(uob.a()));
                   tb.p.a(textView1);
                }
             }
             tb.p.setSelectedTextColor(R.color.arg_RES_7f060114);
             if (!s6.m()) {
                l p = tb.p;
                i = a1.a(R.color.arg_RES_7f06010e);
                Objects.requireNonNull(p);
                if (!PatchProxy.isSupport(CameraScrollTabViewGroupV2.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(5.00f), Float.valueOf(3.00f), Float.valueOf(3.00f), Integer.valueOf(i), p, CameraScrollTabViewGroupV2.class, "36")) {
                   int i2 = 0;
                   while (i2 < p.getItemCount()) {
                      TextView textView = p.findViewById(p.u(i2));
                      if (textView != null) {
                         textView.setShadowLayer(5.00f, 3.00f, 3.00f, i);
                      }
                      i2 = i2 + 1;
                   }
                }
             }
             l t = tb.t;
             tb.p.c(t.keyAt(t.indexOfValue(Integer.valueOf(2))));
             if (!PatchProxy.applyVoidOneRefs(view, tb, ol, "14")) {
                n.Y(view.findViewById(R.id.radio_indicator), false, false);
                tb.p.setSelectedTextColor(R.color.arg_RES_7f060115);
                ViewGroup$LayoutParams layoutParams = tb.o.getLayoutParams();
                layoutParams.height = a1.d(0x7f070141);
                tb.o.setLayoutParams(layoutParams);
                i1 = tb.t.indexOfValue(Integer.valueOf(false));
                if (i1 >= 0) {
                   n.Y(tb.p.findViewById(tb.t.keyAt(i1)), 8, false);
                }
             }
             if (!i0.Y(tb.o)) {
                f.G(tb.o, new h(tb));
             }
             i1 = (tb.t.indexOfValue(Integer.valueOf(tb.n)) < 0)? 0: tb.n;
             tb.g2(i1);
             tb.p.setOnTabSelected(new k(tb));
             i1 = (tb.d.d(j.i).c == null && !tb.a2())? true: false;
             tb.i2(i1, false);
             tb.h2();
          }
       }
       return;
    }
}
