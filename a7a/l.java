package a7a.l;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import a7a.l$a;
import nsd.u;
import lnc.a1;
import a7a.l$g;
import a7a.l$f;
import a7a.l$h;
import a7a.l$e;
import a7a.l$b;
import a7a.l$c;
import w85.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import android.widget.ImageView;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import wh5.c;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;
import a7a.l$j;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a7a.l$k;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.h;
import t45.d;
import brd.z;
import a7a.l$l;
import tw6.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import a7a.l$m;
import erd.r;
import a7a.l$n;
import io.reactivex.internal.functions.Functions;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import joc.z;
import rf5.u;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import a7a.l$i;
import java.lang.Runnable;
import java.util.List;
import jta.c;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;
import xtd.b;
import xtd.a;
import ytd.c;
import ytd.b;
import a7a.l$d;
import xtd.e;
import java.lang.Number;
import com.yxcorp.utility.n;
import as7.a;
import java.lang.StringBuilder;
import q87.c;

public final class l extends SlidePlayAtlasBaseTouchPresenter	// class@00006b
{
    public final int W0;
    public Rect X0;
    public SwipeLayout Y0;
    public t Z0;
    public PublishSubject a1;
    public a b1;
    public t c1;
    public int d1;
    public int e1;
    public boolean f1;
    public b g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public final l$g k1;
    public final int l1;
    public int m1;
    public float n1;
    public float o1;
    public final l$f p1;
    public boolean q1;
    public final l$h r1;
    public boolean s1;
    public boolean t1;
    public List u1;
    public List v1;
    public final l$e w1;
    public final l$b x1;
    public final View$OnLayoutChangeListener y1;
    public static final l$a z1;

