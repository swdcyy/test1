package com.kwai.live.gzone.promotion.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.util.ArrayList;
import s67.t;
import s67.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.promotion.LiveGzonePromotionGameRecyclerFragment$a;
import y8c.d;
import android.view.View;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameResource;
import t67.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import y43.a;
import m67.c0;
import s67.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import s67.i1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import s67.x;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import android.app.Activity;
import d61.y;
import com.kwai.live.gzone.promotion.l;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import s67.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import s0d.f;
import s0d.e;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import java.lang.StringBuilder;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame$ExtraDesc;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame$ExtraDescUrl;
import com.kwai.live.gzone.promotion.d$a;
import com.kwai.live.gzone.promotion.d$b;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.ref.WeakReference;
import mq5.h;
import mq5.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.c;
import brd.t;
import t45.d;
import brd.z;
import s67.u;
import erd.g;
import s67.v;
import crd.b;
import wl9.d;
import s67.w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import kq3.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import os5.h;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.gzone.widget.LiveGzoneDownloadProgressView;
import java.util.Objects;
import ekd.m1;
import com.kwai.live.gzone.promotion.a;
import com.yxcorp.gifshow.image.KwaiImageView;

public class d extends PresenterV2	// class@000dbe
{
    public RecyclerView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public KwaiImageView F;
    public View G;
    public TextView H;
    public TextView I;
    public KwaiDialogFragment J;
    public c K;
    public c L;
    public List M;
    public a N;
    public c O;
    public h P;
    public boolean p;
    public a q;
    public e r;
    public d s;
    public LiveGzonePromotionGameRecyclerFragment$a t;
    public View u;
    public KwaiFixedSimpleDraweeView v;
    public TextView w;
    public LiveGzoneDownloadProgressView x;
    public List y;
    public TextView z;
    public static final int Q;

