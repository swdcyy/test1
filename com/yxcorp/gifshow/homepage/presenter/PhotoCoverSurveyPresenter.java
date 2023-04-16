package com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.util.ArrayList;
import yta.u1;
import com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.h0;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import com.kuaishou.android.model.mix.PhotoMeta;
import wkd.b;
import l66.a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import l66.c;
import jsa.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import yta.s1;
import erd.g;
import crd.b;
import android.view.View;
import lnc.b9;
import lnc.p5;
import java.lang.Runnable;
import android.widget.RadioGroup;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.mix.ScoreMark;
import java.lang.System;
import oe6.e;
import android.widget.TextView;
import android.widget.RadioButton;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import java.lang.Integer;
import kp.r1;
import com.google.gson.Gson;
import i89.a;
import com.kuaishou.android.model.mix.CommonMeta;
import brd.t;
import yta.t1;
import yta.r1;
import yta.q1;
import android.widget.RadioGroup$OnCheckedChangeListener;
import yta.p1;
import android.view.View$OnClickListener;
import yta.o1;
import yta.n1;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dda.d;
import m66.a;
import android.widget.ImageView;
import uh5.e;

public class PhotoCoverSurveyPresenter extends PresenterV2	// class@00179a
{
    public View A;
    public View B;
    public TextView C;
    public RadioButton D;
    public RadioButton E;
    public RadioButton F;
    public List G;
    public CardStyle H;
    public boolean I;
    public final Runnable J;
    public final LifecycleObserver K;
    public CommonMeta p;
    public BaseFeed q;
    public PhotoMeta r;
    public BaseFragment s;
    public VideoQualityInfo t;
    public ViewGroup u;
    public KwaiImageView v;
    public ViewStub w;
    public b x;
    public View y;
    public RadioGroup z;

