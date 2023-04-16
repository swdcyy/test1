package com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.s5;
import k2b.e0;
import k2b.j0;
import gka.c0;
import gka.d0;
import y8c.a;
import ta9.b;
import tz6.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import k2b.e0$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment$compositeLifecycleState$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment;
import brd.t;
import com.kuaishou.live.core.show.redpacket.krn.LiveKrnRedPacketFragment;
import java.lang.Integer;
import android.app.Activity;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import f3b.o;
import android.os.Bundle;
import android.content.ComponentName;
import k2b.u1;
import android.content.Context;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import com.kwai.sdk.switchconfig.a;
import java.lang.Throwable;
import crd.b;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment$c;
import erd.g;
import tz6.c;
import rz6.a;
import rz6.a$a;
import android.content.Intent;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public class BaseFragment extends RxFragment implements s5, e0, j0, c0, d0, a, b, b	// class@001799
{
    public b c;
    public final p d;
    public final b0 e;
    public final w f;
    public final a g;
    public final c h;
    public static final BaseFragment$a i;

    static {
       BaseFragment.i = new BaseFragment$a(null);
    }
    public void BaseFragment(){
       super(null, null, null, null, 15, null);
    }
    public void BaseFragment(b0 p0,w p1,a p2,c p3,int p4,u p5){
       j0 oj01;
       j0 oj0 = null;
       p0 = (p4 & 0x01)? new b0(): oj0;
       w ow = (p4 & 0x02)? new w(): oj0;
       a uoa = (p4 & 0x04)? new a(new e0$a()): oj0;
       if (p4 & 0x08) {
          oj0 = new c(oj0, 1, oj0);
       }
       a.p(p0, "visibleDelegate");
       a.p(ow, "selectableDelegate");
       a.p(uoa, "logPageContentProvider");
       a.p(oj0, "pageLoggerDelegate");
       super();
       this.e = p0;
       this.f = ow;
       this.g = uoa;
       this.h = oj0;
       this.d = s.c(new BaseFragment$compositeLifecycleState$2(this));
       return;
    }
    public int Ab(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.Ab();
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       return d0.e(this);
    }
    public boolean K0(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.f.K0();
    }
    public ClientEvent$ExpTagTrans K5(){
       return d0.d(this);
    }
    public boolean Ke(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.Ke();
    }
    public int Lb(){
       return d0.j(this);
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.M();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.Nf();
    }
    public String O9(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.o();
       }catch(java.lang.Exception e0){
          Log.g("appGrayConfig", "getPages Exception "+this.getClass().getName());
          return "";
       }
    }
    public String P7(){
       return d0.i(this);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.Q3();
    }
    public void S2(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFragment.class, "30")) {
          return;
       }
       a.p(p0, "newFragment");
       this.h.S2(p0);
       return;
    }
    public FragmentCompositeLifecycleState Vg(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public String Wg(){
       String str;
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, BaseFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       if (obj instanceof GifshowActivity) {
          objArray = obj;
       }
       if (objArray != null) {
          str = objArray.U2();
          if (str != null) {
          label_0027 :
             return str;
          }
       }
       str = "";
       goto label_0027 ;
    }
    public boolean Xg(){
       return (this instanceof KSFeedGroupPagerFragment ^ 0x01);
    }
    public void Yg(){
       if (PatchProxy.applyVoid(null, this, BaseFragment.class, "15")) {
          return;
       }
       this.S2(this);
       this.b2(1);
       return;
    }
    public t Z0(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.Z0();
    }
    public boolean Zg(){
       return (this instanceof LiveKrnRedPacketFragment ^ 0x01);
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.a2();
    }
    public final void ah(j0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFragment.class, "14")) {
          return;
       }
       this.h.b = p0;
       return;
    }
    public void b2(int p0){
       if (PatchProxy.isSupport(BaseFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseFragment.class, "29")) {
          return;
       }
       this.h.b2(p0);
       return;
    }
    public final void bh(boolean p0){
       if (PatchProxy.isSupport(BaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseFragment.class, "11")) {
          return;
       }
       this.f.a(p0);
       return;
    }
    public void c0(){
    }
    public t c7(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.c7();
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       return d0.a(this);
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(this.g);
       return 0;
    }
    public Fragment g0(){
       return this;
    }
    public int getPage(){
       return this.g.getPage();
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getPageParams();
    }
    public String getUrl(){
       String url;
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, BaseFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       if (obj instanceof GifshowActivity) {
          objArray = obj;
       }
       if (objArray != null) {
          url = objArray.getUrl();
          if (url != null) {
          label_0027 :
             return url;
          }
       }
       url = "";
       goto label_0027 ;
    }
    public String h5(){
       return d0.g(this);
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public t m5(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.m5();
    }
    public t n1(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.n1();
    }
    public String o(){
       String obj = PatchProxy.apply(null, this, BaseFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int page = this.getPage();
       obj = (page)? o.i(page): "";
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       FragmentActivity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       j0 oj0 = null;
       if (this.h.b == null) {
          StringBuilder str = "activity: ";
          activity = this.getActivity();
          ComponentName componentNam = (activity != null)? activity.getComponentName(): oj0;
          u1.Q("page_logger_null", str+componentNam+", fragment: "+this.getClass());
       }
       BaseFragment th = this.h;
       activity = this.getActivity();
       if (activity instanceof j0) {
          oj0 = activity;
       }
       th.a(oj0);
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFragment.class, "6")) {
          return;
       }
       AutoTracker.INSTANCE.onInit(this);
       a.p(p0, "context");
       super.onAttach(p0);
       if (!a.t().d("disable_set_logger_at_on_attach", false)) {
          BaseFragment th = this.h;
          FragmentActivity activity = this.getActivity();
          if (!activity instanceof j0) {
             activity = null;
          }
          th.a(activity);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFragment.class, "5")) {
          return;
       }
       AutoTracker iNSTANCE = AutoTracker.INSTANCE;
       iNSTANCE.onCreate(this);
       if (!this.Zg() && p0 != null) {
          p0.remove("android:support:fragments");
       }
       super.onCreate(p0);
       iNSTANCE.registerPageInfoIfNull(this, this.o());
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BaseFragment.class, "16")) {
          return;
       }
       AutoTracker.INSTANCE.onDestroy(this);
       super.onDestroyView();
       BaseFragment tc = this.c;
       if (tc != null && !tc.isDisposed()) {
          tc.dispose();
       }
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, BaseFragment.class, "10")) {
          return;
       }
       super.onDetach();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(BaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseFragment.class, "13")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.e.a(p0);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BaseFragment.class, "38")) {
          return;
       }
       AutoTracker.INSTANCE.onPause(this);
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, BaseFragment.class, "8")) {
          return;
       }
       AutoTracker.INSTANCE.onResume(this);
       super.onResume();
       Log.b("PageDebugInfo", "fragment => "+this.getClass().getSimpleName());
       if (this.Xg()) {
          this.Yg();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, BaseFragment.class, "37")) {
          return;
       }
       AutoTracker.INSTANCE.onStart(this);
       super.onStart();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseFragment.class, "9")) {
          return;
       }
       AutoTracker iNSTANCE = AutoTracker.INSTANCE;
       iNSTANCE.trackFirstFrameOnFragment(this);
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.c = this.n1().subscribe(new BaseFragment$b(this), BaseFragment$c.b);
       this.e.a(this.isHidden());
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, BaseFragment.class, "21")) {
          FragmentActivity activity = this.getActivity();
          if (activity instanceof c) {
             objArray = activity;
          }
          if (objArray == null || objArray.N()) {
             a.e.a().e(this);
          }
       }
       iNSTANCE.onViewCreated(this);
       iNSTANCE.registerPageInfoIfNull(this, this.o());
       return;
    }
    public String pg(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d0.k(this);
    }
    public void setUserVisibleHint(boolean p0){
       super.setUserVisibleHint(p0);
       this.f.a(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BaseFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+", frag="+this.getClass().getName()+", act="+this.getActivity();
    }
    public void u(){
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFragment.class, "17")) {
          return;
       }
       a.p(p0, "intent");
       return;
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
