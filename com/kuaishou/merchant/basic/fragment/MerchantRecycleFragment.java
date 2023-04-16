package com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import ht3.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.merchant.basic.fragment.f;
import gr8.a;
import ht3.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import ok.x;
import brd.x;
import ht3.p;
import android.view.animation.Animation;
import android.view.View;
import android.os.Bundle;
import brd.t;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawRecyclerView;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawCustomRecyclerView;
import java.util.Map;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragment;
import q74.d;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment$a;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.merchant.live.screenshot.b;

public abstract class MerchantRecycleFragment extends RecyclerFragment implements b	// class@0015ba
{
    public String F;
    public f G;
    public b H;

    public void MerchantRecycleFragment(){
       super();
       this.G = new f(this);
    }
    public boolean C2(){
       return a.d(this);
    }
    public String D1(){
       return a.c(this);
    }
    public boolean Gh(){
       LazyInitSupportedFragment obj = PatchProxy.apply(null, this, MerchantRecycleFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l;
       boolean b = (obj != null && obj.get().booleanValue())? true: false;
       return b;
    }
    public x Hh(){
       Object obj = PatchProxy.apply(null, this, MerchantRecycleFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p(this);
    }
    public void Ih(Animation p0){
    }
    public void Jh(View p0,Bundle p1){
    }
    public String Kb(){
       return a.b(this);
    }
    public void Kh(){
    }
    public void Lh(){
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, MerchantRecycleFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h0() instanceof WatchDispatchDrawRecyclerView) {
          return this.h0().getDispatchDrawObservable();
       }
       if (this.h0() instanceof WatchDispatchDrawCustomRecyclerView) {
          return this.h0().getDispatchDrawObservable();
       }
       return null;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantRecycleFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MerchantRecycleFragment.class, null);
       return objectsByTag;
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRecycleFragment.class, "4")) {
          return;
       }
       super.onAttach(p0);
       d.b(this);
       if (!PatchProxy.applyVoid(null, this, MerchantRecycleFragment.class, "5")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             String str = arguments.getString("preloadTraceId");
             this.F = str;
             if (!TextUtils.isEmpty(str)) {
                this.G.i(this.F);
             }
          }
       }
       this.G.f(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRecycleFragment.class, "1")) {
          return;
       }
       this.G.onPerfLogFragmentEvent(0, 0);
       super.onCreate(p0);
       PatchProxy.applyVoid(null, this, MerchantRecycleFragment.class, "11");
       PageMonitor.INSTANCE.registerPageInfo(this, this.C1(), "", this.D1());
       return;
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       Animation uAnimation1;
       if (PatchProxy.isSupport(MerchantRecycleFragment.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, MerchantRecycleFragment.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1) {
          return super.onCreateAnimation(p0, p1, p2);
       }else {
          Animation uAnimation = null;
          try{
             uAnimation1 = AnimationUtils.loadAnimation(this.getActivity(), p2);
          }catch(java.lang.Exception e0){
             uAnimation1 = uAnimation;
          }
          if (uAnimation1 == null) {
             this.Ih(uAnimation);
             return uAnimation;
          }else {
             uAnimation1.setAnimationListener(new MerchantRecycleFragment$a(this));
             return uAnimation1;
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantRecycleFragment.class, "3")) {
          return;
       }
       super.onDestroy();
       MerchantRecycleFragment tH = this.H;
       if (tH != null) {
          tH.e();
          this.H = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantRecycleFragment.class, "2")) {
          return;
       }
       this.Lh();
       super.onViewCreated(p0, p1);
       this.Jh(p0, p1);
       this.G.onPerfLogFragmentEvent(1, 1);
       this.Kh();
       return;
    }
}
