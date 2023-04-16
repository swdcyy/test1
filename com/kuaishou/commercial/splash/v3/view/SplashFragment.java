package com.kuaishou.commercial.splash.v3.view.SplashFragment;
import yy.v0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.lang.StringBuilder;
import yx.j0;
import androidx.fragment.app.FragmentActivity;
import java.lang.Boolean;
import com.kuaishou.commercial.splash.v3.view.SplashV3Activity;
import android.app.Activity;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;
import lz.d;
import java.lang.Runnable;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.WindowManager$LayoutParams;
import android.os.Build$VERSION;
import android.content.Context;
import android.os.SystemClock;
import kz.g;
import ekd.q1;
import wkd.b;
import tjc.c;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import brd.t;
import t45.d;
import brd.z;
import lz.b;
import erd.g;
import crd.b;
import kz.h;
import lz.c;
import wl9.w;
import tjc.a;
import com.kuaishou.commercial.splash.presenter.h;
import mxb.u;
import mrd.a;
import android.view.LayoutInflater;
import ag6.a;
import com.kuaishou.commercial.splash.v3.view.a;
import android.view.View$OnTouchListener;
import zf6.k;
import com.kuaishou.commercial.splash.SplashUtils;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b9;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.commercial.splash.presenter.e;
import gz.e3;
import com.kuaishou.commercial.splash.presenter.n;
import kz.a;
import kz.i;
import gz.s;
import kz.a$a;
import gz.u2;
import kz.a$b;
import com.kuaishou.commercial.splash.presenter.r0;
import i2b.a;

public class SplashFragment extends BaseFragment implements v0	// class@001628
{
    public PresenterV2 j;
    public g k;
    public h l;
    public b m;
    public b n;
    public View o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public static int t;

