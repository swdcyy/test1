package d63.b;
import k51.c;
import d63.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ho1.b;
import android.widget.TextView;
import oq5.c;
import jv1.b;
import t02.a0;
import hb2.g$b;
import ekd.m1;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import gq5.f;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends c	// class@002476
{
    public f A;
    public b B;
    public c C;
    public a0 p;
    public View q;
    public TextView r;
    public ViewGroup s;
    public View t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public View y;
    public b z;
    public static String sLivePresenterClassName = "LiveGzoneAudienceTopBarStylePresenter";

    public void b(){
       super();
       this.C = new a(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          int i = a1.e(26.00f);
          this.q.setBackgroundResource(R.drawable.arg_RES_7f08121e);
          ViewGroup$MarginLayoutParams layoutParams = this.t.getLayoutParams();
          if (!this.t.isInLayout()) {
             this.t.setLayoutParams(layoutParams);
          }else {
             this.t.forceLayout();
          }
          int i1 = a1.a(R.color.arg_RES_7f061457);
          this.B.a(i1);
          this.u.setTextColor(i1);
          this.r.setTextColor(a1.a(R.color.arg_RES_7f061c00));
          this.v.getLayoutParams().height = i;
          this.v.setTextColor(a1.a(R.color.arg_RES_7f061ff3));
          this.P8();
       }
       this.P8();
       this.z.H6(this.C);
       a0 l1 = this.p.l1;
       if (l1 != null) {
          View view = l1.i();
          if (view != null) {
             View view1 = m1.f(view, R.id.live_right_pendant_container);
             this.x = view1;
             if (view1 != null) {
                view1.setBackground(a1.f(R.drawable.arg_RES_7f08128a));
                this.w = m1.f(view, 0x7f0a2579);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.z.Q0(this.C);
       return;
    }
    public final void P8(){
       int b;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "4")) {
          return;
       }
       b = this.z.H2();
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "6")) {
          if (b) {
             this.q.setBackgroundResource(R.drawable.arg_RES_7f08121f);
          }else {
             this.q.setBackgroundResource(R.drawable.arg_RES_7f08121e);
          }
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "7")) {
          if (b) {
             this.r.setBackgroundResource(R.drawable.arg_RES_7f0810f0);
          }else {
             this.r.setBackgroundResource(R.drawable.arg_RES_7f081239);
          }
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "8")) {
          b tx = this.x;
          if (tx != null) {
             tx.setSelected(b);
             if (b) {
                this.w.setTextColor(a1.a(R.color.arg_RES_7f061fda));
             }else {
                this.w.setTextColor(a1.a(R.color.arg_RES_7f061c00));
             }
          }
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "9")) {
          this.A.r(false);
          if (this.y.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
             RelativeLayout$LayoutParams layoutParams = this.y.getLayoutParams();
             if (b) {
                layoutParams.removeRule(3);
                layoutParams.addRule(10);
                b = (this.p.c.isGRPRCustomizedLive())? a1.e(68.00f): a1.e(60.00f);
                layoutParams.topMargin = b;
             }else {
                layoutParams.removeRule(10);
                layoutParams.addRule(3, R.id.top_bar);
                layoutParams.topMargin = - a1.e(2.00f);
             }
             this.y.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3fd0);
       this.v = m1.f(p0, 0x7f0a1ced);
       this.u = m1.f(p0, 0x7f0a21f7);
       this.q = m1.f(p0, 0x7f0a18d9);
       this.t = m1.f(p0, 0x7f0a26a7);
       this.r = m1.f(p0, 0x7f0a1934);
       this.y = m1.f(p0, 0x7f0a2801);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.z = this.q8(b.class);
       this.p = this.q8(a0.class);
       this.A = this.q8(f.class);
       this.B = this.q8(b.class);
       return;
    }
}
