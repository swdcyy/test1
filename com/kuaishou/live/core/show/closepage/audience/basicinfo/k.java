package com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import g52.i;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.i;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.kwai.framework.activitycontext.ActivityContext;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.widget.TextView;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import java.lang.CharSequence;
import xk2.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import f52.w;
import sfc.a;
import f52.v;
import mz6.b;
import android.content.Context;
import mz6.a;
import mz6.b$d;
import f52.r;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import ekd.m1;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.h;
import android.view.View$OnClickListener;
import f52.u;
import f52.t;
import t02.a0;
import f52.b;

public class k extends c	// class@000a40
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public a0 p;
    public i q;
    public b r;
    public View s;
    public TextView t;
    public TextView u;
    public TextView v;
    public String w;
    public String x;
    public int y;
    public boolean z;
    public static String sLivePresenterClassName = "LivePlayClosedUserOperatePresenter";

    public void k(){
       super();
       this.D = true;
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "5")) {
          this.X7(this.q.a().subscribe(new i(this), Functions.d()));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.z = false;
       this.A = false;
       this.B = false;
       this.C = false;
       this.D = true;
       this.E = false;
       this.F = false;
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, k.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getActivity() != null && this.getActivity().equals(ActivityContext.g().e()))? true: false;
       return b;
    }
    public final void R8(View[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "7")) {
          return;
       }
       if (p0.length == 1) {
          object oobject = p0[0];
          oobject.setVisibility(0);
          LinearLayout$LayoutParams layoutParams = oobject.getLayoutParams();
          layoutParams.weight = 0;
          layoutParams.width = a1.d(0x7f07029f);
          layoutParams.leftMargin = 0;
          layoutParams.rightMargin = 0;
          oobject.setLayoutParams(layoutParams);
       }else {
          for (int i = 0; i < p0.length; i = i + 1) {
             object oobject1 = p0[i];
             oobject1.setVisibility(0);
             LinearLayout$LayoutParams layoutParams1 = oobject1.getLayoutParams();
             layoutParams1.weight = 0x3f800000;
             layoutParams1.width = 0;
             int i1 = 0x7f0702ab;
             int i2 = 0x7f07034b;
             if (!i) {
                layoutParams1.leftMargin = a1.d(i1);
                layoutParams1.rightMargin = a1.d(i2);
             }else {
                layoutParams1.leftMargin = a1.d(i2);
                layoutParams1.rightMargin = a1.d(i1);
             }
             oobject1.setLayoutParams(layoutParams1);
          }
       }
       return;
    }
    public final void S8(TextView p0,String p1,int p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, k.class, "14")) {
          return;
       }
       if (p0.getVisibility() == 8) {
          return;
       }
       TransitionDrawable background = p0.getBackground();
       background.setCrossFadeEnabled(true);
       p0.setText(p1);
       background.reverseTransition(p2);
       return;
    }
    public final void V8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "10")) {
          return;
       }
       t ot = j.q(new a(this.x, 11), this.getActivity(), p0);
       w ow = new w(this);
       a uoa = (p0)? new a(): Functions.d();
       ot.subscribe(ow, uoa);
       return;
    }
    public final void W8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "8")) {
          return;
       }
       t ot = j.n(new a(this.x, 11), this.getActivity(), p0);
       v ov = new v(this);
       a uoa = (p0)? new a(): Functions.d();
       ot.subscribe(ov, uoa);
       return;
    }
    public final void X8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "9")) {
          return;
       }
       b uob = new b(this.getActivity());
       a uoa = a.b();
       uoa.i(0);
       uoa.o(R.color.arg_RES_7f06200e);
       uoa.g(R.string.arg_RES_7f101f8f);
       uoa.p(R.dimen.arg_RES_7f070f70);
       uob.a(uoa.a());
       uoa = a.b();
       uoa.i(0);
       uoa.o(R.color.arg_RES_7f061767);
       uoa.g(R.string.arg_RES_7f100fdf);
       uoa.p(R.dimen.arg_RES_7f070f73);
       uob.a(uoa.a());
       uob.l(new r(this));
       if (p0) {
          uob.q();
       }else {
          this.V8(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.live_play_closed_v3_user_operate_container);
       this.s = p0;
       TextView textView = p0.findViewById(R.id.live_play_closed_user_operate_follow_text_view);
       this.t = textView;
       textView.setOnClickListener(new h(this));
       textView = this.s.findViewById(R.id.live_play_closed_user_operate_reservation_text_view);
       this.u = textView;
       textView.setOnClickListener(new u(this));
       textView = this.s.findViewById(R.id.live_play_closed_user_operate_replay_text_view);
       this.v = textView;
       textView.setOnClickListener(new t(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.r = this.q8(b.class);
       this.q = this.q8(i.class);
       return;
    }
}
