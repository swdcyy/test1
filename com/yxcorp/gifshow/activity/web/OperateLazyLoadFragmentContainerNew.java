package com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew;
import wq6.k;
import eb5.g;
import on5.f;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import kx8.d;
import on5.e;
import brd.t;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kx8.k;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fr6.a;
import wq6.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import tra.b;
import q87.c;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import as6.a;
import wq6.d;
import zq6.l;
import pn5.a;
import zq6.p;
import ln5.c;
import kx8.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import isa.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import kx8.i;
import kx8.g;
import kx8.h;
import hsa.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.lang.Boolean;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kuaishou.webkit.WebView;
import com.kuaishou.krn.model.LaunchModel;
import com.yxcorp.gifshow.homepage.activity.e;
import rs6.f;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import kx8.e;
import lkd.b;
import kx8.j;
import ps6.e;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import wkd.b;
import cta.e;
import cta.c;
import fw8.d;
import uh5.e;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew$a;
import android.content.Context;
import java.lang.StringBuilder;

public class OperateLazyLoadFragmentContainerNew extends LazyInitSupportedFragment implements k, g, f	// class@0014b4
{
    public final c A;
    public View s;
    public int t;
    public a u;
    public Fragment v;
    public b w;
    public boolean x;
    public int y;
    public ViewGroup z;
    public static final int B;

