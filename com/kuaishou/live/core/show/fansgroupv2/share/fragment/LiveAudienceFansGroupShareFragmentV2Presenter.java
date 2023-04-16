package com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareFragmentV2Presenter;
import k51.c;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareFragmentV2Presenter$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareFragmentV2Presenter$b;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent;
import p82.c;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.k1;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import pj2.c0;
import uj2.b;
import t02.a0;
import com.kuaishou.live.core.show.share.f$b;
import com.kwai.component.fansgroup.net.LiveFansGroupSharePanelInfoV2;
import java.util.Objects;
import p82.b;
import android.widget.TextView;
import lnc.c3$a;
import lnc.c3;
import android.widget.LinearLayout;
import lnc.a1;
import f82.c;
import ekd.j;
import java.lang.Math;
import com.kwai.component.fansgroup.net.LiveFansGroupSharePanelInfoV2$LiveFansGroupShareCountConfig;
import java.lang.CharSequence;
import java.util.ArrayList;
import p82.a;
import java.util.List;
import ok.h;
import com.google.common.collect.Lists;
import android.widget.ViewFlipper;
import android.content.Context;
import android.text.TextUtils$TruncateAt;
import android.view.View;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareItemIconView;
import p82.d;
import java.lang.Runnable;
import p82.e;
import ekd.m1;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;

public class LiveAudienceFansGroupShareFragmentV2Presenter extends c	// class@000b54
{
    public TextView A;
    public LinearLayout B;
    public TextView C;
    public View D;
    public ImageView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public a0 p;
    public LiveFansGroupSharePanelInfoV2 q;
    public LiveMediumTextView r;
    public ViewFlipper s;
    public LiveAudienceFansGroupShareItemIconView t;
    public TextView u;
    public TextView v;
    public LinearLayout w;
    public TextView x;
    public LiveAudienceFansGroupShareItemIconView y;
    public TextView z;
    public static final Pattern J;
    public static String sLivePresenterClassName;

