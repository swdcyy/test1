package com.yxcorp.gifshow.v3.editor.text.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t36.f;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.t0$a;
import com.yxcorp.gifshow.v3.editor.text.t0$b;
import com.yxcorp.gifshow.v3.editor.text.t0$c;
import com.yxcorp.gifshow.v3.editor.text.t0$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.ViewModel;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import huc.n0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import huc.o0;
import di0.b;
import io.reactivex.subjects.PublishSubject;
import huc.r0;
import com.yxcorp.gifshow.v3.editor.text.q0;
import erd.g;
import crd.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import huc.q0;
import com.yxcorp.gifshow.v3.editor.text.r0;
import tyc.f2;
import lwc.d;
import java.lang.Boolean;
import uwc.b;
import androidx.lifecycle.MutableLiveData;
import android.app.Activity;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.i0;
import android.util.Pair;
import java.util.Collection;
import xuc.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import voc.o;

public class t0 extends PresenterV2	// class@0014b4
{
    public EditDecorationContainerView A;
    public z B;
    public Observer C;
    public Observer D;
    public DynamicTextViewModel E;
    public d F;
    public DecorationContainerView$e G;
    public f H;
    public y I;
    public f J;
    public g K;
    public final b L;
    public o p;
    public c q;
    public BaseFragment r;
    public TextElementViewModel s;
    public h t;
    public b u;
    public a v;
    public MutableLiveData w;
    public f2 x;
    public List y;
    public List z;

    public void t0(f p0,f p1){
       super();
       this.y = new ArrayList();
       this.z = new ArrayList();
       this.C = null;
       this.D = null;
       this.G = new t0$a(this);
       this.I = new t0$b(this);
       this.K = new t0$c(this);
       this.L = new t0$d(this);
       this.H = p0;
       this.J = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "3")) {
          return;
       }
       this.s = ViewModelProviders.of(this.r).get(TextElementViewModel.class);
       a uoa = this.q.W0();
       this.v = uoa;
       uoa.c0();
       this.s.X0(this.v, false);
       this.t = f.l(this.r);
       this.A.d(this.G);
       if (this.C == null) {
          this.C = new n0(this);
       }
       this.w.observe(this.r, this.C);
       DynamicTextViewModel uDynamicText = ViewModelProviders.of(this.r.getActivity()).get(DynamicTextViewModel.class);
       this.E = uDynamicText;
       this.D = new o0(this);
       uDynamicText.t0().observe(this.r, this.D);
       this.X7(this.t.D0().subscribe(new r0(this), q0.b));
       this.H.d(this.I);
       this.J.d(this.K);
       this.X7(this.r.m().subscribe(new q0(this), r0.b));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t0.class, "9")) {
          return;
       }
       t0 tx = this.x;
       if (tx != null) {
          tx.b();
          this.x = objArray;
       }
       tx = this.C;
       if (tx != null) {
          this.w.removeObserver(tx);
       }
       String str = "SinglePicTextEditPresenter";
       if (this.F.c(str)) {
          this.F.d(str);
       }
       if (this.D != null) {
          this.E.t0().removeObserver(this.D);
       }
       this.J.d(this.K);
       return;
    }
    public final void P8(boolean p0){
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot0, "6")) {
          return;
       }
       if (this.v.D() && p0) {
          this.v.g(false);
       }
       t0 tu = this.u;
       if (tu != null) {
          tu.V0();
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "5")) {
          return;
       }
       this.t.I0(this.r.getActivity(), this.s.I0());
       Pair pair = i0.f(QCurrentUser.me().isLogined(), 16, i0.a());
       Pair pair1 = i0.e(QCurrentUser.me().isLogined(), 16);
       this.y = pair.second;
       this.z = pair1.second;
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(pair.first);
       uArrayList.addAll(pair1.first);
       this.s.Z0(uArrayList, this.L, this.y, this.z);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a0a6c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.p = this.r8("EDITOR_CONTEXT");
       this.q = this.r8("WORKSPACE");
       this.w = this.r8("EDIT_PREVIEW_INIT_LIVE_DATA");
       this.F = this.r8("EDIT_PREVIEW_PREPARE_TASK_MANAGER");
       return;
    }
}
