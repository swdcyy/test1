package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment;
import u8a.c;
import u8a.q;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import v8a.l;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialPanelBaseFragment$b;
import y8c.t;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u8a.r;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import u8a.b;
import androidx.fragment.app.FragmentActivity;
import e0a.j;
import java.lang.Number;
import ilc.a;
import msd.a;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.View;
import u8a.p;
import java.lang.Runnable;
import zl5.j;
import java.lang.Throwable;
import java.util.List;
import qvb.n0;
import u8a.q$a;
import kotlin.Pair;
import u8a.q$c;
import java.util.Map;
import java.util.Objects;
import android.animation.ValueAnimator;
import v8a.l$c;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import v8a.l$d;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$d;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import bh5.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.detail.slidev2.similarphoto.widget.NasaFeaturedFractionTranslateLayout;
import v8a.e;
import v8a.h;
import v8a.i;
import v8a.j;
import v8a.k;
import android.content.Context;
import y8c.g;
import u8a.e;
import k2b.e0;
import qvb.i;

public abstract class SerialPanelBaseFragment extends RecyclerFragment implements c, q	// class@0019f7
{
    public b F;
    public boolean G;
    public boolean H;
    public String I;
    public int J;
    public int K;
    public a L;
    public int M;
    public e N;
    public j O;
    public c P;
    public View Q;
    public final e R;
    public final l S;
    public List T;
    public FragmentActivity U;
    public int V;
    public final SerialPanelBaseFragment$b W;
    public static final n[] X;
    public static final SerialPanelBaseFragment$a Y;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(SerialPanelBaseFragment.class, "mRoot", "getMRoot\(\)Landroid/view/View;", 0))};
       SerialPanelBaseFragment.X = onArray;
       SerialPanelBaseFragment.Y = new SerialPanelBaseFragment$a(null);
    }
    public void SerialPanelBaseFragment(){
       super();
       this.M = -1;
       this.R = KotterKnifeKt.b(this, 0x7f0a4459);
       this.S = new l();
       this.T = new ArrayList();
       this.W = new SerialPanelBaseFragment$b(this);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new r(this);
    }
    public void D7(QPhoto p0,int p1){
       if (PatchProxy.isSupport(SerialPanelBaseFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SerialPanelBaseFragment.class, "12")) {
          return;
       }
       a.p(p0, "photo");
       SerialPanelBaseFragment tF = this.F;
       if (tF == null) {
          a.S("mSimilarPhotoPanelCallback");
       }
       tF.e(p0, p1);
       return;
    }
    public void Dd(FragmentActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialPanelBaseFragment.class, "19")) {
          return;
       }
       a.p(p0, "activity");
       if (this.H != null) {
          return;
       }
       this.H = true;
       this.U = p0;
       if (j.f()) {
          this.Sh();
       }else {
          this.Ph();
       }
       return;
    }
    public int G4(){
       Object obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public final int Gh(){
       return this.K;
    }
    public final a Hh(){
       return this.L;
    }
    public void Ig(FragmentActivity p0,String p1,int p2,QPhoto p3,int p4,b p5,boolean p6,a p7){
       SerialPanelBaseFragment serialPanelB = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p5;
       object oobject3 = p7;
       int i = 0;
       if (PatchProxy.isSupport(SerialPanelBaseFragment.class)) {
          Object[] objArray = new Object[]{oobject,p1,Integer.valueOf(p2),oobject1,Integer.valueOf(p4),oobject2,Boolean.valueOf(p6),oobject3};
          if (PatchProxy.applyVoid(objArray, this, SerialPanelBaseFragment.class, "15")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(oobject2, "similarPhotoPanelCallback");
       if (this.isAdded() && !this.isHidden()) {
          return;
       }else {
          serialPanelB.H = i;
          serialPanelB.F = oobject2;
          if (oobject1 != null) {
             this.Uh(oobject1);
          }
          c supportFragm = p0.getSupportFragmentManager();
          a.o(supportFragm, "activity.supportFragmentManager");
          e uoe = supportFragm.beginTransaction();
          a.o(uoe, "fragmentManager.beginTransaction\(\)");
          if (!j.f()) {
             uoe.y(R.anim.arg_RES_7f0100cd, i);
          }
          if (!this.isAdded()) {
             if (!PatchProxy.isSupport(SerialPanelBaseFragment.class) || !PatchProxy.applyVoidFourRefs("SerialEpisodePanelFragment", Integer.valueOf(p2), uoe, p7, this, SerialPanelBaseFragment.class, "16")) {
                uoe.w(p2, this, "SerialEpisodePanelFragment");
                uoe.o();
                if (j.f()) {
                   View view = this.Jh();
                   if (view != null) {
                      view.postDelayed(new p(this, oobject3), 500);
                   }
                }else if(oobject3 != null){
                   p7.invoke();
                }
             }
          }else if(PatchProxy.applyVoidTwoRefs(uoe, oobject3, this, SerialPanelBaseFragment.class, "17")){
             if (oobject3 != null) {
                p7.invoke();
             }
             uoe.E(this);
             uoe.o();
             if (j.f()) {
                this.Th();
             }
          }
       label_00e8 :
          serialPanelB.G = true;
          SerialPanelBaseFragment f = serialPanelB.F;
          if (f == null) {
             a.S("mSimilarPhotoPanelCallback");
          }
          f.d();
          return;
       }
    }
    public final j Ih(){
       return this.O;
    }
    public final View Jh(){
       Object obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.R.a(this, SerialPanelBaseFragment.X[0]);
    }
    public void K1(QPhoto p0,int p1){
       if (PatchProxy.isSupport(SerialPanelBaseFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SerialPanelBaseFragment.class, "11")) {
          return;
       }
       a.p(p0, "photo");
       SerialPanelBaseFragment tL = this.L;
       if (tL != null) {
          tL.E0(p0);
       }
       tL = this.F;
       if (tL == null) {
          a.S("mSimilarPhotoPanelCallback");
       }
       tL.g(p0, p1, false);
       return;
    }
    public final int Kh(){
       return this.M;
    }
    public final b Lh(){
       SerialPanelBaseFragment obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj == null) {
          a.S("mSimilarPhotoPanelCallback");
       }
       return obj;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(SerialPanelBaseFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, SerialPanelBaseFragment.class, "28")) {
          return;
       }
       super.M1(p0, p1);
       if (p0) {
          SerialPanelBaseFragment tQ = this.Q;
          if (tQ != null) {
             tQ.setVisibility(8);
          }
       }
       return;
    }
    public final int Mh(){
       return this.J;
    }
    public final void Nh(){
       if (PatchProxy.applyVoid(null, this, SerialPanelBaseFragment.class, "25")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          this.Z9(activity, null);
       }
       return;
    }
    public abstract boolean Oh(int p0);
    public final void Ph(){
       if (PatchProxy.applyVoid(null, this, SerialPanelBaseFragment.class, "20")) {
          return;
       }
       SerialPanelBaseFragment tU = this.U;
       if (tU != null) {
          c supportFragm = tU.getSupportFragmentManager();
          if (supportFragm != null) {
             a.o(supportFragm, "mHostActivity?.supportFragmentManager ?: return");
             e uoe = supportFragm.beginTransaction();
             a.o(uoe, "fragmentManager.beginTransaction\(\)");
             if (!j.f()) {
                uoe.y(0, R.anim.arg_RES_7f01010d);
             }
             if (this.H != null) {
                uoe.u(this);
             }else {
                uoe.s(this);
             }
             uoe.m();
             this.G = false;
          }
       }
       return;
    }
    public abstract void Qh();
    public final void Rh(int p0){
       this.K = p0;
    }
    public boolean S1(){
       return false;
    }
    public final void Sh(){
       if (PatchProxy.applyVoid(null, this, SerialPanelBaseFragment.class, "22")) {
          return;
       }
       if (this.S.b()) {
          this.S.e();
       }
       return;
    }
    public final void Th(){
       if (PatchProxy.applyVoid(null, this, SerialPanelBaseFragment.class, "21")) {
          return;
       }
       if (!this.S.b()) {
          this.S.f();
       }
       return;
    }
    public abstract void Uh(QPhoto p0);
    public void Y2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialPanelBaseFragment.class, "29")) {
          return;
       }
       a.p(p0, "listener");
       this.T = p0;
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SerialPanelBaseFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SerialPanelBaseFragment.class, "27")) {
          return;
       }
       super.Z1(p0, p1);
       if (p0) {
          SerialPanelBaseFragment tQ = this.Q;
          if (tQ != null) {
             tQ.setVisibility(0);
          }
       }
       return;
    }
    public void Z9(FragmentActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialPanelBaseFragment.class, "18")) {
          return;
       }
       a.p(p0, "activity");
       if (this.isHidden()) {
          return;
       }
       this.I = p1;
       this.U = p0;
       if (j.f()) {
          this.Sh();
       }else {
          this.Ph();
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SerialPanelBaseFragment.class, "8")) {
          return;
       }
       super.a();
       SerialPanelBaseFragment tO = this.O;
       if (tO != null) {
          tO.a();
       }
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.H == null && (!this.isHidden() && this.G != null))? true: false;
       return b;
    }
    public void g6(q$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialPanelBaseFragment.class, "23")) {
          return;
       }
       a.p(p0, "builder");
       p0 = p0.d;
       if (p0 != null) {
          this.Uh(p0);
       }
       return;
    }
    public Pair getCursor(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Pair obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "35");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(this, null, q$c.class, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = new Pair("", "");
       }
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d14b8;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SerialPanelBaseFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SerialPanelBaseFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       return "";
    }
    public int kg(){
       Object obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SerialPanelBaseFragment.class, "30")) {
          return;
       }
       super.onDestroy();
       if (j.f()) {
          SerialPanelBaseFragment tS = this.S;
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoid(null, tS, l.class, "4")) {
             tS.h = null;
             l i = tS.i;
             if (i != null) {
                i.cancel();
             }
             i = tS.j;
             int i1 = 1;
             if (i != null) {
                if (!PatchProxy.applyVoid(null, i, l$c.class, "2")) {
                   i.e = i1;
                   i.b.removeOnPreDrawListener(i);
                }
                tS.j = null;
             }
             tS.m = false;
             if (tS.d != null) {
                int i2 = tS.l + i1;
                l ol = 4;
                while (i2 <= ol) {
                   if (i2 == ol) {
                      tS.d.a(n.j(tS.a), tS.b.getHeight(), n.j(tS.a), 0);
                   }
                   tS.c(i2);
                   i2 = i2 + 1;
                }
             }
             tS.a = null;
             i = tS.b;
             if (i != null) {
                i.removeOnLayoutChangeListener(tS.n);
             }
             i = tS.c;
             if (i != null) {
                i.setOnTopChangeListener(null);
             }
             tS.c = null;
             tS.b = null;
          }
          this.S.d(null);
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(SerialPanelBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SerialPanelBaseFragment.class, "31")) {
          return;
       }
       SerialPanelBaseFragment tS = this.S;
       Objects.requireNonNull(tS);
       if (!PatchProxy.applyVoid(null, tS, l.class, "11") && tS.m != null) {
          tS.f();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       String str = "7";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialPanelBaseFragment.class, str)) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       view = this.Jh();
       SerialPanelBaseFragment serialPanelB = null;
       ViewGroup$LayoutParams layoutParams = (view != null)? view.getLayoutParams(): serialPanelB;
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       if (j.f()) {
          layoutParams.height = e.b(this.getActivity());
          SerialPanelBaseFragment tS = this.S;
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoidOneRefs(this, tS, l.class, "1")) {
             tS.a = this.getActivity();
             if (this.getView() != null) {
                ConstraintLayout uConstraintL = this.getView().findViewById(R.id.view_root);
                tS.b = uConstraintL;
                uConstraintL.setTranslationY((float)uConstraintL.getLayoutParams().height);
                NasaFeaturedFractionTranslateLayout nasaFeatured = this.getView().findViewById(R.id.content_container);
                tS.c = nasaFeatured;
                nasaFeatured.setOnTopChangeListener(new e(tS));
                l b = tS.b;
                if (b != null && tS.c != null) {
                   b.addOnLayoutChangeListener(tS.n);
                   tS.b.requestLayout();
                   if (!PatchProxy.applyVoid(serialPanelB, tS, l.class, "2")) {
                      tS.k.put(Integer.valueOf(1), new h(tS));
                      tS.k.put(Integer.valueOf(2), new i(tS));
                      tS.k.put(Integer.valueOf(3), new j(tS));
                      tS.k.put(Integer.valueOf(4), new k(tS));
                   }
                   tS.l = 0;
                   if (!PatchProxy.applyVoid(serialPanelB, tS, l.class, str)) {
                      l h = tS.h;
                      if (h != null) {
                         h.run();
                      }
                      tS.h = serialPanelB;
                   }
                }
             }
          }
          this.S.d(this.W);
       }else {
          layoutParams.height = (int)((float)n.u(this.getActivity()) * 0x3f1e353f);
       }
       serialPanelB = this.V;
       if (serialPanelB > null) {
          layoutParams.bottomMargin = serialPanelB;
       }
       p0 = p0.findViewById(R.id.serial_episode_panel_loading_skeleton);
       this.Q = p0;
       if (p0 != null) {
          p0.setVisibility(0);
       }
       return;
    }
    public List r8(){
       ArrayList obj = PatchProxy.apply(null, this, SerialPanelBaseFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(this, null, q$c.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new ArrayList();
       }
       return obj;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SerialPanelBaseFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SerialPanelBaseFragment.class, "26")) {
          return;
       }
       super.v2(p0, p1);
       if (p0) {
          SerialPanelBaseFragment tQ = this.Q;
          if (tQ != null) {
             tQ.setVisibility(8);
          }
          this.Qh();
       }
       return;
    }
    public void ve(int p0){
       this.V = p0;
    }
    public g vh(){
       e0 uoe0;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, SerialPanelBaseFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SerialPanelBaseFragment tL = this.L;
       if (tL != null) {
          uoe0 = tL.s0();
          if (uoe0 != null) {
          label_001e :
             SerialPanelBaseFragment tL1 = this.L;
             if (tL1 != null) {
                objArray = tL1.w0();
             }
             obj = new e(this, uoe0, objArray);
             this.N = obj;
             return obj;
          }
       }
       uoe0 = this;
       goto label_001e ;
    }
    public i wg(){
       return this.O;
    }
    public void ze(){
    }
}
