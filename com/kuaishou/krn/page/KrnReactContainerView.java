package com.kuaishou.krn.page.KrnReactContainerView;
import ik0.m;
import ik0.n;
import ik0.i;
import androidx.lifecycle.LifecycleObserver;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fi0.h;
import com.kuaishou.krn.utils.c;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.krn.page.c;
import ik0.b;
import com.kuaishou.krn.page.b;
import com.kuaishou.krn.page.c$b;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.delegate.BundleLoadMode;
import java.lang.Boolean;
import ik0.a;
import java.lang.Throwable;
import zj0.x;
import lj0.c;
import zj0.u;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.krn.context.KrnContextBindingManager;
import java.lang.StringBuilder;
import ek0.d;
import android.app.Activity;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.PluginTrackInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.model.LoadingStateTrack;
import com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import hg.a;
import com.kuaishou.krn.delegate.k;
import android.view.Window;
import ik0.e;
import java.lang.Number;
import java.util.Objects;
import sj0.b;
import kk0.c;
import ik0.l;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import com.kuaishou.krn.delegate.c;
import ik0.j;
import com.kuaishou.krn.page.KrnReactContainerView$a;
import kk0.a;

public class KrnReactContainerView extends FrameLayout implements m, n, i, LifecycleObserver	// class@00090f
{
    public KrnReactRootView b;
    public KwaiEmptyStateView c;
    public LaunchModel d;
    public KrnDelegate e;
    public Activity f;
    public KrnReactContainerView$a g;
    public LifecycleOwner h;
    public x i;
    public Window j;
    public boolean k;
    public a l;
    public c m;
    public boolean n;

