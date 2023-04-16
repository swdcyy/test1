package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter;
import e7a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$defaultBottomMargin$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$j;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$k;
import ud5.c;
import ud5.e;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import bf5.q;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$l;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.p;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$m;
import sf5.d;
import java.lang.Integer;
import id5.v;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$d;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$e;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$f;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$g;
import bxb.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$h;
import fkc.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.SlideVerticalAtlasAutoPlayPresenter$i;
import java.util.List;
import jta.c;
import r7a.f;
import java.lang.NullPointerException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import brd.y;
import java.lang.StringBuilder;
import android.view.View;
import ekd.m1;
import java.lang.Float;
import le5.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Number;
import mrd.c;

public final class SlideVerticalAtlasAutoPlayPresenter extends a	// class@00180c
{
    public int A;
    public NasaBizParam B;
    public t C;
    public t D;
    public c E;
    public boolean F;
    public boolean G;
    public List H;
    public List I;
    public final SlideVerticalAtlasAutoPlayPresenter$c J;
    public final SlideVerticalAtlasAutoPlayPresenter$b K;
    public f L;
    public final SlideVerticalAtlasAutoPlayPresenter$n M;
    public q v;
    public final p w;
    public SlideVerticalAtlasPlayer x;
    public final BitSet y;
    public boolean z;
    public static final SlideVerticalAtlasAutoPlayPresenter$a N;

