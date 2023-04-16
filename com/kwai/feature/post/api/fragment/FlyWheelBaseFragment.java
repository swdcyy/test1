package com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import j36.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import j36.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j36.c;
import v46.e;
import java.lang.Boolean;
import java.util.Objects;
import v46.d;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import o36.g;

public abstract class FlyWheelBaseFragment extends BaseFragment implements g	// class@0013f2
{
    public String j;
    public boolean k;
    public c l;
    public e m;

    public void FlyWheelBaseFragment(){
       super();
    }
    public String E7(){
       return f.a(this);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FlyWheelBaseFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       FlyWheelBaseFragment tl = this.l;
       if (tl != null) {
          tl.c();
       }
       tl = this.m;
       if (tl != null) {
          tl.H();
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       String str = "7";
       if (PatchProxy.isSupport(FlyWheelBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FlyWheelBaseFragment.class, str)) {
          return;
       }
       super.onHiddenChanged(p0);
       FlyWheelBaseFragment tl = this.l;
       if (tl != null) {
          tl.d(p0);
       }
       tl = this.m;
       if (tl != null) {
          Objects.requireNonNull(tl);
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tl, uoe, str)) {
             e a = tl.a;
             if (a instanceof d) {
                Objects.requireNonNull(a);
                if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), a, d.class, "6")) {
                   a.b();
                }
             }
          }
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, FlyWheelBaseFragment.class, "4")) {
          return;
       }
       super.onStart();
       FlyWheelBaseFragment tl = this.l;
       if (tl != null) {
          tl.e();
       }
       tl = this.m;
       if (tl != null) {
          tl.J();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, FlyWheelBaseFragment.class, "5")) {
          return;
       }
       super.onStop();
       FlyWheelBaseFragment tl = this.l;
       if (tl != null) {
          tl.f();
       }
       tl = this.m;
       if (tl != null) {
          tl.I();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FlyWheelBaseFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.z4() != null) {
          c uoc = new c(this, this);
          this.l = uoc;
          uoc.g();
       }
       e uoe = new e(this);
       this.m = uoe;
       uoe.s2();
       return;
    }
    public View r5(){
       Object obj = PatchProxy.apply(null, this, FlyWheelBaseFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getView();
    }
    public void setUserVisibleHint(boolean p0){
       String str = "6";
       if (PatchProxy.isSupport(FlyWheelBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FlyWheelBaseFragment.class, str)) {
          return;
       }
       super.setUserVisibleHint(p0);
       FlyWheelBaseFragment tl = this.l;
       if (tl != null) {
          tl.i(p0);
       }
       tl = this.m;
       if (tl != null) {
          Objects.requireNonNull(tl);
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tl, uoe, str)) {
             e a = tl.a;
             if (a instanceof d) {
                Objects.requireNonNull(a);
                if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), a, d.class, "5")) {
                   a.b();
                }
             }
          }
       }
       return;
    }
    public String z4(){
       Object obj = PatchProxy.apply(null, this, FlyWheelBaseFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k == null) {
          this.j = g.c(this);
          this.k = true;
       }
       return this.j;
    }
}