    static {
       LiveAudienceFansGroupShareFragmentV2Presenter.J = Pattern.compile("\\+[0-9][0-9]");
    }
    public void LiveAudienceFansGroupShareFragmentV2Presenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareFragmentV2Presenter.class, "3")) {
          return;
       }
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.reset();
       this.S8();
       this.t.setOnClickListener(new LiveAudienceFansGroupShareFragmentV2Presenter$a(this));
       this.y.setOnClickListener(new LiveAudienceFansGroupShareFragmentV2Presenter$b(this));
       this.X7(f.a(LiveShareStatusEvent.class, new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareFragmentV2Presenter.class, "4")) {
          return;
       }
       k1.n(this);
       return;
    }
    public void P8(LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceFansGroupShareFragmentV2Presenter.class, "10")) {
          return;
       }
       if (!this.getActivity() instanceof GifshowActivity) {
          return;
       }
       c0 uoc0 = new c0();
       uoc0.q(new b());
       uoc0.i(p0.mChannel);
       uoc0.p("live_fans_group");
       this.p.o1.w1(uoc0);
       return;
    }
    public void R8(LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem p0){
       LiveAudienceFansGroupShareFragmentV2Presenter tv;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceFansGroupShareFragmentV2Presenter.class, "12")) {
          return;
       }
       int i = 1;
       int i1 = p0.mHasShared ^ i;
       if (p0 == LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.WECHAT) {
          tv = this.v;
          Objects.requireNonNull(tv);
          c3.c(this.q.mBonus, new b(tv));
          tv = this.x;
          Objects.requireNonNull(tv);
          c3.c(this.q.mFinishText, new b(tv));
          if (!i1) {
             this.t.setEnabled(false);
             this.u.setAlpha(0x3f000000);
             this.w.setVisibility(false);
             this.v.setVisibility(4);
          }else {
             this.t.setEnabled(i);
             this.u.setAlpha(0x3f800000);
             c.o(this.v, a1.a(R.color.arg_RES_7f060d78), a1.a(R.color.arg_RES_7f060d76));
             this.v.setVisibility(false);
             this.w.setVisibility(4);
          }
       }else if(p0 == LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.MOMENTS){
          tv = this.A;
          Objects.requireNonNull(tv);
          c3.c(this.q.mBonus, new b(tv));
          tv = this.C;
          Objects.requireNonNull(tv);
          c3.c(this.q.mFinishText, new b(tv));
          if (!i1) {
             this.y.setEnabled(false);
             this.z.setAlpha(0x3f000000);
             this.B.setVisibility(false);
             this.A.setVisibility(4);
          }else {
             this.y.setEnabled(i);
             this.z.setAlpha(0x3f800000);
             c.o(this.A, a1.a(R.color.arg_RES_7f060d78), a1.a(R.color.arg_RES_7f060d76));
             this.A.setVisibility(false);
             this.B.setVisibility(4);
          }
       }
       return;
    }
    public final void S8(){
       LiveAudienceFansGroupShareFragmentV2Presenter liveAudience = LiveAudienceFansGroupShareFragmentV2Presenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "6")) {
          return;
       }
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem shareItem = 0x7f06168c;
       String str = 2;
       int i = 0;
       int i1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "7")) {
          LiveAudienceFansGroupShareFragmentV2Presenter tq1 = this.q;
          LiveFansGroupSharePanelInfoV2 mCurrentShar = tq1.mCurrentShareCount;
          if (mCurrentShar >= null && !j.h(tq1.mShareCountConfigs)) {
             object oobject = this.q.mShareCountConfigs[Math.min(mCurrentShar, (this.q.mShareCountConfigs.length - i1))];
             this.r.setText(oobject.mTitle);
             if (!j.h(oobject.mCarouselTips)) {
                CharSequence[] uCharSequenc = new CharSequence[oobject.mCarouselTips.length];
                uCharSequenc = Lists.h(j.a(oobject.mCarouselTips), new a(this)).toArray(uCharSequenc);
                if (!PatchProxy.applyVoidOneRefs(uCharSequenc, this, liveAudience, "13") && !j.h(uCharSequenc)) {
                   this.s.stopFlipping();
                   this.s.removeAllViews();
                   int len = uCharSequenc.length;
                   for (int i4 = 0; i4 < len; i4 = i4 + 1) {
                      TextView textView = new TextView(this.getContext());
                      textView.setMaxLines(str);
                      textView.setTextColor(a1.a(shareItem));
                      textView.setTextSize(14.00f);
                      textView.setLineSpacing(0, 0x3f99999a);
                      textView.setEllipsize(TextUtils$TruncateAt.END);
                      textView.setPadding(i, a1.e(6.00f), i, a1.e(6.00f));
                      textView.setText(uCharSequenc[i4]);
                      this.s.addView(textView);
                   }
                }
                if (!PatchProxy.applyVoid(objArray, this, liveAudience, "14") && !this.s.getVisibility()) {
                   if (this.s.getChildCount() <= i1) {
                      this.s.stopFlipping();
                   }else if(this.s.isFlipping()){
                      this.s.setFlipInterval(2000);
                      this.s.startFlipping();
                   }
                }
             }
          }
       }
    label_00f0 :
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "9")) {
          int i2 = 3;
          int[] ointArray = new int[i2]{0x7f0811a5,0x7f0811a7,0x7f0811a6};
          TextView[] textViewArra = new TextView[i2];
          textViewArra[i] = this.F;
          textViewArra[i1] = this.G;
          textViewArra[str] = this.H;
          LiveAudienceFansGroupShareFragmentV2Presenter tq = this.q;
          LiveFansGroupSharePanelInfoV2 mCurrentDay = (tq.mCurrentShareCount > null)? tq.mCurrentDay: tq.mCurrentDay - i1;
          int i3 = Math.min(mCurrentDay, i2);
          if (i3 > 0 && i3 <= i2) {
             this.D.setVisibility(i);
             this.E.setImageResource(ointArray[(i3 - 1)]);
             for (; i < i2; i = i + 1) {
                i1 = (i < i3)? 0x7f061641: 0x7f06168c;
                textViewArra[i].setTextColor(a1.a(i1));
             }
             this.I.setText("+"+this.q.mContinuousShareBonus);
          }else {
             this.D.setVisibility(8);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "8")) {
          LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem wECHAT = LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.WECHAT;
          this.R8(wECHAT);
          shareItem = LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.MOMENTS;
          this.R8(shareItem);
          if (!PatchProxy.applyVoid(objArray, this, liveAudience, "11")) {
             this.t.s0();
             this.y.s0();
          }
          if (wECHAT.mHasShared == null) {
             k1.s(new d(this), this, 0);
          }else if(shareItem.mHasShared == null){
             k1.s(new e(this), this, 0);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceFansGroupShareFragmentV2Presenter.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1a09);
       this.s = m1.f(p0, 0x7f0a19f3);
       this.t = m1.f(p0, 0x7f0a1a0d);
       this.u = m1.f(p0, 0x7f0a1a13);
       this.v = m1.f(p0, 0x7f0a1a0e);
       this.w = m1.f(p0, 0x7f0a1a10);
       this.x = m1.f(p0, 0x7f0a1a11);
       this.y = m1.f(p0, 0x7f0a19fb);
       this.z = m1.f(p0, 0x7f0a1a01);
       this.A = m1.f(p0, 0x7f0a19fc);
       this.B = m1.f(p0, 0x7f0a19fe);
       this.C = m1.f(p0, 0x7f0a19ff);
       this.D = m1.f(p0, 0x7f0a1a03);
       this.E = m1.f(p0, 0x7f0a1a05);
       this.F = m1.f(p0, 0x7f0a1a06);
       this.G = m1.f(p0, 0x7f0a1a08);
       this.H = m1.f(p0, 0x7f0a1a07);
       this.I = m1.f(p0, 0x7f0a1a04);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareFragmentV2Presenter.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.q8(LiveFansGroupSharePanelInfoV2.class);
       return;
    }
}
