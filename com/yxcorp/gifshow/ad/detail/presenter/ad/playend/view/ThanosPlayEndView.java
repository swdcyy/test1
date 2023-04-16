package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayEndView;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.widget.AdDownloadProgressBar;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.TextWithEndTagView;
import com.yxcorp.gifshow.ad.detail.view.AdScoreLayout;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tw.j;
import lnc.a1;
import tw.f;
import zf6.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zf6.j;
import java.lang.Integer;
import java.lang.Boolean;
import android.text.TextPaint;
import n49.s;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import g59.k0;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$c;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.yxcorp.gifshow.commercial.adsdk.model.AdUrlInfo;
import tw.c;
import com.yxcorp.gifshow.ad.widget.BaseAdProgressView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import f09.a;
import android.view.View$OnClickListener;
import f09.b;
import f09.c;
import f09.d;
import f09.h;
import f09.e;
import f09.f;
import f09.g;
import g59.p;
import com.yxcorp.gifshow.ad.detail.view.AdScoreLayout$a;

public class ThanosPlayEndView extends AdPlayEndBaseView	// class@0015f3
{
    public KwaiImageView g;
    public TextView h;
    public AdScoreLayout i;
    public TextWithEndTagView j;
    public AdDownloadProgressBar k;
    public AdDownloadProgressHelper l;
    public TextView m;
    public a n;
    public View o;
    public static final int p;

