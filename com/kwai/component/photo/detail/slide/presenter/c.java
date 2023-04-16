package com.kwai.component.photo.detail.slide.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.detail.slide.presenter.c$a;
import erd.g;
import java.lang.Throwable;
import android.view.View;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import java.lang.CharSequence;
import e17.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import je5.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import of5.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ekd.w0;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.feed.PaidCourseAuthFailException;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.utility.Log;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.Window;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import n3d.a;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vm5.f;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import qvb.q;
import qvb.j;
import of5.e;
import android.view.View$OnClickListener;
import nf6.h;
import com.kuaishou.android.model.mix.QComment;
import org.json.JSONObject;
import ek9.m1;
import q87.c;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import of5.f;
import of5.h;
import com.yxcorp.gifshow.feed.g;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import erd.o;
import of5.m;
import com.yxcorp.gifshow.feed.d;
import of5.k;
import erd.a;
import of5.l;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import java.lang.Runnable;
import l8a.d;
import yw6.g;
import java.util.List;
import fw6.b;
import com.kwai.component.photo.detail.slide.presenter.d;
import ew6.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.VideoFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import u07.t$a;
import u07.t;
import u07.j;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public class c extends PresenterV2	// class@000a95
{
    public String A;
    public b B;
    public i C;
    public final q D;
    public View p;
    public View q;
    public boolean r;
    public BaseFragment s;
    public SlidePlayViewModel t;
    public PhotoDetailParam u;
    public Runnable v;
    public PublishSubject w;
    public u x;
    public String y;
    public String z;

    public void c(){
       super();
       this.r = true;
       this.D = new c$a(this);
    }
    public static void P8(c p0,g p1,Throwable p2){
       String str;
       p0.q.setVisibility(8);
       if (p2 instanceof IndexOutOfBoundsException) {
          i.d(R.style.arg_RES_7f110668, p0.n8(R.string.arg_RES_7f100a1c));
          Object[] objArray = null;
          if (PatchProxy.applyVoid(objArray, p0, c.class, "8") || (p0.getActivity() != null && p0.getActivity().getIntent() != null)) {
             Uri data = p0.getActivity().getIntent().getData();
             if (c.c()) {
                p0.X7(t.timer(2, TimeUnit.SECONDS).subscribe(new g(p0), Functions.d()));
             }else if(data != null && data.isHierarchical()){
                objArray = w0.a(data, "userId");
                str = w0.a(data, "backUri");
             }else {
                str = objArray;
             }
             if (TextUtils.x(objArray) || !TextUtils.x(str)) {
                p0.getActivity().finish();
             }else {
                p0.W8(objArray);
                p0.getActivity().finish();
             }
          }
       }else if(p2 instanceof IllegalArgumentException){
          p0.getActivity().finish();
       }else if(p2 instanceof PaidCourseAuthFailException){
          PaidCourseAuthFailException mRedirectUrl = p2.mRedirectUrl;
          if (!TextUtils.x(mRedirectUrl)) {
             c.i(p0.getActivity(), KwaiWebViewActivity.N3(p0.getActivity(), mRedirectUrl).a());
          }
          p0.getActivity().finish();
       }else {
          ExceptionHandler.handleException(p0.getActivity(), p2);
          Log.e("SlidePlayDetailFlowPres", "queryPhotoInfo", p2);
          p1.accept(p2);
       }
       return;
    }
    public static void R8(c p0,Uri p1,Throwable p2){
       Objects.requireNonNull(p0);
       String str = w0.a(p1, "userId");
       String str1 = w0.a(p1, "backUri");
       if (TextUtils.x(str) || !TextUtils.x(str1)) {
          p0.getActivity().finish();
       }else {
          p0.W8(str);
          p0.getActivity().finish();
       }
       return;
    }
    private void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "15")) {
          return;
       }
       View view = null;
       int i = -1718536792;
       if (QCurrentUser.ME.isLogined() && (QCurrentUser.ME.getId()).equals(p0)) {
          if (this.getActivity() != null && this.getActivity().getWindow() != null) {
             view = this.getActivity().getWindow().getDecorView();
          }
          d.a(i).wT(this.getActivity(), ProfileStartParam.j(view));
       }else if(this.u.mPhoto != null){
          d.a(i).Y7(this.getActivity(), ProfileStartParam.l(this.u.mPhoto.getUser()));
       }else {
          d.a(i).tn(this.getActivity(), ProfileStartParam.m(p0), 0, view);
       }
       return;
    }
    public void E8(){
       QComment qComment;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       this.t = SlidePlayViewModel.B0(this.s);
       PhotoDetailParam mPhoto = this.u.mPhoto;
       int i = 0;
       if (mPhoto == null) {
          if (!("true").equals(f.c(this.getActivity().getIntent(), "enableDomino"))) {
             b uob = b.e(this.u.mSlidePlayId);
             if (uob != null) {
                i oi = uob.q();
                this.C = oi;
                if (oi.isEmpty()) {
                   this.C.h(this.D);
                   c tp = this.p;
                   if (tp != null) {
                      tp.setOnClickListener(new e(this));
                   }
                   if (this.C.isEmpty()) {
                      this.C.a();
                   }
                   return;
                }
             }
          }
          Uri data = this.getActivity().getIntent().getData();
          String str = "SlidePlayDetailFlowPres";
          if (data != null && (data.isHierarchical() && !TextUtils.x(data.getLastPathSegment()))) {
             h.a(data);
             this.y = data.getLastPathSegment();
             String str1 = w0.a(data, "rootCommentId");
             String str2 = w0.a(data, "commentId");
             if (!TextUtils.x(str2)) {
                try{
                   qComment = new QComment();
                   qComment.transparentParam = new JSONObject().put("sourceType", "KWAI").put("schemaUrl", data.toString());
                }catch(org.json.JSONException e8){
                   Object[] objArray1 = new Object[i];
                   m1.C().u(str, e8, objArray1);
                }
                qComment.mId = str2;
                qComment.mRootCommentId = str1;
                this.u.getDetailCommonParam().setComment(qComment);
             }
             this.z = w0.a(data, "exp_tag");
             this.A = w0.a(data, "serverExpTag");
             this.u.getDetailLogParam().setSchemaInfo(TextUtils.i(w0.a(data, "h5_page"), this.u.getDetailLogParam().getPageUrlParam("h5_page")), TextUtils.i(w0.a(data, "utm_source"), this.u.getDetailLogParam().getPageUrlParam("utm_source")));
             f uof = new f(this);
             h oh = new h(this, data);
             if (!PatchProxy.applyVoidTwoRefs(uof, oh, this, uoc, "4")) {
                Log.d(str, "queryPhotoInfo");
                this.q.setVisibility(i);
                t ot = g.h(this.y, this.A).compose(this.getActivity().ge());
                c ty = this.y;
                m om = PatchProxy.applyOneRefs(ty, this, uoc, "5");
                if (om != patchProxyRe) {
                }else {
                   om = new m(ty);
                }
                ot = ot.map(om);
                if (this.X8()) {
                   ot = ot.flatMap(d.b());
                }
                k ok = PatchProxy.applyOneRefs(uof, this, uoc, "6");
                if (ok != patchProxyRe) {
                }else {
                   ok = new k(this, uof);
                }
                l ol = PatchProxy.applyOneRefs(oh, this, uoc, "7");
                if (ol != patchProxyRe) {
                }else {
                   ol = new l(this, oh);
                }
                ot.subscribe(ok, ol);
                PhotoDetailParam mPhoto1 = this.u.mPhoto;
                if (mPhoto1 != null) {
                   mPhoto1.setNeedRetryFreeTraffic(true);
                   QPhotoMediaPlayerCacheManager.e(this.u.mPhoto);
                   this.v.run();
                }
             }
          }else if(this.u.isFromDomino()){
             Log.g(str, "from kwai://domino link");
          }else if(this instanceof d){
             Log.g(str, "handlerOtherLogic");
          }else {
             this.getActivity().finish();
          }
          return;
       }else {
          this.y = mPhoto.getPhotoId();
          this.A = this.u.mPhoto.getServerExpTag();
          if (!PatchProxy.applyVoid(objArray, this, uoc, "9")) {
             this.S8(this.u.mPhoto);
             b uob1 = b.e(this.u.mSlidePlayId);
             if (uob1 == null) {
                this.V8(this.u.mPhoto, i, objArray);
                this.v.run();
             }else {
                PhotoDetailParam mPhoto2 = this.u.mPhoto;
                Object obj = PatchProxy.applyTwoRefs(uob1, mPhoto2, this, uoc, "12");
                if (obj != patchProxyRe) {
                   objArray = obj;
                }else if(mPhoto2.mEntity == null){
                   List list = this.t.O0().n0();
                   if (list != null) {
                      i = list.indexOf(mPhoto2);
                      if (i > -1) {
                         objArray = list.get(i);
                      }
                   }
                }
                if (objArray == null) {
                   this.v.run();
                }else if(PatchProxy.applyVoidTwoRefs(uob1, objArray, this, uoc, "10")){
                   d uod = new d(this, uob1, objArray);
                   this.B = uod;
                   this.t.R(uod);
                }
                this.v.run();
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "18")) {
          return;
       }
       c tB = this.B;
       if (tB != null) {
          this.t.O(tB);
       }
       tB = this.C;
       if (tB != null) {
          tB.f(this.D);
       }
       return;
    }
    public final void S8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "16")) {
          return;
       }
       BaseFeed entity = p0.getEntity();
       if (entity instanceof VideoFeed && entity.isPayCourse()) {
          p0.setVideoUrl("");
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          p0.setVideoUrls(uCDNUrlArray);
          Activity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             t$a uoa = new t$a(activity);
             uoa.W0(R.string.arg_RES_7f103b8d);
             uoa.S0(R.string.arg_RES_7f1007e2);
             j.d(uoa);
          }
       }
       return;
    }
    public final void V8(QPhoto p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, c.class, "14")) {
          return;
       }
       p0.setNeedRetryFreeTraffic(false);
       this.q.setVisibility(8);
       this.t.W1(false);
       this.w.onNext(Boolean.valueOf(p1));
       if (p2 != null) {
          Log.e("SlidePlayDetailFlowPres", "querySlideKCardPhotos error", p2);
       }
       return;
    }
    public final boolean X8(){
       Object obj = PatchProxy.apply(null, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.u.getBizType() == 4)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0feb);
       this.p = m1.f(p0, 0x7f0a3a1a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.u = this.q8(PhotoDetailParam.class);
       this.s = this.r8("FRAGMENT");
       this.v = this.r8("DETAIL_FLOW_END_LISTENER");
       this.w = this.r8("DETAIL_PHOTO_UPDATED_EVENT");
       this.x = this.s8(u.class);
       return;
    }
}
