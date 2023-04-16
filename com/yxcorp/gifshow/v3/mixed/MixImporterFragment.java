package com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import hwc.e$a;
import c35.i;
import c35.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import crd.a;
import com.kuaishou.viewbinder.ViewBinderOption;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment$a;
import com.yxcorp.gifshow.v3.mixed.model.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.mixed.MixImporterActivity;
import lq.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import com.kuaishou.viewbinder.IViewBinder;
import com.yxcorp.gifshow.v3.mixed.vb.AbsMixImporterViewBinder;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import qxc.c;
import com.yxcorp.gifshow.v3.mixed.vb.DefaultMixImporterViewBinder;
import com.kwai.library.widget.popup.common.c;
import u07.t$a;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import io.reactivex.subjects.PublishSubject;
import androidx.lifecycle.MutableLiveData;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import ekd.j0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.viewbinder.BaseViewBinder;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;
import lnc.b9;
import xnc.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import java.lang.StringBuilder;
import e17.i;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import lq.a;
import brd.t;
import zvc.a;
import com.yxcorp.gifshow.v3.mixed.a;
import erd.g;

public class MixImporterFragment extends BaseFragment implements e$a, i, c	// class@001545
{
    public MixImporterActivity j;
    public b k;
    public String l;
    public PresenterV2 m;
    public a n;
    public t o;
    public boolean p;
    public ViewBinderOption q;
    public AbsMixImporterViewBinder r;
    public Bitmap s;
    public final f t;
    public static final int u;

    public void MixImporterFragment(){
       super();
       this.l = "";
       this.n = new a();
       this.q = new ViewBinderOption();
       this.t = new MixImporterFragment$a(this);
    }
    public void H3(b p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MixImporterFragment.class, "7")) {
          return;
       }
       if (!this.j.isFinishing() && this.p == null) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("MixImporterFragment", "onLoadSuccess: ", objArray);
          if (!PatchProxy.applyVoidOneRefs(p0, this, MixImporterFragment.class, "9")) {
             MixImporterFragment tj = this.j;
             if (tj != null && !tj.isFinishing()) {
                if (this.m == null) {
                   objArray1 = new Object[i];
                   a.D().s("MixImporterFragment", "bind: mPresenter is null", objArray1);
                   this.j.finish();
                }else if(!i.h()){
                   objArray1 = new Object[i];
                   a.D().w("MixImporterFragment", "bind: PostSession is unavailable.", objArray1);
                   this.j.finish();
                }else {
                   objArray = new Object[i];
                   a.D().w("MixImporterFragment", "bind: ", objArray);
                   objArray = new Object[]{this,p0};
                   this.m.i(objArray);
                   if (p0.a.size() == 1) {
                      p0.r0();
                   }
                }
             }
          }
       }
       return;
    }
    public IViewBinder O1(){
       return this.ch();
    }
    public IViewBinder V5(int p0){
       MixImporterFragment mixImporterF;
       if (PatchProxy.isSupport(MixImporterFragment.class)) {
          mixImporterF = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MixImporterFragment.class, "13");
          if (mixImporterF != PatchProxyResult.class) {
          label_0036 :
             return mixImporterF;
          }
       }
       AbsMixImporterViewBinder uAbsMixImpor = c.a(this.q.a(), AbsMixImporterViewBinder.class, this);
       this.r = uAbsMixImpor;
       if (uAbsMixImpor == null) {
          this.r = new DefaultMixImporterViewBinder(this);
       }
       mixImporterF = this.r;
       goto label_0036 ;
    }
    public AbsMixImporterViewBinder ch(){
       return this.r;
    }
    public b dh(){
       return this.k;
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, MixImporterFragment.class, "11")) {
          return;
       }
       MixImporterFragment to = this.o;
       if (to != null && to.K()) {
          return;
       }
       t$a uoa = new t$a(this.j);
       uoa.y0(R.string.arg_RES_7f10503c);
       uoa.S0(R.string.arg_RES_7f1005f5);
       uoa.M(new MixImporterFragment$b(this));
       this.o = j.d(uoa);
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(MixImporterFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MixImporterFragment.class, "10")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (this.k == null) {
          return;
       }
       if (p0 == 771 && !BitmapUtil.I(this.s)) {
          this.k.s.onNext(new Object());
       }
       this.k.r.setValue(new Object());
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixImporterFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getActivity().getIntent();
       String str = "MIX_IMPORT_VIEW_BINDER";
       if (j0.g(intent, str)) {
          this.q = new ViewBinderOption(j0.f(intent, str));
       }
       if (this.r == null) {
          this.r = this.V5(-1);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MixImporterFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View bindedView = this.r.getBindedView(p0, p1, p2);
       this.r.bindViews(bindedView);
       return bindedView;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MixImporterFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MixImporterFragment", "onDestroy: ", objArray);
       this.p = true;
       this.s = null;
       if (this.m != null) {
          Object[] objArray1 = new Object[i];
          a.D().s("MixImporterFragment", "onDestroy: ", objArray1);
          this.m.destroy();
          this.m = null;
       }
       b9.a(this.n);
       this.o = null;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MixImporterFragment.class, "14")) {
          return;
       }
       super.onResume();
       MixImporterFragment tk = this.k;
       if (tk != null) {
          tk.r.setValue(new Object());
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MixImporterFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MixImporterFragment", "onViewCreated: ", objArray);
       MixImporterActivity activity = this.getActivity();
       this.j = activity;
       if (activity != null && activity.isFinishing()) {
          return;
       }
       MixImporterFragment tj = this.j;
       if (tj != null && tj.getIntent() != null) {
          String str = j0.f(this.j.getIntent(), "photo_task_id");
          if (TextUtils.x(str)) {
             str = u1.f();
          }
          this.l = str;
          str = j0.f(this.j.getIntent(), "INTENT_EXTRA_TOAST_ON_PAGE_SHOW");
          Object[] objArray1 = new Object[i];
          a.D().w("MixImporterFragment", "onViewCreated: get toast="+str, objArray1);
          if (!TextUtils.x(str)) {
             i.d(R.style.arg_RES_7f11066a, str);
          }
       }
    label_0083 :
       this.r.f.setBackground(null);
       this.n.c(i.m().p().init().subscribe(new a(this, p0), a.b));
       return;
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, MixImporterFragment.class, "8")) {
          return;
       }
       this.eh();
       return;
    }
}
