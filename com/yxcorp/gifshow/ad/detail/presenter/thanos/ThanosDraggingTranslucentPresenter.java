package com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosDraggingTranslucentPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i19.j;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosDraggingTranslucentPresenter$mAdDisableDraggingTranslucent$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosDraggingTranslucentPresenter$a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosDraggingTranslucentPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.View;
import vy6.a;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.ArrayList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ThanosDraggingTranslucentPresenter extends PresenterV2	// class@0016ba
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public j r;
    public final p s;
    public final ThanosDraggingTranslucentPresenter$a t;
    public final ThanosDraggingTranslucentPresenter$b u;

    public void ThanosDraggingTranslucentPresenter(){
       super();
       this.r = new j();
       this.s = s.c(ThanosDraggingTranslucentPresenter$mAdDisableDraggingTranslucent$2.INSTANCE);
       this.t = new ThanosDraggingTranslucentPresenter$a(this);
       this.u = new ThanosDraggingTranslucentPresenter$b(this);
    }
    public void E8(){
       ThanosDraggingTranslucentPresenter thanosDraggi = ThanosDraggingTranslucentPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, thanosDraggi, "3")) {
          return;
       }
       Boolean uBoolean = PatchProxy.apply(objArray, this, thanosDraggi, "1");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = this.s.getValue();
       }
       if (uBoolean.booleanValue()) {
          return;
       }else {
          thanosDraggi = this.p;
          String str = "mFragment";
          if (thanosDraggi == null) {
             a.S(str);
          }
          this.q = SlidePlayViewModel.B0(thanosDraggi.requireParentFragment());
          View view = this.m8().findViewById(R.id.ad_detail_content_layout);
          if (view != null) {
             this.r.a(view);
          }
          view = this.m8().findViewById(R.id.ad_play_end_container);
          if (view != null) {
             this.r.a(view);
          }
          view = this.m8().findViewById(R.id.ad_tk_play_end_container);
          if (view != null) {
             this.r.a(view);
          }
          thanosDraggi = this.q;
          if (thanosDraggi != null) {
             ThanosDraggingTranslucentPresenter tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             thanosDraggi.P(tp, this.u);
          }
          return;
       }
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosDraggingTranslucentPresenter.class, "4")) {
          return;
       }
       ThanosDraggingTranslucentPresenter tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, j.class, "5")) {
          Iterator iterator = tr.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().clearAnimation();
          }
          tr.a.clear();
       }
       tr = this.q;
       if (tr != null) {
          ThanosDraggingTranslucentPresenter tp = this.p;
          if (tp == null) {
             a.S("mFragment");
          }
          tr.D(tp, this.u);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosDraggingTranslucentPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       return;
    }
}
