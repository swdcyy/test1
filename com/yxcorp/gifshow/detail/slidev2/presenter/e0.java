package com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.k2;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import m9a.k;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import b8a.j2;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.Observer;
import zz5.d;
import vy6.a;
import jta.c;
import r7a.f;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import le5.f;
import lnc.a1;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0$d;
import uw9.a;
import com.kwai.framework.model.user.DynamicPendant;
import java.lang.Float;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.graphics.Typeface;
import jb0.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.yxcorp.utility.TextUtils;
import im8.f;
import p1a.a;
import p1a.a$a;
import lnc.i3;
import p5a.b;
import java.lang.Long;
import java.lang.Number;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import b8a.l2;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.c;
import e1a.w;
import com.kwai.framework.model.user.UserVerifiedDetail;
import w85.a;
import java.lang.Math;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public class e0 extends PresenterV2	// class@001900
{
    public PhotoDetailParam A;
    public f B;
    public f C;
    public View$OnClickListener D;
    public BaseFragment E;
    public a F;
    public f G;
    public User H;
    public a I;
    public ImageView J;
    public AvatarInfoResponse K;
    public SlidePlayViewModel L;
    public a M;
    public u N;
    public final Runnable O;
    public String P;
    public GifshowActivity$AnchorPoint Q;
    public final a R;
    public final c S;
    public View p;
    public AvatarWithPendantView q;
    public KwaiImageView r;
    public View s;
    public View t;
    public TextView u;
    public TextView v;
    public View w;
    public TextView x;
    public KwaiImageView y;
    public QPhoto z;
    public static boolean T;

    public void e0(){
       super();
       this.O = new k2(this);
       this.P = "avatar";
       this.Q = GifshowActivity$AnchorPoint.AVATAR;
       this.R = new e0$a(this);
       this.S = new e0$b(this);
    }
    public void E8(){
       e0 uoe0 = e0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe0, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe0, "2") && this.p == null) {
          this.p = k.a(this.getActivity(), this.E, 0x7f0a39b0);
          View view = k.a(this.getActivity(), this.E, R.id.avatar_pendant);
          int i = 0x7f0a10be;
          if (view != null) {
             this.q = view;
             this.r = view.getAvatar();
             this.q.setVisibility(0);
             k.a(this.getActivity(), this.E, i).setVisibility(8);
          }else {
             this.r = k.a(this.getActivity(), this.E, i);
          }
          this.s = k.a(this.getActivity(), this.E, 0x7f0a10c0);
          this.t = k.a(this.getActivity(), this.E, 0x7f0a10bf);
          this.u = k.a(this.getActivity(), this.E, 0x7f0a10c2);
          this.v = k.a(this.getActivity(), this.E, 0x7f0a3280);
          this.J = k.a(this.getActivity(), this.E, 0x7f0a43c6);
          this.w = k.a(this.getActivity(), this.E, 0x7f0a10c3);
          this.W8();
          this.x = k.a(this.getActivity(), this.E, 0x7f0a10c6);
          this.y = k.a(this.getActivity(), this.E, 0x7f0a10bb);
       }
       this.L = SlidePlayViewModel.B0(this.E.getParentFragment());
       d.b(this.z, this.E, new j2(this));
       this.L.P(this.E, this.R);
       this.B.a(this.S);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "4")) {
          return;
       }
       if (this.getContext() != null) {
          DisplayMetrics widthPixels = c.c(this.getContext().getResources()).widthPixels;
          boolean b = (f.o() && widthPixels <= a1.d(0x7f0702ed))? true: false;
          e0.T = b;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "6")) {
          return;
       }
       this.B.c(this.S);
       k1.m(this.O);
       return;
    }
    public void P8(View p0,int p1){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe0, "14")) {
          return;
       }
       if (p0 != null && p0.getVisibility() != p1) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void R8(){
    }
    public void S8(){
       e0 uoe0 = e0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe0, "7")) {
          return;
       }
       g.k(this.r, this.H, HeadImageSize.SMALL);
       this.r.setOnClickListener(new e0$c(this));
       this.x.setOnClickListener(new e0$d(this));
       if (!PatchProxy.applyVoid(objArray, this, uoe0, "9")) {
          uoe0 = this.q;
          if (uoe0 != null) {
             uoe0.r();
             uoe0 = this.I;
             if (uoe0 == null || uoe0.a == null) {
                uoe0 = this.H;
                User mDynamicPend = uoe0.mDynamicPendant;
                User mPendants = uoe0.mPendants;
                if (mDynamicPend != null) {
                   this.q.s(mDynamicPend.getLottieUrl(), mDynamicPend.getWidthRadio().floatValue(), mDynamicPend.getHeightRadio().floatValue());
                }else if(!j.h(mPendants)){
                   this.q.setStaticPendantUrl(mPendants);
                }else {
                   this.q.r();
                }
             }
          }
       }
       return;
    }
    public boolean V8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e0 uoe0 = e0.class;
       Object obj = PatchProxy.apply(null, this, uoe0, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.E instanceof GrootBaseFragment) {
          Object obj1 = PatchProxy.apply(null, this, uoe0, "12");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.L.M(this.z) == -1){
             if (this.L.t() == this.E) {
             label_0040 :
                b1 = true;
             }
          }else if(this.L.M(this.z) == this.L.j()){
             goto label_0040 ;
          }
          b1 = false;
          if (b1) {
             b = false;
          }
       }
       return b;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "3")) {
          return;
       }
       e0 tu = this.u;
       if (tu != null) {
          tu.setTypeface(a.c(this.getContext()));
       }
       return;
    }
    public void X8(){
    }
    public void Y8(String p0){
       e0 uoe0 = e0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe0, "15")) {
          return;
       }
       if (k.B(this.z) != null) {
          PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.THIRD_PLATFORM};
          if (k.B(this.z).isAdGroup(uAdGroupArra)) {
             return;
          }
       }
       GifshowActivity activity = this.getActivity();
       activity.m3(this.P);
       activity.n3(this.Q);
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       e0 tK = this.K;
       if (tK != null) {
          AvatarInfoResponse mPhoto = tK.mPhoto;
          if (mPhoto != null) {
             liveStreamPa.identity = TextUtils.k(mPhoto.getLiveStreamId());
          }
       }
       a uoa = this.C.get();
       String str = "click_head";
       int i = (str.equals(p0))? 810: 884;
       a$a uoa1 = a$a.a(i, p0);
       uoa1.n(2);
       String str1 = PatchProxy.applyOneRefs(p0, this, uoe0, "16");
       if (str1 != PatchProxyResult.class) {
       }else {
          i3 oi3 = i3.f();
          oi3.c("photo_duration", Long.valueOf(b.e(this.z)));
          String str2 = (!this.s.getVisibility())? "1": "0";
          oi3.d("live_tag", str2);
          p0 = (str.equals(p0))? "head_position": "location";
          oi3.d(p0, "BOTTOM_BAR");
          str1 = oi3.e();
       }
       uoa1.m(str1);
       uoa1.l(liveStreamPa);
       uoa1.g(a.b(this.A.mPhoto));
       uoa.a(uoa1);
       Kgi.c(new l2(this));
       e0 tA = this.A;
       c.a(this.getActivity(), tA.mPhoto, tA.getDetailCommonParam().getPreInfo(), this.A.mPhotoIndex, true, this.D);
       k1.m(this.O);
       k1.r(this.O, 1200);
       return;
    }
    public void Z8(AvatarInfoResponse p0){
       e0 tq;
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "10")) {
          return;
       }
       if (this.V8()) {
          return;
       }
       Boolean uBoolean = 1;
       int i = 8;
       if (p0.mType == uBoolean) {
          tq = this.q;
          if (tq != null) {
             tq.o();
          }
          this.s.setVisibility(0);
          this.t.setVisibility(0);
          this.J.setVisibility(i);
          this.G.set(Boolean.TRUE);
       }else {
          tq = this.q;
          if (tq != null) {
             tq.u();
          }
          this.s.setVisibility(i);
          this.t.setVisibility(i);
          this.G.set(Boolean.FALSE);
          tq = this.H;
          e0 tJ = this.J;
          if (!PatchProxy.isSupport(w.class) || !PatchProxy.applyVoidThreeRefs(tq, tJ, Boolean.TRUE, null, w.class, "1")) {
             User mVerifiedDet = tq.mVerifiedDetail;
             if (mVerifiedDet == null) {
                tJ.setVisibility(i);
             }else {
                UserVerifiedDetail mIconType = mVerifiedDet.mIconType;
                if (mIconType != uBoolean) {
                   if (mIconType != 2) {
                      if (mIconType != 3) {
                         tJ.setVisibility(i);
                      }else {
                         tJ.setImageResource(R.drawable.arg_RES_7f080a74);
                         tJ.setVisibility(0);
                      }
                   }else {
                      tJ.setImageResource(R.drawable.arg_RES_7f080a73);
                      tJ.setVisibility(0);
                   }
                }else {
                   tJ.setImageResource(R.drawable.arg_RES_7f080a75);
                   tJ.setVisibility(0);
                }
             }
          }
       }
       this.K = p0;
       if (this.u != null) {
          tq = this.F;
          if (tq != null && (!tq.k() && this.F.m() != null)) {
             this.u.setText(TextUtils.N((long)Math.max(0, this.F.m().intValue())));
          }else {
             this.u.setText(TextUtils.N((long)Math.max(0, p0.mPhotoCount)));
          }
       }
       tq = this.w;
       if (tq != null) {
          RelativeLayout$LayoutParams layoutParams = tq.getLayoutParams();
          if (p0.mPhotoCount < 1000) {
             layoutParams.removeRule(11);
             layoutParams.addRule(14);
             layoutParams.setMargins(0, 0, 0, a1.e(18.00f));
          }else {
             layoutParams.removeRule(14);
             layoutParams.addRule(11);
             layoutParams.setMargins(0, 0, a1.e(5.00f), a1.e(18.00f));
          }
          this.w.setLayoutParams(layoutParams);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       this.z = this.q8(QPhoto.class);
       this.A = this.q8(PhotoDetailParam.class);
       this.B = this.r8("NASA_SIDEBAR_STATUS");
       this.C = this.x8("LOG_LISTENER");
       this.E = this.r8("DETAIL_FRAGMENT");
       this.F = this.q8(a.class);
       this.G = this.x8("AVATAR_LIVE_STATUS");
       this.H = this.q8(User.class);
       this.I = this.q8(a.class);
       this.N = this.q8(u.class);
       return;
    }
}