    static {
       l.z1 = new l$a(null);
    }
    public void l(){
       super();
       this.W0 = a1.e(113.00f);
       this.k1 = new l$g(this);
       this.l1 = 60;
       this.p1 = new l$f(this);
       this.r1 = new l$h(this);
       this.w1 = new l$e(this);
       this.x1 = new l$b(this);
       this.y1 = new l$c(this);
    }
    public static final a k9(l p0){
       p0 = p0.b1;
       if (p0 == null) {
          a.S("mDetailParam");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, l.class, "7")) {
          return;
       }
       super.E8();
       int i = 0;
       this.Z8().setVisibility(i);
       this.q1 = this.p0().r();
       this.Z8().setAssistListener(this.z);
       PhotosScaleHelpView photosScaleH = this.Z8();
       String str = "15";
       Object obj = PatchProxy.applyWithListener(objArray, this, l.class, str);
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!NasaExperimentUtils.n() && !c.b()){
          obj = 1;
       }else {
          obj = 0;
       }
       PatchProxy.onMethodExit(l.class, str);
       b = obj;
       photosScaleH.c(b);
       this.Z8().setVerticalPhotosScaleHelper(this.A);
       l tZ0 = this.Z0;
       if (tZ0 == null) {
          a.S("mAtlasProgressSyncEvent");
       }
       this.X7(tZ0.subscribe(new l$j(this)));
       this.Z8().setScaleEnabled((this.q1 ^ 1));
       tZ0 = this.c1;
       if (tZ0 == null) {
          a.S("mPhotoStatusObservable");
       }
       this.X7(tZ0.subscribe(new l$k(this)));
       this.X7(RxBus.f.f(h.class).observeOn(d.a).subscribe(new l$l(this)));
       this.j1 = i;
       this.p0().c0(this.k1);
       SlidePlayAtlasBaseTouchPresenter slidePlayAtl = PatchProxy.apply(objArray, this, SlidePlayAtlasBaseTouchPresenter.class, "14");
       if (slidePlayAtl != patchProxyRe) {
       }else {
          slidePlayAtl = this.R;
          if (slidePlayAtl == null) {
             a.S("currentFragment");
          }
       }
       this.X7(slidePlayAtl.Vg().f().filter(l$m.b).subscribe(new l$n(this), Functions.e));
       PatchProxy.onMethodExit(l.class, "7");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, l.class, "5")) {
          return;
       }
       this.Y0 = w9.c(this.getActivity());
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       a.o(viewConfigur, "ViewConfiguration.get\(context\)");
       this.m1 = viewConfigur.getScaledTouchSlop();
       PatchProxy.onMethodExit(l.class, "5");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, l.class, "13")) {
          return;
       }
       super.J8();
       if (NasaExperimentUtils.a()) {
          this.X8().release();
       }
       this.p0().d0(this.k1);
       PatchProxy.onMethodExit(l.class, "13");
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoidWithListener(null, this, l.class, "8")) {
          return;
       }
       super.d9();
       l tY0 = this.Y0;
       int i = 0;
       if (tY0 != null) {
          tY0.b(i, this.p1);
       }
       this.X0 = this.b9().A;
       this.X8().addOnLayoutChangeListener(this.y1);
       this.X8().post(new l$i(this));
       tY0 = this.u1;
       if (tY0 == null) {
          a.S("commentPanelStateListenerList");
       }
       tY0.add(this.w1);
       tY0 = this.v1;
       if (tY0 == null) {
          a.S("aiTextPanelStateListenerList");
       }
       tY0.add(this.x1);
       this.b9().j(this.r1);
       if (this.b9().w()) {
          this.X8().setEnableScroll(i);
          this.R8();
       }else {
          this.X8().setEnableScroll(true);
          this.W8();
       }
       PatchProxy.onMethodExit(l.class, "8");
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoidWithListener(null, this, l.class, "12")) {
          return;
       }
       l tY0 = this.Y0;
       if (tY0 != null) {
          tY0.m(this.p1);
       }
       this.X8().removeOnLayoutChangeListener(this.y1);
       this.b9().C(this.X0);
       this.b9().B(this.r1);
       tY0 = this.u1;
       if (tY0 == null) {
          a.S("commentPanelStateListenerList");
       }
       tY0.remove(this.w1);
       tY0 = this.v1;
       if (tY0 == null) {
          a.S("aiTextPanelStateListenerList");
       }
       tY0.remove(this.x1);
       this.f1 = false;
       if (!NasaExperimentUtils.a()) {
          this.X8().release();
       }
       PatchProxy.onMethodExit(l.class, "12");
       return;
    }
    public void h9(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l.class, "14")) {
          return;
       }
       a.p(p0, "e");
       if (this.X8().getScrollState()) {
          PatchProxy.onMethodExit(l.class, "14");
          return;
       }else {
          super.h9(p0);
          PatchProxy.onMethodExit(l.class, "14");
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, l.class, "6")) {
          return;
       }
       super.j8();
       Object obj = this.r8("SLIDE_PLAY_ATLAS_PLAY_PROGRESS_SYNC_POSITION");
       a.o(obj, "inject\(DetailAccessIds.S…Y_PROGRESS_SYNC_POSITION\)");
       this.Z0 = obj;
       obj = this.r8("SLIDE_PLAY_ATLAS_PLAY_PROGRESS");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_ATLAS_PLAY_PROGRESS\)");
       this.a1 = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailParam::class.java\)");
       this.b1 = obj;
       obj = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_P…ANEL_STATE_LISTENER_LIST\)");
       this.u1 = obj;
       obj = this.r8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_P…ANEL_STATE_LISTENER_LIST\)");
       this.v1 = obj;
       obj = this.r8("PhOTOSTATUS_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.PhOTOSTATUS_OBSERVABLE\)");
       this.c1 = obj;
       PatchProxy.onMethodExit(l.class, "6");
       return;
    }
    public void j9(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, l.class, "11")) {
          return;
       }
       l obj = PatchProxy.applyWithListener(objArray, this, l.class, "16");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.b1;
          if (obj == null) {
             a.S("mDetailParam");
          }
          b = (obj.g() && (this.j1 != null || this.p0().b1()))? true: false;
          PatchProxy.onMethodExit(l.class, "16");
       }
       if (!b) {
          super.j9();
       }
       if (!this.X8().F()) {
          this.m9();
       }
       PatchProxy.onMethodExit(l.class, "11");
       return;
    }
    public final void l9(){
       if (PatchProxy.applyVoidWithListener(null, this, l.class, "3")) {
          return;
       }
       if (this.X8().F() && !this.t9()) {
          l tg1 = this.g1;
          if (tg1 != null && tg1 != null) {
             tg1.detach();
          }
          a uoa = new a(new c(this.X8()), 4.00f, 0x3f800000, -2.00f);
          this.g1 = uoa;
          uoa.a(new l$d(this));
       }
       PatchProxy.onMethodExit(l.class, "3");
       return;
    }
    public final void m9(){
       if (PatchProxy.applyVoidWithListener(null, this, l.class, "4")) {
          return;
       }
       l tg1 = this.g1;
       if (tg1 != null) {
          tg1.detach();
       }
       PatchProxy.onMethodExit(l.class, "4");
       return;
    }
    public final int n9(){
       l ol = l.class;
       Object obj = PatchProxy.applyWithListener(null, this, ol, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PatchProxy.onMethodExit(ol, "2");
       return (this.o9() - 120);
    }
    public final int o9(){
       l ol = l.class;
       Object obj = PatchProxy.applyWithListener(null, this, ol, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PatchProxy.onMethodExit(ol, "1");
       return this.X8().getWidth();
    }
    public final boolean q9(MotionEvent p0){
       Activity obj = PatchProxy.applyOneRefsWithListener(p0, this, l.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d1 == null) {
          obj = this.getActivity();
          a.m(obj);
          this.d1 = n.j(obj);
       }
       if (this.e1 == null) {
          obj = this.getActivity();
          a.m(obj);
          this.e1 = n.k(obj);
       }
       int i = 2;
       int[] ointArray = new int[i];
       int i1 = 0;
       ointArray[i1] = i1;
       ointArray[1] = this.d1 - this.W0;
       Object[] objArray = new Object[i1];
       a.C().w("AtlasPlaySegmentedProgressView", "进度条的位置"+ointArray[i1]+" "+ointArray[1]+"屏幕宽高 "+this.e1+" "+this.d1, objArray);
       if ((int)p0.getX() >= ointArray[i1] && ((int)p0.getX() <= (ointArray[i1] + this.e1) && ((int)p0.getY() >= ointArray[1] && ((int)p0.getY() <= this.d1 && p0.getY() - (float)(this.d1 / i) > 0)))) {
          i1 = true;
       }
    label_00b1 :
       PatchProxy.onMethodExit(l.class, "17");
       return i1;
    }
    public final boolean s9(){
       boolean b;
       l ol = l.class;
       l obj = PatchProxy.applyWithListener(null, this, ol, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!c.b() && this.b9().o()) {
          obj = this.b1;
          if (obj == null) {
             a.S("mDetailParam");
          }
          if (obj.d()) {
             b = true;
          label_0036 :
             PatchProxy.onMethodExit(ol, "9");
             return b;
          }
       }
    label_0035 :
       b = false;
       goto label_0036 ;
    }
    public final boolean t9(){
       boolean b;
       l ol = l.class;
       l obj = PatchProxy.applyWithListener(null, this, ol, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.s9()) {
          obj = this.b1;
          if (obj == null) {
             a.S("mDetailParam");
          }
          if (!obj.c()) {
             b = true;
          label_002c :
             PatchProxy.onMethodExit(ol, "10");
             return b;
          }
       }
       b = false;
       goto label_002c ;
    }
}
