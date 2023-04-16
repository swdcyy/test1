package com.yxcorp.gifshow.homepage.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.gifshow.homepage.presenter.j$a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xl8.b;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import android.graphics.Rect;
import xa5.a;
import uh5.e;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.widget.FrameLayout;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import foc.p;
import android.graphics.Bitmap;
import foc.z;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.utility.Log;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.framework.model.user.User;
import ha5.e;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.framework.model.feed.BaseFeed;
import k2b.t2$a;
import wkd.b;
import l66.a;
import dda.d;
import m66.a;
import im8.f;
import xh5.a;
import tkd.b;
import tkd.d;
import vw5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.c;
import qvb.i;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.f;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.util.ArrayList;
import ekd.j;
import tw5.d;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import vw5.f;
import wvb.e;
import lv5.c;
import lv5.b;
import hv5.a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import kp.r1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.content.Intent;
import vm5.o;
import vm5.e;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import gx5.d;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.live.base.model.LiveStyleParams$a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import os5.e;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import yta.t0;
import yta.v0;
import yta.u0;
import yta.r0;
import os5.l;
import yta.s0;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserOwnerCount;
import wm5.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import da6.c;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import yqb.b$a;
import yqb.b;
import yqb.k;
import ida.a;
import ekd.m1;
import y8c.d;

public class j extends PresenterV2	// class@0017ce
{
    public String A;
    public b B;
    public View C;
    public LivePlayTextureView D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public String M;
    public PhotoItemViewParam N;
    public d O;
    public Boolean P;
    public String Q;
    public String R;
    public b S;
    public String T;
    public String U;
    public LiveAutoPlayModule V;
    public int W;
    public LiveStreamFeed p;
    public BaseFragment q;
    public f r;
    public d s;
    public t2$a t;
    public e u;
    public o v;
    public int w;
    public f x;
    public LiveStreamModel y;
    public f z;

