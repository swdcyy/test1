package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.util.HashSet;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$a;
import rg2.g0;
import java.lang.System;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.view.View;
import rg2.j;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import uw1.f;
import androidx.fragment.app.Fragment;
import ekd.m1;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import java.lang.Boolean;
import java.lang.Math;
import com.kuaishou.live.core.basic.widget.LiveSafeViewPager;
import android.content.Context;
import va1.n0;
import android.content.res.Resources;
import cw9.c;
import lnc.a1;
import androidx.viewpager.widget.ViewPager;
import ya1.z;
import androidx.viewpager.widget.ViewPager$j;
import com.kwai.sdk.switchconfig.a;
import rg2.k;
import rg2.f;
import android.view.View$OnClickListener;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import ym5.a;
import android.os.Bundle;
import android.app.Dialog;
import android.view.Window;
import com.kuaishou.live.core.show.redpacket.container.d;
import android.content.DialogInterface$OnShowListener;
import android.view.LayoutInflater;
import i2b.a;
import androidx.viewpager.widget.ViewPager$i;
import java.util.Set;
import androidx.fragment.app.DialogFragment;
import java.util.Collection;
import ekd.q;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter;
import androidx.fragment.app.c;
import rg2.g;
import h3.a;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$c;
import android.view.View$OnTouchListener;
import gy2.e;
import gy2.k;
import android.widget.ImageView;
import com.kuaishou.live.common.core.basic.resource.c;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.Map;
import java.util.Iterator;
import java.lang.Integer;
import uw1.j;

public class LiveRedPacketContainerDialogFragment extends LiveSafeDialogFragment implements d	// class@000e66
{
    public TextView A;
    public LottieAnimationView B;
    public LottieAnimationView C;
    public ObjectAnimator D;
    public View E;
    public LottieAnimationView F;
    public ViewGroup G;
    public final Set H;
    public Map I;
    public DialogInterface$OnShowListener J;
    public Runnable K;
    public final Animator$AnimatorListener L;
    public boolean M;
    public final Set N;
    public String O;
    public LiveRedPacketContainerDialogFragment$e P;
    public LiveRedPacketContainerDialogFragment$d Q;
    public String R;
    public boolean S;
    public final g0 T;
    public final ViewPager$i U;
    public LiveSafeViewPager s;
    public AnimatorSet t;
    public View u;
    public View v;
    public LiveRedPacketContainerPagerAdapter w;
    public List x;
    public List y;
    public View z;
    public static final int V;

