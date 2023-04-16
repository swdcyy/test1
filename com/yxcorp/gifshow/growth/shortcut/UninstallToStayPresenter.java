package com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import sqa.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import wkd.b;
import yma.a;
import yma.b;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$d;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$e;
import erd.g;
import crd.b;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$f;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import android.util.Log;
import k2b.u1;
import android.app.Activity;
import xh7.b;
import android.content.Context;
import qh7.b;
import qh7.a;
import kotlin.Pair;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig;
import java.lang.Boolean;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$showDialog$1$1$1;
import sqa.j;
import msd.l;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$showDialog$1$1$2;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import lnc.m5;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$b;
import com.yxcorp.gifshow.growth.shortcut.UninstallToStayPresenter$c;

public final class UninstallToStayPresenter extends PresenterV2	// class@0014ce
{
    public BaseFragment p;
    public a q;
    public TextView r;
    public TextView s;
    public TextView t;
    public View u;
    public View v;
    public View w;
    public ImageView x;

    public void UninstallToStayPresenter(BaseFragment p0){
       super();
       this.p = p0;
    }
    public static final a P8(UninstallToStayPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mCallerContext");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, UninstallToStayPresenter.class, "3")) {
          return;
       }
       b obj = b.a(-1257347683);
       a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
       obj = obj.b();
       a.o(obj, "Singleton.get\(GrowthApi::class.java\).apiService");
       this.X7(obj.b().subscribeOn(d.c).observeOn(d.a).map(new e()).subscribe(new UninstallToStayPresenter$d(this), new UninstallToStayPresenter$e(this)));
       UninstallToStayPresenter tq = this.q;
       if (tq == null) {
          a.S("mCallerContext");
       }
       this.X7(tq.b().subscribe(new UninstallToStayPresenter$f(this)));
       Throwable obj1 = Result.constructor-impl(l1.a);
       obj1 = Result.exceptionOrNull-impl(obj1);
       if (obj1 != null) {
          u1.R("U2SERROR", Log.getStackTraceString(obj1), 9);
          this.R8("kwai://featured");
       }
       return;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallToStayPresenter.class, "6")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.b(new b(activity, p0), null);
          activity.finish();
       }
       return;
    }
    public final void S8(String p0,Pair[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UninstallToStayPresenter.class, "12")) {
          return;
       }
       UninstallToStayPresenter tp = this.p;
       if (tp != null) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = p0;
          i3 oi3 = i3.f();
          int len = p1.length;
          int i = 0;
          while (i < len) {
             object oobject = p1[i];
             if (oobject != null && !TextUtils.isEmpty(oobject.getFirst())) {
                oi3.d(oobject.getFirst(), oobject.getSecond());
             }
             i = i + 1;
          }
          uElementPack.params = oi3.e();
          u1.B(new ClickMetaData().setLogPage(tp).setType(1).setElementPackage(uElementPack));
       }
       return;
    }
    public final void V8(GrowthStayDialogConfig p0,boolean p1){
       UninstallToStayPresenter uninstallToS = UninstallToStayPresenter.class;
       if (PatchProxy.isSupport(uninstallToS) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uninstallToS, "11")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          if (activity.isFinishing()) {
             return;
          }else {
             d uod = new d(activity);
             int i = (p1)? 173: 174;
             uod.Z0(i);
             uod.b1(KwaiDialogOption.e);
             uod.w0(false);
             uod.A(true);
             UninstallToStayPresenter$showDialog$1$1$1 iNSTANCE = UninstallToStayPresenter$showDialog$1$1$1.INSTANCE;
             if (iNSTANCE != null) {
                iNSTANCE = new j(iNSTANCE);
             }
             uod.G(iNSTANCE);
             UninstallToStayPresenter$showDialog$1$1$2 iNSTANCE1 = UninstallToStayPresenter$showDialog$1$1$2.INSTANCE;
             if (iNSTANCE1 != null) {
                iNSTANCE1 = new j(iNSTANCE1);
             }
             uod.O(iNSTANCE1);
             int i1 = (p1)? 0x7f0d0570: 0x7f0d0571;
             UninstallToStayPresenter$g og = new UninstallToStayPresenter$g(i1, activity, this, p1, p0);
             uod.L(v8);
             uod.M(new UninstallToStayPresenter$h(activity, this, p1, p0));
             t ot = uod.b0();
             ot.Z();
             ot = Result.constructor-impl(ot);
             Result.box-impl(ot);
          }
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, UninstallToStayPresenter.class, "7")) {
          return;
       }
       if (this.getActivity() != null) {
          m5.a(this.getActivity());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UninstallToStayPresenter.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.left_btn);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.left_btn\)");
       this.x = view;
       view = m1.f(p0, R.id.tv_subtitle);
       a.o(view, "ViewBindUtils.bindWidget¡­otView, R.id.tv_subtitle\)");
       this.r = view;
       view = m1.f(p0, R.id.btn_stay);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.btn_stay\)");
       this.s = view;
       view = m1.f(p0, R.id.tv_unload);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.tv_unload\)");
       this.t = view;
       view = m1.f(p0, R.id.item_top);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.item_top\)");
       this.u = view;
       view = m1.f(p0, R.id.item_middle);
       a.o(view, "ViewBindUtils.bindWidget¡­otView, R.id.item_middle\)");
       this.v = view;
       p0 = m1.f(p0, R.id.item_bottom);
       a.o(p0, "ViewBindUtils.bindWidget¡­otView, R.id.item_bottom\)");
       this.w = p0;
       UninstallToStayPresenter tx = this.x;
       if (tx == null) {
          a.S("mBackBtn");
       }
       tx.setOnClickListener(new UninstallToStayPresenter$a(this));
       tx = this.s;
       if (tx == null) {
          a.S("mStayBtn");
       }
       tx.setOnClickListener(new UninstallToStayPresenter$b(this));
       tx = this.t;
       if (tx == null) {
          a.S("mUnloadBtn");
       }
       tx.setOnClickListener(new UninstallToStayPresenter$c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, UninstallToStayPresenter.class, "2")) {
          return;
       }
       Throwable obj = this.q8(a.class);
       a.o(obj, "inject\(UninstallToStayContext::class.java\)");
       this.q = obj;
       obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          u1.R("U2SERROR", Log.getStackTraceString(obj), 9);
          this.R8("kwai://featured");
       }
       return;
    }
}
