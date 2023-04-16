package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$mTipsBottomMargin$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import m9a.k;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.nonslide.toolbar.widget.CollectView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$b;
import erd.g;
import crd.b;
import xy5.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class NasaProfileSideCollectPresenter extends PresenterV2	// class@001917
{
    public View p;
    public TextView q;
    public CollectView r;
    public boolean s;
    public QPhoto t;
    public BaseFragment u;
    public SlidePlayViewModel v;
    public j w;
    public PhotoDetailParam x;
    public final p y;
    public final a z;

    public void NasaProfileSideCollectPresenter(){
       super();
       this.y = s.c(new NasaProfileSideCollectPresenter$mTipsBottomMargin$2(this));
       this.z = new NasaProfileSideCollectPresenter$a(this);
    }
    public void E8(){
       String str;
       NasaProfileSideCollectPresenter tt;
       NasaProfileSideCollectPresenter nasaProfileS = NasaProfileSideCollectPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaProfileS, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, nasaProfileS, "3") && this.q == null) {
          View view = k.a(this.getActivity(), this.u, R.id.slide_global_edit_layout);
          View view1 = view.findViewById(R.id.profile_side_collect_button);
          a.o(view1, "view.findViewById\(R.id.p¡­file_side_collect_button\)");
          this.p = view1;
          if (view1 == null) {
             a.S("mCollectContainer");
          }
          view1.setVisibility(0);
          view1 = view.findViewById(R.id.profile_side_collect_text);
          a.o(view1, "view.findViewById\(R.id.profile_side_collect_text\)");
          this.q = view1;
          view = view.findViewById(R.id.profile_side_collect_layout);
          a.o(view, "view.findViewById\(R.id.p¡­file_side_collect_layout\)");
          this.r = view;
          str = "mCollectView";
          if (view == null) {
             a.S(str);
          }
          view = view.findViewById(R.id.collect_button);
          a.o(view, "mCollectView.findViewById\(R.id.collect_button\)");
          tt = this.r;
          if (tt == null) {
             a.S(str);
          }
          view1 = tt.findViewById(R.id.iv_collect_bottom);
          a.o(view1, "mCollectView.findViewById\(R.id.iv_collect_bottom\)");
          int i = 0x7f0819b4;
          view.k(i, i);
          view1.k(i, i);
       }
       NasaProfileSideCollectPresenter tu = this.u;
       a.m(tu);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tu.getParentFragment());
       this.v = slidePlayVie;
       if (slidePlayVie != null) {
          NasaProfileSideCollectPresenter tu1 = this.u;
          a.m(tu1);
          slidePlayVie.P(tu1, this.z);
       }
       tu = this.t;
       str = "mPhoto";
       if (tu == null) {
          a.S(str);
       }
       PhotoMeta photoMeta = tu.getPhotoMeta();
       if (photoMeta != null) {
          this.X7(photoMeta.observable().subscribe(new NasaProfileSideCollectPresenter$b(this)));
       }
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       j oj = new j(tt);
       Number number = PatchProxy.apply(objArray, this, nasaProfileS, "1");
       if (number == PatchProxyResult.class) {
          number = this.y.getValue();
       }
       oj.l(number.intValue());
       a.o(oj, "PhotoCollectHelper\(mPhot¡­Margin\(mTipsBottomMargin\)");
       this.w = oj;
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, NasaProfileSideCollectPresenter.class, "6");
    }
    public final void P8(boolean p0){
       NasaProfileSideCollectPresenter nasaProfileS = NasaProfileSideCollectPresenter.class;
       if (PatchProxy.isSupport(nasaProfileS) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaProfileS, "8")) {
          return;
       }
       nasaProfileS = this.r;
       if (nasaProfileS == null) {
          a.S("mCollectView");
       }
       NasaProfileSideCollectPresenter tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       nasaProfileS.c(p0, tt.getPhotoMeta());
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideCollectPresenter.class, "10")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       NasaProfileSideCollectPresenter tr = this.r;
       String str = "mCollectView";
       if (tr == null) {
          a.S(str);
       }
       if (!tr.b()) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          NasaProfileSideCollectPresenter tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          tr.setSelected(tt.isCollected());
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideCollectPresenter.class, "11")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       NasaProfileSideCollectPresenter tt = this.t;
       String str = "mPhoto";
       if (tt == null) {
          a.S(str);
       }
       String str1 = "mCollectText";
       if (tt.numberOfCollects() > 0) {
          NasaProfileSideCollectPresenter tq = this.q;
          if (tq == null) {
             a.S(str1);
          }
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tq.setText(TextUtils.N(tt.numberOfCollects()));
       }else {
          NasaProfileSideCollectPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str1);
          }
          tq1.setText(a1.p(R.string.arg_RES_7f100729));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideCollectPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       this.u = this.r8("DETAIL_FRAGMENT");
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.x = obj;
       return;
    }
}
