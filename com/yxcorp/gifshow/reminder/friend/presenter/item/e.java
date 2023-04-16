package com.yxcorp.gifshow.reminder.friend.presenter.item.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.reminder.friend.presenter.item.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.reminder.friend.presenter.item.b;
import erd.r;
import xdc.e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.reminder.friend.presenter.item.d;
import xdc.f;
import com.yxcorp.gifshow.reminder.friend.presenter.item.c;
import xdc.g;
import com.yxcorp.gifshow.reminder.friend.presenter.item.a;
import xdc.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import mec.a;
import xdc.i;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Runnable;
import ekd.k1;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.reminder.friend.presenter.item.e$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public class e extends PresenterV2	// class@001ad0
{
    public a A;
    public QPhoto p;
    public f q;
    public BaseFragment r;
    public CommonMeta s;
    public f t;
    public PublishSubject u;
    public PublishSubject v;
    public SlidePlayViewModel w;
    public View x;
    public ViewPropertyAnimator y;
    public Runnable z;

    public void e(){
       super();
       this.A = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.w = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.r, this.A);
       }
       this.X7(this.r.Vg().j().filter(b.b).subscribe(new e(this), Functions.d()));
       this.X7(this.r.m().filter(d.b).subscribe(new f(this), Functions.d()));
       this.X7(this.u.filter(c.b).subscribe(new g(this), Functions.d()));
       this.X7(this.v.filter(a.b).subscribe(new h(this), Functions.d()));
       this.X7(RxBus.f.f(a.class).subscribe(new i(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tw = this.w;
       if (tw != null) {
          tw.D(this.r, this.A);
       }
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       e tx = this.x;
       if (tx != null) {
          tx.setAlpha(0);
          this.x.setScaleX(0);
          this.x.setScaleY(0);
          View[] viewArray = new View[]{this.x};
          n.Z(8, viewArray);
       }
       if (this.y != null) {
          this.y = null;
       }
       tx = this.z;
       if (tx != null) {
          k1.m(tx);
          this.z = null;
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       e tx = this.x;
       if (tx == null) {
          return;
       }
       ViewPropertyAnimator viewProperty = tx.animate().alpha(0).scaleX(0).scaleY(0).setDuration(300).setInterpolator(new DecelerateInterpolator()).setListener(new e$b(this));
       this.y = viewProperty;
       viewProperty.start();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.s = this.q8(CommonMeta.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.t = this.x8("SHOW_BUBBLE_ENABLE");
       this.q = this.x8("FRIEND_SLIDE_PLAY_ITEM_VIEW_STUB_ROOT_VIEW");
       this.u = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       this.v = this.r8("DETAIL_SLIDE_SCREEN_VISIBILITY_EVENT");
       return;
    }
}