    public void SplashFragment(){
       super();
       this.p = false;
       this.q = -1;
       this.r = -1;
       this.s = -1;
    }
    public static Fragment ch(int p0){
       SplashFragment obj;
       if (PatchProxy.isSupport(SplashFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, SplashFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SplashFragment();
       Bundle uBundle = new Bundle();
       uBundle.putInt("ATTATCH_TO", p0);
       obj.setArguments(uBundle);
       return obj;
    }
    public int M(){
       return 7;
    }
    public final void dh(){
       if (PatchProxy.applyVoid(null, this, SplashFragment.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashFragment", "=== finish === ,isAdded = "+this.isAdded()+",mFinished = "+this.p, objArray);
       if (this.isAdded() && this.p == null) {
          this.fh(this.getActivity(), 0);
       }
       return;
    }
    public boolean eh(){
       return this.p;
    }
    public final void fh(FragmentActivity p0,boolean p1){
       if (PatchProxy.isSupport(SplashFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SplashFragment.class, "20")) {
          return;
       }
       this.p = true;
       if (p0 instanceof SplashV3Activity) {
          p0.finish();
       }else if(p1){
          ViewGroup viewGroup = PatchProxy.applyOneRefs(p0, this, SplashFragment.class, "27");
          if (viewGroup == PatchProxyResult.class) {
             viewGroup = p0.getWindow().getDecorView();
          }
          viewGroup.post(new d(this, p0));
       }else {
          p0.getSupportFragmentManager().beginTransaction().u(this).o();
       }
       return;
    }
    public int getPage(){
       return 0x7d8f;
    }
    public String getUrl(){
       return "ks://splash";
    }
    public final void gh(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashFragment.class, "13")) {
          return;
       }
       WindowManager$LayoutParams attributes = p0.getAttributes();
       WindowManager$LayoutParams flags = attributes.flags;
       this.s = flags;
       this.s = flags & 0xff7f;
       p0.addFlags(1024);
       p0.clearFlags(Integer.MIN_VALUE);
       p0.clearFlags(2048);
       p0.addFlags(0x4000000);
       if (Build$VERSION.SDK_INT >= 28) {
          this.r = attributes.layoutInDisplayCutoutMode;
          attributes.layoutInDisplayCutoutMode = 1;
          p0.setAttributes(attributes);
       }
       return;
    }
    public final void hh(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashFragment.class, "14")) {
          return;
       }
       WindowManager$LayoutParams attributes = p0.getAttributes();
       SplashFragment ts = this.s;
       if (ts != -1) {
          p0.setFlags(ts, -2080371712);
       }
       if (Build$VERSION.SDK_INT >= 28) {
          ts = this.r;
          if (ts != -1) {
             attributes.layoutInDisplayCutoutMode = ts;
             p0.setAttributes(attributes);
          }
       }
       return;
    }
    public boolean k4(){
       return true;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       this.p = false;
       Object[] objArray = new Object[false];
       j0.f("SplashFragment", "=== onAttach === ", objArray);
       return;
    }
    public void onCreate(Bundle p0){
       int b;
       Object[] objArray2;
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashFragment", "onCreate, delay fragment splash at "+SystemClock.elapsedRealtime(), objArray);
       this.k = new g();
       SplashFragment.t = SplashFragment.t + 1;
       FragmentActivity activity = this.getActivity();
       if (!PatchProxy.applyVoidOneRefs(activity, this, SplashFragment.class, "9")) {
          this.q = activity.getWindow().getDecorView().getSystemUiVisibility();
          if (!PatchProxy.applyVoidOneRefs(activity, this, SplashFragment.class, "10")) {
             q1.r0(activity).o0("SplashFragment");
          }
          this.gh(activity.getWindow());
       }
       Object[] objArray1 = new Object[i];
       j0.f("SplashFragment", "create "+this, objArray1);
       objArray1 = null;
       RxBus obj = PatchProxy.apply(objArray1, this, SplashFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = -1608526086;
          b = (b.a(b).S() && b.a(b).X())? true: false;
          if (!b) {
             CommercialSplashTracker.E().U(1);
          }
       }
       if (!b) {
          objArray2 = new Object[i];
          j0.l("SplashFragment", "no splash data! "+this, objArray2);
          this.fh(activity, 1);
          return;
       }else {
          obj = RxBus.f;
          z a = d.a;
          this.m = obj.f(e.class).observeOn(a).subscribe(new b(this));
          t ot = obj.f(h.class).observeOn(a);
          this.n = ot.subscribe(new c(this));
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             int intx = arguments.getInt("ATTATCH_TO", i);
             if (intx > 0) {
                Object[] objArray3 = new Object[i];
                j0.a("SplashFragment", "send SplashDisplayEvent,attachedTo = "+intx, objArray3);
                obj.b(new w(intx));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(activity, this, SplashFragment.class, "26")) {
             objArray2 = new Object[i];
             j0.a("SplashFragment", "onShowSplashFragment in activity "+activity, objArray2);
             if (activity instanceof a) {
                activity.g1(this);
             }
          }
          h oh = new h(activity, 1, objArray1);
          oh.f = a.g();
          this.l = oh;
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SplashFragment.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashFragment", "=== onCreateView ===, isFinishing = "+this.eh(), objArray);
       if (this.eh()) {
          return null;
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d0037, p1, i);
       this.o = view;
       view.setOnTouchListener(a.b);
       int i1 = 0x7f0a0a7a;
       view = this.o.findViewById(i1);
       if (!PatchProxy.applyVoidOneRefs(view, this, SplashFragment.class, "21")) {
          view = view.findViewById(i1);
          if (k.f()) {
             view.setBackgroundResource(R.color.arg_RES_7f061d74);
          }else {
             view.setBackgroundResource(R.color.arg_RES_7f061e52);
          }
       }
       return this.o;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SplashFragment.class, "17")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       String str = "SplashFragment";
       if (!PatchProxy.applyVoidOneRefs(activity, this, SplashFragment.class, "11")) {
          if (SplashUtils.f()) {
             activity.getWindow().getDecorView().setSystemUiVisibility(this.q);
          }
          if (!PatchProxy.applyVoidOneRefs(activity, this, SplashFragment.class, "12")) {
             q1.r0(activity).q0(str);
          }
          this.hh(activity.getWindow());
       }
       if (!PatchProxy.applyVoidOneRefs(activity, this, SplashFragment.class, "25")) {
          Object[] objArray1 = new Object[0];
          j0.a(str, "onHideSplashFragment in activity "+activity, objArray1);
          if (activity instanceof a) {
             activity.M1();
          }
       }
       SplashFragment.t = SplashFragment.t - 1;
       Object[] objArray = new Object[0];
       j0.f(str, "onDestroy "+this+" "+SplashFragment.t, objArray);
       SplashFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       b9.a(this.m);
       b9.a(this.n);
       c uoc = b.a(-1608526086);
       if (SplashFragment.t <= 0 && uoc.getState() == 3) {
          uoc.a0();
       }
       super.onDestroy();
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, SplashFragment.class, "3")) {
          return;
       }
       super.onDetach();
       Object[] objArray = new Object[0];
       j0.f("SplashFragment", "=== onDetach === ", objArray);
       return;
    }
    public void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashFragment.class, "18")) {
          return;
       }
       if (p0.a == 4 && !this.eh()) {
          this.dh();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, SplashFragment.class, "16")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       j0.f("SplashFragment", "onPause "+this, objArray);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, SplashFragment.class, "15")) {
          return;
       }
       super.onResume();
       if (SplashUtils.f()) {
          SplashUtils.A(this.getActivity().getWindow());
       }
       Object[] objArray = new Object[0];
       j0.f("SplashFragment", "onResume "+this, objArray);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, SplashFragment.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashFragment", "=== onStart === ", objArray);
       super.onStart();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       Object[] objArray2;
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashFragment.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashFragment", "=== onViewCreated ===,view = "+p0, objArray);
       super.onViewCreated(p0, p1);
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, this, SplashFragment.class, "22")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.j = presenterV2;
          presenterV2.U7(new e());
          this.j.U7(this.k);
          this.j.U7(new e3());
          this.j.U7(new n());
          SplashFragment tl = this.l;
          h k = tl.k;
          h j = tl.j;
          a$a uoa = PatchProxy.applyTwoRefs(k, j, objArray1, a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else if(k != null && k.a != null){
             Object[] objArray3 = new Object[0];
             j0.f("SplashFragment", "create ImageSplashPresentersBuilder >>>", objArray3);
             uoa = new a$a(k);
          }else if(j != null && j.a != null){
             objArray2 = new Object[0];
             j0.f("SplashFragment", "create VideoSplashPresentersBuilder >>>", objArray2);
             uoa = new a$b(j);
          }else {
             uoa = objArray1;
          }
          if (uoa != null) {
             uoa.a(this.j);
          }else {
             objArray2 = new Object[0];
             j0.f("SplashFragment", "invalid param, finish", objArray2);
             this.fh(this.getActivity(), 1);
          }
          SplashFragment tl1 = this.l;
          h k1 = tl1.k;
          k = tl1.j;
          if (!PatchProxy.applyVoidTwoRefs(k1, k, this, SplashFragment.class, "23")) {
             ViewGroup viewGroup = this.o.findViewById(R.id.splash_content);
             Context context = this.o.getContext();
             if (k1 != null) {
                i = (k1.W == 2)? 0x7f0d08b8: 0x7f0d08b9;
             }else if(k != null){
                i = 0x7f0d08bc;
             }else {
                i = 0;
             }
             if (i > 0) {
                objArray1 = a.d(context, i, viewGroup, 1);
             }
             objArray2 = new Object[0];
             j0.f("SplashFragment", "init view return:"+objArray1, objArray2);
          }
          this.j.f(this.o);
          objArray2 = new Object[]{this.l,this};
          this.j.i(objArray2);
       }
       return;
    }
    public boolean x1(){
       return true;
    }
}