    public void ThanosPlayEndView(Context p0){
       super(p0);
    }
    public void ThanosPlayEndView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ThanosPlayEndView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ThanosPlayEndView.class, "1")) {
          return;
       }
       LayoutInflater.from(this.b).inflate(R.layout.arg_RES_7f0d0091, this);
       this.k = this.findViewById(0x7f0a300e);
       this.m = this.findViewById(0x7f0a35ad);
       this.g = this.findViewById(0x7f0a00eb);
       this.h = this.findViewById(0x7f0a0166);
       this.j = this.findViewById(0x7f0a0105);
       this.i = this.findViewById(0x7f0a013a);
       this.o = this.findViewById(0x7f0a30d3);
       this.n = this.g.getHierarchy();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ThanosPlayEndView.class, "13")) {
          return;
       }
       super.b();
       ThanosPlayEndView tl = this.l;
       if (tl != null) {
          tl.f();
          this.l.g();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ThanosPlayEndView.class, "12")) {
          return;
       }
       super.c();
       Activity uActivity = a.a(this);
       ThanosPlayEndView tl = this.l;
       if (tl != null && uActivity instanceof GifshowActivity) {
          tl.e();
          this.l.d(uActivity.getLifecycle());
       }
       return;
    }
    public void f(QPhoto p0,Lifecycle p1){
       boolean i1;
       int i2;
       String str1;
       int i3;
       int i4;
       int i5;
       boolean b;
       int i6;
       int i7;
       int i8;
       String str2;
       int i9;
       int i10;
       PhotoAdvertisement mAdData;
       PhotoAdvertisement$AdData mPlayEndInfo;
       ThanosPlayEndView k;
       PhotoAdvertisement$AdData mPlayEndInfo1;
       PhotoAdvertisement$PlayEndInfo mUserIconUrl;
       AdDownloadProgressHelper uAdDownloadP = this;
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, uAdDownloadP, ThanosPlayEndView.class, "2")) {
          return;
       }
       if (obj == null || k.B(p0) == null) {
          uAdDownloadP.setVisibility(8);
          return;
       }else {
          PhotoAdvertisement photoAdverti = k.B(p0);
          float f = 14.00f;
          int i = -4868682;
          Object[] obj1 = null;
          if (j.D(p0)) {
             i1 = a1.e(38.00f);
             String str = f.f(photoAdverti.mAppName);
             i2 = 17;
             str1 = (k.d())? -1644826: -13619152;
             i3 = a1.e(f);
             if (!k.d()) {
                mUserIconUrl = -8947849;
             }
             i4 = i1;
             i1 = true;
             i3 = i;
             i = i3;
             str1 = str;
             i5 = str1;
          }else {
             float f1 = 16.00f;
             i5 = a1.e(f1);
             PhotoAdvertisement$PlayEndInfo playEndInfo1 = PatchProxy.applyOneRefs(obj, obj1, c.class, "28");
             if (playEndInfo1 != PatchProxyResult.class) {
             }else {
                mAdData = k.B(p0);
                if (mAdData != null) {
                   mAdData = mAdData.mAdData;
                   if (mAdData != null) {
                      mPlayEndInfo = mAdData.mPlayEndInfo;
                   label_0086 :
                      playEndInfo1 = (mPlayEndInfo != null)? mPlayEndInfo.mUserName: obj1;
                      if (TextUtils.x(playEndInfo1)) {
                         playEndInfo1 = c.A(p0);
                      }
                   }
                }
                mPlayEndInfo = obj1;
                goto label_0086 ;
             }
             if (!k.d()) {
                mUserIconUrl = -10066330;
             }
             i4 = i5;
             str1 = playEndInfo1;
             i2 = 14;
             i5 = i;
             i = a1.e(f1);
             i3 = j.d(uAdDownloadP, 0x7f0607de);
             i1 = false;
          }
          if (PatchProxy.isSupport(ThanosPlayEndView.class)) {
             b = i1;
             i6 = i;
             i7 = i5;
             i8 = i2;
             str2 = str1;
             i9 = i3;
             if (!PatchProxy.applyVoidFourRefs(str1, Integer.valueOf(i2), Boolean.valueOf(i1), Integer.valueOf(i5), this, ThanosPlayEndView.class, "4")) {
             label_00f7 :
                if (!TextUtils.x(str2)) {
                   uAdDownloadP.h.setText(str2);
                   uAdDownloadP.h.setTextSize((float)i8);
                   uAdDownloadP.h.setTextColor(i7);
                   uAdDownloadP.h.getPaint().setFakeBoldText(b);
                   uAdDownloadP.h.setVisibility(0);
                }else {
                   uAdDownloadP.h.setVisibility(8);
                }
             }
          }else {
             b = i1;
             i6 = i;
             i7 = i5;
             i8 = i2;
             str2 = str1;
             i9 = i3;
             int i11 = 0;
             goto label_00f7 ;
          }
          if (!PatchProxy.isSupport(ThanosPlayEndView.class) || !PatchProxy.applyVoidFourRefs(p0, photoAdverti, Integer.valueOf(i6), Integer.valueOf(i9), this, ThanosPlayEndView.class, "3")) {
             if (!TextUtils.x(p0.getCaption())) {
                uAdDownloadP.j.setText(p0.getCaption());
                uAdDownloadP.j.setTextColor(i9);
                uAdDownloadP.j.setTextSize(i6);
                if (s.c(photoAdverti)) {
                   uAdDownloadP.j.setTagText(this.getResources().getString(R.string.arg_RES_7f103ca0));
                   uAdDownloadP.j.setTagIcon(BitmapFactory.decodeResource(this.getResources(), R.drawable.arg_RES_7f081ace));
                }else {
                   uAdDownloadP.j.setTagText("");
                   uAdDownloadP.j.setTagIcon(null);
                }
                uAdDownloadP.j.setVisibility(0);
             }else {
                uAdDownloadP.j.setVisibility(8);
             }
          }
          uAdDownloadP.k.setTextSize(14.00f);
          if (!PatchProxy.applyVoidTwoRefs(photoAdverti, obj, uAdDownloadP, ThanosPlayEndView.class, "8")) {
             RoundingParams roundingPara = this.getRoundingParams();
             i = j.d(uAdDownloadP, R.color.arg_RES_7f060737);
             if (j.D(p0)) {
                if (!TextUtils.x(photoAdverti.mAppIconUrl)) {
                   uAdDownloadP.g.L(photoAdverti.mAppIconUrl);
                   b uob = new b();
                   uob.v(i);
                   uob.g(KwaiRadiusStyles.R12);
                   uob.s(DrawableCreator$Shape.Rectangle);
                   uAdDownloadP.g.setBackground(uob.a());
                   i = a1.e(6.00f);
                   uAdDownloadP.g.setPadding(i, i, i, i);
                   roundingPara.n((float)i);
                   uAdDownloadP.g(a1.e(86.00f));
                   uAdDownloadP.n.L(roundingPara);
                   uAdDownloadP.g.setVisibility(0);
                }else {
                   uAdDownloadP.g.setVisibility(8);
                }
             }else {
                User user = p0.getUser();
                super();
                this.v(i);
                this.s(DrawableCreator$Shape.Oval);
                uAdDownloadP.g.setBackground(this.a());
                uAdDownloadP.g.setPadding(a1.e(4.00f), a1.e(4.00f), a1.e(4.00f), a1.e(4.00f));
                roundingPara.q(true);
                uAdDownloadP.g(a1.e(54.00f));
                uAdDownloadP.n.L(roundingPara);
                PhotoAdvertisement$PlayEndInfo playEndInfo = PatchProxy.applyOneRefs(obj, null, c.class, "29");
                if (playEndInfo != PatchProxyResult.class) {
                }else {
                   PhotoAdvertisement photoAdverti1 = k.B(p0);
                   if (photoAdverti1 != null) {
                      photoAdverti1 = photoAdverti1.mAdData;
                      if (photoAdverti1 != null) {
                         mPlayEndInfo1 = photoAdverti1.mPlayEndInfo;
                      label_0273 :
                         mUserIconUrl = (mPlayEndInfo1 != null)? mPlayEndInfo1.mUserIconUrl: false;
                         playEndInfo = mUserIconUrl;
                      }
                   }
                   mPlayEndInfo1 = null;
                   goto label_0273 ;
                }
                if (!TextUtils.x(playEndInfo)) {
                   uAdDownloadP.g.L(playEndInfo);
                   uAdDownloadP.g.setVisibility(0);
                }else {
                   User mAvatars = user.mAvatars;
                   if (mAvatars != null && mAvatars.length > 0) {
                      uAdDownloadP.g.U(mAvatars);
                      uAdDownloadP.g.setVisibility(0);
                   }else {
                      uAdDownloadP.g.setVisibility(8);
                   }
                }
             }
          }
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, uAdDownloadP, ThanosPlayEndView.class, "14")) {
             k = uAdDownloadP.k;
             i1 = n.y(a.a().a()) - (a1.e(60.00f) * 2);
             i = a1.e(40.00f);
             if (!PatchProxy.isSupport(k0.class) || !PatchProxy.applyVoidThreeRefs(k, Integer.valueOf(i1), Integer.valueOf(i), null, k0.class, "6")) {
                ViewGroup$LayoutParams layoutParams1 = k.getLayoutParams();
                if (layoutParams1 != null) {
                   layoutParams1.width = i1;
                   layoutParams1.height = i;
                   k.setLayoutParams(layoutParams1);
                }
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(photoAdverti, obj, uAdDownloadP, ThanosPlayEndView.class, "15")) {
             String str3 = s.f(photoAdverti);
             if (photoAdverti != null) {
                mAdData = photoAdverti.mAdData;
                if (mAdData != null) {
                   mPlayEndInfo = mAdData.mPlayEndInfo;
                   if (mPlayEndInfo != null) {
                      PhotoAdvertisement$PlayEndInfo mActionBarCo = mPlayEndInfo.mActionBarColor;
                   label_031a :
                      uAdDownloadP.l = new AdDownloadProgressHelper(uAdDownloadP.k, c.a(photoAdverti), new AdDownloadProgressHelper$c(str3, obj1, "E6"));
                      Activity uActivity = a.a(this);
                      if (uActivity instanceof GifshowActivity) {
                         uAdDownloadP.l.d(uActivity.getLifecycle());
                      }
                   }
                }
             }
             obj1 = objArray;
             goto label_031a ;
          }
          uAdDownloadP.setupStarScore(photoAdverti);
          if (!PatchProxy.isSupport(ThanosPlayEndView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i4), uAdDownloadP, ThanosPlayEndView.class, "5")) {
             if (uAdDownloadP.h.getVisibility() && (uAdDownloadP.j.getVisibility() && (uAdDownloadP.g.getVisibility() && uAdDownloadP.i.getVisibility()))) {
                uAdDownloadP.o.setVisibility(8);
             }else if(uAdDownloadP.g.getVisibility()){
                i10 = 0;
             }else {
                i10 = i4;
             }
             ConstraintLayout$LayoutParams layoutParams = uAdDownloadP.o.getLayoutParams();
             layoutParams.topMargin = i10;
             uAdDownloadP.o.setLayoutParams(layoutParams);
             uAdDownloadP.o.setVisibility(0);
          }
          if (!PatchProxy.applyVoidOneRefs(obj, uAdDownloadP, ThanosPlayEndView.class, "6")) {
             uAdDownloadP.g.setOnClickListener(new a(uAdDownloadP));
             uAdDownloadP.i.setOnClickListener(new b(uAdDownloadP));
             uAdDownloadP.h.setOnClickListener(new c(uAdDownloadP));
             uAdDownloadP.j.setOnClickListener(new d(uAdDownloadP));
             uAdDownloadP.k.setOnClickListener(new h(uAdDownloadP));
             uAdDownloadP.o.setOnClickListener(new e(uAdDownloadP));
             uAdDownloadP.m.setOnClickListener(new f(uAdDownloadP));
             uAdDownloadP.setOnClickListener(new g(uAdDownloadP));
          }
          if (!j.D(p0)) {
             uAdDownloadP.h(uAdDownloadP.h, 8);
             uAdDownloadP.h(uAdDownloadP.j, 16);
             uAdDownloadP.h(uAdDownloadP.k, 24);
          }
          return;
       }
    }
    public final void g(int p0){
       if (PatchProxy.isSupport(ThanosPlayEndView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ThanosPlayEndView.class, "10")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.g.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = p0;
       this.g.setLayoutParams(layoutParams);
       return;
    }
    public final RoundingParams getRoundingParams(){
       RoundingParams obj = PatchProxy.apply(null, this, ThanosPlayEndView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n.n();
       if (obj == null) {
          obj = new RoundingParams();
       }
       return obj;
    }
    public final void h(View p0,int p1){
       if (PatchProxy.isSupport(ThanosPlayEndView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ThanosPlayEndView.class, "9")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = a1.e((float)p1);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void setupStarScore(PhotoAdvertisement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosPlayEndView.class, "11")) {
          return;
       }
       int i = 8;
       if (p0 != null) {
          PhotoAdvertisement mAdData = p0.mAdData;
          if (mAdData != null) {
             if (mAdData.mAppScore > 0) {
                AdScoreLayout$a uoa = new AdScoreLayout$a(p.b(mAdData.mPlayEndInfo.mScoreBrightStarColor, a1.a(0x7f061eb8)), p.c(p0.mAdData.mPlayEndInfo.mScoreBrightStarColor, a1.a(0x7f061ebb), "7F"), a1.e(12.00f), a1.e(2.00f), p0.mAdData.mAppScore);
                this.i.setConfig(i);
                this.i.setVisibility(0);
             }else {
                this.i.setVisibility(i);
             }
             return;
          }
       }
       this.i.setVisibility(i);
       return;
    }
}
