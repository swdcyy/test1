package com.yxcorp.gifshow.homepage.presenter.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import yta.h2;
import erd.g;
import crd.b;
import eda.l;
import yta.g2;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import eda.f;
import yta.b2;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.yxcorp.gifshow.homepage.presenter.y;
import ok.h;
import lnc.b9;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import kp.r1;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil;
import java.util.Objects;
import qrd.p;
import im8.f;
import java.lang.Integer;
import java.util.Set;
import android.view.animation.TranslateAnimation;
import l2.b;
import android.view.animation.Interpolator;
import android.view.animation.Animation;
import android.view.View;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.yxcorp.gifshow.homepage.presenter.w;
import android.view.View$OnLongClickListener;
import com.kwai.component.photo.reduce.g;
import yta.d2;
import yta.e2;
import android.app.Activity;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import java.util.Collection;
import ekd.q;
import yta.c2;
import xl8.b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.util.List;
import yf5.l0$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import yf5.l0;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.homepage.presenter.x;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import com.kwai.component.photo.reduce.f;
import com.kwai.framework.model.channel.HotChannel;
import com.kuaishou.android.model.mix.CommonMeta;

public class z extends PresenterV2	// class@0017ef
{
    public HotChannel A;
    public Boolean B;
    public b C;
    public PhotoItemViewParam D;
    public final int E;
    public View F;
    public boolean G;
    public b H;
    public c I;
    public View p;
    public RecyclerFragment q;
    public f r;
    public BaseFeed s;
    public QPhoto t;
    public PhotoMeta u;
    public f v;
    public f w;
    public VideoQualityInfo x;
    public f y;
    public CommonMeta z;

    public void z(int p0){
       super();
       this.E = p0;
    }
    public void E8(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "4")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new h2(this)));
       t ot = f.g(l.class, mAIN);
       this.X7(ot.subscribe(new g2(this)));
       if (HomeCardExperimentUtil.h.a()) {
          this.X7(f.f(f.class).subscribe(new b2(this)));
       }
       z tD = this.D;
       if (tD == null || (tD.mIsAcquaintance != null && !PatchProxy.applyVoid(objArray, this, oz, "6"))) {
          this.X7(b9.c(this.H, new y(this)));
       }
    label_006f :
       int b = d.a(-1694791652).zT(new QPhoto(this.s));
       this.G = b;
       int i = 1;
       if (!b && !QCurrentUser.ME.isLogined()) {
          TranslateAnimation obj = PatchProxy.apply(objArray, this, oz, "5");
          b = (obj != patchProxyRe)? obj.booleanValue(): this.t.isLiveStream() ^ i;
          if (b) {
          label_00a8 :
             if (!r1.b3(this.s)) {
                Set obj1 = PatchProxy.apply(objArray, this, oz, "16");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   HomeCardExperimentUtil e = HomeCardExperimentUtil.e;
                   Objects.requireNonNull(e);
                   Boolean uBoolean = PatchProxy.apply(objArray, e, HomeCardExperimentUtil.class, "1");
                   if (uBoolean == patchProxyRe) {
                      uBoolean = HomeCardExperimentUtil.a.getValue();
                   }
                   if (!uBoolean.booleanValue() || !r1.z2(this.t)) {
                      i = 0;
                   }
                   b1 = i;
                }
                if (!b1) {
                   this.P8();
                label_00f2 :
                   b1 = this.r.get().intValue();
                   if (this.E != 9) {
                      oz = this.v;
                      if (oz == null || (oz.get() != null && this.w != null)) {
                         obj1 = this.v.get();
                         if (!obj1.contains(Integer.valueOf(b1))) {
                            return;
                         }else {
                            obj = new TranslateAnimation(0, 0, (float)this.w.get().intValue(), 0);
                            obj.setDuration(300);
                            obj.setInterpolator(new b());
                            this.F.startAnimation(obj);
                            obj1.remove(Integer.valueOf(b1));
                         }
                      }
                   }
                   return;
                }
             }
          }
       }else {
          goto label_00a8 ;
       }
    label_00ef :
       this.S8();
       goto label_00f2 ;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       this.F = this.m8();
       View view = this.m8().findViewById(R.id.subject);
       this.p = view;
       if (view == null) {
          this.p = this.m8().findViewById(0x7f0a3641);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, z.class, "8")) {
          return;
       }
       if (VisitorModeManager.f()) {
          return;
       }
       if (this.G != null) {
          this.F.setOnLongClickListener(new w(this));
          return;
       }else if(g.f(this.E) || (this.A == null || (this.E == null || Boolean.TRUE.equals(this.B)))){
          this.F.setOnLongClickListener(new e2(this));
       }else if(this.E == 16){
          this.F.setOnLongClickListener(new d2(this));
       }
       return;
    }
    public final boolean R8(boolean p0,boolean p1){
       View obj;
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oz, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.getActivity() == null) {
          return b;
       }else {
          FeedNegativeFeedback uFeedNegativ = g.d(this.t, p1, b);
          if (uFeedNegativ == null || q.f(uFeedNegativ.mPhotoNegative)) {
             return b;
          }else {
             obj = this.F.findViewById(R.id.container);
             if (obj == null) {
                obj = this.F.findViewById(R.id.player_cover);
             }
             c2 uoc2 = new c2(this);
             z tC = this.C;
             FeedNegativeFeedback uFeedNegativ1 = null;
             PopupInterface$h oh = (tC == null)? uFeedNegativ1: tC.a();
             List list = g.e(uFeedNegativ.mPhotoNegativeHeader, R.string.arg_RES_7f1038d6);
             List list1 = g.e(uFeedNegativ.mPhotoContentNegativeHeader, R.string.arg_RES_7f1038d5);
             l0$a uoa = new l0$a(this.t).j(obj);
             if (p0) {
                uFeedNegativ1 = uFeedNegativ.mPhotoInterestAdjust;
             }
             uoa.k = uFeedNegativ1;
             l0$a uoa1 = uoa.h(uFeedNegativ.mPhotoNegative);
             uoa1.e(uFeedNegativ.mPhotoContentNegative);
             uoa1 = uoa1.g(list);
             uoa1.d(list1);
             uoa1.c(uoc2);
             uoa1.k(oh);
             uoa1.i(this.E);
             uoa1 = uoa1.b(this.getActivity());
             uoa1.f(this.q);
             this.I = g.j(uoa1.a());
             return true;
          }
       }
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, z.class, "10")) {
          return;
       }
       this.F.setOnLongClickListener(x.b);
       this.F.setOnTouchListener(null);
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, z.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.x8("ADAPTER_POSITION");
       this.s = this.r8("feed");
       this.t = this.q8(QPhoto.class);
       this.u = this.s8(PhotoMeta.class);
       this.v = this.w8("ANIMATE_POSITION");
       this.w = this.w8("TRANSLATE_DISTANCE");
       this.x = this.s8(VideoQualityInfo.class);
       this.y = this.s8(f.class);
       this.A = this.t8("feed_channel");
       this.B = this.v8("DETAIL_RECOMMEND_PHOTO_TAG", Boolean.class);
       this.C = this.t8("HOME_POPUP_VISIBILITY_LISTENER");
       this.D = this.t8("FEED_ITEM_VIEW_PARAM");
       this.z = this.q8(CommonMeta.class);
       return;
    }
}