    public void PhotoCoverSurveyPresenter(CardStyle p0){
       super();
       this.G = new ArrayList();
       this.J = new u1(this);
       this.K = new PhotoCoverSurveyPresenter$1(this);
       this.H = p0;
    }
    public void E8(){
       PhotoCoverSurveyPresenter tr;
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "4")) {
          return;
       }
       if (h0.c(this.q)) {
          return;
       }
       if (!this.P8(this.t)) {
          tr = this.r;
          if (tr != null && tr.mNeedActionSurvey == null) {
             return;
          }
       }
       b.a(0x6d2a4fdd).a(this);
       this.s.getLifecycle().addObserver(this.K);
       this.x = c.a().c(b.class, RxBus$ThreadMode.MAIN, new s1(this));
       tr = this.t;
       if (tr != null && tr.mRateCoverShowStatus == 1) {
          this.W8();
          this.V8();
          this.a9();
       }else {
          tr = this.y;
          if (tr != null) {
             tr.setVisibility(8);
          }
       }
       return;
    }
    public void J8(){
       PhotoCoverSurveyPresenter photoCoverSu = PhotoCoverSurveyPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoCoverSu, "7")) {
          return;
       }
       if (h0.c(this.q)) {
          return;
       }
       b.a(0x6d2a4fdd).c(this);
       b9.a(this.x);
       b.a(-87691847).c(this.J);
       this.s.getLifecycle().removeObserver(this.K);
       if (!PatchProxy.applyVoid(objArray, this, photoCoverSu, "15")) {
          photoCoverSu = this.y;
          if (photoCoverSu != null) {
             photoCoverSu.setVisibility(8);
             this.A.setEnabled(false);
             this.z.clearCheck();
             this.G.clear();
          }
       }
       return;
    }
    public final boolean P8(VideoQualityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoCoverSurveyPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (TextUtils.x(p0.mTitle) || (!q.f(p0.mScoreMarkList) && p0.mScoreMarkList.size() >= 3))) {
          this.G.clear();
          int i = 0;
          while (i < p0.mScoreMarkList.size() && this.G.size() < 3) {
             ScoreMark scoreMark = p0.mScoreMarkList.get(i);
             if (scoreMark != null && !TextUtils.x(scoreMark.mScoreTitle)) {
                this.G.add(scoreMark);
             }
             i = i + 1;
          }
          if (this.G.size() == 3) {
             b = true;
          }
       }
    label_0069 :
       return b;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, PhotoCoverSurveyPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((System.currentTimeMillis() - e.c()) - e.E() <= 0)? true: false;
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "14")) {
          return;
       }
       this.t.mRateCoverShowStatus = 2;
       this.y.setVisibility(8);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "5")) {
          return;
       }
       this.C.setText(this.t.mTitle);
       int i = 0;
       this.D.setText(this.G.get(i).mScoreTitle);
       this.E.setText(this.G.get(1).mScoreTitle);
       this.F.setText(this.G.get(2).mScoreTitle);
       PhotoCoverSurveyPresenter tA = this.A;
       if (this.t.mSelectRateViewId != -1) {
          i = true;
       }
       tA.setEnabled(i);
       this.z.check(this.t.mSelectRateViewId);
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "6")) {
          return;
       }
       if (this.y == null && this.w.getParent() != null) {
          View view = this.w.inflate();
          this.y = view;
          this.z = view.findViewById(0x7f0a341e);
          this.C = this.y.findViewById(0x7f0a3f2c);
          this.A = this.y.findViewById(0x7f0a3c20);
          this.B = this.y.findViewById(0x7f0a0782);
          this.D = this.y.findViewById(0x7f0a341d);
          this.E = this.y.findViewById(0x7f0a341b);
          this.F = this.y.findViewById(0x7f0a341c);
       }
       RelativeLayout$LayoutParams layoutParams = this.y.getLayoutParams();
       ConstraintLayout$LayoutParams layoutParams1 = this.B.getLayoutParams();
       layoutParams1.topMargin = a1.e(8.00f);
       layoutParams1.rightMargin = a1.e(8.00f);
       this.B.setLayoutParams(layoutParams1);
       layoutParams.height = -2;
       layoutParams.width = -1;
       layoutParams.addRule(10, -1);
       layoutParams.addRule(8, R.id.photo_cover_container);
       layoutParams.removeRule(12);
       this.y.setLayoutParams(layoutParams);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "16")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLOSE_PHOTO_QUALITY_SCORE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("subreason", this.t.mType);
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.q);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "17")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PHOTO_QUALITY_SCORE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("subreason", this.t.mType);
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.q);
       u1.u0(0, uElementPack, uContentPack);
       return;
    }
    public void Z8(int p0,String p1,int p2,String p3){
       String str;
       String str1;
       PhotoCoverSurveyPresenter photoCoverSu = this;
       int i = p2;
       if (PatchProxy.isSupport(PhotoCoverSurveyPresenter.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, PhotoCoverSurveyPresenter.class, "12")) {
          return;
       }
       if (photoCoverSu.t == null) {
          return;
       }
       PhotoCoverSurveyPresenter photoCoverSu1 = null;
       if (r1.S2(photoCoverSu.q)) {
          str = photoCoverSu.q.getId();
          str1 = photoCoverSu1;
       }else {
          str1 = photoCoverSu.q.getId();
          str = photoCoverSu1;
       }
       photoCoverSu1 = photoCoverSu.t;
       int i1 = i;
       b.a(-1106399741).b(str1, str, photoCoverSu1.mType, p0, photoCoverSu1.surveyId, photoCoverSu.p.mExpTag, new Gson().q(photoCoverSu.t.mScoreMarkList), p2, p3, photoCoverSu1.mTitle).subscribe(new t1(photoCoverSu, p1, i1), new r1(i1));
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "11")) {
          return;
       }
       this.z.setOnCheckedChangeListener(new q1(this));
       this.A.setOnClickListener(new p1(this));
       this.y.setOnClickListener(new o1(this));
       this.B.setOnClickListener(new n1(this));
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "13")) {
          return;
       }
       e.m0(System.currentTimeMillis());
       this.t.mRateCoverShowStatus = 1;
       this.y.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoCoverSurveyPresenter.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a3105);
       this.u = m1.f(p0, 0x7f0a0923);
       this.w = m1.f(p0, 0x7f0a3060);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoCoverSurveyPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(CommonMeta.class);
       this.q = this.r8("feed");
       this.r = this.s8(PhotoMeta.class);
       this.s = this.r8("FRAGMENT");
       this.t = this.s8(VideoQualityInfo.class);
       return;
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoCoverSurveyPresenter.class, "9")) {
          return;
       }
       if (TextUtils.n(this.q.getId(), p0.a.getId()) && this.v.getMeasuredHeight() >= this.v.getMeasuredWidth()) {
          PhotoCoverSurveyPresenter tt = this.t;
          if (tt == null || (tt.mRateCoverShowStatus != null || (!e.b() && this.P8(this.t)))) {
             this.W8();
             this.V8();
             this.a9();
             b.a(-87691847).a(this.J);
             this.I = true;
          }
       }
    label_005e :
       return;
    }
}
