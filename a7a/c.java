package a7a.c;
import e7a.a;
import a7a.c$a;
import nsd.u;
import java.util.BitSet;
import a7a.c$c;
import a7a.c$b;
import a7a.c$n;
import a7a.c$m;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.p;
import brd.t;
import t45.d;
import brd.z;
import a7a.c$k;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a7a.c$l;
import sf5.d;
import java.lang.Integer;
import id5.v;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.trello.rxlifecycle3.components.support.RxFragment;
import a7a.c$d;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import a7a.c$e;
import a7a.c$f;
import bxb.a;
import a7a.c$g;
import a7a.c$h;
import xx9.a;
import a7a.c$i;
import io.reactivex.internal.functions.Functions;
import fkc.b;
import a7a.c$j;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jta.c;
import r7a.f;
import rf5.u;
import java.lang.NullPointerException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.view.View;
import ekd.m1;

public final class c extends a	// class@000050
{
    public t A;
    public boolean B;
    public List C;
    public List D;
    public final c$c E;
    public final c$b F;
    public t G;
    public f H;
    public a I;
    public t J;
    public final c$n K;
    public final RecyclerView$r L;
    public SlideHorizontalAtlasPlayer v;
    public final BitSet w;
    public boolean x;
    public int y;
    public u z;
    public static final c$a M;

