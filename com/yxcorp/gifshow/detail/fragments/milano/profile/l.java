package com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import z0a.d0;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l$b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l$c;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l$d;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import ef5.a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import tw6.c;
import jta.c;
import rf5.u;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import z0a.a0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import bf5.q;
import z0a.b0;
import qvb.q;
import qvb.a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import c95.c;
import qvb.n0;
import kp.r1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.text.TextPaint;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import jp.a;
import ub.b;
import com.yxcorp.image.callercontext.a;
import jd.c;
import wb5.g;
import z0a.z;
import android.view.View$OnClickListener;
import z0a.e0;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k2b.e0;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l$f;
import p1a.a$a;
import i0a.d;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import os5.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import mxb.j0;
import mxb.i0;
import z0a.c0;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ef5.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class l extends PresenterV2	// class@00155a
{
    public c A;
    public SlidePlayViewModel B;
    public boolean C;
    public QPhoto D;
    public boolean E;
    public boolean F;
    public a G;
    public q H;
    public final Runnable I;
    public final RecyclerView$r J;
    public final c K;
    public final b L;
    public final c M;
    public final q N;
    public ViewGroup p;
    public RecyclerView q;
    public View r;
    public MilanoContainerEventBus s;
    public int t;
    public BaseFragment u;
    public QPhoto v;
    public u w;
    public boolean x;
    public PhotoDetailParam y;
    public c z;
    public static final int O;

    static {
       l.O = a1.e(38.00f);
    }
    public void l(){
       super();
       this.I = new d0(this);
       this.J = new l$a(this);
       this.K = new l$b(this);
       this.L = new l$c(this);
       this.M = new l$d(this);
       this.N = new l$e(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "3")) {
          return;
       }
       this.B = SlidePlayViewModel.B0(this.u);
       this.A.a(this.L);
       this.q.addOnScrollListener(this.J);
       this.B.N(this.K);
       this.F = false;
       this.w.j(this.M);
       this.D = objArray;
       this.x = false;
       g e = Functions.e;
       this.X7(this.s.y.subscribe(new a0(this), e));
       this.X7(this.H.u.subscribe(new b0(this), e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       l tG = this.G;
       if (tG != null) {
          tG.f(this.N);
       }
       this.w.B(this.M);
       this.q.removeOnScrollListener(this.J);
       this.B.s0(this.K);
       k1.m(this.I);
       return;
    }
    public ClientContent$LiveStreamPackage P8(QPhoto p0){
       ClientContent$LiveStreamPackage obj = PatchProxy.applyOneRefs(p0, this, l.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$LiveStreamPackage();
       obj.identity = TextUtils.k(p0.getLiveStreamId());
       return obj;
    }
    public ClientContent$PhotoPackage R8(QPhoto p0){
       ClientContent$PhotoPackage obj = PatchProxy.applyOneRefs(p0, this, l.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = w1.f(p0.mEntity);
       obj.index = 1;
       int i = (p0.isLiveStream())? 2: 1;
       obj.type = i;
       return obj;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       int i = 0;
       if (this.B.r()) {
          l tz = this.z;
          if (tz.l != null) {
             if (tz.g != null) {
                tz = this.B;
                if (this.G.getCount() > 0 && r1.S2(this.G.getItem(i).mEntity)) {
                   i = true;
                }
                tz.O1(i);
             }else {
                QPhoto qPhoto = this.B.k0(i);
                l tB = this.B;
                if (qPhoto != null && r1.S2(qPhoto.mEntity)) {
                   i = true;
                }
                tB.O1(i);
             }
          }else {
          label_0056 :
             this.B.O1(i);
          }
       }else {
          goto label_0056 ;
       }
       return;
    }
    public void V8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       if (this.C != null && this.p.getChildCount() <= 0) {
          this.D = p0;
          p0.setPosition(0);
          this.X8(a1.d(R.dimen.arg_RES_7f070a83));
          a.k(this.p, R.layout.arg_RES_7f0d1046, true);
          this.p.findViewById(R.id.slide_profile_feed_live_text).getPaint().setFakeBoldText(true);
          this.p.findViewById(R.id.slide_profile_feed_live_icon).setBackgroundResource(R.drawable.arg_RES_7f08204f);
          this.p.findViewById(R.id.slide_profile_feed_live_container).setVisibility(0);
          View view = this.p.findViewById(R.id.slide_play_item_container);
          g.B(view.findViewById(R.id.slide_profile_feed_cover), p0.mEntity, a.d, null, null, null, a1.a(R.color.arg_RES_7f061ed1));
          view.setOnClickListener(new z(this, p0));
          this.p.post(new e0(this));
       }
       return;
    }
    public final void W8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "9")) {
          return;
       }
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          return;
       }
       if (p0.getLivePlayConfig() == null) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("live getLivePlayConfig null"));
          return;
       }else if(this.B.t() instanceof e0){
          l$f uof = new l$f(this, 1, 0, "CLICK_FEED_LIVE", p0);
          v8.f("CLICK_FEED_LIVE");
          v8.k(p0.getKsOrderId());
          d.a(this.B.t(), p0, v8);
       }
       d.a(-1638991736).Tq(p0.mEntity);
       f.m(p0.getUser(), p0.getUser().mFollowStatus);
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.j(p0.mEntity);
       int i = (r1.Q2(this.v))? 286: 226;
       uoa.g(i);
       uoa.d(p0.getPosition());
       d.a(-1492894991).m1(activity, uoa.a());
       l tv = this.v;
       if (tv != null && k.B(tv) != null) {
          tv = this.v;
          if (tv.mEntity != null && TextUtils.n(tv.getUserId(), p0.getUserId())) {
             i0.a().e(124, this.v.mEntity).d(new c0(p0)).a();
          }
       }
       k1.m(this.I);
       k1.r(this.I, 1200);
       return;
    }
    public void X8(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "6")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.q.getLayoutParams();
       layoutParams.topMargin = p0;
       this.q.setLayoutParams(layoutParams);
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       l tt = this.t;
       int o = l.O;
       if (tt > o) {
          this.r.setAlpha(0x3f800000);
       }else {
          this.r.setAlpha((((float)tt * 0x3f800000) / (float)o));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a327e);
       this.q = m1.f(p0, 0x7f0a32a9);
       this.r = m1.f(p0, 0x7f0a327f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.u = this.r8("FRAGMENT");
       this.s = this.q8(MilanoContainerEventBus.class);
       this.A = this.r8("MILANO_ATTACH_LISTENER");
       this.z = this.q8(c.class);
       this.w = this.q8(u.class);
       this.H = this.q8(q.class);
       this.y = this.s8(PhotoDetailParam.class);
       return;
    }
}
