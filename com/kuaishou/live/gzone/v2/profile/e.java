package com.kuaishou.live.gzone.v2.profile.e;
import lf2.m;
import k51.c;
import java.util.HashSet;
import u07.t;
import android.view.View;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zic.f;
import java.lang.Object;
import android.app.Activity;
import java.lang.CharSequence;
import e17.i;
import bb1.n;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import e63.i0;
import sfc.a;
import android.content.Context;
import erd.g;
import crd.b;
import cb1.b;
import cb1.c;
import brd.t;
import cjd.e;
import erd.o;
import e63.e0;
import e63.o0;
import e63.f0;
import com.kuaishou.live.gzone.v2.profile.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.TextView;
import java.util.Objects;
import z12.e;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import qvb.a;
import android.util.SparseIntArray;
import u07.t$a;
import e63.r;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.j;
import qvb.i;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.profilecard.photo.l;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserSettingOption;
import lnc.a1;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import e63.q0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.basic.widget.ConstrainLinearLayout;
import e63.q;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.LinearLayout;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Enum;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import d61.y;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import android.view.ViewGroup$MarginLayoutParams;
import e63.o1;
import wj2.r;
import p91.m;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e63.c1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.gzone.v2.profile.h;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$i;
import e9c.b;
import com.kuaishou.live.gzone.v2.profile.e$f;
import androidx.recyclerview.widget.RecyclerView$r;
import lf2.b;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import com.kuaishou.live.gzone.v2.profile.e$g;
import qvb.q;
import com.kwai.library.widget.specific.misc.LoadingView;
import e63.d1;
import o02.f;
import o02.e;
import e63.c0;
import e63.z;
import io.reactivex.internal.functions.Functions;
import t02.a0;
import io.reactivex.subjects.PublishSubject;
import kg1.g;
import e63.a0;
import co2.i0;
import ne2.k;
import ry1.b;
import e63.b0;
import com.gifshow.tuna.player.poi.e;
import af2.b;
import af2.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import e63.h0;
import f37.n0;
import java.lang.Boolean;
import f37.i0;
import erd.r;
import com.kuaishou.live.gzone.v2.profile.e$c;
import e63.d0;
import brd.y;
import e63.n0;
import e63.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import java.util.Set;
import wkd.b;
import le2.b;
import kp.r1;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import lnc.b9;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import qe2.t;
import e63.p0;
import e63.m0;
import e63.k0;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.yxcorp.utility.TextUtils;
import lu7.f;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kuaishou.live.core.show.profilecard.b;
import com.kuaishou.live.gzone.v2.profile.e$d;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.gzone.v2.profile.b;
import e63.x;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import k2b.e0;
import z12.x;
import com.kuaishou.android.model.feed.PhotoType;
import com.kuaishou.live.core.show.profilecard.follow.b;
import fka.e;
import e63.j0;
import y41.i$a;
import y41.i;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import bk2.f;
import qa6.b;
import mz6.b;
import java.util.ArrayList;
import mz6.b$d;
import java.util.Collection;
import com.kuaishou.live.gzone.v2.profile.e$e;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.gzone.v2.profile.e$a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import java.lang.Float;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.core.content.ContextCompat;
import android.widget.FrameLayout;
import java.lang.Number;
import android.view.ViewTreeObserver;
import com.kuaishou.live.gzone.v2.profile.e$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Exception;
import wj2.l0;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.kwai.library.widget.textview.DrawableCenterTextView;
import com.kuaishou.live.common.core.basic.widget.LiveProfileContainerView;
import e63.y0;
import e63.m;
import e63.w;
import e63.u0;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$AssistantConfig;
import java.lang.reflect.Type;
import s81.a;
import e63.s;
import zf6.l;
import e63.g;
import wj2.o0;
import wj2.n0;
import tx1.d;
import mrd.c;
import android.text.TextPaint;
import android.text.Layout;
import e63.t;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import e63.u;

public class e extends c implements m	// class@001ce8
{
    public c A;
    public KwaiImageView A1;
    public a0 B;
    public KwaiImageView B1;
    public LiveProfileContainerView C;
    public o1 C1;
    public RelativeLayout D;
    public int D1;
    public KwaiImageView E;
    public String E1;
    public RelativeLayout F;
    public b F1;
    public KwaiImageView G;
    public Set G1;
    public KwaiImageView H;
    public boolean H1;
    public LinearLayout I;
    public boolean I1;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public RelativeLayout N;
    public EmojiTextView O;
    public ImageView P;
    public LinearLayout Q;
    public DrawableCenterTextView R;
    public DrawableCenterTextView S;
    public ImageView T;
    public View U;
    public l U0;
    public CustomRecyclerView V;
    public e$g V0;
    public RelativeLayout W;
    public GridLayoutManager W0;
    public TextView X;
    public ViewGroup X0;
    public TextView Y;
    public LoadingView Y0;
    public j Z;
    public View Z0;
    public boolean a1;
    public int b1;
    public int c1;
    public boolean d1;
    public String e1;
    public boolean f1;
    public RelativeLayout g1;
    public RelativeLayout h1;
    public DrawableCenterTextView i1;
    public DrawableCenterTextView j1;
    public DrawableCenterTextView k1;
    public VoicePartyTintableTextView l1;
    public DrawableCenterTextView m1;
    public DrawableCenterTextView n1;
    public ExpandEmojiTextView o1;
    public GifshowActivity p;
    public DrawableCenterTextView p1;
    public User q;
    public LiveGzoneProfileTagsView q1;
    public LiveGzoneProfileParams r;
    public View r1;
    public g s;
    public View s1;
    public Fragment t;
    public int t1;
    public o0 u;
    public boolean u1;
    public n0 v;
    public boolean v1;
    public d w;
    public boolean w1;
    public l0 x;
    public boolean x1;
    public LivePlayLogger y;
    public View y1;
    public c z;
    public RelativeLayout z1;
    public static String sLivePresenterClassName = "LiveGzoneProfileCommonPresenter";

