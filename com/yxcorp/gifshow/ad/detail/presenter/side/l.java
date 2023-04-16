package com.yxcorp.gifshow.ad.detail.presenter.side.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g19.j0;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import com.yxcorp.gifshow.ad.detail.presenter.side.l$a;
import com.yxcorp.gifshow.ad.detail.presenter.side.l$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import g59.m;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import g19.i0;
import androidx.lifecycle.Observer;
import zz5.d;
import vy6.a;
import jta.c;
import g19.l;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.SideWindowInfo;
import mxb.c;
import java.lang.Boolean;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.content.Context;
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
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import az6.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.c;
import g19.r0;
import com.kwai.framework.model.user.UserVerifiedDetail;
import w85.a;
import java.lang.Math;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public class l extends PresenterV2	// class@0016b6
{
    public PhotoDetailParam A;
    public l B;
    public f C;
    public View$OnClickListener D;
    public BaseFragment E;
    public a F;
    public f G;
    public User H;
    public ImageView I;
    public AvatarInfoResponse J;
    public SlidePlayViewModel K;
    public a L;
    public u M;
    public final Runnable N;
    public String O;
    public GifshowActivity$AnchorPoint P;
    public final a Q;
    public final c R;
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

    public void l(){
       super();
       this.N = new j0(this);
       this.O = "avatar";
       this.P = GifshowActivity$AnchorPoint.AVATAR;
       this.Q = new l$a(this);
       this.R = new l$b(this);
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "2") && this.p == null) {
          this.p = m.a(this.getActivity(), this.E, 0x7f0a39b0);
          View view = m.a(this.getActivity(), this.E, R.id.avatar_pendant);
          int i = 0x7f0a10be;
          if (view != null) {
             this.q = view;
             this.r = view.getAvatar();
             this.q.setVisibility(0);
             m.a(this.getActivity(), this.E, i).setVisibility(8);
          }else {
             this.r = m.a(this.getActivity(), this.E, i);
          }
          this.s = m.a(this.getActivity(), this.E, 0x7f0a10c0);
          this.t = m.a(this.getActivity(), this.E, 0x7f0a10bf);
          this.u = m.a(this.getActivity(), this.E, 0x7f0a10c2);
          this.v = m.a(this.getActivity(), this.E, 0x7f0a3280);
          this.I = m.a(this.getActivity(), this.E, 0x7f0a43c6);
          this.w = m.a(this.getActivity(), this.E, 0x7f0a10c3);
          this.W8();
          this.x = m.a(this.getActivity(), this.E, 0x7f0a10c6);
          this.y = m.a(this.getActivity(), this.E, 0x7f0a10bb);
       }
       this.K = SlidePlayViewModel.B0(this.E.getParentFragment());
       if (!PatchProxy.applyVoid(objArray, this, ol, "9")) {
          if (this.getPhoto() == this.z) {
             d.b(this.getPhoto(), this.E, new i0(this));
          }else {
             Fragment parentFragme = this.E.getParentFragment();
             if (parentFragme != null) {
                d.b(this.getPhoto(), parentFragme, new i0(this));
             }
          }
       }
       this.K.P(this.E, this.Q);
       this.B.a(this.R);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       this.B.c(this.R);
       k1.m(this.N);
       return;
    }
    public void P8(View p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol, "14")) {
          return;
       }
       if (p0 != null && p0.getVisibility() != p1) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void R8(){
    }
    public User S8(){
       SideWindowInfo obj = PatchProxy.apply(null, this, l.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.J(this.z);
       if (obj != null) {
          SideWindowInfo mSidePhoto = obj.mSidePhoto;
          if (mSidePhoto != null && mSidePhoto.getUser() != null) {
             return obj.mSidePhoto.getUser();
          }
       }
       return this.H;
    }
    public boolean V8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       Object obj = PatchProxy.apply(null, this, ol, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.E instanceof GrootBaseFragment) {
          Object obj1 = PatchProxy.apply(null, this, ol, "12");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.K.M(this.z) == -1){
             if (this.K.t() == this.E) {
             label_0040 :
                b1 = true;
             }
          }else if(this.K.M(this.z) == this.K.j()){
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
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       l tu = this.u;
       if (tu != null) {
          tu.setTypeface(a.c(this.getContext()));
       }
       return;
    }
    public void X8(){
    }
    public void Y8(String p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "15")) {
          return;
       }
       if (k.B(this.getPhoto()) != null) {
          PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.THIRD_PLATFORM};
          if (k.B(this.getPhoto()).isAdGroup(uAdGroupArra)) {
             return;
          }
       }
       GifshowActivity activity = this.getActivity();
       activity.m3(this.O);
       activity.n3(this.P);
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       l tJ = this.J;
       if (tJ != null) {
          AvatarInfoResponse mPhoto = tJ.mPhoto;
          if (mPhoto != null) {
             liveStreamPa.identity = TextUtils.k(mPhoto.getLiveStreamId());
          }
       }
       a uoa = this.C.get();
       String str = "click_head";
       int i = (str.equals(p0))? 810: 884;
       a$a uoa1 = a$a.a(i, p0);
       uoa1.n(2);
       String str1 = PatchProxy.applyOneRefs(p0, this, ol, "16");
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
       uoa1.g(a.b(this.getPhoto()));
       uoa.a(uoa1);
       c.a(this.getActivity(), this.getPhoto(), this.A.getDetailCommonParam().getPreInfo(), this.A.mPhotoIndex, true, this.D);
       k1.m(this.N);
       k1.r(this.N, 1200);
       return;
    }
    public void Z8(AvatarInfoResponse p0){
       l tq;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "10")) {
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
          this.I.setVisibility(i);
          this.G.set(Boolean.TRUE);
       }else {
          tq = this.q;
          if (tq != null) {
             tq.u();
          }
          this.s.setVisibility(i);
          this.t.setVisibility(i);
          this.G.set(Boolean.FALSE);
          User user = this.S8();
          l tI = this.I;
          if (!PatchProxy.isSupport(r0.class) || !PatchProxy.applyVoidThreeRefs(user, tI, Boolean.TRUE, null, r0.class, "1")) {
             user = user.mVerifiedDetail;
             if (user == null) {
                tI.setVisibility(i);
             }else {
                UserVerifiedDetail mIconType = user.mIconType;
                if (mIconType != uBoolean) {
                   if (mIconType != 2) {
                      if (mIconType != 3) {
                         tI.setVisibility(i);
                      }else {
                         tI.setImageResource(R.drawable.arg_RES_7f080a74);
                         tI.setVisibility(0);
                      }
                   }else {
                      tI.setImageResource(R.drawable.arg_RES_7f080a73);
                      tI.setVisibility(0);
                   }
                }else {
                   tI.setImageResource(R.drawable.arg_RES_7f080a75);
                   tI.setVisibility(0);
                }
             }
          }
       }
       this.J = p0;
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
    public QPhoto getPhoto(){
       SideWindowInfo obj = PatchProxy.apply(null, this, l.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.J(this.z);
       if (obj != null) {
          obj = obj.mSidePhoto;
          if (obj != null) {
             return obj;
          }
       }
       return this.z;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
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
       this.M = this.q8(u.class);
       return;
    }
}
