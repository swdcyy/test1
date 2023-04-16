package com.kuaishou.live.core.show.screenrecord.f;
import com.kwai.live.gzone.widget.e;
import com.kuaishou.live.core.show.screenrecord.f$a;
import com.kwai.live.gzone.widget.e$a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.f$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import d61.y;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import ij2.s;
import android.view.View$OnClickListener;
import ij2.t;
import ij2.w;
import ij2.u;
import ij2.v;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.n;
import ia2.a;
import android.view.ViewGroup$LayoutParams;
import ia2.b;
import android.graphics.drawable.Drawable;
import ij2.x;
import java.lang.Boolean;

public class f extends e	// class@000fe2
{
    public ImageView A;
    public f$b B;
    public boolean C;
    public boolean D;
    public long E;
    public boolean F;
    public boolean G;
    public int H;
    public View x;
    public View y;
    public TextView z;

    public void f(f$a p0){
       super(p0);
       this.B = p0.I;
       this.C = p0.J;
       this.D = p0.K;
       this.E = p0.L;
       this.F = p0.M;
       this.G = p0.N;
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       super.N(p0);
       f tB = this.B;
       if (tB != null) {
          tB.onDismiss();
       }
       return;
    }
    public int c0(){
       f obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.F != null) {
          obj = this.H;
          if (obj > null) {
             return obj;
          }
       }
       return super.c0();
    }
    public int d0(){
       Object obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!y.d(this.u())) {
          return 0x7f0d0a58;
       }
       if (this.F != null) {
          return 0x7f0d0a5a;
       }
       return 0x7f0d0a59;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a19d4);
       this.A = m1.f(p0, 0x7f0a19d0);
       this.x = m1.f(p0, 0x7f0a19d0);
       this.y = m1.f(p0, 0x7f0a19d1);
       m1.a(p0, new s(this), R.id.live_audience_screen_record_clear_screen_icon);
       m1.a(p0, new t(this), R.id.live_audience_screen_record_clear_screen_text);
       m1.a(p0, new w(this), R.id.live_audience_screen_record_start_button);
       m1.a(p0, new u(this), R.id.live_audience_screen_record_cancel_icon);
       m1.a(p0, new v(this), R.id.live_audience_screen_record_cancel_text);
       m1.a(p0, null, R.id.live_audience_start_screen_record_view);
       return;
    }
    public void f0(View p0,Bundle p1){
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uof, "2")) {
          return;
       }
       this.m0();
       f tx = this.x;
       int i = 0;
       int i1 = (this.D != null)? 0: 8;
       tx.setVisibility(i1);
       tx = this.y;
       if (this.D == null) {
          i = 8;
       }
       tx.setVisibility(i);
       this.z.setText(a1.q(R.string.arg_RES_7f101e76, (int)((float)this.E / 1000.00f)));
       if (this.F != null && !PatchProxy.applyVoidOneRefs(p0, this, uof, "10")) {
          Activity uActivity = n.d(p0);
          View view = p0.findViewById(R.id.live_audience_start_screen_record_landscape_new_style_container);
          p0 = p0.findViewById(R.id.live_audience_start_screen_record_landscape_new_style_left_view);
          if (uActivity == null || (view != null && p0 != null)) {
             int i2 = a.a(uActivity);
             this.H = i2;
             view.getLayoutParams().width = i2;
             view.setBackground(a.b(this.G));
             p0.setOnClickListener(new x(this));
          }
       }
    label_0080 :
       return;
    }
    public boolean j0(){
       Object obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.F != null) {
          return true;
       }
       return super.j0();
    }
    public final void l0(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tB = this.B;
       if (tB != null) {
          tB.b(this.C);
       }
       this.C = this.C ^ 0x01;
       this.m0();
       return;
    }
    public final void m0(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       if (this.C != null) {
          this.A.setImageResource(R.drawable.arg_RES_7f081466);
       }else {
          this.A.setImageResource(R.drawable.arg_RES_7f0810df);
       }
       return;
    }
}