    static {
       d.Q = a1.e(8.00f);
    }
    public void d(){
       super();
       this.y = new ArrayList();
       this.O = new t(this);
       this.P = new r(this);
    }
    public void E8(){
       int i1;
       d uod1;
       RxBus f;
       float f1;
       int i3;
       int c;
       int i4;
       int q;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       int i = 1;
       if ((this.t.V1() + i) == this.s.get()) {
          this.u.setVisibility(4);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          if (q.f(this.M)) {
             this.G.setVisibility(8);
          }else {
             Iterator iterator = this.M.iterator();
             Object[] objArray1 = objArray;
             while (iterator.hasNext()) {
                LiveGzonePromotionGameResource liveGzonePro = iterator.next();
                if (TextUtils.n(this.q.b, liveGzonePro.mGameId)) {
                   objArray1 = liveGzonePro;
                }
             }
             if (objArray1 == null || !this.N.Y0.P0(objArray1.mLinkUrl)) {
                this.G.setVisibility(8);
             }else {
                this.G.setVisibility(0);
                uod1 = this.q;
                a b = uod1.b;
                String str = uod1.a();
                ClientContent$LiveStreamPackage liveStreamPa = this.r.e.a();
                if (!PatchProxy.applyVoidThreeRefs(b, str, liveStreamPa, null, i1.class, "21")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "PROP_SELL_ENTRY";
                   i3 oi3 = i3.f();
                   oi3.d("game_name", str);
                   oi3.d("game_id", b);
                   uElementPack.params = oi3.e();
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   u1.u0(6, uElementPack, uContentPack);
                }
                if (!PatchProxy.applyVoidOneRefs(objArray1, this, uod, "5")) {
                   this.F.U(objArray1.mIcons);
                   this.H.setText(objArray1.mResourceText);
                   this.I.setText(objArray1.mButtonText);
                   this.G.setOnClickListener(new x(this, objArray1));
                }
             }
          }
       }
       i1 = 3;
       if (!PatchProxy.applyVoid(objArray, this, uod, "10")) {
          if (("VERTICAL").equals(this.q.c.mGameBannerDisplayDirection)) {
             f1 = 0x3f100000;
             i3 = 3;
          }else {
             f1 = 0x3fe38e39;
             i3 = 2;
          }
          float f2 = 17.00f;
          if (y.d(this.getActivity())) {
             c = l.C;
             i4 = a1.e(12.00f);
          }else {
             c = n.k(this.getActivity());
             i4 = a1.e(f2);
          }
          q = d.Q;
          c = ((c - (i4 * 2)) - ((i3 - 1) * q)) / i3;
          this.A.getLayoutParams().height = (int)((float)c / f1);
          if (this.K == null) {
             this.K = new c(c);
             this.A.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
             this.A.addItemDecoration(new b(0, 0, a1.e(f2), q));
          }
          this.K.W0(this.q.c.mPromotionGameBanners);
          this.A.setAdapter(this.K);
          this.K.k0();
       }
       uod1 = this.v.g0(objArray, objArray, f.x().r(this.q.c.mGameIcons).w());
       if (uod1 != null) {
          uod1.q(i);
          this.v.setController(uod1.e());
       }
       this.w.setText(this.q.c.mGameName);
       this.z.setText(this.q.c.mGameDescription);
       LiveGzonePromotionGame mExtraDescs = this.q.c.mExtraDescs;
       if (mExtraDescs != null && mExtraDescs.size() >= 2) {
          this.B.setText(this.q.c.mExtraDescs.get(0).mTitle+": "+this.q.c.mExtraDescs.get(0).mDesc);
          this.C.setText(this.q.c.mExtraDescs.get(i).mTitle+": "+this.q.c.mExtraDescs.get(i).mDesc);
          this.B.setVisibility(0);
          this.C.setVisibility(0);
       }else {
          this.B.setVisibility(8);
          this.C.setVisibility(8);
       }
       mExtraDescs = this.q.c.mExtraDescUrls;
       if (mExtraDescs != null && mExtraDescs.size() >= 2) {
          this.D.setText(this.q.c.mExtraDescUrls.get(0).mTitle);
          this.D.setOnClickListener(new d$a(this));
          this.E.setText(this.q.c.mExtraDescUrls.get(i).mTitle);
          this.E.setOnClickListener(new d$b(this));
          this.D.setVisibility(0);
          this.E.setVisibility(0);
       }else {
          this.D.setVisibility(8);
          this.E.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          if (y.d(this.getActivity())) {
             i1 = 2;
          }
          int i2 = 0;
          while (i2 < this.y.size()) {
             if (i2 < this.q.c.mGameTags.size() && (i2 < i1 && !TextUtils.x(this.q.c.mGameTags.get(i2)))) {
                this.y.get(i2).setVisibility(0);
                this.y.get(i2).setText(this.q.c.mGameTags.get(i2));
             }else {
                this.y.get(i2).setVisibility(8);
             }
             i2 = i2 + 1;
          }
       }
       this.V8(d.a(-1986139969).getGameCenterDownloadInfoByGameId(this.q.c.mGameId));
       d.a(-1986139969).registerGlobalDownloadListener(String.valueOf(this.hashCode()), new WeakReference(this.O));
       this.r.g.Km(this.P);
       f = RxBus.f;
       z a = d.a;
       f.f(c.class).observeOn(a).doOnSubscribe(new u(this)).subscribe(new v(this));
       f.f(d.class).observeOn(a).doOnSubscribe(new u(this)).subscribe(new w(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "7")) {
          return;
       }
       this.r.g.le(this.P);
       this.R8();
       this.A.setAdapter(objArray);
       d.a(-1986139969).unregisterGlobalDownloadListener(String.valueOf(this.hashCode()));
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       d tJ = this.J;
       if (tJ != null && tJ.isAdded()) {
          this.J.dismissAllowingStateLoss();
          this.J = null;
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "15")) {
          return;
       }
       d tL = this.L;
       if (tL != null) {
          tL.q(0);
          this.L = null;
       }
       return;
    }
    public void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       this.P8();
       GifshowActivity activity = this.getActivity();
       if (!a1.i(activity) || (!this.r.e.b().isAdded() || (this.r.e.b().getFragmentManager() != null && !TextUtils.x(p0)))) {
          int i = (!y.d(activity))? (int)((float)n.j(activity) * 0x3f19999a): 0;
          a uoa = a.b(activity);
          uoa.c = activity.getSupportFragmentManager();
          uoa.g("live-game-promotion-detail-dialog");
          uoa.f("live-game-promotion-detail-fragment");
          uoa.b.setPortraitHeightPixel(i).setLayoutType("3").setInOutAnimation(0).setDimAmount(0);
          this.J = d.a(0x2cb5d4a8).pu(p0, uoa);
       }
    label_0088 :
       return;
    }
    public final void V8(GameCenterDownloadParams$DownloadInfo p0){
       d tx;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       int i = 0x7f103c08;
       int i1 = 0x7f101144;
       int i2 = 100;
       if (p0 == null) {
          tx = this.x;
          str = (SystemUtil.M(this.getActivity(), this.q.c.mIdentifier))? a1.p(i): a1.p(i1);
          tx.setText(str);
          this.x.setBackgroundProgress(i2);
       }else {
          GameCenterDownloadParams$DownloadInfo mStage = p0.mStage;
          Objects.requireNonNull(mStage);
          int i3 = -1;
          switch (mStage.hashCode()){
              case 0xae7a2e7a:
                if (mStage.equals("cancel")) {
                   i3 = 0;
                }
                break;
              case 0xc454c22d:
                if (mStage.equals("progress")) {
                   i3 = 1;
                }
                break;
              case 0xc84dc82d:
                if (mStage.equals("resume")) {
                   i3 = 2;
                }
                break;
              case 0xdc453139:
                if (mStage.equals("complete")) {
                   i3 = 3;
                }
                break;
              case 0x379175:
                if (mStage.equals("wait")) {
                   i3 = 4;
                }
                break;
              case 0x5c4d208:
                if (mStage.equals("error")) {
                   i3 = 5;
                }
                break;
              case 0x65825f6:
                if (mStage.equals("pause")) {
                   i3 = 6;
                }
                break;
              case 0x68ac462:
                if (mStage.equals("start")) {
                   i3 = 7;
                }
                break;
              default:
          }
          switch (i3){
              case 0:
                this.x.setBackgroundProgress(i2);
                this.x.setText(a1.p(i1));
                break;
              case 1:
              case 7:
              case 2:
                this.x.setBackgroundProgress(p0.getPercent());
                this.x.setText(p0.getPercent()+"%");
                break;
              case 3:
                this.x.setBackgroundProgress(i2);
                tx = this.x;
                str = (SystemUtil.M(this.getActivity(), this.q.c.mIdentifier))? a1.p(i): a1.p(R.string.arg_RES_7f101174);
                tx.setText(str);
                break;
              case 4:
              case 6:
              case 5:
                this.x.setBackgroundProgress(p0.getPercent());
                this.x.setText(a1.p(R.string.arg_RES_7f100aac));
                break;
              default:
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1e49);
       this.v = m1.f(p0, 0x7f0a1e47);
       this.w = m1.f(p0, 0x7f0a1e4a);
       this.y.add(m1.f(p0, R.id.live_gzone_audience_game_promotion_tag1_text_view));
       this.y.add(m1.f(p0, R.id.live_gzone_audience_game_promotion_tag2_text_view));
       this.y.add(m1.f(p0, R.id.live_gzone_audience_game_promotion_tag3_text_view));
       this.x = m1.f(p0, 0x7f0a1e46);
       this.z = m1.f(p0, 0x7f0a1e42);
       this.A = m1.f(p0, 0x7f0a1e40);
       m1.a(p0, new a(this), R.id.live_gzone_audience_game_promotion_download_progress_view);
       this.B = m1.f(p0, 0x7f0a1e4f);
       this.C = m1.f(p0, 0x7f0a1e53);
       this.D = m1.f(p0, 0x7f0a1e4b);
       this.E = m1.f(p0, 0x7f0a1e4c);
       this.G = m1.f(p0, 0x7f0a1201);
       this.F = m1.f(p0, 0x7f0a1217);
       this.H = m1.f(p0, 0x7f0a1218);
       this.I = m1.f(p0, 0x7f0a1216);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.q8(e.class);
       this.s = this.r8("ADAPTER_POSITION_GETTER");
       this.t = this.r8("DETAIL_PAGE_LIST");
       this.M = this.t8("GZONE_PROMOTION_RESOURCE");
       this.N = this.q8(a.class);
       return;
    }
}
