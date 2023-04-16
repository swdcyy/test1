package com.yxcorp.gifshow.music.radio.MusicRadioActivity;
import im8.g;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayActivity;
import java.util.HashSet;
import bqb.a;
import uw9.l0;
import aqb.a;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import tyc.k3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import io.reactivex.subjects.PublishSubject;
import wpb.d;
import java.util.Map;
import java.util.HashMap;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.i;
import android.view.Window;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Intent;
import android.net.Uri;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import wpb.a;
import android.content.Context;
import n3d.a;
import ekd.x0;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import rf5.n;
import id5.p;
import com.yxcorp.gifshow.detail.nonslide.b;
import uw9.v3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import yy6.c;
import java.lang.System;
import d9a.b;
import ld5.a;

public class MusicRadioActivity extends SlidePlayActivity implements g	// class@002068
{
    public Set C;
    public a D;
    public final l0 E;
    public final a F;
    public String G;
    public String H;
    public static final int I;

    public void MusicRadioActivity(){
       super();
       this.C = new HashSet();
       this.D = new a();
       this.E = new l0();
       this.F = new a();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, MusicRadioActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.C.isEmpty()) {
          obj = this.C.iterator();
          while (obj.hasNext()) {
             obj.next().onDispatchTouchEvent(p0);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public int f(){
       return 229;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MusicRadioActivity.class, "6")) {
          return;
       }
       this.F.i.onNext(Boolean.TRUE);
       super.finish();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicRadioActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MusicRadioActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MusicRadioActivity.class, new d());
       }else {
          obj.put(MusicRadioActivity.class, null);
       }
       return obj;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MusicRadioActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       return "MUSIC_PLAYER_DETAIL";
    }
    public void onCreate(Bundle p0){
       MusicRadioActivity musicRadioAc = MusicRadioActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, musicRadioAc, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setTheme(R.style.arg_RES_7f11016c);
       int i = 0;
       i.h(this, i, i);
       this.getWindow().addFlags(128);
       if (!QCurrentUser.ME.isLogined() && !PatchProxy.applyVoid(null, this, musicRadioAc, "4")) {
          d.a(-1712118428).x00(this, i, new LoginParams$a().a(), new a(this, this.getIntent().getData()));
       }
       String str = "musicId";
       if (this.getIntent() != null && this.getIntent().getData() != null) {
          Uri data = this.getIntent().getData();
          this.H = x0.b(data, "musicType", "");
          this.G = x0.b(data, str, "");
       }
       if (this.getIntent() != null && this.getIntent().getExtras() != null) {
          this.G = this.getIntent().getExtras().getString(str);
          this.H = this.getIntent().getExtras().getString("musicType");
       }
       if (!PatchProxy.applyVoid(null, this, musicRadioAc, "2")) {
          NasaMilanoSlidePlayContainerFragment nasaMilanoSl = new NasaMilanoSlidePlayContainerFragment();
          this.y3(nasaMilanoSl);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(0x1020002, nasaMilanoSl);
          uoe.m();
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
    }
    public a x3(){
       return this.F;
    }
    public final void y3(NasaMilanoSlidePlayContainerFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRadioActivity.class, "3")) {
          return;
       }
       PhotoDetailParam photoDetailP = new PhotoDetailParam();
       photoDetailP.setSource(229).setBizType(4);
       boolean b = true;
       photoDetailP.getDetailPlayConfig().setPlayInBackground(b);
       if (Build$VERSION.SDK_INT >= 23) {
          photoDetailP.getDetailPlayConfig().setUseSWDecoder(b);
       }
       MusicRadioActivity tD = this.D;
       if (!TextUtils.x(this.H) && !TextUtils.x(this.G)) {
          tD.h2(this.G);
          tD.i2(this.H);
       }
       String str = f.b(p0);
       b.g(j.e(tD, str, SlideMediaType.ALL));
       photoDetailP.setSlidePlayId(str);
       NasaBizParam nasaBizParam = new NasaBizParam();
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("DETAIL");
       uoa.C(false);
       uoa.r(false);
       uoa.f(b);
       uoa.K(b);
       uoa.s(b);
       nasaBizParam.setNasaSlideParam(uoa.a());
       p0.C = nasaBizParam;
       p0.oh(photoDetailP);
       this.E.U0.b = new n();
       this.E.V1 = new b(photoDetailP, this);
       this.E.f.g(u1.p());
       this.E.f.e(System.currentTimeMillis());
       this.E.W1 = new b();
       p0.fh().b = this.E;
       p0.ih(this.getIntent(), photoDetailP);
       return;
    }
}
