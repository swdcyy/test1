package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$a;
import nsd.u;
import java.util.LinkedHashMap;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$k;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$e;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$d;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$mActivityLifecycleObserver$1;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$c;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$mBackgroundRunnable$1;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import jta.c;
import rf5.u;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$f;
import erd.g;
import crd.b;
import rd5.h;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$g;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$h;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$i;
import rd5.a;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$j;
import fw8.r;
import fw8.r$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import o56.f;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import uo5.a;
import tkd.b;
import tkd.d;
import fp5.a;
import kzc.e;
import cg6.b;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import kzc.c;
import com.kwai.library.widget.popup.bubble.a;
import kzc.f;
import com.kwai.library.widget.popup.common.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import java.util.WeakHashMap;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$clearPopup$4;
import msd.l;
import trd.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import i3a.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import wh5.a;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import android.view.View;
import java.lang.Number;
import androidx.fragment.app.e;
import com.kwai.inapp.InAppConfigExt;
import ey6.f;
import java.util.concurrent.ConcurrentHashMap;
import wkd.b;
import bf6.h;
import brd.y;
import uw9.l0;

public final class PictureInPicturePresenter extends PresenterV2	// class@0016c1
{
    public final Map A;
    public final BitSet B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final PictureInPicturePresenter$k H;
    public final c I;
    public final PictureInPicturePresenter$d J;
    public final LifecycleObserver K;
    public final PictureInPicturePresenter$c L;
    public final Runnable M;
    public final a N;
    public BaseFragment p;
    public u q;
    public y r;
    public t s;
    public y t;
    public t u;
    public l0 v;
    public u w;
    public SlidePlayViewModel x;
    public SmallWindowFragment y;
    public boolean z;
    public static final PictureInPicturePresenter$a O;

