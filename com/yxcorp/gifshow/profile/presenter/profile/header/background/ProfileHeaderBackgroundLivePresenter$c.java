package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$c;
import t99.y;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
import java.lang.Object;
import t99.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.yxcorp.utility.n;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import t99.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.graphics.Bitmap;
import t99.w$a;
import brd.t;
import m4c.g;
import erd.o;
import t45.d;
import brd.z;
import m4c.h;
import erd.g;
import m4c.i;
import m4c.j;
import crd.b;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import android.widget.ImageView;
import java.lang.Integer;
import java.lang.System;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;

public final class ProfileHeaderBackgroundLivePresenter$c implements y	// class@0014bb
{
    public final ProfileHeaderBackgroundLivePresenter b;

    public void ProfileHeaderBackgroundLivePresenter$c(ProfileHeaderBackgroundLivePresenter p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1,int p2){
       x.d(this, p0, p1, p2);
    }
    public void c(int p0,int p1,int p2){
       x.j(this, p0, p1, p2);
    }
    public void onAnchorEndLive(){
       ProfileHeaderBackgroundLivePresenter a;
       if (PatchProxy.applyVoid(null, this, ProfileHeaderBackgroundLivePresenter$c.class, "2")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter$c tb = this.b;
       boolean b = false;
       tb.M = b;
       tb.X8();
       tb = this.b;
       ProfileHeaderBackgroundLivePresenter z = tb.z;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(z, tb, ProfileHeaderBackgroundLivePresenter.class, "25")) {
          if (tb.B == null) {
             View view = n.G(tb.getContext(), R.layout.arg_RES_7f0d121d);
             tb.B = view;
             tb.C = m1.f(view, 0x7f0a1c11);
             if (z instanceof ViewGroup) {
                z.addView(tb.B);
             }
          }
          View[] viewArray = new View[]{tb.C,tb.B};
          n.Z(b, viewArray);
          ProfileHeaderBackgroundLivePresenter j = tb.J;
          a.m(j);
          a = tb.A;
          a.m(a);
          Bitmap uBitmap = w.a.c(j.U(), a);
          if (uBitmap != null) {
             tb.X7(t.just(uBitmap).map(g.b).observeOn(d.c).doOnNext(h.b).observeOn(d.a).subscribe(new i(tb), j.b));
          }
          if (z instanceof ViewGroup) {
             ProfileHeaderBackgroundLivePresenter b1 = tb.B;
             if (b1 != null) {
                ViewGroup$LayoutParams layoutParams = b1.getLayoutParams();
                layoutParams.height = z.getMeasuredHeight();
                layoutParams.width = z.getMeasuredWidth();
                b1.setLayoutParams(layoutParams);
             }
          }
       }
    label_00b6 :
       this.b.b9();
       this.b.Z8();
       return;
    }
    public void onAudioStart(){
       x.b(this);
    }
    public void onCachedPlayerResumePlay(){
       x.c(this);
    }
    public void onPlayTimeFinished(){
       x.e(this);
    }
    public void onPlayerCached(){
       x.f(this);
    }
    public void onPlayerRetrieved(){
       x.g(this);
    }
    public void onRenderStop(){
       ProfileHeaderBackgroundLivePresenter a;
       View[] viewArray;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderBackgroundLivePresenter$c.class, "5")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter z = this.b.z;
       if (z != null && !z.g()) {
          this.b.X8();
       }
       ProfileHeaderBackgroundLivePresenter$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ProfileHeaderBackgroundLivePresenter.class, "23")) {
          ProfileHeaderBackgroundLivePresenter j = tb.J;
          a.m(j);
          a = tb.A;
          a.m(a);
          Bitmap uBitmap = w.a.c(j.U(), a);
          int i = 1;
          if (uBitmap != null) {
             viewArray = new View[i];
             viewArray[0] = tb.y;
             n.Z(0, viewArray);
             z = tb.y;
             if (z != null) {
                z.setImageBitmap(uBitmap);
             }
          }else {
             viewArray = new View[i];
             viewArray[0] = tb.y;
             n.Z(4, viewArray);
          }
       }
       this.b.b9();
       return;
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       x.i(this, p0, p1, p2);
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundLivePresenter$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundLivePresenter$c.class, "3")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter$c tb = this.b;
       tb.N = p0;
       tb.O = p1;
       ProfileHeaderBackgroundLivePresenter z = tb.z;
       a.m(z);
       tb.W8(p0, p1, z, this.b.A);
       return;
    }
    public void onVideoStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileHeaderBackgroundLivePresenter$c.class, "1")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter$c tb = this.b;
       tb.M = true;
       Objects.requireNonNull(tb);
       int i = 2;
       if (!PatchProxy.applyVoid(objArray, tb, ProfileHeaderBackgroundLivePresenter.class, "21")) {
          View[] viewArray1 = new View[i];
          viewArray1[0] = tb.x;
          viewArray1[1] = tb.y;
          n.Z(4, viewArray1);
       }
       this.b.F = System.currentTimeMillis();
       View[] viewArray = new View[i];
       ProfileHeaderBackgroundLivePresenter$c tb1 = this.b;
       viewArray[0] = tb1.B;
       viewArray[1] = tb1.C;
       n.Z(4, viewArray);
       this.b.Y8();
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter$c.class, "4")) {
          return;
       }
       a.p(p0, "newState");
       if (p0 == LiveAutoPlayerState.PLAYING) {
          ProfileHeaderBackgroundLivePresenter z = this.b.z;
          if (z != null && !z.g()) {
             this.b.a9("live_state_change");
          }
       }
       return;
    }
}
