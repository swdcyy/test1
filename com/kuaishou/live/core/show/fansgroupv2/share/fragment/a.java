package com.kuaishou.live.core.show.fansgroupv2.share.fragment.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.c;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareItemIconView;
import com.kwai.component.fansgroup.net.LiveFansGroupSharePanelInfoV3;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.a$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.a$b;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.a$c;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent;
import p82.f;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.k1;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.c$a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import pj2.c0;
import uj2.b;
import mhc.x;
import com.yxcorp.gifshow.share.platform.b;
import e17.i;
import p82.g;
import java.lang.Runnable;
import t02.a0;
import com.kuaishou.live.core.show.share.f$b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import lnc.a1;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import com.kwai.component.fansgroup.net.LiveFansGroupSharePanelInfoV3$LiveBubbleTips;
import java.util.Objects;
import p82.b;
import lnc.c3$a;
import lnc.c3;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;
import android.widget.LinearLayout;

public class a extends c	// class@000b5b
{
    public LinearLayout A;
    public TextView B;
    public LiveAudienceFansGroupShareItemIconView C;
    public TextView D;
    public LinearLayout E;
    public TextView F;
    public TextView G;
    public TextView H;
    public a0 p;
    public c q;
    public TextView r;
    public LiveFansGroupSharePanelInfoV3 s;
    public LiveAudienceFansGroupShareItemIconView t;
    public TextView u;
    public LinearLayout v;
    public TextView w;
    public TextView x;
    public LiveAudienceFansGroupShareItemIconView y;
    public TextView z;
    public static String sLivePresenterClassName = "LiveAudienceFansGroupShareFragmentV3Presenter";

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q = new c();
       this.R8();
       this.t.q0();
       this.y.q0();
       this.C.q0();
       boolean b = this.s.isLowShareUser();
       this.t.setOnClickListener(new a$a(this, b));
       this.y.setOnClickListener(new a$b(this, b));
       this.C.setOnClickListener(new a$c(this, b));
       this.X7(f.a(LiveShareStatusEvent.class, new f(this)));
       return;
    }
    public void J8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "11")) {
          this.t.s0();
          this.y.s0();
          this.C.s0();
       }
       this.q = null;
       k1.n(this);
       return;
    }
    public void P8(c$a p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       if (!this.getActivity() instanceof GifshowActivity) {
          return;
       }
       c0 uoc0 = new c0();
       uoc0.q(new b(p1));
       uoc0.m(4);
       uoc0.p("live_fans_group");
       if (!b.k().K()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1021a7);
          k1.s(new g(this, uoc0), this, 2000);
       }else {
          uoc0.i(p0.b);
          this.p.o1.w1(uoc0);
       }
       return;
    }
    public final void R8(){
       SpannableString spannableStr;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "8")) {
          return;
       }
       a tr = this.r;
       int i = 0x7f1021a6;
       a ts = this.s;
       LiveFansGroupSharePanelInfoV3 mOpenAppBonu = ts.mOpenAppBonus;
       LiveFansGroupSharePanelInfoV3 mFollowAutho = ts.mFollowAuthorBonus;
       int i1 = 1;
       if (PatchProxy.isSupport(uoa)) {
          spannableStr = PatchProxy.applyThreeRefs(Integer.valueOf(i), Integer.valueOf(mOpenAppBonu), Integer.valueOf(mFollowAutho), this, a.class, "7");
          if (spannableStr != PatchProxyResult.class) {
          label_00a4 :
             tr.setText(spannableStr);
             int i2 = 8;
             if (!TextUtils.x(this.s.mBottomText)) {
                this.H.setText(this.s.mBottomText);
                this.H.setVisibility(0);
                this.G.setVisibility(i2);
             }else {
                this.G.setText(this.s.mBottomTips);
                this.G.setVisibility(0);
                this.H.setVisibility(i2);
             }
             String str = "WECHAT_CHANNEL";
             this.S8(str, this.q.a(str));
             this.S8("WECHAT_GROUP_CHANNEL", this.q.a("WECHAT_GROUP_CHANNEL"));
             this.S8("WECHAT_MOMENTS_CHANNEL", this.q.a("WECHAT_MOMENTS_CHANNEL"));
             if (this.s.mLiveBubbleTips != null) {
                this.x.setVisibility(0);
                if (this.q.a(str).a != null || (this.q.a("WECHAT_GROUP_CHANNEL").a == null && this.q.a("WECHAT_MOMENTS_CHANNEL").a == null)) {
                   i1 = 0;
                }
             label_0126 :
                LiveFansGroupSharePanelInfoV3$LiveBubbleTips mAfterShareT = (i1)? this.s.mLiveBubbleTips.mAfterShareTips: this.s.mLiveBubbleTips.mBeforeShareTips;
                if (!TextUtils.x(mAfterShareT)) {
                   this.x.setText(mAfterShareT);
                   this.x.setVisibility(0);
                }
             }
             return;
          }
       }
       String str1 = "+"+mOpenAppBonu;
       String str2 = "+"+mFollowAutho;
       Object[] objArray = new Object[]{str1,str2};
       String str3 = String.format(a1.p(i), objArray);
       int i3 = str3.indexOf(str1);
       int i4 = str3.indexOf(str2, (str1.length() + i3));
       SpannableString spannableStr1 = new SpannableString(str3);
       spannableStr1.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0607c5)), i3, (str1.length() + i3), 33);
       spannableStr1.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0607c5)), i4, (str2.length() + i4), 33);
       spannableStr = spannableStr1;
       goto label_00a4 ;
    }
    public final void S8(String p0,c$a p1){
       a tu;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       if (TextUtils.n(p0, "WECHAT_CHANNEL")) {
          tu = this.u;
          Objects.requireNonNull(tu);
          c3.c(this.s.mBonus, new b(tu));
          tu = this.w;
          Objects.requireNonNull(tu);
          c3.c(this.s.mFinishText, new b(tu));
          this.V8(p1, this.v, this.u);
       }else if(TextUtils.n(p0, "WECHAT_GROUP_CHANNEL")){
          tu = this.z;
          Objects.requireNonNull(tu);
          c3.c(this.s.mBonus, new b(tu));
          tu = this.B;
          Objects.requireNonNull(tu);
          c3.c(this.s.mFinishText, new b(tu));
          this.V8(p1, this.A, this.z);
       }else if(TextUtils.n(p0, "WECHAT_MOMENTS_CHANNEL")){
          tu = this.D;
          Objects.requireNonNull(tu);
          c3.c(this.s.mBonus, new b(tu));
          tu = this.F;
          Objects.requireNonNull(tu);
          c3.c(this.s.mFinishText, new b(tu));
          this.V8(p1, this.E, this.D);
       }
       return;
    }
    public final void V8(c$a p0,ViewGroup p1,TextView p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "10")) {
          return;
       }
       if (p0.a != null) {
          p1.setVisibility(0);
          p2.setVisibility(4);
       }else {
          p2.setVisibility(0);
          p1.setVisibility(4);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1a0a);
       this.t = m1.f(p0, 0x7f0a1a0d);
       this.u = m1.f(p0, 0x7f0a1a0f);
       this.v = m1.f(p0, 0x7f0a1a10);
       this.w = m1.f(p0, 0x7f0a1a12);
       this.x = m1.f(p0, 0x7f0a1a15);
       this.y = m1.f(p0, 0x7f0a19f5);
       this.z = m1.f(p0, 0x7f0a19f6);
       this.A = m1.f(p0, 0x7f0a19f7);
       this.B = m1.f(p0, 0x7f0a19f8);
       this.C = m1.f(p0, 0x7f0a19fb);
       this.D = m1.f(p0, 0x7f0a19fd);
       this.E = m1.f(p0, 0x7f0a19fe);
       this.F = m1.f(p0, 0x7f0a1a00);
       this.G = m1.f(p0, 0x7f0a19f0);
       this.H = m1.f(p0, 0x7f0a19ef);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.s = this.q8(LiveFansGroupSharePanelInfoV3.class);
       return;
    }
}