    public void LiveRedPacketContainerDialogFragment(){
       super();
       this.H = new HashSet();
       this.L = new LiveRedPacketContainerDialogFragment$a(this);
       this.N = new HashSet();
       this.T = new g0(System.nanoTime());
       this.U = new LiveRedPacketContainerDialogFragment$b(this);
    }
    public void Ah(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "4")) {
          return;
       }
       LiveRedPacketContainerDialogFragment tz = this.z;
       if (tz != null) {
          tz.animate().alpha(0).setDuration(100).withEndAction(new j(this)).start();
       }
       return;
    }
    public final String Bh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerDialogFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Zg("key_select_red_packet_id");
    }
    public ViewGroup Ch(){
       return this.G;
    }
    public void Dh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "10")) {
          return;
       }
       View[] viewArray = new View[]{this.v};
       n.Z(8, viewArray);
       return;
    }
    public final int Eh(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRedPacketContainerDialogFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return -1;
       }
       int i = 0;
       while (true) {
          if (i >= this.y.size()) {
             return -1;
          }
          if (TextUtils.equals(p0, this.y.get(i).a())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final void Fh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "2")) {
          return;
       }
       this.z = m1.f(this.getView(), 0x7f0a250c);
       this.A = m1.f(this.getView(), 0x7f0a24eb);
       this.B = m1.f(this.getView(), 0x7f0a24ee);
       this.C = m1.f(this.getView(), 0x7f0a24fd);
       c0 a = c0.a;
       LiveRedPacketResourcePathConstant lIVE_RED_PAC = LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_CONTAINER_TIPS_LEFT;
       this.B.setAnimationFromUrl(a.b(lIVE_RED_PAC.getResourcePath()));
       this.C.setAnimationFromUrl(a.b(lIVE_RED_PAC.getResourcePath()));
       return;
    }
    public final void Gh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "18")) {
          return;
       }
       LiveRedPacketContainerDialogFragment tK = this.K;
       if (tK != null) {
          LiveRedPacketContainerDialogFragment ts = this.s;
          if (ts != null) {
             ts.removeCallbacks(tK);
          }
       }
       return;
    }
    public void Hh(String p0,boolean p1){
       if (PatchProxy.isSupport(LiveRedPacketContainerDialogFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveRedPacketContainerDialogFragment.class, "11")) {
          return;
       }
       this.s.setCurrentItem(Math.max(0, this.Eh(p0)));
       this.s.setScrollable(p1);
       return;
    }
    public void Ih(){
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPacketContainerDialogFragment.class, "16")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       Context context = this.getContext();
       if (context == null) {
          return;
       }
       float f = (float)n0.f();
       float f1 = (float)c.a(this.getResources(), 0x7f07093f);
       float f2 = 2.00f;
       float f3 = ((f - f1) / f2) - (float)a1.e(14.00f);
       int i = 1;
       if (f3 - (float)this.s.getPaddingLeft()) {
          this.s.setPadding((int)f3, 0, (int)f3, 0);
          i1 = 1;
       }else {
          i1 = 0;
       }
       int i2 = (int)(((float)(c.a(this.getResources(), 0x7f07034b) - (int)((f1 * 0.20f) / f2)) * ((float)n.P(context, f) * 0x3f800000)) / 360.00f);
       if (i2 != this.s.getPageMargin()) {
          this.s.setPageMargin(i2);
       }else {
          i = i1;
       }
       if (i) {
          this.s.setPageTransformer(0, new z(0x3f4ccccd, (f3 / ((float)n0.f() - (f2 * f3)))));
          this.s.invalidate();
          this.s.requestLayout();
          if (!PatchProxy.applyVoid(objArray, this, LiveRedPacketContainerDialogFragment.class, "17") && (a.t().d("liveEnableRedPacketDialogFoldAdaptation", 0) && this.s != null)) {
             this.Gh();
             k ok = new k(this);
             this.K = ok;
             this.s.post(ok);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketContainerDialogFragment.class, "12")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a24e8);
       this.v = m1.f(p0, 0x7f0a24e6);
       this.E = m1.f(p0, 0x7f0a4030);
       this.F = m1.f(p0, 0x7f0a24e7);
       this.G = m1.f(p0, 0x7f0a2518);
       this.v.setOnClickListener(new f(this));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketContainerDialogFragment.class, "33")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (d.a(0x4c5dd1b8).f2()) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveRedPacketContainerDialogFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       obj = uDialog.getWindow();
       obj.setBackgroundDrawableResource(0x106000d);
       obj.requestFeature(1);
       obj.setWindowAnimations(R.style.arg_RES_7f1105ac);
       obj.setDimAmount(0x3f000000);
       this.ph(new d(this));
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveRedPacketContainerDialogFragment.class, "28");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0d93, p1, false);
       this.u = view;
       this.doBindView(view);
       return this.u;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "29")) {
          return;
       }
       super.onDestroyView();
       this.s.removeOnPageChangeListener(this.U);
       this.Gh();
       this.yh();
       LiveRedPacketContainerDialogFragment tu = this.u;
       if (tu != null) {
          tu.animate().cancel();
       }
       this.N.clear();
       this.wh();
       this.xh();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "31")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          return;
       }
       dialog.getWindow().setLayout(-1, -1);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketContainerDialogFragment.class, "15")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (q.f(this.y)) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          this.M = a.a.getBoolean(b.d("user")+"hasShowRedPacketContainerTips", false);
          LiveRedPacketContainerPagerAdapter liveRedPacke = new LiveRedPacketContainerPagerAdapter(this.getChildFragmentManager());
          this.w = liveRedPacke;
          liveRedPacke.A(this.y);
          LiveRedPacketContainerDialogFragment tw = this.w;
          tw.p = this.T;
          tw.n = this.R;
          tw.l = new g(this);
          this.s.setOffscreenPageLimit(2);
          this.s.setAdapter(this.w);
          this.Hh(this.Bh(), true);
          this.U.onPageSelected(this.s.getCurrentItem());
          this.Ih();
          View[] viewArray = new View[true];
          viewArray[0] = this.v;
          n.Z(false, viewArray);
          this.s.addOnPageChangeListener(this.U);
          this.s.setOnTouchListener(new LiveRedPacketContainerDialogFragment$c(this));
          return;
       }
    }
    public e uh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketContainerDialogFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(1, 3);
    }
    public final void wh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "25")) {
          return;
       }
       this.F.setVisibility(8);
       c.e(this.F);
       return;
    }
    public final void xh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "27")) {
          return;
       }
       LiveRedPacketContainerDialogFragment tt = this.t;
       if (tt != null && tt.isRunning()) {
          this.t.removeAllListeners();
          this.t.cancel();
       }
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "3")) {
          return;
       }
       LiveRedPacketContainerDialogFragment tD = this.D;
       if (tD != null) {
          tD.cancel();
          this.D.removeAllListeners();
       }
       tD = this.z;
       if (tD != null) {
          tD.animate().cancel();
       }
       tD = this.B;
       if (tD != null) {
          tD.f();
       }
       tD = this.C;
       if (tD != null) {
          tD.f();
       }
       return;
    }
    public void zh(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketContainerDialogFragment.class, "19")) {
          return;
       }
       LiveRedPacketContainerDialogFragment tI = this.I;
       if (tI != null) {
          Iterator iterator = tI.keySet().iterator();
          while (iterator.hasNext()) {
             int i = iterator.next().intValue();
             if (this.H.contains(Integer.valueOf(i)) && this.I.get(Integer.valueOf(i)) != null) {
                this.I.get(Integer.valueOf(i)).a(i);
             }
          }
       }
       return;
    }
}