    public void KrnReactContainerView(Context p0){
       super(p0, false);
    }
    public void KrnReactContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 0);
    }
    public void KrnReactContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, false);
    }
    public void KrnReactContainerView(Context p0,AttributeSet p1,int p2,boolean p3){
       View view;
       super(p0, p1, p2);
       this.n = p3;
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "1")) {
       }else {
          h.b.a("KrnReactContainerView initView");
          p2 = 0x7f0d06cf;
          if (this.n != null && c.b()) {
             view = c.a(p0, p2);
             this.addView(view);
          }else {
             view = a.c(LayoutInflater.from(p0), p2, this, true);
          }
          this.b = view.findViewById(0x7f0a1604);
          this.c = view.findViewById(0x7f0a1605);
          if (this.m == null) {
             c uoc = new c(view, null);
             this.m = uoc;
             uoc.c(new b(this));
          }
       }
       return;
    }
    public void KrnReactContainerView(Context p0,boolean p1){
       super(p0, null, 0, p1);
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "23")) {
          return;
       }
       if (this.getKrnDelegate() != null) {
          this.getKrnDelegate().s(null, true);
       }
       return;
    }
    public void D2(boolean p0){
       if (PatchProxy.isSupport(KrnReactContainerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KrnReactContainerView.class, "13")) {
          return;
       }
       KrnReactContainerView tl = this.l;
       if (tl != null) {
          tl.Wc(p0);
       }
       return;
    }
    public void Gd(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "9")) {
          return;
       }
       this.m.e(p0);
       return;
    }
    public void Gg(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "15")) {
          return;
       }
       c krnContext = this.getKrnContext();
       if (krnContext == null) {
          return;
       }
       x ox = krnContext.k();
       if (ox instanceof u) {
          ox.E(p0);
       }
       return;
    }
    public void Ja(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "26")) {
          return;
       }
       KrnReactContainerView te = this.e;
       if (te != null) {
          te.Ja();
       }
       return;
    }
    public void Lc(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "10")) {
          return;
       }
       this.m.d();
       return;
    }
    public void Rb(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "16")) {
          return;
       }
       c krnContext = this.getKrnContext();
       if (krnContext == null) {
          return;
       }
       x ox = krnContext.k();
       if (ox instanceof u) {
          ox.E(p0);
       }
       return;
    }
    public void Vc(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "12")) {
          return;
       }
       this.e.x(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "5")) {
          return;
       }
       if (this.k != null) {
          return;
       }
       KrnReactContainerView th = this.h;
       if (!PatchProxy.applyVoidOneRefs(th, this, KrnReactContainerView.class, "18")) {
          th.getLifecycle().removeObserver(this);
       }
       th = this.e;
       if (th != null) {
          if (this.i != null) {
             th.e().k().G(this.i);
          }
          this.e.n();
          KrnContextBindingManager.b.b(this.e.e());
       }
       this.k = true;
       d.e("unload view: "+this+" LaunchModel: "+this.d);
       return;
    }
    public void c(Activity p0,LaunchModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnReactContainerView.class, "2")) {
          return;
       }
       this.g(p0, null, p1);
       return;
    }
    public void df(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "25")) {
          return;
       }
       KrnReactContainerView te = this.e;
       if (te != null) {
          te.df();
       }
       return;
    }
    public void e(Activity p0,LifecycleOwner p1,LaunchModel p2,x p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KrnReactContainerView.class, "4")) {
          return;
       }
       if (this.f != null && this.d != null) {
          return;
       }
       d.e("load view: "+this+" LaunchModel: "+p2);
       long l = p2.j().c();
       long l1 = p2.j().b();
       this.f = p0;
       Bundle obj = PatchProxy.applyOneRefs(p2, this, KrnReactContainerView.class, "6");
       if (obj != PatchProxyResult.class) {
          p2 = obj;
       }else {
          obj = new Bundle();
          obj.putBoolean("enableBackBtnHandler", false);
          p2.t(obj);
       }
       this.d = p2;
       p2.g().putString("containerSource", "rn_react_container_view");
       this.i = p3;
       super(LoadingStateTrack$LoadType.NORMAL_BUSINESS_BUNDLE, this.d.a(), this.d.j());
       if (this.d.j().d() - null > 0) {
          this.l(this.d.j().d());
       }else {
          this.l(a.e());
       }
       k ok = new k(this, this.d, this, l, l1);
       this.e = this.d.j();
       if (p1 == null) {
          p1 = p0;
       }
       this.h = p1;
       this.d.j().m();
       if (p3 != null) {
          this.e.e().k().E(p3);
       }
       this.e.q(this.b);
       KrnContextBindingManager.b.a(this.e.e());
       KrnReactContainerView th = this.h;
       if (!PatchProxy.applyVoidOneRefs(th, this, KrnReactContainerView.class, "17")) {
          th.getLifecycle().addObserver(this);
       }
       return;
    }
    public void fc(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "7")) {
          return;
       }
       this.m.f();
       return;
    }
    public void g(Activity p0,LifecycleOwner p1,LaunchModel p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnReactContainerView.class, "3")) {
          return;
       }
       this.e(p0, p1, p2, null);
       return;
    }
    public Activity getActivity(){
       return this.f;
    }
    public Window getAttachedWindow(){
       return this.j;
    }
    public e getDegradeHandler(){
       return null;
    }
    public long getEngineId(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KrnReactContainerView obj = PatchProxy.apply(objArray, this, KrnReactContainerView.class, "22");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.e;
       if (obj == null) {
          return 0;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, KrnDelegate.class, "41");
       long l = (obj1 != patchProxyRe)? obj1.longValue(): (long)obj.e.i().hashCode();
       return l;
    }
    public Object getKrnContext(){
       return this.getKrnContext();
    }
    public c getKrnContext(){
       Object[] objArray = null;
       KrnReactContainerView obj = PatchProxy.apply(objArray, this, KrnReactContainerView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          objArray = obj.e();
       }
       return objArray;
    }
    public KrnDelegate getKrnDelegate(){
       return this.e;
    }
    public LaunchModel getLaunchModel(){
       return this.d;
    }
    public void lg(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "24")) {
          return;
       }
       KrnReactContainerView te = this.e;
       if (te != null) {
          te.lg();
       }
       return;
    }
    public c m1(){
       return l.b(this);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "21")) {
          return;
       }
       this.b();
       if (ExpConfigKt.f()) {
          KdsLeakDetector.g.e(this, "KrnReactContainerView", this.getLaunchModel().a(), this.getLaunchModel().b(), 8000);
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "20")) {
          return;
       }
       KrnReactContainerView te = this.e;
       if (te != null) {
          te.o();
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "19")) {
          return;
       }
       KrnReactContainerView te = this.e;
       if (te != null) {
          te.p();
       }
       return;
    }
    public void setAttachedWindow(Window p0){
       this.j = p0;
    }
    public void setCloseHandler(a p0){
       this.l = p0;
    }
    public void setDegradeHandler(e p0){
    }
    public void setKrnDelegateConfig(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactContainerView.class, "14")) {
          return;
       }
       this.e.t(p0);
       return;
    }
    public void setKrnStateController(c p0){
       this.m = p0;
    }
    public void setKrnTopBarController(j p0){
    }
    public void setLoadErrorCallBack(KrnReactContainerView$a p0){
       this.g = p0;
    }
    public void setTopBarConfig(a p0){
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, KrnReactContainerView.class, "8")) {
          return;
       }
       this.m.b();
       return;
    }
}
