package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s85.a;
import s85.e;
import android.app.Activity;
import im8.f;
import com.yxcorp.gifshow.entity.QPhoto;
import crd.b;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.b;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.commenttopbar.CommentTopBarBizType;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uz5.c;
import zz5.d;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.tabs.panel.h;
import hk9.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPreInfo;
import de5.a;
import m9a.d;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import ek9.t0;
import al9.a;
import g7a.m;
import java.util.Objects;
import kotlin.jvm.internal.a;
import g7a.n;
import g7a.o;
import fx9.e;
import g7a.j0;
import p1a.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import ik9.f;
import tkd.b;
import tkd.d;
import mv5.b;
import hx9.b;
import android.os.Bundle;
import yy6.c;
import com.kwai.component.photo.detail.core.tag.TagPackageListHelper;
import brd.y;
import com.kwai.feature.api.danmaku.c;
import mrd.a;

public class NasaCommentCreatorPresenter extends PresenterV2	// class@001848
{
    public y A;
    public TagPackageListHelper B;
    public c C;
    public f D;
    public a E;
    public a F;
    public a G;
    public e$b H;
    public QPhoto p;
    public NasaBizParam q;
    public f r;
    public f s;
    public c t;
    public PhotoDetailParam u;
    public a v;
    public a w;
    public BaseFragment x;
    public e y;
    public t0 z;
    public static int I;

    public void NasaCommentCreatorPresenter(){
       super();
       this.H = new NasaCommentCreatorPresenter$a(this);
    }
    public void E8(){
       NasaCommentCreatorPresenter nasaCommentC = NasaCommentCreatorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaCommentC, "3")) {
          return;
       }
       this.G = new a();
       e uoe = new e();
       if (!PatchProxy.applyVoidOneRefs(uoe, this, nasaCommentC, "4")) {
          uoe.a("DETAIL_FRAGMENT", this.x);
          uoe.a("DETAIL_PLAYER", this.w);
          uoe.a("DETAIL_ACTIVITY", this.getActivity());
          NasaCommentCreatorPresenter tr = this.r;
          if (tr != null) {
             uoe.a("DETAIL_LOGGER", tr.get());
          }
       }
       this.X7(this.G.c(this.p, uoe));
       this.D.set(new b(this));
       this.y.b(this.H);
       if (!PatchProxy.applyVoid(objArray, this, nasaCommentC, "20")) {
          String obj = PatchProxy.apply(objArray, this, nasaCommentC, "21");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             obj = w.O(this.p.mEntity);
             if (!TextUtils.x(obj)) {
                objArray = a.a.h(obj, CommentTopBarBizType.class);
             }
          }
          if (objArray != null) {
             this.G.a(objArray.biz, objArray.subBiz);
          }else {
             d.a(this.p, this.x, new c(this));
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaCommentCreatorPresenter.class, "5")) {
          return;
       }
       this.D.set(objArray);
       this.y.j(this.H);
       return;
    }
    public final h P8(QPhoto p0,PhotoDetailParam p1,boolean p2){
       NasaCommentCreatorPresenter obj;
       d this;
       CommentParams this1;
       NasaCommentCreatorPresenter nasaCommentC = NasaCommentCreatorPresenter.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(nasaCommentC)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, NasaCommentCreatorPresenter.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.q;
       NasaSlideSerialParam mCommercialA = (obj != null && (obj.getNasaSlideParam() != null && this.q.getNasaSlideParam().mNasaSlideSerialParam != null))? this.q.getNasaSlideParam().mNasaSlideSerialParam.mCommercialActiveCallback: null;
       QComment comment = p1.getDetailCommonParam().getComment();
       QPreInfo preInfo = p1.getDetailCommonParam().getPreInfo();
       String str = this.w.c();
       this = d.class;
       if (PatchProxy.isSupport(this)) {
          Object[] objArray = new Object[]{p0,comment,preInfo,str,mCommercialA};
          this1 = PatchProxy.apply(objArray, null, this, "1");
          if (this1 != PatchProxyResult.class) {
          label_008d :
             c uoc1 = new c(p0, this1, d.a(p0), 1001);
             c uoc2 = uoc1.c(this.z).e(this.v);
             m om = new m(this);
             Objects.requireNonNull(uoc2);
             Object obj1 = PatchProxy.applyOneRefs(om, uoc2, uoc, "6");
             if (obj1 != PatchProxyResult.class) {
                uoc2 = obj1;
             }else {
                a.p(om, "codeType");
                uoc2.j = om;
             }
             n on = new n(this);
             Objects.requireNonNull(uoc2);
             obj1 = PatchProxy.applyOneRefs(on, uoc2, uoc, "7");
             if (obj1 != PatchProxyResult.class) {
                uoc2 = obj1;
             }else {
                a.p(on, "progress");
                uoc2.k = on;
             }
             uoc2 = uoc2.d(this.y);
             o oo = new o(p0);
             Objects.requireNonNull(uoc2);
             String str1 = "2";
             Object obj2 = PatchProxy.applyOneRefs(oo, uoc2, uoc, str1);
             if (obj2 != PatchProxyResult.class) {
                uoc2 = obj2;
             }else {
                a.p(oo, "intercept");
                uoc2.n = oo;
             }
             j0 oj0 = PatchProxy.apply(null, this, nasaCommentC, str1);
             if (oj0 != PatchProxyResult.class) {
             }else {
                oj0 = new j0();
                oj0.b = this.s.get();
                oj0.e = this.r.get();
                oj0.f = this.q;
                oj0.d = this.t;
                oj0.c = this.u;
                oj0.h = this.B;
                oj0.g = this.A;
             }
             uoc2.f(new e(oj0, p2));
             return uoc1.a();
          }
       }
       this1 = new CommentParams();
       this1.mComment = comment;
       this1.mPreInfo = preInfo;
       this1.mCommentLoggerSource = "FEATURED";
       this1.mLogWatchId = str;
       this1.mADCallback = mCommercialA;
       goto label_008d ;
    }
    public final h R8(){
       NasaSlideParam obj = PatchProxy.apply(null, this, NasaCommentCreatorPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = new b(d.a(0x3ee97dc2).s5(), Bundle.EMPTY, "LIKE_AREA");
       uob.n = this.p;
       obj = this.q.getNasaSlideParam().mSourcePage;
       if (this.q.getNasaSlideParam().isFollowNasaDetail() && TextUtils.n(obj, "follow")) {
          uob.l(String.valueOf(6));
       }else {
          uob.l(obj);
       }
       return uob;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaCommentCreatorPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(NasaBizParam.class);
       this.r = this.x8("DETAIL_LOGGER");
       this.s = this.x8("LOG_LISTENER");
       this.t = this.q8(c.class);
       this.u = this.q8(PhotoDetailParam.class);
       this.v = this.q8(a.class);
       this.w = this.q8(a.class);
       this.x = this.r8("DETAIL_FRAGMENT");
       this.y = this.r8("COMMENT_HELPER");
       this.z = this.r8("COMMENT_GLOBAL_ACTION");
       this.B = this.r8("TAG_SHOW_PACKAGE_LIST_HELPER");
       this.A = this.t8("NASA_BOTTOM_EDITOR_UPDATE_AT_BUTTON_ALPHA_OBSERVER");
       this.D = this.w8("NASA_COMMENT_TAB_SUPPLIER_REF");
       this.C = this.t8("FRAGMENT_BARRAGE_KIT_WRAPPER");
       this.E = this.t8("COMMENT_PANEL_SHOW_DANMAKU_LIST");
       this.F = this.t8("COMMENT_PANEL_SHOW_SUMMARY_LIST");
       return;
    }
}
