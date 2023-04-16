package com.yxcorp.gifshow.detail.slidev2.presenter.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Float;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import b8a.o0;
import com.yxcorp.gifshow.detail.slidev2.presenter.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import b8a.r0;
import erd.g;
import crd.b;
import brd.t;
import b8a.q0;
import uw9.l0;
import b8a.p0;
import android.app.Activity;
import android.view.View;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.widget.RelativeLayout;
import java.lang.Boolean;
import hn5.c;
import oo5.a;
import ro5.a;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import rf5.u;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import ge5.d;
import joc.q;
import d0a.n;
import brd.y;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView;

public class l extends PresenterV2	// class@0019c3
{
    public final a A;
    public final ScaleCleanControllerView$a B;
    public ScaleCleanControllerView p;
    public ViewStub q;
    public SwipeLayout r;
    public y s;
    public t t;
    public t u;
    public u v;
    public SlidePlayViewModel w;
    public BaseFragment x;
    public final List y;
    public l0 z;

    public void l(){
       super();
       Float[] uFloatArray = new Float[]{Float.valueOf(0x3f000000),Float.valueOf(0x3f400000),Float.valueOf(0x3f800000),Float.valueOf(0x3fa00000),Float.valueOf(0x3fc00000),Float.valueOf(2.00f)};
       this.y = Arrays.asList(uFloatArray);
       this.A = new o0(this);
       this.B = new l$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       u1.a(this);
       this.w = SlidePlayViewModel.B0(this.x);
       this.X7(this.t.subscribe(new r0(this)));
       this.X7(this.u.subscribe(new q0(this)));
       this.X7(this.z.L1.subscribe(new p0(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.r = this.getActivity().findViewById(0x7f0a3c34);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "10")) {
          return;
       }
       l tp = this.p;
       if (tp != null) {
          tp.setVisibility(8);
       }
       this.P8(true);
       this.S8();
       u1.b(this);
       return;
    }
    public final void P8(boolean p0){
       d d;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "9")) {
          return;
       }
       if (this.getActivity() instanceof c) {
          a.i(this.x, p0, 17);
          a.o(this.x, p0, 17);
          q.p0(this.getActivity()).w0(p0, 15);
       }
       ol = this.r;
       if (ol != null) {
          ol.n(p0, 25);
       }
       this.v.F(p0, 22);
       this.w.d(p0, 23);
       Activity activity = this.getActivity();
       if (activity != null && (!activity.isFinishing() && activity instanceof PhotoDetailActivity)) {
          d uod = activity.p();
          if (uod == null) {
             return;
          }else if(p0){
             d = uod.d;
             if (d != null) {
                d.e(25);
             }
             d = uod.g;
             if (d != null) {
                d.e(25);
             }
             d = uod.c;
             if (d != null) {
                d.e(25);
             }
             d = uod.e;
             if (d != null) {
                d.e(25);
             }
             d = uod.f;
             if (d != null) {
                d.e(25);
             }
             d = uod.h;
             if (d != null) {
                d.e(25);
             }
          }else {
             d = uod.d;
             if (d != null) {
                d.a(25);
             }
             d = uod.g;
             if (d != null) {
                d.a(25);
             }
             d = uod.c;
             if (d != null) {
                d.a(25);
             }
             d = uod.e;
             if (d != null) {
                d.a(25);
             }
             d = uod.f;
             if (d != null) {
                d.a(25);
             }
             d = uod.h;
             if (d != null) {
                d.a(25);
             }
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       this.s.onNext(new n(0));
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null && (!activity.isFinishing() && activity instanceof GifshowActivity)) {
          activity.l3(this.A);
       }
    label_0023 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3713);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.x = this.r8("FRAGMENT");
       this.t = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       this.s = this.r8("NASA_SCALE_CLEAN_CONTROLLER_EVENT_OBSERVER");
       this.v = this.q8(u.class);
       this.u = this.r8("NASA_SCALE_CLEAN_SPEED_CHANGED_OBSERVABLE");
       this.z = this.q8(l0.class);
       return;
    }
    public void onEventMainThread(PlayEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       l tp = this.p;
       if (tp != null && p0.c != 5) {
          p0 = p0.b;
          boolean b = (p0 == PlayEvent$Status.PAUSE || p0 == PlayEvent$Status.STOP)? true: false;
          tp.setPauseStatus(b);
       }
       return;
    }
}