    public void j(int p0){
       super();
       this.W = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       if (this.W == 9) {
          j ty = this.y;
          if (ty != null && !TextUtils.x(ty.mDistrictRank)) {
             this.W = 94;
          }
       }
       this.m8().setOnClickListener(new j$a(this, true));
       return;
    }
    public final boolean P8(){
       j obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.S;
       boolean b = (obj != null && obj.a().booleanValue())? true: false;
       return b;
    }
    public final int R8(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.q.getView() != null) {
          objArray = new Rect();
          this.q.getView().getGlobalVisibleRect(objArray);
          if (a.g(this.q)) {
             objArray.bottom = objArray.bottom - e.c();
          }
       }
       Object[] objArray1 = objArray;
       obj = this.C;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       int[] ointArray = new int[2];
       if (this.P8()) {
          this.D = this.k8(0x7f0a2666);
       }
       obj = this.D;
       if (obj != null) {
          obj.getLocationOnScreen(ointArray);
       }
       int i = (this.P8())? p.u(this.getActivity(), this.C, objArray1, b, ointArray): z.u(this.getActivity(), this.C, objArray1, b, ointArray, null);
       return i;
    }
    public void S8(QPhoto p0,int p1){
       int b;
       String str2;
       Boolean uBoolean;
       String str3;
       j v;
       String str4;
       t0 ot0;
       u0 ou0;
       int i7;
       i oi;
       QPhoto[] qPhotoArray;
       i oi1;
       CharSequence uCharSequenc;
       Object obj = this;
       Object obj1 = p0;
       int i = p1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, oj, "3")) {
          return;
       }
       Log.d("PhotoFragment", "  open "+System.currentTimeMillis());
       Activity activity = this.getActivity();
       oj = obj.p;
       LiveStreamFeed mUser = oj.mUser;
       LiveStreamFeed mCommonMeta = oj.mCommonMeta;
       j u = obj.u;
       if (u != null && mUser != null) {
          u.a(mCommonMeta.mId, mCommonMeta.mExpTag, mUser.getId(), mCommonMeta.mListLoadSequenceID, 1, p1);
       }
       oj = obj.p;
       if (oj.mConfig == null) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("live getLivePlayConfig null"));
          return;
       }else {
          u = obj.t;
          if (u != null && mUser != null) {
             u.a(oj, mUser.getId(), i, 805);
          }
          b.a(0x6d2a4fdd).b(new d(obj.p));
          oj = obj.u;
          if (oj != null) {
             oj.c(obj.p, i);
          }
          int i1 = 2;
          if (obj.F.booleanValue() || obj.G.booleanValue()) {
             b$a uoa = new b$a();
             uoa.e(obj1);
             uoa.b(activity);
             uoa.c(obj.q);
             uoa.d(d.a(-1492894991).KL(obj.q.f()));
             uoa.f(p0.getPosition());
             uoa.j = d.a(-1492894991).Hy();
             b uob = uoa.a();
             k ok = new k(i1, 14);
             if (!p0.isAd()) {
                i1 = 1;
             }
             ok.c = i1;
             d.a(0x2e315ea8).su(uob, ok);
             return;
          }else {
             oj = obj.B;
             oj = (oj != null && oj.a().booleanValue())? 1: null;
             u = obj.z;
             int i2 = (u != null && u.get().booleanValue())? 1: 0;
             b = a.a(obj.A);
             int b1 = a.b(obj.A);
             j e = obj.E;
             int i3 = (e != null && (e.booleanValue() && d.a(0x686ff5e0).Fp(obj1)))? 1: 0;
             boolean b2 = TextUtils.m(obj.A, String.valueOf(47));
             String str = "follow";
             if (e.f() && TextUtils.n(obj.A, str)) {
                b = 1;
             }
             Boolean tRUE = Boolean.TRUE;
             int i4 = (tRUE.equals(obj.P))? 1: b;
             int i5 = (TextUtils.n(obj.A, str) && (i4 && !oj))? 1: b1;
             String str1 = null;
             if (tRUE.equals(obj.J)) {
                str2 = d.a(0x686ff5e0).Bh(obj.q);
             label_0185 :
                str1 = str2;
                uBoolean = tRUE;
                str3 = str;
             }else if(tRUE.equals(obj.H)){
                if (c.l() && tRUE.equals(obj.I)) {
                   oi = c.f(obj1, obj.q);
                   if (oi != null) {
                      str4 = f.b(obj.q);
                      b.g(j.e(oi, str4, c.i(obj.W, obj1)));
                      str2 = str4;
                      goto label_0185 ;
                   }else {
                      i7 = str1;
                      goto label_0185 ;
                   }
                }else if(obj.O != null){
                   qPhotoArray = new QPhoto[true];
                   qPhotoArray[0] = new QPhoto(obj.p);
                   uBoolean = tRUE;
                   str3 = str;
                   oi1 = d.a(0x686ff5e0).M00(j.a(qPhotoArray), p0, p1, obj.W, obj.O.getTypeValue(), 0, obj.R);
                }else {
                   uBoolean = tRUE;
                   str3 = str;
                   oi1 = null;
                }
                if (oi1 != null) {
                   str1 = d.a(0x686ff5e0).Y0(obj.q, oi1);
                }
             }else {
                uBoolean = tRUE;
                str3 = str;
                if (b2 && obj.q instanceof RecyclerFragment) {
                   e uoe = d.a(0x54358588).u0(obj.q.q());
                   if (uoe != null) {
                      uCharSequenc = d.a(0x686ff5e0).Y0(obj.q, uoe);
                   }
                }else if(uBoolean.equals(obj.L)){
                   uCharSequenc = f.b(obj.q);
                   b.g(j.e(c.g(obj.q), uCharSequenc, c.i(obj.W, obj1)));
                }else if(i3){
                   if (obj.O != null) {
                      qPhotoArray = new QPhoto[true];
                      qPhotoArray[0] = new QPhoto(obj.p);
                      oi1 = d.a(0x686ff5e0).M00(j.a(qPhotoArray), p0, p1, obj.W, obj.O.getTypeValue(), false, obj.R);
                   }else {
                      oi1 = null;
                   }
                   if (oi1 != null) {
                      uCharSequenc = d.a(0x686ff5e0).Y0(obj.q, oi1);
                   }
                }else {
                   i7 = -242212848;
                   b = 0x6c2883df;
                   if (i5) {
                      v = obj.q;
                      if (v instanceof RecyclerFragment) {
                         i oi2 = v.q();
                         d.a(i7).pg(oi2, i1, i1);
                         uCharSequenc = d.a(b).Y0(obj.q, oi2);
                      }
                   }
                   if (i4) {
                      a uoa4 = d.a(b);
                      v = obj.N;
                      b1 = (v != null && v.mIsNebulaFollowLiveAggregateCard != null)? 3: 0;
                      uCharSequenc = d.a(b).Y0(obj.q, uoa4.du(obj1, i, false, b1));
                   }else if(i2){
                      if (obj.W == 16) {
                         QPhoto[] qPhotoArray1 = new QPhoto[true];
                         qPhotoArray1[0] = new QPhoto(obj.p);
                         uCharSequenc = d.a(i7).FD(obj.W, j.a(qPhotoArray1));
                      }else {
                         oi = c.g(obj.q);
                         if (oi != null) {
                            uCharSequenc = f.b(obj.q);
                            b.g(j.b(oi, uCharSequenc, c.i(obj.W, obj1)));
                         }
                      }
                   }else if(c.l()){
                      oi = c.f(obj1, obj.q);
                      if (oi != null) {
                         uCharSequenc = f.b(obj.q);
                         b.g(j.e(oi, uCharSequenc, c.i(obj.W, obj1)));
                      }
                   }
                }
             }
             uCharSequenc = null;
             SlidePlayConfig slidePlayCon = 1025;
             if (!TextUtils.x(str1) && !r1.l1(obj1.mEntity)) {
                PhotoDetailParam photoDetailP = new PhotoDetailParam(obj1).setSource(obj.W).setPhotoIndex(i).setSlidePlayId(str1);
                v = obj.v;
                if (v != null) {
                   v.a(this.getActivity().getIntent(), photoDetailP);
                }
                if (!i5 && (!i4 && (!obj.G.booleanValue() && (!uBoolean.equals(obj.H) && (!uBoolean.equals(obj.J) && (!uBoolean.equals(obj.L) && (i3 || b2))))))) {
                   v0 ov0 = null;
                   photoDetailP.getSlidePlayConfig().setEnablePullRefresh(false);
                   photoDetailP.getDetailPlayConfig().setUseHardDecoder(true);
                   photoDetailP.getDetailCommonParam().setUnserializableBundleId(this.R8());
                   NasaSlideParam$a uoa1 = new NasaSlideParam$a();
                   uoa1.T("DETAIL");
                   uoa1.q(true);
                   if (i4 || i5) {
                      uoa1.Z(str3);
                      uoa1.D(true);
                      uoa1.t(true);
                      uoa1.m(true);
                      uoa1.j(true);
                      uoa1.n(true);
                      uoa1.o(true);
                      str4 = "search_entrance_follow";
                      uoa1.Y(str4);
                      uoa1.Y(str4);
                   }
                   if (!uBoolean.equals(obj.H) && (i3 || uBoolean.equals(obj.J))) {
                      uoa1.Z("nearby");
                      uoa1.Y("search_entrance_nearby_detail");
                      DetailLogParam detailLogPar = photoDetailP.getDetailLogParam();
                      j v1 = obj.V;
                      boolean b3 = (v1 != null && v1.isPlaying())? true: false;
                      detailLogPar.addPageUrlParam("source_page_is_play", String.valueOf(b3));
                   }
                   if (!i5 && (!b2 && (uBoolean.equals(obj.J) || (c.l() && (uBoolean.equals(obj.H) && obj.I.booleanValue()))))) {
                      uoa1.e(false);
                      uoa1.l(this.P8());
                      uoa1.C(this.P8());
                   }else if(!i4 && (obj.G.booleanValue() || uBoolean.equals(obj.H))){
                      uoa1.e(true);
                      ot0 = 1;
                   label_04d8 :
                      if (i4 || (i5 && (!this.P8() && (r1.n2(obj.p) && !TextUtils.x(r1.u0(obj.p)))))) {
                         ot0 = new t0(obj);
                      }else if(i4 && this.P8()){
                         ov0 = new v0(obj, ot0);
                      }else if(uBoolean.equals(obj.H)){
                         ou0 = new u0(obj, obj1);
                      }else if(uBoolean.equals(obj.J)){
                         v = obj.x;
                         if (v != null) {
                            r0 or0 = new r0(v.get().intValue());
                         }
                      }else if(d.a(-1492894991).Hy() && obj1.mEntity instanceof LiveStreamFeed){
                         ou0 = new s0(obj1);
                      }
                      v0 ov01 = ov0;
                   label_0556 :
                      uoa1.H(obj.M);
                      if (uBoolean.equals(obj.L)) {
                         v = obj.w;
                         if (v == true) {
                            uoa1.U(Integer.valueOf(QCurrentUser.ME.getOwnerCount().mPublicPhoto));
                         }else if(v == i1){
                            uoa1.U(Integer.valueOf(QCurrentUser.ME.getOwnerCount().mPrivatePhoto));
                         }
                      }
                      v = obj.w;
                      boolean b4 = (v != true && v != i1)? true: false;
                      d.a(0x66aa3a58).z20(activity, 1025, photoDetailP, null, 0, 0, uoa1.a(), b4, ov01);
                      if (this.P8()) {
                         activity.overridePendingTransition(false, false);
                      }
                      return;
                      t0 ot01 = ov0;
                   label_0551 :
                      ov01 = ot01;
                      goto label_0556 ;
                      ot01 = ot0;
                      goto label_0551 ;
                   }
                   ot0 = null;
                   goto label_04d8 ;
                }else if(i2){
                   photoDetailP.setBizType(10);
                }
                Intent intent = d.a(-1818031860).tF(activity, photoDetailP, null);
                ThanosDetailBizParam thanosDetail = new ThanosDetailBizParam();
                thanosDetail.mNeedReplaceFeedInThanos = d.a(-1188553266).Jm(obj.q, obj.w) ^ true;
                thanosDetail.putParamIntoIntent(intent);
                e = obj.x;
                int i6 = (e != null)? e.get().intValue(): 0;
                LiveBizParam liveBizParam = new LiveBizParam();
                liveBizParam.mLiveSourceType = i6;
                liveBizParam.mDisablePullRefresh = true;
                liveBizParam.mDisableSyncFeedPosition = true;
                liveBizParam.mShouldShowNewFeedbackInProfilePage = true;
                if (this.P8()) {
                   photoDetailP.getDetailCommonParam().setUnserializableBundleId(this.R8());
                   liveBizParam.mPlayerReuseToken = obj.Q;
                   LiveStyleParams$a uoa2 = new LiveStyleParams$a();
                   uoa2.d(true);
                   uoa2.b(true);
                   uoa2.f(true);
                   uoa2.c(true);
                   liveBizParam.mLiveStyleParams = uoa2.a();
                   intent.putExtra("start_enter_page_animation", false);
                }
                liveBizParam.putParamIntoIntent(intent);
                d.a(-1835681758).QH(activity, intent, slidePlayCon);
             }else if(obj.W != 88){
                oj = obj.N;
                if (oj != null && !TextUtils.x(oj.mChannelTabId)) {
                   i7 = 176;
                label_05e2 :
                   LiveAudienceParam$a uoa3 = new LiveAudienceParam$a();
                   uoa3.j(obj1.mEntity);
                   uoa3.g(i7);
                   uoa3.d(obj.r.get().intValue());
                   uoa3.m(obj.p.getExtra("SEARCH_PARAMS"));
                   LiveAudienceParam liveAudience = uoa3.a();
                   d.a(-1492894991).wV(activity, liveAudience, slidePlayCon);
                }
             }
             i7 = d.a(-1492894991).KL(obj.W);
             goto label_05e2 ;
             return;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a3105);
       return;
    }
    public void j8(){
       Boolean uBoolean = Boolean.class;
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.q8(LiveStreamFeed.class);
       this.q = this.r8("FRAGMENT");
       this.r = this.x8("ADAPTER_POSITION");
       this.s = this.t8("ADAPTER_POSITION_GETTER");
       this.t = this.r8("PHOTO_CLICK_LOGGER");
       this.u = this.t8("LIVE_STREAM_CLICK_LISTENER");
       this.v = this.t8("PHOTO_DETAIL_PARAM_PROCESSOR");
       this.w = this.v8("TAB_ID", Integer.class).intValue();
       this.x = this.w8("CLICK_LIVE_SOURCE_TYPE");
       this.y = this.s8(LiveStreamModel.class);
       this.z = this.w8("CLICK_AGGREGATE_LIVE_PLAY");
       this.A = this.t8("SLIDE_PLAY_BUSINESS");
       this.B = this.t8("FOLLOW_SELECTOR_IS_DEFAULT_RANK");
       this.E = this.v8("SLIDE_DETAIL_DOUBLE_STREAM", uBoolean);
       this.F = this.v8("HOT_LIVE_CLICK_TO_SLIDE_PLAY", uBoolean);
       this.G = this.v8("HOT_CLICK_TO_NASA_SLIDE_PLAY", uBoolean);
       this.H = this.v8("LOCAL_CLICK_TO_NASA_SLIDE_PLAY", uBoolean);
       this.J = this.v8("LOCAL_SAME_STREAM_SLIDE_PLAY", uBoolean);
       this.L = this.v8("PROFILE_CLICK_TO_NASA_SLIDE_PLAY", uBoolean);
       this.I = this.v8("LOCAL_CLICK_NEBULA_TO_NASA_SLIDE_PLAY", uBoolean);
       this.Q = this.t8("PLAYER_REUSE_SESSION_ID");
       this.S = this.t8("SHOULD_CACHE_LIVE_PLAYER_CONTROLLER");
       this.M = this.t8("PAGE_NAME");
       this.N = this.t8("FEED_ITEM_VIEW_PARAM");
       this.O = this.t8("local_current_city");
       this.P = this.t8("NEBULA_ENABLE_BOTTOM_NAV_BAR");
       this.R = this.t8("SOCIAL_ACCESS_IDSlocal_page_from_source_data");
       this.T = this.t8("NEARBY_THREE_TAB_ID");
       this.U = this.t8("NEARBY_THREE_TAB_SERVER_EXTRA_INFO");
       this.V = this.t8("AUTO_PLAY_LIVE_MODULE");
       return;
    }
}
