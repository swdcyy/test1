package com.kuaishou.live.core.show.closepage.audience.feed.recommand.a;
import k51.c;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.a$a;
import o4d.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h52.j;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import jp.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import dd.d;
import wb5.h;
import yp.x;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveFeedCoverIcons;
import com.yxcorp.gifshow.widget.LiveCoverIconView$e;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.LiveFeedCoverIcons$LiveFeedCoverIconBackground;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.drawable.GradientDrawable$Orientation;
import d61.h;
import androidx.core.graphics.drawable.a;
import com.yxcorp.gifshow.model.CDNUrl;
import im8.f;
import java.lang.Integer;
import com.kuaishou.android.live.model.LiveSquareSideBarNoticeModel;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import android.view.ViewGroup;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig;
import ekd.t0;
import kp.r1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i52.a;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.utils.e;
import t02.a0;
import f42.f;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.LivePlayClosedRecommendLiveAutoPlay;
import i52.b;
import ekd.t;
import java.util.Objects;
import e52.a;
import java.util.List;
import i52.c;
import kq5.b;
import p91.m;
import androidx.fragment.app.c$b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import g9c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import tkd.b;
import tkd.d;
import os5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import ekd.m1;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.a$b;
import android.view.View$OnClickListener;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends c	// class@000a4a
{
    public a0 A;
    public a B;
    public StringBuilder C;
    public c$b D;
    public t E;
    public a$a F;
    public TextView p;
    public TextView q;
    public KwaiImageView r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public LiveCoverIconView v;
    public BaseFragment w;
    public f x;
    public g y;
    public j z;
    public static String sLivePresenterClassName = "LivePlayClosedV2RecommendFeedPresenter";

    public void a(){
       super();
       this.C = "";
       this.F = new a$a(this);
    }
    public void E8(){
       a v;
       LiveStreamModel mUserCountCo;
       LiveCoverIconView$e uoe;
       int[] ointArray;
       t ot = this;
       a uoa = a.class;
       a uoa1 = a.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, ot, uoa, str)) {
          return;
       }
       j f = ot.z.f;
       QPhoto mEntity = f.mEntity;
       if (!mEntity instanceof LiveStreamFeed) {
          return;
       }
       QPhoto qPhoto = mEntity;
       h.f(ot.r, mEntity, false, a.c, null, null);
       int i = 0x7f060753;
       if (x.r(qPhoto)) {
          v = ot.v;
          LiveStreamModel mLiveCoverIc = qPhoto.mLiveStreamModel.mLiveCoverIconInfo;
          if (!PatchProxy.applyVoidTwoRefs(v, mLiveCoverIc, objArray, uoa1, "1")) {
             LiveFeedCoverIcons mCoverIconTy = mLiveCoverIc.mCoverIconType;
             if (mCoverIconTy == true) {
                uoe = v.Y();
                uoe.c(a.a(i));
                uoe.f(a1.f(R.drawable.arg_RES_7f08098e));
                uoe.p(mLiveCoverIc.mCoverTag);
                uoe.a();
             }else if(mCoverIconTy == 3){
                uoe = v.Y();
                uoe.c(a.a(i));
                uoe.f(a1.f(R.drawable.arg_RES_7f08098d));
                uoe.p(mLiveCoverIc.mCoverTag);
                uoe.a();
             }else if(mCoverIconTy == 13){
                LiveCoverIconView$e uoe1 = v.Y();
                Drawable uDrawable = PatchProxy.applyOneRefs(mLiveCoverIc, objArray, uoa1, "2");
                if (uDrawable != PatchProxyResult.class) {
                }else {
                   LiveFeedCoverIcons mCoverIconBa = mLiveCoverIc.mCoverIconBackground;
                   if (mCoverIconBa != null) {
                      i = 0x7f070429;
                      if (!TextUtils.isEmpty(mCoverIconBa.mBackgroundColorBegin) && !TextUtils.isEmpty(mLiveCoverIc.mCoverIconBackground.mBackgroundColorEnd)) {
                         ointArray = new int[]{a.b(mLiveCoverIc.mCoverIconBackground.mBackgroundColorBegin),a.b(mLiveCoverIc.mCoverIconBackground.mBackgroundColorEnd)};
                         uDrawable = h.b(a1.d(i), GradientDrawable$Orientation.LEFT_RIGHT, ointArray);
                      }else if(!TextUtils.isEmpty(mLiveCoverIc.mCoverIconBackground.mBackgroundColor)){
                         ointArray = new int[true];
                         ointArray[0] = a.b(mLiveCoverIc.mCoverIconBackground.mBackgroundColor);
                         uDrawable = h.b(a1.d(i), GradientDrawable$Orientation.LEFT_RIGHT, ointArray);
                      }
                   }
                   uDrawable = objArray;
                }
                if (uDrawable != null) {
                   uoe1.c(uDrawable);
                }else {
                   uoe1.b();
                }
                uDrawable = a1.f(R.drawable.arg_RES_7f0811b0);
                a.n(uDrawable, a1.a(R.color.arg_RES_7f0602ef));
                LiveFeedCoverIcons mCoverIconUr = mLiveCoverIc.mCoverIconUrls;
                if (mCoverIconUr != null && mCoverIconUr.length > 0) {
                   uoe1.k(mCoverIconUr);
                   uoe1.g(uDrawable);
                }else {
                   uoe1.f(uDrawable);
                }
                uoe1.p(mLiveCoverIc.mCoverTag);
                uoe1.a();
             }
          }
       }else if(!ot.x.get().intValue()){
          LiveStreamFeed mLiveSquareS = qPhoto.mLiveSquareSideBarNoticeModel;
          if (mLiveSquareS != null) {
             a v1 = ot.v;
             LiveSquareSideBarNoticeModel mLiveSquareS1 = mLiveSquareS.mLiveSquareSideBarNoticeType;
             if (PatchProxy.isSupport(uoa1) && (!PatchProxy.applyVoidTwoRefs(v1, Integer.valueOf(mLiveSquareS1), objArray, uoa1, str) && mLiveSquareS1 == true)) {
                uoe = v1.Y();
                uoe.c(a.a(i));
                uoe.f(a1.f(R.drawable.arg_RES_7f0814d4));
                uoe.p(a1.p(R.string.arg_RES_7f101f02));
                uoe.a();
             }
          }
       }
       if (x.s(qPhoto)) {
          mUserCountCo = qPhoto.mLiveStreamModel.mLiveCoverIconInfo;
          if (mUserCountCo.mEnableShowRecentlyWatchTag != null) {
             a v2 = ot.v;
             i = a1.a(R.color.arg_RES_7f061520);
             if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidThreeRefs(v2, mUserCountCo, Integer.valueOf(i), null, a.class, "4")) {
                uoe = v2.Y();
                uoe.p(mUserCountCo.mCoverTag);
                uoe.o(i);
                uoe.c(a.a(R.color.arg_RES_7f061c32));
                uoe.a();
             }
          }
       }
       LiveStreamFeed mUser = qPhoto.mLiveStreamModel;
       LiveCoverWidgetModel liveCoverWid = (mUser != null)? mUser.getLiveCoverWidgetModel(2): objArray;
       if (liveCoverWid != null) {
          ot.v.N(liveCoverWid);
       }else {
          liveCoverWid = 0;
       label_01db :
          v = ot.v;
          int i1 = (uoa1)? 0: 8;
          v.setVisibility(i1);
          mUser = qPhoto.mUser;
          if (mUser != null) {
             ot.s.U(mUser.mAvatars);
             ot.t.setText(qPhoto.mUser.mName);
          }
          mUser = qPhoto.mLiveStreamModel;
          if (mUser != null && !TextUtils.x(mUser.mAudienceCount)) {
             mUser = qPhoto.mLiveStreamModel;
             mUserCountCo = mUser.mUserCountConfig;
             str = (mUserCountCo != null && mUserCountCo.mType == 2)? 1: null;
             if (!str && (!t0.a(mUser.mAudienceCount) || Integer.parseInt(qPhoto.mLiveStreamModel.mAudienceCount))) {
                ot.q.setVisibility(0);
                ot.q.setText(TextUtils.k(qPhoto.mLiveStreamModel.mAudienceCount));
             label_0242 :
                if (!TextUtils.x(f.getCaption())) {
                   ot.p.setText(f.getCaption());
                }else {
                   ot.p.setText(a1.p(R.string.arg_RES_7f101f9a));
                }
                if (!f.isShowed()) {
                   f.setShowed(true);
                   r1.g5(f.mEntity, ot.x.get().intValue());
                   this.m8().post(new a(ot, qPhoto));
                   e.u(f.mEntity);
                }
                if (!PatchProxy.applyVoid(objArray, ot, uoa, "5")) {
                   if (!ot.x.get().intValue() && (ot.z.e != null && !f.a(ot.A.l))) {
                      ot.u.setVisibility(0);
                      int i2 = (int)((float)ot.z.e.mDelayMillis / 1000.00f);
                      ot.S8(i2);
                      b uob = new b(ot, i2, 1000);
                      ot.E = uob;
                      uob.f();
                      uoa = ot.B;
                      uoa1 = ot.F;
                      Objects.requireNonNull(uoa);
                      if (!PatchProxy.applyVoidOneRefs(uoa1, uoa, a.class, "1")) {
                         uoa.a.add(uoa1);
                      }
                      ot.D = new c(ot);
                      ot.A.Z2.k().c(ot.D);
                   }else {
                      ot.u.setVisibility(8);
                   }
                }
                return;
             }
          }
       label_023d :
          ot.q.setVisibility(8);
          goto label_0242 ;
       }
    label_01d8 :
       uoa1 = 1;
       goto label_01db ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tE = this.E;
       if (tE != null) {
          tE.a();
       }
       if (this.D != null) {
          this.A.Z2.k().a(this.D);
       }
       tE = this.F;
       if (tE != null) {
          a tB = this.B;
          Objects.requireNonNull(tB);
          if (!PatchProxy.applyVoidOneRefs(tE, tB, a.class, "2")) {
             tB.a.remove(tE);
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       a tE = this.E;
       if (tE != null) {
          tE.a();
       }
       tE = this.u;
       if (tE != null) {
          tE.setVisibility(8);
       }
       return;
    }
    public void R8(QPhoto p0){
       j a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (this.getActivity() == null || (this.getActivity() instanceof GifshowActivity && p0 != null)) {
          this.P8();
          if (this.x.get().intValue()) {
             this.B.a();
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.y.Q0().iterator();
          while (iterator.hasNext()) {
             j oj = iterator.next();
             a = oj.a;
             if (a == null) {
                uArrayList.add(oj.f);
             }else if(a == 1){
                uArrayList.addAll(oj.g);
             }
          }
          LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
          uob.v("n/live/getEndRecommend/v3");
          uob.C(p0);
          uob.w(uArrayList);
          uob.c = this.z.d;
          uob.q(this.A.Z2.getLiveStreamId());
          uob.y = this.A.Z2.getLiveStreamId();
          uob.o(18);
          d.a(-1835681758).eO(this.getActivity(), uob.a(), 1025);
       }
    label_00a9 :
       return;
    }
    public void S8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9")) {
          return;
       }
       if (this.z.e != null) {
          (this.C).setLength(0);
          StringBuilder str = this.C+p0+this.z.e.mDescription;
          this.u.setText(this.C);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a25df);
       this.s = m1.f(p0, 0x7f0a25dd);
       this.t = m1.f(p0, 0x7f0a25e5);
       this.p = m1.f(p0, 0x7f0a25e3);
       this.q = m1.f(p0, 0x7f0a25de);
       this.v = m1.f(p0, 0x7f0a1b33);
       this.u = m1.f(p0, 0x7f0a22c5);
       m1.a(p0, new a$b(this), R.id.live_square_side_bar_item_cover_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.x = this.x8("ADAPTER_POSITION");
       this.y = this.r8("ADAPTER");
       this.w = this.r8("LIVE_PLAY_CLOSED_FRAGMENT");
       this.z = this.q8(j.class);
       this.A = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.B = this.r8("LIVE_PLAY_CLOSED_V2_AUTO_PLAY_SERVICE");
       return;
    }
}
