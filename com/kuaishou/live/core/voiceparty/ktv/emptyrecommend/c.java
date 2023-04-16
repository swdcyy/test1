package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tt2.v;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c$a;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gs2.a;
import ut2.c;
import java.lang.StringBuilder;
import z12.e;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.LiveVoicePartyMusicInfo;
import android.widget.Button;
import java.lang.Throwable;
import android.view.View$OnClickListener;
import android.view.View;
import lnc.a1;
import bld.b;
import android.content.Context;
import android.content.res.Resources;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$Status;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c$b;
import java.lang.Enum;
import e17.i;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;

public class c extends PresenterV2 implements LiveVoicePartyKtvMusicDownloadHelper$d	// class@00152e
{
    public v p;
    public LiveVoicePartyKtvMusicDownloadHelper q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public Button u;
    public View v;
    public LiveVoicePartyMusicInfo w;
    public View$OnClickListener x;
    public static String sLivePresenterClassName = "LiveVoicePartyEmptyRecommendItemRenderer";

    public void c(v p0,LiveVoicePartyKtvMusicDownloadHelper p1){
       super();
       this.x = new c$a(this);
       this.p = p0;
       this.q = p1;
    }
    public void A1(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       c tp = this.p;
       if (tp != null) {
          tp.gc(p0, new a(this));
          String[] stringArray = new String[0];
          e.c("LiveVoicePartyEmptyRecommendItemPresenter", "order music:"+p0.mName, stringArray);
       }
       if (this.w.equals(p0)) {
          this.W8(p0);
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.r.L(this.w.mAvatarUrl);
       this.s.setText(this.w.mName);
       this.t.setText(this.w.mArtist);
       if (this.w.mIsOrdered != null) {
          this.S8();
       }else {
          this.R8();
       }
       this.u.setVisibility(0);
       if (this.w.mIsOrdered == null) {
          this.P8();
       }else {
          this.V8();
       }
       c tw = this.w;
       if (tw.mShowed == null) {
          c tp = this.p;
          if (tp != null) {
             tw.mShowed = true;
             tp.ad(tw, true);
          }
       }
       return;
    }
    public void F0(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       if (!this.w.equals(p0)) {
          return;
       }
       this.W8(p0);
       return;
    }
    public void P0(Music p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "12")) {
          return;
       }
       if (!this.w.equals(p0)) {
          return;
       }
       this.W8(p0);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.v.setOnClickListener(this.x);
       this.u.setOnClickListener(this.x);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       this.u.setText(a1.p(R.string.arg_RES_7f102537));
       b uob = new b();
       uob.v(this.getContext().getResources().getColor(0x106000d));
       uob.x(0x3f800000);
       uob.w(this.getContext().getResources().getColor(R.color.arg_RES_7f0601b3));
       uob.g(KwaiRadiusStyles.FULL);
       this.u.setBackground(uob.a());
       this.u.setTextColor(a1.a(R.color.arg_RES_7f0601b3));
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.u.setText(a1.p(R.string.arg_RES_7f102e2c));
       b uob = new b();
       uob.v(this.getContext().getResources().getColor(0x106000d));
       uob.x(0x3f800000);
       uob.w(this.getContext().getResources().getColor(R.color.arg_RES_7f0601b3));
       uob.g(KwaiRadiusStyles.FULL);
       this.u.setBackground(uob.a());
       this.u.setTextColor(a1.a(R.color.arg_RES_7f0601b3));
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.v.setOnClickListener(null);
       this.u.setOnClickListener(null);
       return;
    }
    public final void W8(Music p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "9")) {
          return;
       }
       this.V8();
       LiveVoicePartyKtvMusicDownloadHelper$Status status = this.q.d(p0);
       if (status == null) {
          return;
       }
       int i = c$b.a[status.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   return;
                }else {
                   this.R8();
                   this.P8();
                   return;
                }
             }else {
                i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103712));
                this.P8();
                return;
             }
          }else if(PatchProxy.applyVoid(null, this, uoc, "7")){
             b uob = new b();
             uob.v(this.getContext().getResources().getColor(0x106000d));
             uob.x(0x3f800000);
             int i1 = 0x7f0601b3;
             uob.w(this.getContext().getResources().getColor(i1));
             uob.g(KwaiRadiusStyles.FULL);
             this.u.setBackground(uob.a());
             this.u.setTextColor(a1.a(i1));
          }
          this.u.setText(this.q.c(this.w)+"%");
          return;
       }else {
          this.u.setText(R.string.arg_RES_7f104aa7);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a14c8);
       this.r = m1.f(p0, 0x7f0a09e2);
       this.t = m1.f(p0, 0x7f0a2ca3);
       this.s = m1.f(p0, 0x7f0a2c99);
       this.u = m1.f(p0, 0x7f0a2c6c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.w = this.q8(LiveVoicePartyMusicInfo.class);
       return;
    }
    public void o2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
          return;
       }
       if (!this.w.equals(p0)) {
          return;
       }
       this.W8(p0);
       return;
    }
    public void s1(Music p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "11")) {
          return;
       }
       if (!this.w.equals(p0)) {
          return;
       }
       this.W8(p0);
       return;
    }
}
