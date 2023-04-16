package com.kuaishou.live.liteend.LiveLiteEndFragment;
import eq3.d;
import ll0.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yd3.a;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewHost;
import eq3.e;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.os.Bundle;
import androidx.lifecycle.LifecycleRegistry;
import gq3.a;
import androidx.lifecycle.Lifecycle$State;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController;
import com.kuaishou.live.lite.LiveLiteParam;
import mrd.a;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public class LiveLiteEndFragment extends BaseFragment implements d, a	// class@000bb8
{
    public LiveLiteParam j;
    public a k;
    public a l;
    public a m;
    public a n;
    public boolean o;
    public FrameLayout p;
    public ViewControllerManagerImpl q;
    public ViewController r;
    public e0 s;
    public final LifecycleEventObserver t;
    public static final int u;

    public void LiveLiteEndFragment(){
       super();
       this.o = false;
       this.t = new a(this);
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteEndFragment.class, "10")) {
          return;
       }
       this.q.E2(p0, p1);
       return;
    }
    public void G8(int p0,ViewController p1){
       if (PatchProxy.isSupport(LiveLiteEndFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveLiteEndFragment.class, "12")) {
          return;
       }
       this.q.G8(p0, p1);
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.I1();
    }
    public ClientEvent$ExpTagTrans K5(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.K5();
    }
    public int Lb(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.s.Lb();
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.s.M();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.Nf();
    }
    public String P7(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.P7();
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.Q3();
    }
    public boolean Xg(){
       return false;
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.a2();
    }
    public Activity cd(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.cd();
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndFragment.class, "7")) {
          return;
       }
       this.q = new ViewControllerManagerImpl(LifecyclesExt.a(this, LifecyclesExt.a(this.k, this.l)), this.requireActivity(), this.requireContext(), e.a(this.p));
       return;
    }
    public final void dh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndFragment.class, "9")) {
          return;
       }
       b.Z(LiveLiteLogTag.CLOSE_LIFE_CYCLE, "removeRootViewController "+this.r);
       LiveLiteEndFragment tr = this.r;
       if (tr != null) {
          this.o1(tr);
          this.r = null;
       }
       return;
    }
    public void e8(e0 p0){
       this.s = p0;
    }
    public boolean eg(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s.eg();
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.s.getPage();
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getPageParams();
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.h5();
    }
    public ClientEvent$ElementPackage j4(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.j4();
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.o();
    }
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndFragment.class, "13")) {
          return;
       }
       this.q.o1(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIVE_LITE_END, "LiveLiteEndFragment.onCreate no success init - failed");
          return;
       }else {
          this.l.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
          if (!PatchProxy.applyVoid(null, this, LiveLiteEndFragment.class, "6")) {
             FrameLayout uFrameLayout = new FrameLayout(this.requireContext());
             this.p = uFrameLayout;
             uFrameLayout.setId(R.id.live_lite_slide_close_container);
             this.p.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          }
          this.ch();
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteEndFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.o != null) {
          return this.p;
       }
       b.Z(LiveLiteLogTag.LIVE_LITE_END, "LiveLiteEndFragment.onCreateView no success init - failed");
       return null;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIVE_LITE_END, "LiveLiteEndFragment.onDestroyView no success init - failed");
          return;
       }else {
          this.dh();
          return;
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteEndFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.o == null) {
          b.Z(LiveLiteLogTag.LIVE_LITE_END, "LiveLiteEndFragment.onViewCreated no success init - failed");
          return;
       }else if(!PatchProxy.applyVoid(null, this, LiveLiteEndFragment.class, "8") && this.r == null){
          LiveLiteEndRootViewController liveLiteEndR = new LiveLiteEndRootViewController(this, this.j, this.s, this.m, this.n);
          this.r = this.r;
          this.G8(R.id.live_lite_slide_close_container, this.r);
          b.Z(LiveLiteLogTag.CLOSE_LIFE_CYCLE, "addRootViewController "+this.r);
       }
       this.k.getLifecycle().addObserver(this.t);
       return;
    }
    public String pg(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.pg();
    }
    public void xg(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndFragment.class, "11")) {
          return;
       }
       this.q.xg(p0);
       return;
    }
    public ClientContentWrapper$ContentWrapper ye(){
       Object obj = PatchProxy.apply(null, this, LiveLiteEndFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.ye();
    }
}