    static {
       c.M = new c$a(null);
    }
    public void c(){
       super();
       this.w = new BitSet();
       this.x = true;
       this.E = new c$c(this);
       this.F = new c$b(this);
       this.K = new c$n(this);
       this.L = new c$m(this);
    }
    public static final SlideHorizontalAtlasPlayer X8(c p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("horizontalAtlasPlayer");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "4")) {
          return;
       }
       super.E8();
       this.X7(RxBus.f.f(p.class).observeOn(d.a).subscribe(new c$k(this)));
       c tA = this.A;
       if (tA == null) {
          a.S("mAtlasProgressSyncEvent");
       }
       this.X7(tA.subscribe(new c$l(this)));
       PatchProxy.onMethodExit(c.class, "4");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "3")) {
          return;
       }
       super.F8();
       this.y = d.d.b();
       PatchProxy.onMethodExit(c.class, "3");
       return;
    }
    public void V8(){
       z a;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, c.class, "5")) {
          return;
       }
       boolean b = false;
       if (this.x != null) {
          this.w.clear();
          int i = 1;
          String str = "8";
          if (!PatchProxy.isSupport2(c.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(i), this, c.class, str)) {
             Object[] objArray1 = new Object[b];
             v.C().w("SlideHorizontalAtlasAPP", "tryStartScroll: flag=1", objArray1);
             this.w.clear(i);
             this.Z8(b, i);
             PatchProxy.onMethodExit(c.class, str);
          }
       }else {
          this.b9(12);
       }
       Fragment parentFragme = this.S8().getParentFragment();
       if (!parentFragme instanceof BaseFragment) {
          parentFragme = objArray;
       }
       if (parentFragme != null) {
          FragmentCompositeLifecycleState uFragmentCom = parentFragme.Vg();
          if (uFragmentCom != null) {
             b = uFragmentCom.c();
          }
       }
       this.x = b;
       if (this.p0().r()) {
          this.c9(5);
       }
       b uob = this.S8().m().subscribe(new c$d(this));
       a.o(uob, "currentPhotoFragment.lif¡­      }\n        }\n      }");
       this.P8(uob);
       Activity activity = this.getActivity();
       if (activity != null) {
          q oq = q.p0(activity);
          a.o(oq, "MenuViewModel.get\(activity as FragmentActivity\)");
          uob = oq.r0().subscribe(new c$e(this));
          a.o(uob, "MenuViewModel.get\(activi¡­DING_PANEL\)\n      }\n    }");
          this.P8(uob);
          c tG = this.G;
          if (tG == null) {
             a.S("moreOperationPanelShowObservable");
          }
          uob = tG.subscribe(new c$f(this));
          a.o(uob, "moreOperationPanelShowOb¡­BACK_PANEL\)\n      }\n    }");
          this.P8(uob);
          RxBus f = RxBus.f;
          a = d.a;
          b uob1 = f.f(a.class).observeOn(a).subscribe(new c$g(this));
          a.o(uob1, "RxBus.INSTANCE.toObserva¡­DIALOG\)\n        }\n      }");
          this.P8(uob1);
          c tI = this.I;
          if (tI == null) {
             a.S("mScreenCleanStatusCombination");
          }
          this.P8(a.j(tI, new c$h(this), objArray, 2, objArray));
          c tJ = this.J;
          if (tJ == null) {
             a.S("mNasaScaleCleanControllerShowObservable");
          }
          b uob2 = tJ.subscribe(new c$i(this), Functions.e);
          a.o(uob2, "mNasaScaleCleanControlle¡­Functions.ERROR_CONSUMER\)");
          this.P8(uob2);
          this.X7(f.f(b.class).observeOn(a).subscribe(new c$j(this)));
          tJ = this.v;
          String str1 = "horizontalAtlasPlayer";
          if (tJ == null) {
             a.S(str1);
          }
          tJ.addOnScrollListener(this.L);
          tJ = this.C;
          if (tJ == null) {
             a.S("commentPanelStateListenerList");
          }
          tJ.add(this.E);
          tJ = this.D;
          if (tJ == null) {
             a.S("aiTextPanelStateListenerList");
          }
          tJ.add(this.F);
          tJ = this.H;
          if (tJ == null) {
             a.S("sidebarStatusHelper");
          }
          tJ.a(this.K);
          tJ = this.v;
          if (tJ == null) {
             a.S(str1);
          }
          tG = this.z;
          if (tG == null) {
             a.S("mSwipeToProfileFeedMovement");
          }
          tJ.G(tG.w());
          PatchProxy.onMethodExit(c.class, "5");
          return;
       }else {
          PatchProxy.onMethodExit(c.class, "5");
          throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       }
    }
    public void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, c.class, "7")) {
          return;
       }
       c tv = this.v;
       if (tv == null) {
          a.S("horizontalAtlasPlayer");
       }
       boolean b = false;
       tv.G(b);
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
       this.x = b;
       if (b) {
          this.c9(1);
       }else {
          this.c9(12);
       }
       c tH = this.H;
       if (tH == null) {
          a.S("sidebarStatusHelper");
       }
       tH.c(this.K);
       tH = this.C;
       if (tH == null) {
          a.S("commentPanelStateListenerList");
       }
       tH.remove(this.E);
       tH = this.D;
       if (tH == null) {
          a.S("aiTextPanelStateListenerList");
       }
       tH.remove(this.F);
       tH = this.v;
       if (tH == null) {
          a.S("horizontalAtlasPlayer");
       }
       tH.removeOnScrollListener(this.L);
       PatchProxy.onMethodExit(c.class, "7");
       return;
    }
    public final boolean Y8(){
       c uoc = c.class;
       Object obj = PatchProxy.applyWithListener(null, this, uoc, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (d.d.g(this.y)) {
          PatchProxy.onMethodExit(uoc, "6");
          return false;
       }else {
          PatchProxy.onMethodExit(uoc, "6");
          return true;
       }
    }
    public final void Z8(int p0,int p1){
       if (PatchProxy.isSupport2(c.class, "10") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), this, c.class, "10")) {
          return;
       }
       int i = 0;
       if (this.w.isEmpty()) {
          Object[] objArray = new Object[i];
          v.C().w("SlideHorizontalAtlasAPP", "tryStartScroll: success", objArray);
          c tv = this.v;
          if (tv == null) {
             a.S("horizontalAtlasPlayer");
          }
          tv.P(p0, p1);
       }else {
          Object[] objArray1 = new Object[i];
          v.C().w("SlideHorizontalAtlasAPP", "tryStartScroll: fail "+this.w, objArray1);
       }
       PatchProxy.onMethodExit(c.class, "10");
       return;
    }
    public final void a9(int p0){
       if (PatchProxy.isSupport2(c.class, "12") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideHorizontalAtlasAPP", "tryStartScroll: flag="+p0, objArray);
       this.w.clear(2);
       this.Z8(-1, p0);
       PatchProxy.onMethodExit(c.class, "12");
       return;
    }
    public final void b9(int p0){
       if (PatchProxy.isSupport2(c.class, "9") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideHorizontalAtlasAPP", "tryStartScroll: flag="+p0, objArray);
       this.w.clear(p0);
       this.Z8(-1, p0);
       PatchProxy.onMethodExit(c.class, "9");
       return;
    }
    public final void c9(int p0){
       if (PatchProxy.isSupport2(c.class, "11") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideHorizontalAtlasAPP", "tryStopScroll: flag="+p0, objArray);
       this.w.set(p0);
       c tv = this.v;
       if (tv == null) {
          a.S("horizontalAtlasPlayer");
       }
       tv.R(p0);
       PatchProxy.onMethodExit(c.class, "11");
       return;
    }
    public final void d9(int p0){
       if (PatchProxy.isSupport2(c.class, "13") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       v.C().w("SlideHorizontalAtlasAPP", "tryStopScroll: flag="+p0, objArray);
       this.w.set(2);
       c tv = this.v;
       if (tv == null) {
          a.S("horizontalAtlasPlayer");
       }
       tv.R(p0);
       PatchProxy.onMethodExit(c.class, "13");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.doBindView(p0);
       p0 = m1.f(p0, R.id.autoplay_cover_view_page_style);
       a.o(p0, "ViewBindUtils.bindWidget¡­ay_cover_view_page_style\)");
       this.v = p0;
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "2")) {
          return;
       }
       super.j8();
       Object obj = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_P¡­ANEL_STATE_LISTENER_LIST\)");
       this.C = obj;
       obj = this.r8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_P¡­ANEL_STATE_LISTENER_LIST\)");
       this.D = obj;
       obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(DetailAccessIds.NASA_SIDEBAR_STATUS\)");
       this.H = obj;
       obj = this.r8("MORE_OPERATION_PANEL_SHOW_OBSERVABLE");
       a.o(obj, "inject\(AccessIds.MORE_OP¡­ON_PANEL_SHOW_OBSERVABLE\)");
       this.G = obj;
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.I = obj;
       obj = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.N¡­NTROLLER_SHOW_OBSERVABLE\)");
       this.J = obj;
       obj = this.r8("SLIDE_PLAY_ATLAS_PLAY_PROGRESS_SYNC_POSITION");
       a.o(obj, "inject\(DetailAccessIds.S¡­Y_PROGRESS_SYNC_POSITION\)");
       this.A = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.z = obj;
       PatchProxy.onMethodExit(c.class, "2");
       return;
    }
}
