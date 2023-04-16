package com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$a;
import nsd.u;
import java.util.ArrayList;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$onBind$1;
import kf5.c;
import msd.l;
import erd.g;
import crd.b;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;

public final class FeedbackSpeedPanelPresenter extends PresenterV2	// class@000a74
{
    public Activity p;
    public BaseFragment q;
    public QPhoto r;
    public View s;
    public RecyclerView t;
    public List u;
    public FeedbackSpeedPanelPresenter$c v;
    public ArrayList w;
    public int x;
    public static final FeedbackSpeedPanelPresenter$a y;

    static {
       FeedbackSpeedPanelPresenter.y = new FeedbackSpeedPanelPresenter$a(null);
    }
    public void FeedbackSpeedPanelPresenter(){
       super();
       this.w = new ArrayList();
    }
    public static final View P8(FeedbackSpeedPanelPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mSpeedSecondPanel");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FeedbackSpeedPanelPresenter.class, "3")) {
          return;
       }
       FeedbackSpeedPanelPresenter tt = this.t;
       if (tt == null) {
          a.S("mSpeedRecyclerView");
       }
       tt.setLayoutManager(new LinearLayoutManager(this.getActivity(), 0, 0));
       this.X7(RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new c(new FeedbackSpeedPanelPresenter$onBind$1(this))));
       return;
    }
    public final void R8(float p0){
       FeedbackSpeedPanelPresenter uFeedbackSpe = FeedbackSpeedPanelPresenter.class;
       if (PatchProxy.isSupport(uFeedbackSpe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uFeedbackSpe, "5")) {
          return;
       }
       uFeedbackSpe = this.s;
       if (uFeedbackSpe == null) {
          a.S("mSpeedSecondPanel");
       }
       uFeedbackSpe.setAlpha(p0);
       uFeedbackSpe = this.s;
       if (uFeedbackSpe == null) {
          a.S("mSpeedSecondPanel");
       }
       uFeedbackSpe.getLayoutParams().height = (int)(p0 * (float)a1.d(0x7f070325));
       FeedbackSpeedPanelPresenter ts = this.s;
       if (ts == null) {
          a.S("mSpeedSecondPanel");
       }
       ts.requestLayout();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedbackSpeedPanelPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.speed_second_panel);
       a.o(view, "bindWidget\(rootView, R.id.speed_second_panel\)");
       this.s = view;
       p0 = m1.f(p0, R.id.speed_second_panel_recycler_view);
       a.o(p0, "bindWidget\(rootView, R.i¡­cond_panel_recycler_view\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeedbackSpeedPanelPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(Activity.class);
       a.o(obj, "inject\(Activity::class.java\)");
       this.p = obj;
       obj = this.q8(BaseFragment.class);
       a.o(obj, "inject\(BaseFragment::class.java\)");
       this.q = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       return;
    }
}