    public void OperateLazyLoadFragmentContainerNew(){
       super();
       this.t = -1;
       this.x = false;
       this.y = 1;
       this.A = new d(this);
    }
    public boolean B7(){
       return e.f(this);
    }
    public void L8(){
       e.h(this);
    }
    public void N1(){
       e.j(this);
    }
    public t Ra(){
       return null;
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public String X3(){
       return "activity";
    }
    public void Yg(){
       if (PatchProxy.applyVoid(null, this, OperateLazyLoadFragmentContainerNew.class, "20")) {
          return;
       }
       if (k.a()) {
          OperateLazyLoadFragmentContainerNew tv = this.v;
          if (tv instanceof OperateWebViewFragment) {
             this.S2(tv);
             this.b2(1);
             return;
          }
       }
       super.Yg();
       return;
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public ViewGroup dh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, OperateLazyLoadFragmentContainerNew.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.z = super.dh(p0, p1, p2);
       this.sh();
       return this.z;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, OperateLazyLoadFragmentContainerNew.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0028, p1, false);
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperateLazyLoadFragmentContainerNew.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("OperateLazyLoadFragmentContainer", "doInitAfterViewCreated", objArray);
       this.a6();
       if (!PatchProxy.applyVoid(null, this, OperateLazyLoadFragmentContainerNew.class, "8") && a.c(this, b.G)) {
          c uoc = a.d(this).d0().a(a.b);
          if (uoc != null) {
             this.w = uoc.b().subscribe(new f(this), Functions.e);
          }
       }
       this.s = p0;
       this.sh();
       this.qh();
       OperateLazyLoadFragmentContainerNew tu = this.u;
       if (tu != null) {
          this.t = tu.i();
          this.ph(this.u);
       }
       if (this.getActivity() != null) {
          this.y = this.getActivity().getRequestedOrientation();
       }
       FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
       this.Vg().i().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new i(this), Functions.d());
       this.Vg().l().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new g(this), Functions.d());
       this.Vg().f().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new h(this), Functions.d());
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, OperateLazyLoadFragmentContainerNew.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(this.u);
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean kf(){
       return true;
    }
    public boolean lh(){
       return true;
    }
    public Fragment mh(String p0){
       OperateWebViewFragment obj = PatchProxy.applyOneRefs(p0, this, OperateLazyLoadFragmentContainerNew.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new OperateWebViewFragment();
       Bundle uBundle = new Bundle();
       uBundle.putString("KEY_URL", p0);
       obj.setArguments(uBundle);
       obj.G = this.u;
       return obj;
    }
    public void nh(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateLazyLoadFragmentContainerNew.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.v = p0;
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, p0);
       uoe.m();
       return;
    }
    public String o(){
       return "OP_ACTIVITY_PAGE";
    }
    public boolean o3(){
       OperateLazyLoadFragmentContainerNew obj = PatchProxy.apply(null, this, OperateLazyLoadFragmentContainerNew.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj != null && !obj.i()) {
          obj = this.v;
          if (obj != null && (obj instanceof OperateWebViewFragment && obj.Ch() != null)) {
             this.v.Ch().scrollTo(0, 0);
             this.v.Ch().reload();
             return true;
          }
       }
    label_0047 :
       return 0;
    }
    public final void oh(a p0){
       Fragment uFragment;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateLazyLoadFragmentContainerNew.class, "13")) {
          return;
       }
       int i = 0;
       if (p0.i() == 2) {
          LaunchModel launchModel = e.b(p0);
          if (launchModel == null) {
             Object[] objArray = new Object[i];
             b.C().w("OperateLazyLoadFragmentContainer", "launchModel = null", objArray);
             return;
          }else if(f.b().d(launchModel)){
             uFragment = this.mh(launchModel.c());
             objArray1 = new Object[i];
             b.C().w("OperateLazyLoadFragmentContainer", "hit krn proactive degrade", objArray1);
          }else {
             KwaiRnTab kwaiRnTab = PatchProxy.applyOneRefs(launchModel, this, OperateLazyLoadFragmentContainerNew.class, "15");
             if (kwaiRnTab != PatchProxyResult.class) {
             }else {
                launchModel.g().putString("degradeType", "1");
                launchModel.g().putBoolean("enableBackBtnHandler", i);
                launchModel.g().putString("containerSource", "OperateLazyLoadFragmentContainerNew");
                kwaiRnTab = KwaiRnTab.dh(launchModel);
                kwaiRnTab.mg(true);
                kwaiRnTab.ba(new e(this));
                kwaiRnTab.ah(new j(this, launchModel));
             }
             uFragment = kwaiRnTab;
             objArray1 = new Object[i];
             b.C().w("OperateLazyLoadFragmentContainer", "load krn fragment normal", objArray1);
          }
       }else {
          uFragment = this.mh(p0.c());
          objArray1 = new Object[i];
          b.C().w("OperateLazyLoadFragmentContainer", "getWebViewFragment", objArray1);
       }
       this.nh(uFragment);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, OperateLazyLoadFragmentContainerNew.class, "21")) {
          return;
       }
       super.onDestroyView();
       if (this.u != null) {
          b.a(-920422449).h(this.u.o(), this.A);
       }
       OperateLazyLoadFragmentContainerNew tw = this.w;
       if (tw != null) {
          tw.dispose();
          this.w = null;
       }
       return;
    }
    public void onRefresh(){
       e.g(this);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperateLazyLoadFragmentContainerNew.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       b.C().w("OperateLazyLoadFragmentContainer", "onViewCreated", objArray);
       if (this.u != null) {
          b.a(-920422449).j(this.u.o(), this.A);
       }
       return;
    }
    public final void ph(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateLazyLoadFragmentContainerNew.class, "12")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("OperateLazyLoadFragmentContainer", "replaceFragmentIfNeed", objArray);
       if (this.Vg().c()) {
          this.oh(p0);
       }else {
          this.x = true;
          if (this.v != null) {
             this.getChildFragmentManager().beginTransaction().u(this.v).m();
             this.v = null;
             Object[] objArray1 = new Object[i];
             b.C().w("OperateLazyLoadFragmentContainer", "empty fragment", objArray1);
          }
       }
       return;
    }
    public final void qh(){
       int b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OperateLazyLoadFragmentContainerNew.class, "24")) {
          return;
       }
       OperateLazyLoadFragmentContainerNew obj = PatchProxy.apply(objArray, this, OperateLazyLoadFragmentContainerNew.class, "28");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.u;
          b = (obj == null)? false: d.a(obj.k());
       }
       b = (!b)? e.c(): 0;
       b = b + 0;
       OperateLazyLoadFragmentContainerNew ts = this.s;
       if (!PatchProxy.isSupport(OperateLazyLoadFragmentContainerNew.class) || (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(0), Integer.valueOf(b), ts, this, OperateLazyLoadFragmentContainerNew.class, "27") && ts != null)) {
          if (ts.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             if (!PatchProxy.isSupport(OperateLazyLoadFragmentContainerNew.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(0), Integer.valueOf(b), ts, this, OperateLazyLoadFragmentContainerNew.class, "25")) {
                ViewGroup$MarginLayoutParams layoutParams = ts.getLayoutParams();
                if (layoutParams.topMargin != null || layoutParams.bottomMargin != b) {
                   layoutParams.topMargin = 0;
                   layoutParams.bottomMargin = b;
                   ts.setLayoutParams(layoutParams);
                }
             }
          }else if(PatchProxy.isSupport(OperateLazyLoadFragmentContainerNew.class) && (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(0), Integer.valueOf(b), ts, this, OperateLazyLoadFragmentContainerNew.class, "26") && (ts.getPaddingTop() || ts.getPaddingBottom() != b))){
             ts.setPadding(0, 0, 0, b);
          }
       }
       return;
    }
    public int r(){
       return e.a(this);
    }
    public final void rh(View p0,int p1){
       if (PatchProxy.isSupport(OperateLazyLoadFragmentContainerNew.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, OperateLazyLoadFragmentContainerNew.class, "23")) {
          return;
       }
       if (p0 != null) {
          if (p0.getBackground() == null) {
             p0.setBackground(new OperateLazyLoadFragmentContainerNew$a(p1, 0));
          }else {
             p0.setBackgroundColor(p1);
          }
       }
       return;
    }
    public d s8(){
       return j.b(this);
    }
    public final void sh(){
       if (PatchProxy.applyVoid(null, this, OperateLazyLoadFragmentContainerNew.class, "22")) {
          return;
       }
       OperateLazyLoadFragmentContainerNew tu = this.u;
       if (tu == null) {
          return;
       }
       int i = tu.n(this.getContext());
       Object[] objArray = new Object[0];
       b.C().w("OperateLazyLoadFragmentContainer", "updateUi: color "+Integer.toHexString(i)+", "+this.z+", "+this.s, objArray);
       this.rh(this.z, i);
       this.rh(this.s, i);
       return;
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public d z5(){
       return j.c(this);
    }
}
