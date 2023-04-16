package com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vza.a;
import ok.x;
import com.google.common.base.Suppliers;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.os.Bundle;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import brd.t;
import com.kuaishou.live.core.show.liveexplore.LiveExploreFragment;
import com.yxcorp.gifshow.observers.ErrorCrashLambdaObserver;
import vza.b;
import erd.g;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.y;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;

public class LazyInitSupportedFragment extends BaseFragment	// class@001a22
{
    public t j;
    public b k;
    public final x l;
    public LayoutInflater m;
    public Bundle n;
    public final PublishSubject o;
    public boolean p;
    public boolean q;
    public static final int r;

    public void LazyInitSupportedFragment(){
       super();
       this.l = Suppliers.a(new a(this));
       this.o = PublishSubject.g();
       this.p = false;
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, LazyInitSupportedFragment.class, "8")) {
          return;
       }
       ViewGroup view = this.getView();
       boolean b = true;
       if (this.m != null && (view != null && (this.p == null && this.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.CREATED)))) {
          this.p = b;
          this.o.onNext(Integer.valueOf(b));
          View view1 = this.eh(this.m, view, this.n);
          view.addView(view1, -1, -1);
          this.fh(view1, this.n);
          this.o.onNext(Integer.valueOf(2));
       }else {
          StringBuilder str = this.getClass().getName()+" cannotInit : ";
          boolean b1 = false;
          boolean b2 = (this.m != null)? true: false;
          str = str+b2+", ";
          if (view != null) {
             b1 = true;
          }
          String str1 = str+b1+", "+(this.p ^ b)+", "+this.getLifecycle().getCurrentState();
          Log.g("LazyInitFragment", str1);
          u1.R("LazyInitFragmentCannotInit", str1, 14);
       }
       return;
    }
    public ViewGroup dh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LazyInitSupportedFragment.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new FrameLayout(p0.getContext());
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LazyInitSupportedFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.l.get().booleanValue()) {
          return super.onCreateView(p0, p1, p2);
       }
       throw new IllegalStateException("要支持lazy必须重写此方法");
    }
    public void fh(View p0,Bundle p1){
    }
    public t gh(){
       return this.o;
    }
    public t hh(){
       return this.j;
    }
    public void ih(){
       if (PatchProxy.applyVoid(null, this, LazyInitSupportedFragment.class, "3")) {
          return;
       }
       if (this.l.get().booleanValue()) {
          this.ch();
       }
       return;
    }
    public void jh(){
    }
    public void kh(){
    }
    public boolean lh(){
       return this instanceof LiveExploreFragment;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LazyInitSupportedFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       ErrorCrashLambdaObserver uErrorCrashL = new ErrorCrashLambdaObserver(new b(this));
       t ot = this.Vg().i();
       this.j = ot;
       ot.subscribe(uErrorCrashL);
       this.k = uErrorCrashL;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LazyInitSupportedFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.l.get().booleanValue() || (this.Vg().c() && this.q == null)) {
          this.o.onNext(Integer.valueOf(1));
          return this.eh(p0, p1, p2);
       }else {
          this.m = p0;
          this.n = p2;
          return this.dh(p0, p1, p2);
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LazyInitSupportedFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       LazyInitSupportedFragment tk = this.k;
       if (tk != null) {
          tk.dispose();
       }
       this.j = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LazyInitSupportedFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       this.p = false;
       this.m = null;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LazyInitSupportedFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!this.l.get().booleanValue() || (this.Vg().c() && this.q == null)) {
          this.fh(p0, p1);
          this.o.onNext(Integer.valueOf(2));
       }
       return;
    }
}
