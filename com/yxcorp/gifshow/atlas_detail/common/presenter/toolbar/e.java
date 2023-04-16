package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import g99.w;
import androidx.lifecycle.ViewModel;
import im8.f;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.b0;
import g99.u;
import erd.g;
import crd.b;
import brd.t;
import g99.v;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e$a;
import android.content.Context;
import uw9.m3;
import g99.t;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarStyle;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public abstract class e extends PresenterV2	// class@001bab
{
    public QPhoto p;
    public BaseFragment q;
    public f r;
    public PublishSubject s;
    public PublishSubject t;
    public t u;
    public f v;
    public w w;
    public boolean x;
    public boolean y;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.w = ViewModelProviders.of(this.q).get(w.class);
       this.S8(this.v.get().booleanValue(), b0.c(this.getActivity(), this.p));
       this.X7(this.u.subscribe(new u(this)));
       this.X7(this.t.subscribe(new v(this)));
       this.r.set(new e$a(this));
       boolean b = m3.b(this.getContext(), this.p);
       this.x = b;
       if (b) {
          e tw = this.w;
          tw.p0(tw.q0());
          this.X7(this.s.subscribe(new t(this), Functions.d()));
       }else {
          this.w.o0();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.r.set(null);
       return;
    }
    public abstract boolean P8(QPhoto p0);
    public abstract void R8(QPhoto p0);
    public final void S8(boolean p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoe, "4")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (p0) {
          if (this.y == null) {
             this.y = this.w.q0();
          }
          this.w.o0();
       }else if(this.x != null && !this.w.r0()){
          this.w.p0(this.y);
       }
       e tw = this.w;
       ToolbarStyle wHITE_SOLID = ToolbarStyle.WHITE_SOLID;
       Objects.requireNonNull(tw);
       if (!PatchProxy.applyVoidOneRefs(wHITE_SOLID, tw, w.class, "8")) {
          tw.a.setValue(wHITE_SOLID);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.x8("IMMERSIVE_MODE_HELPER");
       this.s = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.t = this.r8("ON_MULTI_WINDOW_MODE_CHANGED_EVENT");
       this.u = this.r8("DETAIL_ADJUST_EVENT");
       this.v = this.x8("DETAIL_MULTI_WINDOW_MODE");
       return;
    }
}