    public void e(){
       super();
       this.a1 = false;
       this.t1 = 2;
       this.u1 = false;
       this.w1 = false;
       this.x1 = false;
       this.G1 = new HashSet();
    }
    public static void P8(e p0,t p1,View p2){
       p0.u9(p1, p2);
    }
    public static void R8(e p0,ActionResponse p1){
       p0.q9(p1);
    }
    public static void S8(e p0,t p1,View p2){
       p0.s9(p1, p2);
    }
    public static void V8(e p0,t p1,View p2){
       p0.t9(p1, p2);
    }
    private void q9(ActionResponse p0){
       f.e(this.r.getUserProfile().mProfile.mId, 0, this.p.Q2(), 0);
       Object[] objArray = new Object[]{this.r.getUserProfile().mProfile.mName};
       i.d(R.style.arg_RES_7f11066a, this.p.getString(R.string.arg_RES_7f104d3b, objArray));
       n.c(1681, this.r.getUserProfile().mProfile.mId, this.r.getLiveStreamId());
       if (this.r.getOriginUserAssPrivilege().mKickUser != null) {
          b.c(this.r.getLiveStreamId(), this.r.getUserProfile().mProfile.mId, new i0(this), new a(this.p));
       }
       return;
    }
    private void s9(t p0,View p1){
       b.b().a(this.r.getLiveStreamId(), this.r.getUserProfile().mProfile.mId).map(new e()).subscribe(new e0(this));
    }
    private void t9(t p0,View p1){
       b.c(this.r.getLiveStreamId(), this.r.getUserProfile().mProfile.mId, new o0(this), new a(this.p));
    }
    private void u9(t p0,View p1){
       b.b().b(this.r.getLiveStreamId(), this.r.getUserProfile().mProfile.mId).map(new e()).subscribe(new f0(this));
    }
    public void B9(int p0){
       e tZ;
       View view;
       j oj = j.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "65")) {
          return;
       }
       LiveLogTag lIVE_PROFILE = LiveLogTag.LIVE_PROFILE;
       b.Z(lIVE_PROFILE, "onListRefreshComplete, UserId:"+this.q.mId);
       if (this.a1 == null) {
          this.a1 = true;
          this.b1 = 1;
          if (p0 <= 0 && (this.o1 != null && (this.r.getUserProfile() != null && this.r.getUserProfile().mProfile != null))) {
             this.o1.setText(this.r.getUserProfile().mProfile.mText);
             this.u1 = true;
          }
       label_0063 :
          String str = "LiveProfilePhotoAdapter";
          if (!this.r.shouldHideLoading()) {
             tZ = this.Z;
             e tc1 = this.c1;
             Objects.requireNonNull(tZ);
             if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tc1), tZ, oj, "4")) {
                String[] stringArray1 = new String[0];
                e.c(str, "removeHeaderView", stringArray1);
                tZ.x.remove(tc1);
             }
             this.Z.t0(this.c1);
          }
          this.y1 = this.Z8(0x3f000000);
          int i = 2;
          if (this.U0.getItems() == null || (this.U0.getItems() != null && this.U0.getItems().isEmpty())) {
             this.Z.s1(true, this.y1);
             view = this.b9();
             this.Z0 = view;
             this.Z.s1(i, view);
             this.Z.p0(true, i);
          }else if(this.U0.getItems() != null){
             String str1 = 3;
             if (this.U0.getItems().size() <= str1) {
                if (this.U0.getItems().size() < str1) {
                   this.b1 = i;
                   this.Z.s1(true, this.y1);
                   this.Z.l0(true);
                }
                b.Z(lIVE_PROFILE, "create footerView, UserId:"+this.q.mId);
                view = this.Z8(100.00f);
                uoe = this.Z;
                Objects.requireNonNull(uoe);
                if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(0), view, uoe, oj, "2")) {
                   String[] stringArray = new String[0];
                   e.c(str, "addOrReplaceFooterView", stringArray);
                   view.setTag(Integer.valueOf((uoe.y.size() + 0x30d40)));
                   uoe.z.append((uoe.y.size() + 0x30d40), 0);
                   uoe.y.append(0, view);
                }
                tZ = this.Z;
                tZ.l0((tZ.getItemCount() - true));
             }
          }
       }
    label_0172 :
       return;
    }
    public void C9(){
       if (PatchProxy.applyVoid(null, this, e.class, "56")) {
          return;
       }
       t$a uoa = new t$a(this.p);
       Object[] objArray = new Object[]{this.r.getUserProfile().mProfile.mName};
       uoa.X0(this.p.getString(R.string.arg_RES_7f101ffa, objArray));
       uoa.y0(R.string.arg_RES_7f1028b0);
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new r(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public i D3(){
       Object obj = PatchProxy.apply(null, this, e.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U0.clone();
    }
    public void D9(){
       if (PatchProxy.applyVoid(null, this, e.class, "16")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          this.O9();
          return;
       }else if(this.r.getUserProfile().mUserSettingOption.isPrivacyUser != null){
          this.e1 = (this.r.getUserProfile().isFollowing != null)? a1.p(0x7f101034): a1.p(0x7f100216);
       }else if(this.r.getUserProfile().isFollowRequesting != null){
          this.e1 = a1.p(0x7f100216);
       }else {
          this.e1 = a1.p(0x7f101034);
       }
       boolean b = this.r.getUserProfile().isFollowingOrFollowRequesting();
       this.d1 = b;
       if (b) {
          this.K9();
       }else {
          this.O9();
       }
       return;
    }
    public void E8(){
       int i3;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new q0(this)));
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "9")) {
          UserInfo mId = this.r.getUserProfile().mProfile.mId;
          this.m8().findViewById(R.id.live_profile_user_name_area).setPlaceHolder(R.id.live_profile_admin_icon);
          this.O.setSingleLine();
          q oq = new q(this, mId);
          this.G.setOnClickListener(oq);
          this.O.setOnClickListener(oq);
          if (!this.r.getOriginUserAssType().isAnchor()) {
             this.T.setImageDrawable(j.n(this.getContext(), R.drawable.arg_RES_7f080cd2, 0x7f061dc4));
          }
          int i = 8;
          if (mId.equals(QCurrentUser.me().getId())) {
             this.T.setVisibility(i);
             this.Q.setVisibility(i);
          }
          if (this.r.isHideMoreButton()) {
             this.T.setVisibility(i);
          }
          if (this.r.getAnchorUserId() != null && (this.r.getAnchorUserId()).equals(mId)) {
             LiveApiParams$AssistantType pUSHER = LiveApiParams$AssistantType.PUSHER;
             this.r.setTargetUserAssType(pUSHER);
             UserProfile userProfile = this.r.getUserProfile();
             if (userProfile != null) {
                UserProfile mProfile = userProfile.mProfile;
                if (mProfile != null) {
                   UserInfo mExtraInfo = mProfile.mExtraInfo;
                   if (mExtraInfo == null) {
                      mExtraInfo = new UserExtraInfo();
                      userProfile.mProfile.mExtraInfo = mExtraInfo;
                   }
                   mExtraInfo.mAssistantType = pUSHER.ordinal();
                }
             }
          }
          this.N.setAlpha(0);
          this.V.setPadding(b, b, b, b);
          if (!y.d(this.getActivity())) {
             ViewGroup$LayoutParams layoutParams = this.V.getLayoutParams();
             layoutParams.height = (this.r.isGzoneHidePhotoList())? -2: n.c(a.a().a(), 274.00f);
             this.V.setLayoutParams(layoutParams);
          }else {
             ViewGroup$MarginLayoutParams layoutParams1 = this.V.getLayoutParams();
             layoutParams1.setMargins(b, b, b, b);
             this.V.setLayoutParams(layoutParams1);
          }
          if (this.r.isTopFollowLayoutInRecyclerViewHeader() && !PatchProxy.applyVoid(objArray, this, uoe, "72")) {
             int i1 = a1.e(90.00f);
             int i2 = a1.e(102.00f);
             if (this.r.isGameLiveStreamNewVersion2Enabled()) {
                i3 = a1.e(100.00f);
                i2 = a1.e(4.00f);
                i1 = a1.e(88.00f);
             }else {
                i3 = i2;
                i2 = 0;
             }
             this.G.getLayoutParams().width = i1;
             this.G.getLayoutParams().height = i1;
             this.G.setPadding(b, b, b, b);
             this.G.getLayoutParams().topMargin = b;
             this.T.getLayoutParams().rightMargin = i2;
             this.F.setVisibility(i);
             this.D.setVisibility(i);
             this.D.setBackground(objArray);
             this.H.getLayoutParams().width = i3;
             this.H.getLayoutParams().height = i3;
             this.H.getLayoutParams().topMargin = a1.e(-5.00f);
          }
       }
    label_01c5 :
       if (!PatchProxy.applyVoid(objArray, this, uoe, "10")) {
          this.C1 = new o1(this.z1, this.A1, this.B1, this.s.d.getLiveBasicContext());
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "63")) {
          b.Z(LiveLogTag.LIVE_PROFILE, "prepareProfilePhotoList, UserId:"+this.q.mId);
          GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), 3);
          this.W0 = gridLayoutMa;
          this.V.setLayoutManager(gridLayoutMa);
          this.V.addItemDecoration(new c1(this, n.c(a.a().a(), 2.00f)));
          j oj = new j(this.q, this.r, this.p, this.t, this);
          this.Z = gridLayoutMa;
          gridLayoutMa.w = new h(this);
          this.Z.B = this.r.isCanOpenFullProfile();
          e tZ = this.Z;
          tZ.F0(b.a(tZ, this.p));
          this.V.addOnScrollListener(new e$f(this));
          this.V.setAdapter(this.Z);
          boolean b1 = (this.r.isCanOpenFullProfile() && (this.r.getUserProfile().mProfile.mId).equals(this.r.getAnchorUserId()))? true: false;
          if (this.r.isGzoneHidePhotoList()) {
             b uob = new b(this.r.getUserProfile().mProfile.mId, false, this.l9(), b1, this.r.getLiveProfileFeedCacheManager());
             this.U0 = tZ;
          }else {
             l ol = new l(this.r.getUserProfile().mProfile.mId, false, this.l9(), b1, this.r.getLiveProfileFeedCacheManager());
             this.U0 = tZ;
          }
          e$g og = new e$g(this);
          this.V0 = og;
          this.U0.h(og);
          if (!this.r.shouldHideLoading()) {
             LoadingView loadingView = this.a9();
             this.Y0 = loadingView;
             this.Z.s1(b, loadingView);
             this.c1 = b;
          }
          this.V.addOnScrollListener(new d1(this));
       }
       this.R9(b);
       this.E9();
       if (!PatchProxy.applyVoid(objArray, this, uoe, "11") && (this.r.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER || this.r.getOriginUserAssPrivilege().mForbidComment != null)) {
          e.a().j0(this.r.getLiveStreamId(), this.r.getUserProfile().mProfile.mId).map(new e()).subscribe(new c0(this));
       }
       this.X7(this.z.subscribe(new z(this), Functions.e));
       this.I9();
       uoe = this.B;
       if (uoe != null) {
          a0 r1 = uoe.r1;
          if (r1 != null) {
             PublishSubject publishSubje = r1.Xf();
             if (publishSubje != null) {
                this.X7(publishSubje.subscribe(new a0(this)));
             }
          }
       }
       r s = this.s.s;
       if (s != null) {
          s.h(this.q.mId, objArray);
       }
       uoe = this.B;
       if (uoe != null) {
          this.X7(uoe.b3.T3().subscribe(new b0(this), e.b));
       }
       return;
    }
    public final void E9(){
       i0 oi0;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoe, "12")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_PROFILE, "refreshProfile, UserId:"+obj.q.mId);
       UserInfo mId = obj.r.getUserProfile().mProfile.mId;
       UserProfile userProfile = obj.r.getUserProfile();
       b uob = a.b();
       int clickType = obj.r.getClickType();
       String liveStreamId = obj.r.getLiveStreamId();
       String str = (obj.r.getExpTag() == null)? "_": obj.r.getExpTag();
       t ot = uob.a(mId, clickType, liveStreamId, str, obj.r.getLogUrl()).map(new e()).compose(obj.t.Ug(FragmentEvent.DESTROY_VIEW));
       e x0 = obj.X0;
       KwaiEmptyStateView$a uoa = PatchProxy.apply(objArray, obj, uoe, "13");
       if (uoa != patchProxyRe) {
       }else {
          uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.p(new h0(obj));
       }
       if (PatchProxy.isSupport(n0.class)) {
          oi0 = PatchProxy.applyFourRefs(x0, uoa, null, Boolean.TRUE, null, n0.class, "3");
          if (oi0 != patchProxyRe) {
          label_00bc :
             obj.X7(ot.compose(oi0).subscribe(new e$c(obj, userProfile, mId), new d0(obj)));
             if (obj.r.getAnchorUserId() != null && (obj.r.getAnchorUserId()).equals(mId)) {
                LiveApiParams$AssistantType pUSHER = LiveApiParams$AssistantType.PUSHER;
                obj.r.setTargetUserAssType(pUSHER);
                if (userProfile != null) {
                   UserProfile mProfile = userProfile.mProfile;
                   if (mProfile != null) {
                      UserInfo mExtraInfo = mProfile.mExtraInfo;
                      if (mExtraInfo == null) {
                         mExtraInfo = new UserExtraInfo();
                         userProfile.mProfile.mExtraInfo = mExtraInfo;
                      }
                      mExtraInfo.mAssistantType = pUSHER.ordinal();
                   }
                }
             }
             obj.A.onNext(Boolean.TRUE);
             return;
          }
       }
       oi0 = new i0(x0, objArray, uoa, true);
       goto label_00bc ;
    }
    public final void F9(){
       if (PatchProxy.applyVoid(null, this, e.class, "51")) {
          return;
       }
       b.b().d(this.r.getUserProfile().mProfile.mId, this.r.getLiveStreamId(), true).map(new e()).subscribe(new n0(this), new a(this.p));
       return;
    }
    public final void G9(){
       if (PatchProxy.applyVoid(null, this, e.class, "49")) {
          return;
       }
       b.b().d(this.r.getUserProfile().mProfile.mId, this.r.getLiveStreamId(), true).map(new e()).subscribe(new l0(this), new a(this.p));
       return;
    }
    public void H9(){
       if (PatchProxy.applyVoid(null, this, e.class, "78")) {
          return;
       }
       List list = this.Z.v1();
       if (list != null && !list.isEmpty()) {
          int i = Math.max(0, (this.W0.i0() - this.b1));
          int i1 = Math.min((list.size() - 1), (this.W0.c() - this.b1));
          while (i <= i1) {
             Object obj = list.get(i);
             CommonMeta uCommonMeta = obj.a(CommonMeta.class);
             if (uCommonMeta != null && !this.G1.contains(obj.getId())) {
                this.G1.add(obj.getId());
                uCommonMeta.mPosition = i;
                uCommonMeta.mShowed = true;
                int i2 = i % 3;
                int i3 = 2;
                if (!i2) {
                   i3 = 1;
                }else if(i2 == i3){
                   i3 = 0;
                }
                uCommonMeta.mDirection = i3;
                b.a(-1787676707).a(obj);
                LivePlayLogger.onShowPhotoInPopupWindow(obj, r1.U1(obj), i, 1, 915, this.r.getProfileOriginSource());
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void I9(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       b9.a(this.F1);
       this.F1 = a.b().b(a.c(this.s.m), this.r.getUserProfile().mProfile.mId, this.r.getLiveStreamId()).map(new e()).observeOn(d.c).doOnNext(t.b).observeOn(d.a).subscribe(new p0(this), Functions.d());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "14")) {
          return;
       }
       b9.a(this.F1);
       e tV = this.V;
       if (tV != null) {
          tV.clearOnScrollListeners();
       }
       tV = this.U0;
       if (tV != null) {
          tV.f(this.V0);
       }
       this.G1.clear();
       return;
    }
    public final void J9(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "20")) {
          return;
       }
       if (!this.m1.getVisibility()) {
          ViewGroup$LayoutParams layoutParams = this.m1.getLayoutParams();
          layoutParams.width = p0;
          this.m1.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void K9(){
       if (PatchProxy.applyVoid(null, this, e.class, "17")) {
          return;
       }
       int i = 8;
       this.R.setVisibility(i);
       this.S.setVisibility(0);
       this.S.setText(this.e1);
       LiveApiParams$AssistantType pUSHER = LiveApiParams$AssistantType.PUSHER;
       if (this.r.getTargetUserAssType() == pUSHER) {
          this.S.setEnabled((this.d1 ^ 1));
       }else {
          this.S.setEnabled(1);
       }
       if (this.g1 != null) {
          this.i1.setVisibility(i);
          this.j1.setVisibility(0);
          this.j1.setText(this.e1);
          if (this.r.getTargetUserAssType() == pUSHER) {
             this.j1.setEnabled((this.d1 ^ 1));
          }else {
             this.j1.setEnabled(1);
          }
       }
       return;
    }
    public final void L9(){
       if (PatchProxy.applyVoid(null, this, e.class, "50")) {
          return;
       }
       b.b().f(this.r.getUserProfile().mProfile.mId, LiveApiParams$AssistantType.ADMIN.ordinal(), this.r.getLiveStreamId(), true).map(new e()).subscribe(new m0(this), new a(this.p));
       return;
    }
    public final void M9(){
       if (PatchProxy.applyVoid(null, this, e.class, "48")) {
          return;
       }
       b.b().f(this.r.getUserProfile().mProfile.mId, LiveApiParams$AssistantType.SUPER_ADMIN.ordinal(), this.r.getLiveStreamId(), true).map(new e()).subscribe(new k0(this), new a(this.p));
       return;
    }
    public final void O9(){
       if (PatchProxy.applyVoid(null, this, e.class, "18")) {
          return;
       }
       this.S.setVisibility(8);
       this.R.setVisibility(0);
       if (this.g1 != null) {
          this.j1.setVisibility(8);
          this.i1.setVisibility(0);
       }
       return;
    }
    public final void Q9(UserProfile p0,LiveApiParams$AssistantType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "61")) {
          return;
       }
       UserInfo mExtraInfo = p0.mProfile.mExtraInfo;
       if (p1 == LiveApiParams$AssistantType.AUDIENCE && mExtraInfo == null) {
          return;
       }
       if (mExtraInfo == null) {
          mExtraInfo = new UserExtraInfo();
          p0.mExtraInfo = mExtraInfo;
       }
       mExtraInfo.mAssistantType = p1.ordinal();
       return;
    }
    public void R9(boolean p0){
       String str1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "22")) {
          return;
       }
       b uob = new b();
       uob.v(a1.a(0x106000d));
       uob.s(DrawableCreator$Shape.Oval);
       this.G.setForegroundDrawable(uob.a());
       UserProfile userProfile = this.r.getUserProfile();
       g.d(this.G, userProfile.mProfile, HeadImageSize.BIG);
       this.O.setText(f.b(TextUtils.k(userProfile.mProfile.mId), TextUtils.k(userProfile.mProfile.mName)));
       UserProfile mOwnerCount = userProfile.mOwnerCount;
       long l = (long)mOwnerCount.mFan;
       UserOwnerCount mFansCountTe = mOwnerCount.mFansCountText;
       String str = "0";
       if (p0) {
          if (!TextUtils.x(mFansCountTe)) {
             this.J.setText(mFansCountTe);
          }else if(!l - -1){
             str1 = str;
          }else {
             str1 = b.d((int)l);
          }
          this.c9(str1, this.J, this.X);
       }
       long l1 = (long)userProfile.mOwnerCount.mFollow;
       if (p0 || l1 - -1) {
          if (l1 - -1) {
             str = b.d((int)l1);
          }
          this.c9(str, this.L, this.Y);
       }
       if (!this.r.isGameLiveStreamNewVersion2Enabled()) {
          this.I.addOnLayoutChangeListener(new e$d(this));
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, e.class, "54")) {
          return;
       }
       t$a uoa = new t$a(this.p);
       Object[] objArray = new Object[]{this.r.getUserProfile().mProfile.mName};
       uoa.X0(this.p.getString(R.string.arg_RES_7f101fef, objArray));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new b(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public void X8(){
       e tp;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "43")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          this.d9();
          tp = this.p;
          y.a(tp, tp.getUrl(), "live_profile_follow", 40, a.a().a().getString(R.string.arg_RES_7f103077), this.r.getBaseFeed(), null, null, new x(this));
          return;
       }else {
          int i = 1;
          int i1 = this.d1 ^ i;
          this.d1 = i1;
          if (i1) {
             tp = this.y;
             if (tp != null) {
                tp.onFollowAtLiveTips(x.l(this.B), this.r.getBaseFeed(), this.r.getUserProfile().mProfile.mId, this.r.getFollowSource());
             }
          }else {
             tp = this.y;
             if (tp != null) {
                tp.onUnFollowAtLiveTips(this.r.getBaseFeed(), this.r.getUserProfile().mProfile.mId);
             }
          }
          tp = this.d1;
          if (PatchProxy.isSupport(uoe) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(tp), this, uoe, "57") && tp != this.r.getUserProfile().isFollowingOrFollowRequesting())) {
             this.q.mPage = "live";
             Object[] objArray1 = new Object[]{this.r.getUserProfile().mProfile.mId,this.r.getLiveStreamId(),String.valueOf(PhotoType.LIVESTREAM.toInt())};
             int i2 = 0;
             String str = String.format("%s_%s_l%s", objArray1);
             String str1 = b.c(this.r);
             int i3 = 77;
             if (this.r.getProfileOriginSource() != 22 && (this.r.getProfileOriginSource() == 23 || this.r.getProfileOriginSource() == 17)) {
                String str2 = PatchProxy.apply(objArray, this, uoe, "58");
                if (str2 != PatchProxyResult.class) {
                }else {
                   str2 = e.a().c(i3);
                }
                str1 = str2;
             }else {
                i3 = 0;
             }
             if (tp != null) {
                if (this.r.getUserProfile().mUserSettingOption.isPrivacyUser != null) {
                   this.r.getUserProfile().isFollowing = i2;
                   this.r.getUserProfile().isFollowRequesting = i;
                }else {
                   this.r.getUserProfile().isFollowing = i;
                   this.r.getUserProfile().isFollowRequesting = i2;
                }
             }else {
                this.r.getUserProfile().isFollowing = i2;
                this.r.getUserProfile().isFollowRequesting = i2;
             }
             j0 oj0 = new j0(this);
             e tB = this.B;
             if (tB != null) {
                a0 z2 = tB.Z2;
                if (z2 != null && !TextUtils.x(z2.getLiveStreamId())) {
                   objArray = this.B.Z2.getLiveStreamId();
                label_017f :
                   i$a uoa = new i$a(this.p, objArray);
                   uoa.o(this.q);
                   uoa.k(i3);
                   uoa.d(str);
                   uoa.m(this.r.getLogUrl());
                   uoa.n(this.r.getFollowSource());
                   uoa.r(i);
                   uoa.h(str1);
                   uoa.j(oj0);
                   i oi = uoa.a();
                   if (tp != null) {
                      if (this.r.getClickType() == LiveStreamClickType.LIVE_PK_PEER.getValue()) {
                         RxBus.f.b(new f(this.q));
                      }
                      oi.c();
                   }else {
                      oi.e();
                   }
                   if (this.q != null) {
                      b.d(this.r.getUserProfile(), this.q);
                   }
                }
             }
             b.B(LiveLogTag.LIVE_PROFILE, "[LiveGzoneProfileCommonPresenter][follow]liveStreamId is null");
             goto label_017f ;
          }
       label_01e2 :
          return;
       }
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, e.class, "32")) {
          return;
       }
       b uob = new b(this.p);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new b$d(R.string.arg_RES_7f104f05, -1, R.color.arg_RES_7f060c49));
       uob.b(uArrayList);
       uob.k(new e$e(this));
       uob.l(new e$a(this));
       uob.q();
       return;
    }
    public final View Z8(float p0){
       View obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoe, "66");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new View(this.getContext());
       obj.setLayoutParams(new RecyclerView$LayoutParams(-1, n.c(a.a().a(), p0)));
       if (!p0 - 0x3f000000) {
          if (this.r.isDarkModeEnabled()) {
             obj.setBackgroundColor(ContextCompat.getColor(this.p, R.color.arg_RES_7f061d80));
          }else {
             obj.setBackgroundColor(ContextCompat.getColor(this.p, R.color.arg_RES_7f0616ce));
          }
       }
       return obj;
    }
    public final LoadingView a9(){
       LoadingView obj = PatchProxy.apply(null, this, e.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LoadingView(this.getContext(), 0x7f11020f);
       int i = -1;
       int i1 = (y.d(this.getActivity()))? -1: n.c(a.a().a(), 275.00f);
       obj.setLayoutParams(new RecyclerView$LayoutParams(i, i1));
       b.Z(LiveLogTag.LIVE_PROFILE, "createLoadingView, UserId:"+this.q.mId);
       return obj;
    }
    public View b9(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       KwaiEmptyStateView obj = PatchProxy.apply(objArray, this, uoe, "67");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new KwaiEmptyStateView(this.getContext());
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       String str = PatchProxy.apply(objArray, this, uoe, "81");
       if (str != patchProxyRe) {
       }else if(this.r.getUserProfile().mUserSettingOption.isPrivacyUser != null && (this.r.getUserProfile().isFollowing == null && !this.r.getUserProfile().mProfile.isUserBanned())){
          str = a1.p(R.string.arg_RES_7f103e67);
       }else if(this.r.getUserProfile().isBlocked != null || this.r.getUserProfile().mIsBlockedByOwner != null){
          str = a1.p(R.string.arg_RES_7f10011a);
       }else if(this.r.getUserProfile().mProfile.isUserBanned()){
          str = a1.p(R.string.arg_RES_7f100359);
       }else {
          str = a1.p(R.string.arg_RES_7f100d28);
       }
       uoa.i(str);
       Object obj1 = PatchProxy.apply(objArray, this, uoe, "80");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          this.r.isDarkModeEnabled();
          if (this.r.getUserProfile().mUserSettingOption.isPrivacyUser != null && (this.r.getUserProfile().isFollowing == null && !this.r.getUserProfile().mProfile.isUserBanned())) {
             i = 0x7f0805f6;
          }else if(this.r.getUserProfile().isBlocked != null || this.r.getUserProfile().mIsBlockedByOwner != null){
             i = 0x7f0813f5;
          }else if(this.r.getUserProfile().mProfile.isUserBanned()){
             i = 0x7f080606;
          }else {
             i = 0x7f080603;
          }
       }
       uoa.k(i);
       uoa.b();
       uoa.a(obj);
       if (y.d(this.getActivity())) {
          obj.setLayoutParams(new RecyclerView$LayoutParams(-1, n.c(a.B, 270.00f)));
       }else {
          obj.getViewTreeObserver().addOnGlobalLayoutListener(new e$b(this, obj));
       }
       return obj;
    }
    public final void c9(String p0,TextView p1,TextView p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "23")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       try{
          int i = 0;
          if (p0.endsWith("Эђ") || p0.endsWith("вк")) {
             p1.setText(p0.substring(i, (p0.length() - 1)));
             p2.setText(p0.substring((p0.length() - 1)));
          }else if(p0.endsWith("+")){
             p1.setText(p0.substring(i, (p0.length() - 2)));
             p2.setText(p0.substring((p0.length() - 2)));
          }else {
             p1.setText(p0);
          }
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, e.class, "82")) {
          return;
       }
       e tx = this.x;
       if (tx != null) {
          tx.a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a2389);
       this.E = m1.f(p0, 0x7f0a238a);
       this.O = m1.f(p0, 0x7f0a23da);
       this.S = m1.f(p0, 0x7f0a2379);
       this.M = m1.f(p0, 0x7f0a237d);
       this.P = m1.f(p0, 0x7f0a2350);
       this.I = m1.f(p0, 0x7f0a2378);
       this.R = m1.f(p0, 0x7f0a2376);
       this.N = m1.f(p0, 0x7f0a23a1);
       this.G = m1.f(p0, 0x7f0a2364);
       this.H = m1.f(p0, 0x7f0a2537);
       this.U = m1.f(p0, 0x7f0a23b4);
       this.J = m1.f(p0, 0x7f0a237a);
       this.X = m1.f(p0, 0x7f0a1f6c);
       this.Y = m1.f(p0, 0x7f0a1f6d);
       this.K = m1.f(p0, 0x7f0a237b);
       this.Q = m1.f(p0, 0x7f0a2377);
       this.F = m1.f(p0, 0x7f0a2365);
       this.L = m1.f(p0, 0x7f0a237c);
       this.T = m1.f(p0, 0x7f0a239d);
       this.V = m1.f(p0, 0x7f0a304a);
       this.C = m1.f(p0, 0x7f0a0923);
       this.W = m1.f(p0, 0x7f0a23b0);
       this.z1 = m1.f(p0, 0x7f0a2385);
       this.A1 = m1.f(p0, 0x7f0a2384);
       this.B1 = m1.f(p0, 0x7f0a2386);
       this.X0 = m1.f(p0, 0x7f0a1f72);
       m1.a(p0, new y0(this), R.id.live_profile_more_button);
       m1.a(p0, new m(this), R.id.live_profile_followed);
       m1.a(p0, new w(this), R.id.live_profile_follow);
       m1.a(p0, new u0(this), R.id.live_profile_send_gift_button);
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, e.class, "55")) {
          return;
       }
       t$a uoa = new t$a(this.p);
       Object[] objArray = new Object[]{this.r.getUserProfile().mProfile.mName};
       uoa.X0(this.p.getString(R.string.arg_RES_7f101ff9, objArray));
       objArray = new Object[]{String.valueOf(((a.a(LiveCommonConfigResponse$AssistantConfig.class).mMaxForbidCommentDurationMs / 1000) / 60))};
       uoa.z0(this.p.getString(R.string.arg_RES_7f102226, objArray));
       uoa.S0(R.string.arg_RES_7f101ff5);
       uoa.Q0(R.string.arg_RES_7f101f00);
       uoa.u0(new s(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public final b$d h9(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "36");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new b$d(p0, l.m(0x7f061dc4, 0x7f061d77));
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(GifshowActivity.class);
       this.q = this.q8(User.class);
       this.s = this.q8(g.class);
       this.r = this.q8(LiveGzoneProfileParams.class);
       this.t = this.q8(Fragment.class);
       this.u = this.s8(o0.class);
       this.v = this.s8(n0.class);
       this.w = this.s8(d.class);
       this.x = this.s8(l0.class);
       this.y = this.s8(LivePlayLogger.class);
       this.z = this.r8("LIVE_PROFILE_REFRESH_SUBJECT");
       this.A = this.r8("LIVE_PROFILE_REFRESHING_STATE_CHANGED_SUBJECT");
       this.B = this.s8(a0.class);
       return;
    }
    public final b$d j9(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new b$d(p0, l.m(0x7f061e06, 0x7f060be7));
    }
    public float k9(CharSequence p0,TextPaint p1,float p2){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), this, e.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       p1.setTextSize(p2);
       return Layout.getDesiredWidth(p0, p1);
    }
    public String l9(){
       Object obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          return this.getActivity().getUrl();
       }
       return "";
    }
    public final boolean m9(){
       Object obj = PatchProxy.apply(null, this, e.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r.getUserProfile() != null && (this.r.getUserProfile().mOwnerCount != null && this.r.getUserProfile().mOwnerCount.mPublicPhoto > null))? true: false;
       return b;
    }
    public boolean n9(UserProfile p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isBlocked == null && (p0.mIsBlockedByOwner == null && (p0.isFollowing != null || (p0.mUserSettingOption.isPrivacyUser == null && !p0.mProfile.isUserBanned())))))? true: false;
       return b;
    }
    public void o9(){
       if (PatchProxy.applyVoid(null, this, e.class, "52")) {
          return;
       }
       t$a uoa = new t$a(this.p);
       Object[] objArray = new Object[]{this.r.getUserProfile().mProfile.mName};
       uoa.X0(this.p.getString(R.string.arg_RES_7f101ff4, objArray));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new t(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
    public void x9(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "79")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_LIVE_PROFILE";
       uElementPack.index = p0;
       HashMap hashMap = new HashMap();
       e tr = this.r;
       int i = (tr == null)? -1: tr.getFollowSource();
       hashMap.put("source", String.valueOf(i));
       uElementPack.params = new Gson().q(hashMap);
       u1.u0(10, uElementPack, null);
       return;
    }
    public void y9(){
       if (PatchProxy.applyVoid(null, this, e.class, "39")) {
          return;
       }
       t$a uoa = new t$a(this.p);
       e tp = this.p;
       int i = (this.r.getTargetUserAssType() == LiveApiParams$AssistantType.ADMIN)? 0x7f101ff6: 0x7f101fec;
       Object[] objArray = new Object[]{this.r.getUserProfile().mProfile.mName};
       uoa.X0(tp.getString(i, objArray));
       uoa.S0(R.string.arg_RES_7f103a83);
       uoa.Q0(R.string.cancel);
       uoa.u0(new u(this));
       uoa.v(1);
       j.d(uoa);
       return;
    }
}