    static {
       SlideVerticalAtlasAutoPlayPresenter.N = new SlideVerticalAtlasAutoPlayPresenter$a(null);
    }
    public void SlideVerticalAtlasAutoPlayPresenter(){
       super();
       this.w = s.c(SlideVerticalAtlasAutoPlayPresenter$defaultBottomMargin$2.INSTANCE);
       this.y = new BitSet();
       this.z = true;
       this.J = new SlideVerticalAtlasAutoPlayPresenter$c(this);
       this.K = new SlideVerticalAtlasAutoPlayPresenter$b(this);
       this.M = new SlideVerticalAtlasAutoPlayPresenter$n(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, SlideVerticalAtlasAutoPlayPresenter.class, "5")) {
          return;
       }
       super.E8();
       SlideVerticalAtlasAutoPlayPresenter tx = this.x;
       if (tx == null) {
          a.S("verticalAtlasPlayer");
       }
       tx.y(this.R8(), new SlideVerticalAtlasAutoPlayPresenter$j(this), new SlideVerticalAtlasAutoPlayPresenter$k(this));
       this.y.clear();
       tx = this.v;
       String str = "profileSideEventBus";
       if (tx == null) {
          a.S(str);
       }
       this.e9(tx.h);
       tx = this.v;
       if (tx == null) {
          a.S(str);
       }
       this.X7(tx.G.subscribe(new SlideVerticalAtlasAutoPlayPresenter$l(this), Functions.e));
       this.X7(RxBus.f.f(p.class).observeOn(d.a).subscribe(new SlideVerticalAtlasAutoPlayPresenter$m(this)));
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "5");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, SlideVerticalAtlasAutoPlayPresenter.class, "4")) {
          return;
       }
       super.F8();
       this.A = d.d.b();
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "4");
       return;
    }
    public void V8(){
       z a;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlideVerticalAtlasAutoPlayPresenter.class, "7")) {
          return;
       }
       boolean b = false;
       if (this.z != null) {
          this.y.clear();
          String str = "10";
          if (!PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(1), this, SlideVerticalAtlasAutoPlayPresenter.class, str)) {
             Object[] objArray1 = new Object[b];
             v.C().w("SlideVerticalAtlasAPP", "tryStartScroll: flag=1", objArray1);
             this.y.clear(1);
             this.Z8(b, 1);
             PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, str);
          }
       }else {
          this.b9(12);
       }
       Fragment parentFragme = this.S8().getParentFragment();
       if (parentFragme instanceof BaseFragment) {
          objArray = parentFragme;
       }
       if (objArray != null) {
          FragmentCompositeLifecycleState uFragmentCom = objArray.Vg();
          if (uFragmentCom != null) {
             b = uFragmentCom.c();
          }
       }
       this.z = b;
       if (this.p0().r()) {
          this.c9(5);
       }
       b uob = this.S8().m().subscribe(new SlideVerticalAtlasAutoPlayPresenter$d(this));
       a.o(uob, "currentPhotoFragment.lif¡­  }\n          }\n        }");
       this.P8(uob);
       SlideVerticalAtlasAutoPlayPresenter tC = this.C;
       if (tC == null) {
          a.S("scaleCleanControllerShowObservable");
       }
       uob = tC.subscribe(new SlideVerticalAtlasAutoPlayPresenter$e(this));
       a.o(uob, "scaleCleanControllerShow¡­ASON.SCALE\)\n      }\n    }");
       this.P8(uob);
       Activity activity = this.getActivity();
       if (activity != null) {
          q oq = q.p0(activity);
          a.o(oq, "MenuViewModel.get\(activity as FragmentActivity\)");
          uob = oq.r0().subscribe(new SlideVerticalAtlasAutoPlayPresenter$f(this));
          a.o(uob, "MenuViewModel.get\(activi¡­DING_PANEL\)\n      }\n    }");
          this.P8(uob);
          tC = this.D;
          if (tC == null) {
             a.S("moreOperationPanelShowObservable");
          }
          uob = tC.subscribe(new SlideVerticalAtlasAutoPlayPresenter$g(this));
          a.o(uob, "moreOperationPanelShowOb¡­BACK_PANEL\)\n      }\n    }");
          this.P8(uob);
          RxBus f = RxBus.f;
          a = d.a;
          b uob1 = f.f(a.class).observeOn(a).subscribe(new SlideVerticalAtlasAutoPlayPresenter$h(this));
          a.o(uob1, "RxBus.INSTANCE.toObserva¡­OG\)\n          }\n        }");
          this.P8(uob1);
          this.X7(f.f(b.class).observeOn(a).subscribe(new SlideVerticalAtlasAutoPlayPresenter$i(this)));
          tC = this.H;
          if (tC == null) {
             a.S("commentPanelStateListenerList");
          }
          tC.add(this.J);
          tC = this.I;
          if (tC == null) {
             a.S("aiTextPanelStateListenerList");
          }
          tC.add(this.K);
          tC = this.L;
          if (tC == null) {
             a.S("sidebarStatusHelper");
          }
          tC.a(this.M);
          if (this.F != null) {
             this.Y8(1);
          }
          PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "7");
          return;
       }else {
          PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "7");
          throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       }
    }
    public void W8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SlideVerticalAtlasAutoPlayPresenter.class, "9")) {
          return;
       }
       Fragment parentFragme = this.S8().getParentFragment();
       if (parentFragme instanceof BaseFragment) {
          objArray = parentFragme;
       }
       if (objArray != null) {
          FragmentCompositeLifecycleState uFragmentCom = objArray.Vg();
          if (uFragmentCom != null) {
             b = uFragmentCom.c();
          label_002b :
             this.z = b;
             if (b) {
                this.c9(1);
             }else {
                this.c9(12);
             }
             SlideVerticalAtlasAutoPlayPresenter tL = this.L;
             if (tL == null) {
                a.S("sidebarStatusHelper");
             }
             tL.c(this.M);
             tL = this.H;
             if (tL == null) {
                a.S("commentPanelStateListenerList");
             }
             tL.remove(this.J);
             tL = this.I;
             if (tL == null) {
                a.S("aiTextPanelStateListenerList");
             }
             tL.remove(this.K);
             this.Y8(false);
             this.F = false;
             PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "9");
             return;
          }
       }
       b = false;
       goto label_002b ;
    }
    public final boolean X8(){
       SlideVerticalAtlasAutoPlayPresenter slideVertica = SlideVerticalAtlasAutoPlayPresenter.class;
       Object obj = PatchProxy.applyWithListener(null, this, slideVertica, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (d.d.g(this.A)) {
          PatchProxy.onMethodExit(slideVertica, "8");
          return false;
       }else {
          PatchProxy.onMethodExit(slideVertica, "8");
          return true;
       }
    }
    public final void Y8(boolean p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, "16") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter.class, "16")) {
          return;
       }
       if (this.getActivity() != null) {
          Activity activity = this.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          if (!activity.isFinishing()) {
             if (NasaExperimentUtils.m()) {
                SlideVerticalAtlasAutoPlayPresenter tE = this.E;
                if (tE == null) {
                   a.S("mLoadingAnimObservable");
                }
                tE.onNext(Boolean.valueOf(p0));
             }
             PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "16");
             return;
          }
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "16");
       return;
    }
    public final void Z8(int p0,int p1){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, "12") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), this, SlideVerticalAtlasAutoPlayPresenter.class, "12")) {
          return;
       }
       String str = "SlideVerticalAtlasAPP";
       if (this.y.isEmpty()) {
          Object[] objArray = new Object[0];
          v.C().w(str, "tryStartScroll: success", objArray);
          SlideVerticalAtlasAutoPlayPresenter tx = this.x;
          if (tx == null) {
             a.S("verticalAtlasPlayer");
          }
          tx.D(p0, 0, p1);
       }else {
          Object[] objArray1 = new Object[0];
          v.C().w(str, "tryStartScroll: fail "+this.y, objArray1);
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "12");
       return;
    }
    public final void a9(int p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, "14") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideVerticalAtlasAPP", "tryStartScroll: flag="+p0, objArray);
       this.y.clear(2);
       this.Z8(-1, p0);
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "14");
       return;
    }
    public final void b9(int p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, "11") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideVerticalAtlasAPP", "tryStartScroll: flag="+p0, objArray);
       this.y.clear(p0);
       this.Z8(-1, p0);
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "11");
       return;
    }
    public final void c9(int p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, "13") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideVerticalAtlasAPP", "tryStopScroll: flag="+p0, objArray);
       this.y.set(p0);
       SlideVerticalAtlasAutoPlayPresenter tx = this.x;
       if (tx == null) {
          a.S("verticalAtlasPlayer");
       }
       tx.F(p0);
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "13");
       return;
    }
    public final void d9(int p0){
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, "15") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideVerticalAtlasAPP", "tryStopScroll: flag="+p0, objArray);
       this.y.set(2);
       SlideVerticalAtlasAutoPlayPresenter tx = this.x;
       if (tx == null) {
          a.S("verticalAtlasPlayer");
       }
       tx.F(p0);
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "15");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlideVerticalAtlasAutoPlayPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       super.doBindView(p0);
       p0 = m1.f(p0, R.id.cover_frame);
       a.o(p0, "bindWidget\(rootView, R.id.cover_frame\)");
       this.x = p0;
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "2");
       return;
    }
    public final void e9(float p0){
       boolean b;
       int i;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport2(SlideVerticalAtlasAutoPlayPresenter.class, "6") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, SlideVerticalAtlasAutoPlayPresenter.class, "6")) {
          return;
       }
       String str = "17";
       Object[] objArray = null;
       ViewGroup$LayoutParams obj = PatchProxy.applyWithListener(objArray, this, SlideVerticalAtlasAutoPlayPresenter.class, str);
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(f.r()){
          SlideVerticalAtlasAutoPlayPresenter tB = this.B;
          String str1 = "nasaBizParam";
          if (tB == null) {
             a.S(str1);
          }
          if (tB.getNasaSlideParam() != null) {
             tB = this.B;
             if (tB == null) {
                a.S(str1);
             }
             NasaSlideParam nasaSlidePar = tB.getNasaSlideParam();
             a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
             if (!nasaSlidePar.isTrendingPage()) {
                tB = this.B;
                if (tB == null) {
                   a.S(str1);
                }
                nasaSlidePar = tB.getNasaSlideParam();
                a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
                if (!nasaSlidePar.isHomePage() || !f.b()) {
                   str2 = 1;
                label_006f :
                   PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, str);
                   b = str2;
                }
             }
          }
       }
    label_006e :
       str2 = null;
       goto label_006f ;
       if (b) {
          SlideVerticalAtlasAutoPlayPresenter tx = this.x;
          if (tx == null) {
             a.S("verticalAtlasPlayer");
          }
          obj = tx.getLayoutParams();
          if (obj != null) {
             Object obj1 = PatchProxy.applyWithListener(objArray, this, SlideVerticalAtlasAutoPlayPresenter.class, "1");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                i = this.w.getValue().intValue();
                PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "1");
             }
             obj.bottomMargin = (int)((float)i * p0);
             tx.setLayoutParams(obj);
          }else {
             PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "6");
             throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          }
       }
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "6");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, SlideVerticalAtlasAutoPlayPresenter.class, "3")) {
          return;
       }
       super.j8();
       Object obj = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.N¡­NTROLLER_SHOW_OBSERVABLE\)");
       this.C = obj;
       obj = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_P¡­ANEL_STATE_LISTENER_LIST\)");
       this.H = obj;
       obj = this.r8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_P¡­ANEL_STATE_LISTENER_LIST\)");
       this.I = obj;
       obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(DetailAccessIds.NASA_SIDEBAR_STATUS\)");
       this.L = obj;
       obj = this.r8("MORE_OPERATION_PANEL_SHOW_OBSERVABLE");
       a.o(obj, "inject\(AccessIds.MORE_OP¡­ON_PANEL_SHOW_OBSERVABLE\)");
       this.D = obj;
       obj = this.q8(NasaBizParam.class);
       a.o(obj, "inject\(NasaBizParam::class.java\)");
       this.B = obj;
       obj = this.q8(q.class);
       a.o(obj, "inject\(MilanoProfileSideEventBus::class.java\)");
       this.v = obj;
       obj = this.r8("DETAIL_LOADING_ANIM_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­_LOADING_ANIM_OBSERVABLE\)");
       this.E = obj;
       PatchProxy.onMethodExit(SlideVerticalAtlasAutoPlayPresenter.class, "3");
       return;
    }
}