    static {
       PictureInPicturePresenter.O = new PictureInPicturePresenter$a(null);
    }
    public void PictureInPicturePresenter(){
       super();
       this.A = new LinkedHashMap();
       this.B = new BitSet();
       this.C = true;
       this.G = true;
       this.H = new PictureInPicturePresenter$k(this);
       this.I = new PictureInPicturePresenter$e(this);
       this.J = new PictureInPicturePresenter$d(this);
       this.K = new PictureInPicturePresenter$mActivityLifecycleObserver$1(this);
       this.L = new PictureInPicturePresenter$c(this);
       this.M = new PictureInPicturePresenter$mBackgroundRunnable$1(this);
       this.N = PictureInPicturePresenter$b.a;
    }
    public static final BaseFragment P8(PictureInPicturePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void E8(){
       g e;
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter.class, "3")) {
          return;
       }
       PictureInPicturePresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       this.x = SlidePlayViewModel.B0(tp);
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       FragmentActivity activity = tp.getActivity();
       if (activity != null) {
          Lifecycle lifecycle = activity.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(this.K);
          }
       }
       tp = this.q;
       if (tp == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       tp.j(this.I);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(e.class, mAIN).subscribe(new PictureInPicturePresenter$f(this)));
       this.X7(f.g(h.class, mAIN).subscribe(new PictureInPicturePresenter$g(this)));
       PictureInPicturePresenter ts = this.s;
       if (ts == null) {
          a.S("mEnablePipModeObservable");
       }
       e = Functions.e;
       this.X7(ts.subscribe(new PictureInPicturePresenter$h(this), e));
       ts = this.u;
       if (ts == null) {
          a.S("mPlayerInfoListenerObservable");
       }
       this.X7(ts.subscribe(new PictureInPicturePresenter$i(this), e));
       this.X7(f.g(a.class, mAIN).subscribe(new PictureInPicturePresenter$j(this), e));
       r.c().a(this.J);
       ActivityContext.i(this.L);
       if (f.b(this.getActivity())) {
          a.b(this.getActivity(), this.H);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter.class, "6")) {
          return;
       }
       PictureInPicturePresenter tq = this.q;
       if (tq == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       tq.B(this.I);
       r.c().g(this.J);
       ActivityContext.k(this.L);
       tq = this.p;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       FragmentActivity activity = tq.getActivity();
       if (activity != null) {
          Lifecycle lifecycle = activity.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.K);
          }
       }
       if (this.D != null) {
          a uoa = d.a(0x31a55ac8);
          PictureInPicturePresenter tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          uoa.nd(tp.getActivity());
       }
       if (f.b(this.getActivity())) {
          a.d(this.getActivity(), this.H);
       }
       return;
    }
    public final void R8(Activity p0){
       Object[] objArray;
       Iterator iterator;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter.class, "9")) {
          return;
       }
       List list = b.b().l(p0);
       if (list != null) {
          objArray = new Object[0];
          o.C().w("PictureInPicturePresent", "dialog queue size: "+list.size(), objArray);
          iterator = list.iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             a.o(ot, "popup");
             if (ot.K()) {
                objArray1 = new Object[0];
                o.C().w("PictureInPicturePresent", "clear dialog: "+ot, objArray1);
                ot.o();
             }
          }
       }
       list = b.a().l(p0);
       if (list != null) {
          objArray = new Object[0];
          o.C().w("PictureInPicturePresent", "bubble queue size: "+list.size(), objArray);
          iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             a.o(uoa, "popup");
             if (uoa.K()) {
                objArray1 = new Object[0];
                o.C().w("PictureInPicturePresent", "clear bubble: "+uoa, objArray1);
                uoa.o();
             }
          }
       }
       f uof = b.c();
       a.o(uof, "KwaiPopupManagerHolder.getPopupManager\(\)");
       list = uof.i().d(p0);
       a.o(list, "KwaiPopupManagerHolder.g¡­er.getPopupList\(activity\)");
       if (list != null) {
          objArray = new Object[0];
          o.C().w("PictureInPicturePresent", "popup queue size: "+list.size(), objArray);
          iterator = list.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             a.o(uoc, "popup");
             if (uoc.K()) {
                objArray1 = new Object[0];
                o.C().w("PictureInPicturePresent", "clear popup: "+uoc, objArray1);
                uoc.o();
             }
          }
       }
       List list1 = KwaiDialogFragment.o.get(p0.getSupportFragmentManager());
       if (list1 != null) {
          y.K0(list1, PictureInPicturePresenter$clearPopup$4.INSTANCE);
       }
       return;
    }
    public final boolean S8(){
       Object[] objArray = null;
       PictureInPicturePresenter obj = PatchProxy.apply(objArray, this, PictureInPicturePresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       if (obj != null) {
          QPhoto currentPhoto = obj.getCurrentPhoto();
          if (currentPhoto != null) {
             objArray = currentPhoto.getEntity();
          }
       }
       boolean b = w.V(objArray);
       o oo = o.C();
       int i = 1;
       StringBuilder str = "small window disable "+(b.j() ^ i)+", sidebar expand "+this.z+", not select ";
       PictureInPicturePresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       Object[] objArray1 = new Object[0];
       oo.w("PictureInPicturePresent", str+(tp.Vg().c() ^ i)+", guide "+"show "+a.f()+", disable set "+this.B+" ,"+"isCurrentPhotoDownloadingFromShare "+b+"menu open "+a.a(this.getActivity()), objArray1);
       if (this.z == null) {
          PictureInPicturePresenter tp1 = this.p;
          if (tp1 == null) {
             a.S("mFragment");
          }
          if (!tp1.Vg().c() || (a.f() || (this.B.cardinality() > 0 || (b || (!a.a(this.getActivity()) && !DeviceInfoManager.d.k()))))) {
             i = false;
          }
       }
    label_00de :
       return i;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("PictureInPicturePresent", "restoreView", objArray);
       this.W8(0);
       Iterator iterator = this.A.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          View key = uEntry.getKey();
          key.setVisibility(uEntry.getValue().intValue());
       }
       this.A.clear();
       PictureInPicturePresenter ty = this.y;
       if (ty != null) {
          PictureInPicturePresenter tp = this.p;
          if (tp == null) {
             a.S("mFragment");
          }
          FragmentActivity activity = tp.getActivity();
          if (activity != null) {
             Object[] objArray1 = new Object[0];
             o.C().w("PictureInPicturePresent", "remove small window fragment", objArray1);
             activity.getSupportFragmentManager().beginTransaction().u(ty).m();
          }
       }
       this.y = null;
       this.D = false;
       return;
    }
    public final void W8(boolean p0){
       Object obj;
       InAppConfigExt inAppConfigE = InAppConfigExt.class;
       PictureInPicturePresenter pictureInPic = PictureInPicturePresenter.class;
       if (PatchProxy.isSupport(pictureInPic) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, pictureInPic, "5")) {
          return;
       }
       int i = 3;
       if (p0) {
          b.b().u(i);
          b.a().u(i);
          f.a().b(false);
          PictureInPicturePresenter tN = this.N;
          if (!PatchProxy.applyVoidTwoRefs("PICTURE_IN_PICTURE", tN, null, inAppConfigE, "6")) {
             a.p("PICTURE_IN_PICTURE", "bizType");
             a.p(tN, "filter");
             InAppConfigExt.d.c().put("PICTURE_IN_PICTURE", tN);
          }
          obj = b.a(0x3adc2a3f);
          a.o(obj, "Singleton.get\(RatingHelper::class.java\)");
          obj.f(false);
       }else {
          b.b().v(i);
          b.a().v(i);
          if (!PatchProxy.applyVoidOneRefs("PICTURE_IN_PICTURE", null, inAppConfigE, "7")) {
             a.p("PICTURE_IN_PICTURE", "bizType");
             InAppConfigExt.d.c().remove("PICTURE_IN_PICTURE");
          }
          obj = b.a(0x3adc2a3f);
          a.o(obj, "Singleton.get\(RatingHelper::class.java\)");
          obj.f(true);
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.q = obj;
       obj = this.r8("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVER");
       a.o(obj, "inject\(AccessIds.PREPARE¡­IN_PICTURE_MODE_OBSERVER\)");
       this.r = obj;
       obj = this.r8("ENABLE_PICTURE_IN_PICTURE_MODE_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.E¡­_PICTURE_MODE_OBSERVABLE\)");
       this.s = obj;
       obj = this.r8("PIP_MODE_SYNC_PLAYER_PROGRESS_OBSERVER");
       a.o(obj, "inject\(DetailAccessIds.P¡­PLAYER_PROGRESS_OBSERVER\)");
       this.t = obj;
       obj = this.r8("PIP_MODE_PLAY_INFO_LISTENER_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.P¡­INFO_LISTENER_OBSERVABLE\)");
       this.u = obj;
       obj = this.q8(l0.class);
       a.o(obj, "inject\(PhotoDetailGlobalParams::class.java\)");
       this.v = obj;
       return;
    }
}
