package com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$a;
import nsd.u;
import java.util.HashSet;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$onHiddenChangedListener$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import java.lang.StringBuilder;
import android.view.View;
import android.view.ViewStub;
import java.lang.Integer;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.d;
import th0.n;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter$d;
import android.animation.Animator$AnimatorListener;
import z4b.p;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;

public final class MagicSearchBarPresenter extends PresenterV2	// class@001bfd
{
    public PublishSubject A;
    public final l B;
    public HashSet p;
    public ValueAnimator q;
    public View r;
    public final ArrayList s;
    public final ArrayList t;
    public boolean u;
    public WeakReference v;
    public p w;
    public MagicEmojiFragment$Source x;
    public String y;
    public MagicSearchFragment z;
    public static final String C;
    public static final long D;
    public static final long E;
    public static final int F;
    public static final MagicSearchBarPresenter$a G;

    static {
       MagicSearchBarPresenter.G = new MagicSearchBarPresenter$a(null);
       MagicSearchBarPresenter.C = "MagicSearchBarPresenter";
       MagicSearchBarPresenter.D = 300;
       MagicSearchBarPresenter.E = 240;
       MagicSearchBarPresenter.F = 200;
    }
    public void MagicSearchBarPresenter(){
       super();
       this.p = new HashSet();
       this.s = new ArrayList();
       this.t = new ArrayList();
       this.u = true;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.A = publishSubje;
       this.B = new MagicSearchBarPresenter$onHiddenChangedListener$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MagicSearchBarPresenter.class, "11")) {
          return;
       }
       b.d(MagicSearchBarPresenter.C, "onBind");
       this.u = true;
       this.X7(this.A.subscribe(new MagicSearchBarPresenter$b(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MagicSearchBarPresenter.class, "12")) {
          return;
       }
       b.d(MagicSearchBarPresenter.C, "onUnbind");
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, MagicSearchBarPresenter.class, "14")) {
          return;
       }
       MagicSearchBarPresenter tv = this.v;
       if (tv != null) {
          MagicSearchBarFragment magicSearchB = tv.get();
          if (magicSearchB != null) {
             magicSearchB.dismissAllowingStateLoss();
          }
       }
       return;
    }
    public final void R8(boolean p0){
       ValueAnimator valueAnimato;
       MagicSearchBarPresenter magicSearchB = MagicSearchBarPresenter.class;
       if (PatchProxy.isSupport(magicSearchB) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, magicSearchB, "15")) {
          return;
       }
       magicSearchB = this.r;
       if (magicSearchB == null && magicSearchB instanceof ViewGroup) {
          return;
       }
       if (p0 == this.u) {
          return;
       }
       this.u = p0;
       float[] uofloatArray = 0x3f800000;
       int i = 0;
       Object obj = (p0)? 0x3f800000: 0;
       MagicSearchBarPresenter tq = this.q;
       if (tq != null && tq.isRunning()) {
          obj = tq.getAnimatedValue();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
          obj = obj.floatValue();
          tq.removeAllListeners();
          tq.cancel();
       }
       b.d(MagicSearchBarPresenter.C, "startMagicViewAnimate + isShow : "+p0);
       if (!p0) {
          this.t.clear();
          this.s.clear();
          MagicSearchBarPresenter tr = this.r;
          Objects.requireNonNull(tr, "null cannot be cast to non-null type android.view.ViewGroup");
          int childCount = tr.getChildCount();
          int i1 = 0;
          while (i1 < childCount) {
             View childAt = tr.getChildAt(i1);
             if (!childAt instanceof ViewStub) {
                a.o(childAt, "view");
                if (!childAt.getVisibility()) {
                   if (this.p.contains(Integer.valueOf(childAt.getId()))) {
                      this.s.add(childAt);
                   }
                   this.t.add(childAt);
                }
             }
             i1 = i1 + 1;
          }
       }
       if (p0) {
          uofloatArray = new float[]{obj,i};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       }else {
          float[] uofloatArray1 = new float[]{obj,uofloatArray};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray1);
       }
       this.q = valueAnimato;
       a.m(valueAnimato);
       valueAnimato.addUpdateListener(new MagicSearchBarPresenter$c(this, p0));
       magicSearchB = this.q;
       a.m(magicSearchB);
       d uod = (p0)? new d(): new n();
       magicSearchB.setInterpolator(uod);
       magicSearchB = this.q;
       a.m(magicSearchB);
       long d = (p0)? MagicSearchBarPresenter.D: MagicSearchBarPresenter.E;
       magicSearchB.setDuration(d);
       magicSearchB = this.q;
       a.m(magicSearchB);
       magicSearchB.addListener(new MagicSearchBarPresenter$d(this, p0));
       MagicSearchBarPresenter tq1 = this.q;
       a.m(tq1);
       tq1.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarPresenter.class, "10")) {
          return;
       }
       this.p.clear();
       this.p.add(Integer.valueOf(R.id.tabs_container));
       this.p.add(Integer.valueOf(R.id.camera_magic_swap_layout));
       p0 = (p0 != null)? p0.findViewById(R.id.magic_fragment): null;
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MagicSearchBarPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("search_keyword_confirm_listener");
       a.o(obj, "inject\(MagicSearchAccess¡­KEYWORD_CONFIRM_LISTENER\)");
       this.w = obj;
       obj = this.r8("magic_source");
       a.o(obj, "inject\(MagicSearchAccessIds.MAGIC_SOURCE\)");
       this.x = obj;
       obj = this.r8("magic_page_id");
       a.o(obj, "inject\(MagicSearchAccessIds.MAGIC_PAGE_ID\)");
       this.y = obj;
       obj = this.r8("magic_search_panel_fragment");
       a.o(obj, "inject\(MagicSearchAccess¡­IC_SEARCH_PANEL_FRAGMENT\)");
       this.z = obj;
       obj = this.r8("magic_search_bar_subject");
       a.o(obj, "inject\(MagicSearchAccess¡­EARCH_BAR_SWITCH_SUBJECT\)");
       this.A = obj;
       return;
    }
}
