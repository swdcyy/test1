package com.yxcorp.gifshow.detail.slidev2.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.util.ArrayList;
import b8a.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.l0;
import b8a.e;
import erd.g;
import crd.b;
import brd.t;
import b8a.d;
import e0d.h;
import android.view.View;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import xx9.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import oo5.a;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import uw9.o;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import rd5.j;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import kp.r1;
import java.lang.Float;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.animation.ValueAnimator;
import b8a.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b8a.c;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@0018f9
{
    public int A;
    public int B;
    public final Runnable C;
    public ViewStub p;
    public View q;
    public SlidePlayViewModel r;
    public BaseFragment s;
    public QPhoto t;
    public l0 u;
    public RecyclerView v;
    public TextView w;
    public final List x;
    public int y;
    public int z;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;

    static {
       d.D = a1.e(60.00f);
       d.E = a1.e(8.00f);
       d.F = a1.e(36.00f);
       d.G = a1.e(48.00f);
    }
    public void d(){
       super();
       this.x = new ArrayList();
       this.A = -1;
       this.B = -1;
       this.C = new f(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.y = n.x(this.getActivity());
       this.r = SlidePlayViewModel.B0(this.s);
       this.X7(this.u.I1.subscribe(new e(this)));
       this.X7(this.u.J1.subscribe(new d(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, d.class, "4");
    }
    public final void P8(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "6")) {
          return;
       }
       boolean b = false;
       h.g(b);
       d tq = this.q;
       if (tq == null || tq.getVisibility()) {
          Object[] objArray = new Object[b];
          o.C().w("SlidePlayAtlasProgressPresenter", "mAtlasProgressRootView==null, up ß∞‹", objArray);
          return;
       }else {
          tq = this.A;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tq), this, uod, "7")) {
             boolean b1 = this.R8();
             String str = (n.I(this.getActivity()))? "LANDSCAPE_SCREEN": "VERTICAL_SCREEN";
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PROGRESS_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("progress_type", str);
             oi3.c("time_start", Integer.valueOf(this.B));
             oi3.c("time_end", Integer.valueOf(tq));
             oi3.c("is_simplify_screen", Integer.valueOf(b1));
             oi3.d("action_type", "DRAG");
             uElementPack.params = oi3.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.t.mEntity);
             u1.M("", this.s, 1, uElementPack, uContentPack, null);
          }
          this.B = -1;
          this.A = -1;
          this.q.setVisibility(8);
          if (this.R8()) {
             this.u.L1.onNext(Boolean.FALSE);
          }else if(this.u.s2.c()){
             this.u.s2.d(new ChangeScreenVisibleEvent(this.t, ChangeScreenVisibilityCause.ATLAS_TOUCH_PROGRESS));
          }
          a.j(this.s, b);
          q.p0(this.getActivity()).w0(true, 20);
          return;
       }
    }
    public final boolean R8(){
       j obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u.s2.b();
       boolean b = (obj != null && (obj.a == ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && this.u.s2.c()))? true: false;
       return b;
    }
    public final void S8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "13")) {
          return;
       }
       QPhoto currentPhoto = this.r.getCurrentPhoto();
       this.t = currentPhoto;
       if (currentPhoto == null) {
          return;
       }
       ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(currentPhoto.getEntity());
       if (uAtlasCoverS == null) {
          return;
       }
       int len = uAtlasCoverS.length;
       for (int i = 0; i < len; i = i + 1) {
          this.W8(i, 0x3f800000, p0);
       }
       return;
    }
    public final void V8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "12")) {
          return;
       }
       this.W8((p0 - 2), 0x3f900000, p0);
       this.W8((p0 - 1), 0x3fa00000, p0);
       this.W8(p0, 0x3fb00000, p0);
       this.W8((p0 + 1), 0x3fa00000, p0);
       this.W8((p0 + 2), 0x3f900000, p0);
       return;
    }
    public final void W8(int p0,float p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, d.class, "15")) {
          return;
       }
       QPhoto currentPhoto = this.r.getCurrentPhoto();
       this.t = currentPhoto;
       if (currentPhoto == null) {
          return;
       }
       ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(currentPhoto.getEntity());
       if (uAtlasCoverS == null) {
          return;
       }
       uAtlasCoverS = uAtlasCoverS.length;
       if (p0 >= 0 && p0 < uAtlasCoverS) {
          View view = this.v.getLayoutManager().findViewByPosition(p0);
          if (view != null) {
             view = view.findViewById(R.id.item_iv_atlasa_preview);
             float[] uofloatArray = new float[]{(float)view.getWidth(),(float)d.F * p1};
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             valueAnimato.addUpdateListener(new b(view));
             float[] uofloatArray1 = new float[]{(float)view.getHeight(),(float)d.G * p1};
             ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray1);
             valueAnimato1.addUpdateListener(new c(view));
             AnimatorSet uAnimatorSet = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.setInterpolator(new LinearInterpolator());
             uAnimatorSet.setDuration(150);
             uAnimatorSet.start();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a027e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       this.u = this.q8(l0.class);
       return;
    }
}
